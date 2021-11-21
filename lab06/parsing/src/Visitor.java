import java.util.LinkedList;

public class Visitor extends miniSysYBaseVisitor<String> {
    private Identifier identifier = new Identifier();
    /**
     * 要加载的寄存器,如果是i32*类型 将进行加载
     * @param reg1 
     * @return
     */
    public String loadIdent(String reg1){
        if (!identifier.isIdentReg(reg1)){
            return reg1;
        }
        if (identifier.isConst(reg1)){
            return identifier.getConst(reg1);
        }
        var reg2 = identifier.newRegister("i32");
        Output.load(reg2, reg1);
        return reg2;
    }

    /**
     * 将寄存器reg转换到type2类型
     * @param reg  要转换的寄存器
     * @param type2 要转换到的类型
     * @return
     */
    public String convert(String reg, String type2){
        if (identifier.isIdentReg(reg)){
            return reg; // 处理指针类型已经给loadIdent处理了
        }
        String type = identifier.getType(reg);
        if (type.equals(type2)){
            return reg;
        }
        String result = identifier.newRegister(type2);
        // 类型大转换小
        if (Tool.cmpPriority(type, type2)){
            Output.icmp(result, "ne", type, reg, "0");
        }
        else{
            Output.zext(result, type, reg, type2);
        }
        return result;
    }

    @Override
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx) {
        // TODO Auto-generated method stub
        for (var func: Tool.getFunctype().keySet()){
            Output.declare(func);
        }
        for (var chd: ctx.decl()){
            visit(chd);
        }
        identifier.setGlobal(false);
        visit(ctx.funcDef());
        identifier.setGlobal(true);
        
        return null;
    }
    /**
     * funcDef: funcType Ident '(' ')' block;
     */
    @Override
    public String visitFuncDef(miniSysYParser.FuncDefContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.funcType());
        System.out.print(" @main ");
        // visit(ctx.ident());
        System.out.printf("%s%s", ctx.LPar().getText(), ctx.RPar().getText());
        System.out.println("{");
        visit(ctx.block());
        System.out.println("}");
        return null;
    }

    /**
     * 
        stmt: lVal '=' exp ';' #stmtlVal
        | exp? ';'  #stmtExp
        | 'return' exp ';' #stmtReturnExp;
     */
    @Override
    public String visitStmtlVal(miniSysYParser.StmtlValContext ctx) {
        String reg1 = visit(ctx.lVal());
        System.out.println();
        if (identifier.isConst(reg1)){  // 左边不能是常量
            System.out.println("left can't be const!");
            System.exit(-1);
        }
        String reg2 = visit(ctx.exp());
        reg2 = loadIdent(reg2);
        Output.store(reg2, reg1);
        return null;
    }
    @Override
    public String visitStmtExp(miniSysYParser.StmtExpContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.exp());
        return null;
    }
    @Override
    public String visitStmtReturnExp(miniSysYParser.StmtReturnExpContext ctx) {
        // TODO Auto-generated method stub
        var reg = visit(ctx.exp());
        reg = loadIdent(reg);
        Output.ret(reg);
        identifier.newRegister("return");
        return null;
    }


    /**
     * funcType: 'int';
     */
    @Override
    public String visitFuncType(miniSysYParser.FuncTypeContext ctx) {
        // TODO Auto-generated method stub
        System.out.print("define dso_local i32 ");
        return null;
    }
    /**
     *  block:'{' blockItem* '}';
     */
    @Override
    public String visitBlock(miniSysYParser.BlockContext ctx) {
        // TODO Auto-generated method stub
        identifier.newTable();
        for (var chd: ctx.blockItem()){
            visit(chd);
        }
        identifier.removeTable();
        return null;
    }

    /**
     *  exp: addExp;
     */
    @Override
    public String visitExp(miniSysYParser.ExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.addExp());
    }

    /**
     * addExp:mulExp  # addExpMulExp
            |  addExp unaryOp mulExp #addExpAddExpOpMulExp
        ; 
     */
    @Override
    public String visitAddExpMulExp(miniSysYParser.AddExpMulExpContext ctx) {
        // TODO Auto-generated method stub

        return visit(ctx.mulExp());
    }

    @Override
    public String visitAddExpAddExpOpMulExp(miniSysYParser.AddExpAddExpOpMulExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.addExp());
        String reg2 = visit(ctx.mulExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        if (identifier.isConst(reg1) && identifier.isConst(reg2)){
            return Tool.Op(ctx.UnaryOp().getText(), reg1, reg2);
        }
        reg1 = convert(reg1, "i32");
        reg2 = convert(reg2, "i32");
        String result = identifier.newRegister("i32");
        String ty = "i32";
        String op = Tool.getOp(ctx.UnaryOp().getText());
        Output.opPrint(result, op, ty, reg1, reg2);
        return result;
    }
    /**
     *  mulExp: unaryExp #mulExpUnaryExp
        | mulExp fOp unaryExp #mulExpMulExpOpUnaryExp
        ;
     */
    @Override
    public String visitMulExpUnaryExp(miniSysYParser.MulExpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.unaryExp());
    }
    @Override
    public String visitMulExpMulExpOpUnaryExp(miniSysYParser.MulExpMulExpOpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.mulExp());
        String reg2 = visit(ctx.unaryExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        if (identifier.isConst(reg1) && identifier.isConst(reg2)){
            return Tool.Op(ctx.FOp().getText(), reg1, reg2);
        }
        String op = Tool.getOp(ctx.FOp().getText());
        reg1 = convert(reg1, "i32");
        reg2 = convert(reg2, "i32");
        String result = identifier.newRegister("i32");
        String ty = "i32";
        Output.opPrint(result, op, ty, reg1, reg2);
        return result;
    }
    /**
        unaryExp: primaryExp #unaryExpPrimaryExp
                | Ident '(' funcRParams? ')' #unaryFunc
                | unaryOp unaryExp #unaryExpUnaryOpUnaryExp
                ;
     */
    @Override
    public String visitUnaryExpPrimaryExp(miniSysYParser.UnaryExpPrimaryExpContext ctx) {

        return visit(ctx.primaryExp());
    }
    // F
    @Override
    public String visitUnaryExpUnaryOpUnaryExp(miniSysYParser.UnaryExpUnaryOpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = "0";
        String reg2 = visit(ctx.unaryExp());
        if (identifier.isConst(reg1) && identifier.isConst(reg2)){
            return Tool.Op(ctx.UnaryOp().getText(), reg1, reg2);
        }
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        reg1 = convert(reg1, "i32");
        reg2 = convert(reg2, "i32");
        String op = Tool.getOp(ctx.UnaryOp().getText());
        String type = "i32";
        if (ctx.UnaryOp().getText().equals("!")){
            type = "i1";
        }
        String result = identifier.newRegister(type);
        String ty = identifier.getType(reg2);
        Output.opPrint(result, op, ty, reg1, reg2);
        return result;
    }
    @Override
    public String visitUnaryExpFunc(miniSysYParser.UnaryExpFuncContext ctx) {
        // TODO Auto-generated method stub
        var list = new LinkedList<String>();
        String func = ctx.Ident().getText();
        for (var chd: ctx.exp()){
            var reg = visit(chd);
            reg = loadIdent(reg);
            list.add(reg);
        }
        if (!Tool.checkFunc(func, list.size())){
            System.exit(-1);
        }
        String funcType = Tool.getFunctype().get(func);
        String reg0 = null;
        if (!funcType.equals("void")){
            reg0 = identifier.newRegister("i32");
        }
        Output.call(func, list, reg0);
        return reg0;
    }


    /**
     * primaryExp: '(' exp ')' #primaryExpExp
        | number #primaryNumber
        | lVal #primaryLVal;
     */
    @Override
    public String visitPrimaryExpExp(miniSysYParser.PrimaryExpExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.exp());
    }
    @Override
    public String visitPrimaryNumber(miniSysYParser.PrimaryNumberContext ctx) {
        return visit(ctx.number());
    }
    @Override
    public String visitPrimaryLVal(miniSysYParser.PrimaryLValContext ctx) {
        // TODO Auto-generated method stub
       
        return visit(ctx.lVal());
    }

    /**
     * decl : constDecl # declConstDecl 
            | varDecl # declVarDecl
    ;
     */
    @Override
    public String visitDeclConstDecl(miniSysYParser.DeclConstDeclContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.constDecl());
        return null;
    }

    @Override
    public String visitDeclVarDecl(miniSysYParser.DeclVarDeclContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.varDecl());
        return null;
    }

    /**
    *
    varDef: Ident # varDefIdent
            | Ident '=' initVal #varDefIdentInitval
    ;
     */
    @Override
    public String visitVarDefIdent(miniSysYParser.VarDefIdentContext ctx) {
        // TODO Auto-generated method stub
        var ident = ctx.Ident().getText();
        var reg = identifier.alloca(ident);
        if (identifier.isGlobal())
            Output.global(reg, "0");
        else 
            Output.alloca(reg);
        return null;
    }
    @Override
    public String visitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx) {
        var ident = ctx.Ident().getText();
        String reg1 = identifier.alloca(ident);
        if (!identifier.isGlobal()){
            Output.alloca(reg1); 
            String reg2 = visit(ctx.initVal()); 
            reg2 = loadIdent(reg2);
            Output.store(reg2, reg1);
            return null;
        }
        String reg2 = visit(ctx.initVal());
        if (!identifier.isConst(reg2)){
            System.out.println("global var right must be a const");
            System.exit(-1);
        }
        Output.global(reg1, reg2);
        return null;
    }

    /**
     * constDecl : 'const' bType constDef { ',' constDef } ';';
     */
    @Override
    public String visitConstDecl(miniSysYParser.ConstDeclContext ctx) {
        // TODO Auto-generated method stub
        for (var chd: ctx.constDef()){
            visit(chd);
        }
        return null;
    }
    /**
     * bType : 'int';
     */
    @Override
    public String visitBType(miniSysYParser.BTypeContext ctx) {
        // TODO Auto-generated method stub
        return "i32";
    }
    /**
     * constDef: Ident '=' constInitVal;
     */
    @Override
    public String visitConstDef(miniSysYParser.ConstDefContext ctx) {
        // TODO Auto-generated method stub
        var ident = ctx.Ident().getText();
        String reg1 = identifier.alloca(ident);
        if (identifier.isGlobal()){ // 不是全局模式
            String reg2 = visit(ctx.constInitVal());  
            if (!identifier.isConst(reg2)){  // 右边必须是常量
                System.out.println("right is not const!");
                System.exit(-1);
            }
            reg2 = loadIdent(reg2);
            identifier.addConstSet(reg1, reg2);
            Output.global(reg1, reg2);
            return null;
        }
        Output.alloca(reg1); 
        String reg2 = visit(ctx.constInitVal());  
        if (!identifier.isConst(reg2)){  // 右边必须是常量
            System.out.println("right is not const!");
            System.exit(-1);
        }
        reg2 = loadIdent(reg2);
        identifier.addConstSet(reg1, reg2);
        Output.store(reg2, reg1);
        return null;
    }
    
    /**
     * constInitVal: constExp;
     */
    @Override
    public String visitConstInitVal(miniSysYParser.ConstInitValContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.constExp());
    }
    /**
     * constExp: addExp;
     */
    @Override
    public String visitConstExp(miniSysYParser.ConstExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.addExp());
    }
    /**
     * varDecl: bType varDef  (',' varDef)* ';';
     */
    @Override
    public String visitVarDecl(miniSysYParser.VarDeclContext ctx) {
        // TODO Auto-generated method stub
        for (var chd : ctx.varDef()){
            visit(chd);
        }
        return null;
    }
    /**
     * initVal: exp;
     */
    @Override
    public String visitInitVal(miniSysYParser.InitValContext ctx) {
        return visit(ctx.exp());
    }
    /**
     * 
        blockItem: decl  # blockItemDecl
        | stmt # blockItemStmt;
     */
    @Override
    public String visitBlockItemDecl(miniSysYParser.BlockItemDeclContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.decl());
    }
    @Override
    public String visitBlockItemStmt(miniSysYParser.BlockItemStmtContext ctx) {
        return  visit(ctx.stmt());
    }

    /**
     *  lVal: ident;
     */
    @Override
    public String visitLVal(miniSysYParser.LValContext ctx) {
        // TODO Auto-generated method stub
        String ident = ctx.Ident().getText();
        return identifier.getIdentRegister(ident);
    }
    /**
     * number: DecimalConst | OctalConst | HexaDecimalConst;
     */
    @Override
    public String visitNumber(miniSysYParser.NumberContext ctx) {
        return Tool.string2int(ctx.getText()).toString();
    }
    /*
        'if' '(' cond ')' stmt ('else' stmt)?  #stmtIfStmt //new
    */
    @Override
    public String visitStmtIfStmt(miniSysYParser.StmtIfStmtContext ctx) {
        // TODO Auto-generated method stub
        var cond = visit(ctx.cond());
        cond = convert(cond, "i1");
        if (ctx.Else() != null){
            var L1 = identifier.newRegister("label");
            var L2 = identifier.newRegister("label");
            var L3 = identifier.newRegister("label");
            Output.brLabel(cond, L1, L2);
            Output.label(L1);
            visit(ctx.stmt(0));
            Output.brDest(L3);
            Output.label(L2);
            visit(ctx.stmt(1));
            Output.brDest(L3);
            Output.label(L3);
        }
        else{
            var L1 = identifier.newRegister("label");
            var L2 = identifier.newRegister("label");
            Output.brLabel(cond , L1, L2);
            Output.label(L1);
            visit(ctx.stmt(0));
            Output.brDest(L2);
            Output.label(L2);
        }
        return null;
    }

    /*
    cond: lOrExp; //new
    */
    @Override
    public String visitCond(miniSysYParser.CondContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.lOrExp());
    }
    /* 
        relExp: addExp #relExpAddExp
        | relExp cmpOp addExp #relExpRelExpCmpOpAddExp
        ; //new
    */
    @Override
    public String visitRelExpAddExp(miniSysYParser.RelExpAddExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.addExp());
    }
    @Override
    public String visitRelExpRelExpCmpOpAddExp(miniSysYParser.RelExpRelExpCmpOpAddExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.relExp());
        String reg2 = visit(ctx.addExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        reg1 = convert(reg1, "i32");
        reg2 = convert(reg2, "i32");
        String cmpOp = Tool.getCmpOp(ctx.CmpOp().getText());
        String result = identifier.newRegister("i1");
        String ty = "i32";
        Output.icmp(result, cmpOp, ty, reg1, reg2);
        return result;
    }

    /**
     * eqExp: relExp #eqExpRelExp
        | eqExp eqOp relExp #eqExpEqExpEqOpRelExp
        ; //new
     */
    @Override
    public String visitEqExpRelExp(miniSysYParser.EqExpRelExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.relExp());
    }
    @Override
    public String visitEqExpEqExpEqOpRelExp(miniSysYParser.EqExpEqExpEqOpRelExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.eqExp());
        String reg2 = visit(ctx.relExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        reg1 = convert(reg1, "i32");
        reg2 = convert(reg2, "i32");
        String cmpOp = Tool.getCmpOp(ctx.EqOp().getText());
        String result = identifier.newRegister("i1");
        String ty = "i32";
        Output.icmp(result, cmpOp, ty, reg1, reg2);
        
        return result;
    }
    /**
     * lOrExp: lAndExp #lOrExplAndExp
        | lOrExp '||' lAndExp #lOrExplOrExplAndExp
        ;  // new
     */
    @Override
    public String visitLOrExplAndExp(miniSysYParser.LOrExplAndExpContext ctx) {
        // TODO Auto-generated method stub

        return visit(ctx.lAndExp());
    }
    @Override
    public String visitLOrExplOrExplAndExp(miniSysYParser.LOrExplOrExplAndExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.lOrExp());
        String reg2 = visit(ctx.lAndExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        String ty = "i1";
        reg1 = convert(reg1, ty);
        reg2 = convert(reg2, ty);
        String result = identifier.newRegister(ty);
        Output.opPrint(result, "or", ty, reg1, reg2);
        return result;
    }
    /**
     * lAndExp: eqExp  #lAndExpEqExp
        | lAndExp '&&' eqExp #lAndExpLAndExpEqExp
        ; //new
     */
    @Override
    public String visitLAndExpEqExp(miniSysYParser.LAndExpEqExpContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.eqExp());
    }
    @Override
    public String visitLAndExpLAndExpEqExp(miniSysYParser.LAndExpLAndExpEqExpContext ctx) {
        // TODO Auto-generated method stub
        String reg1 = visit(ctx.lAndExp());
        String reg2 = visit(ctx.eqExp());
        reg1 = loadIdent(reg1);
        reg2 = loadIdent(reg2);
        String ty = "i1";
        reg1 = convert(reg1, ty);
        reg2 = convert(reg2, ty);
        String result = identifier.newRegister(ty);
        Output.opPrint(result, "and", ty, reg1, reg2);
        return result;
    }
    /**
     * stmt: block #stmtBlock
     */
    @Override
    public String visitStmtBlock(miniSysYParser.StmtBlockContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.block());
    }
    
}
