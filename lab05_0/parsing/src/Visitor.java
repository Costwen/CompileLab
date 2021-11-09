import java.util.LinkedList;

public class Visitor extends miniSysYBaseVisitor<String> {
    private Identifier identifier = new Identifier();
    /**
     * compUnit: funcDef;
     */
    public String loadIdent(Register reg1){
        if (!reg1.isConst()){
            return reg1.toString();
        }
        var reg2 = identifier.newRegister("i32", false);
        Output.load(reg2, reg1);
        return reg2.toString();
    }
    public String loadIdent(String reg0){
        var reg1 = identifier.getNameRegister().get(reg0);
        if (!reg1.isConst()){
            return reg1.toString();
        }
        var reg2 = identifier.newRegister("i32", false);
        Output.load(reg2, reg1);
        return reg2.toString();
    }


    @Override
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx) {
        // TODO Auto-generated method stub
        for (var func: Tool.getFunctype().keySet()){
            Output.declare(func);
        }
        visit(ctx.funcDef());
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
        visit(ctx.block());
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
        if (identifier.isConstReg(reg1)){  // 左边不能是常量
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
        System.out.println(ctx.LBrace().getText());
        for (var chd: ctx.blockItem())
            visit(chd);
        System.out.println(ctx.RBrace().getText());
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
        String op1 = visit(ctx.addExp());
        String op2 = visit(ctx.mulExp());
        op1 = loadIdent(op1);
        op2 = loadIdent(op2);
        var result = identifier.newRegister("i32", false);
        var resultStr = result.toString();
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        if (identifier.isConstReg(op1) && identifier.isConstReg(op2)){
            result.setConst(true);
        }

        Output.opPrint(resultStr, op, ty, op1, op2);
        return resultStr;
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
        String op1 = visit(ctx.mulExp());
        String op2 = visit(ctx.unaryExp());
        op1 = loadIdent(op1);
        op2 = loadIdent(op2);
        var result = identifier.newRegister("i32", false);
        var resultStr = result.toString();
        String ty = "i32";
        String op = Tool.getOp(ctx.fOp());
        if (identifier.isConstReg(op1) && identifier.isConstReg(op2)){
            result.setConst(true);
        }
        Output.opPrint(resultStr, op, ty, op1, op2);
        return resultStr;
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
        String op1 = "0";
        String op2 = visit(ctx.unaryExp());
        op1 = loadIdent(op1);
        op2 = loadIdent(op2);
        var result = identifier.newRegister("i32", false);
        var resultStr = result.toString();
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        if (identifier.isConstReg(op1) && identifier.isConstReg(op2)){
            result.setConst(true);
        }
        Output.opPrint(resultStr, op, ty, op1, op2);
        return resultStr;
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
            reg0 = identifier.newRegister("i32", false).toString();
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
     * unaryOp: op=('+' | '-'); F
     */
    @Override
    public String visitUnaryOp(miniSysYParser.UnaryOpContext ctx) {
        // TODO Auto-generated method stub
        return null;
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
        var reg = identifier.newRegister("i32*", ident, false);
        Output.alloca(reg.toString());
        return null;
    }
    @Override
    public String visitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx) {
        var ident = ctx.Ident().getText();
        var reg1 = identifier.newRegister("i32*", ident, false);
        Output.alloca(reg1.toString()); 
        String reg2 = visit(ctx.initVal()); 
        reg2 = loadIdent(reg2.toString());
        Output.store(reg2.toString(), reg1.toString());
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
        var reg1 = identifier.newRegister("i32*", ident, true);
        Output.alloca(reg1); 
        String reg2 = visit(ctx.constInitVal());  
        if (!identifier.isConstReg(reg2)){  // 右边必须是常量
            System.out.println("right is not const!");
            System.exit(-1);
        }
        reg2 = loadIdent(reg2);
        Output.store(reg2, reg1.toString());
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
        return identifier.getRegisterByIdent(ident).toString();
    }
    /**
     * fOp: op=('*' | '/' | '%');
     */
    @Override
    public String visitFOp(miniSysYParser.FOpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFOp(ctx);
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
        return super.visitStmtIfStmt(ctx);
    }
    @Override
    public String visitCond(miniSysYParser.CondContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCond(ctx);
    }
    @Override
    public String visitRelExpAddExp(miniSysYParser.RelExpAddExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRelExpAddExp(ctx);
    }
    @Override
    public String visitRelExpRelExpCmpOpAddExp(miniSysYParser.RelExpRelExpCmpOpAddExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRelExpRelExpCmpOpAddExp(ctx);
    }
    @Override
    public String visitCmpOp(miniSysYParser.CmpOpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCmpOp(ctx);
    }
    @Override
    public String visitEqExpRelExp(miniSysYParser.EqExpRelExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitEqExpRelExp(ctx);
    }
    @Override
    public String visitEqExpEqExpEqOpRelExp(miniSysYParser.EqExpEqExpEqOpRelExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitEqExpEqExpEqOpRelExp(ctx);
    }
    @Override
    public String visitEqOp(miniSysYParser.EqOpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitEqOp(ctx);
    }
    @Override
    public String visitLOrExplAndExp(miniSysYParser.LOrExplAndExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLOrExplAndExp(ctx);
    }
    @Override
    public String visitLOrExplOrExplAndExp(miniSysYParser.LOrExplOrExplAndExpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLOrExplOrExplAndExp(ctx);
    }
}
