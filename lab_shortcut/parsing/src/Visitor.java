import java.util.ArrayList;

public class Visitor extends miniSysYBaseVisitor<String> {
    private Identifier identifier = Identifier.getInstance();
    /**
     * 要加载的寄存器,如果是i32*类型 将进行加载
     * @param reg1 
     * @return
     */
    public String loadIdent(String reg){
        if (identifier.isConst(reg)){
            return identifier.getConst(reg);
        }
        if (identifier.getType(reg).endsWith("*")){
            var shape = identifier.getShape(reg);
            var type = Tool.getType(shape);
            if (shape.size() == 0){
                var reg2 = identifier.newRegister(type);
                identifier.addShape(reg2, shape);
                Output.load(reg2, reg);   
                return reg2;
            }
        }
        return reg;
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

    /**
     * compUnit: compUnit decl #compUnitcompUnitDecl
        | compUnit funcDef #compUnitcompUnitFuncDef
        | decl #compUnitDecl
        | funcDef #compUnitFuncDef;
     */
    @Override
    public String visitCompUnitcompUnitDecl(miniSysYParser.CompUnitcompUnitDeclContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.compUnit());
        visit(ctx.decl());
        return null;
    }

    @Override
    public String visitCompUnitDecl(miniSysYParser.CompUnitDeclContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.decl());
        return null;
    }
    @Override
    public String visitCompUnitcompUnitFuncDef(miniSysYParser.CompUnitcompUnitFuncDefContext ctx) {
        visit(ctx.compUnit());
        visit(ctx.funcDef());
        return null;
    }
    @Override
    public String visitCompUnitFuncDef(miniSysYParser.CompUnitFuncDefContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.funcDef());
        return null;
    }

    /**
     * funcDef: funcType Ident '('(funcFParams)? ')' block;
     */
     // need to update
    @Override
    public String visitFuncDef(miniSysYParser.FuncDefContext ctx) {
        var type = visit(ctx.funcType());
        var ident = ctx.Ident().getText();
        identifier.setGlobal(false);
        identifier.newTable();
        // TODO Auto-generated method stub
        Output.funcDef(ident, type);
        System.out.print("(");
        var params = new ArrayList<String>();
        identifier.setParams(params);
        if (ctx.funcFParams() != null){
            visit(ctx.funcFParams());
        }
        identifier.addFunc(ident, type);
        System.out.println(")");
        System.out.println("{");
        var table = identifier.getIdentTable();
        for (var s: table.entrySet()){
            var _ident = s.getKey();
            var _reg = s.getValue();
            var _type = identifier.getType(_reg);
            if (!_type.equals("i32")){
                continue;
            }
            var newReg = identifier.newRegister(_type+"*");
            identifier.addShape(newReg, identifier.getShape(_reg));
            Output.alloca(newReg);
            Output.store(_reg, newReg);
            table.put(_ident, newReg);
        }
        visit(ctx.block());
        if (type.equals("void"))
            Output.ret();
        else{
            Output.ret("0");
        }
        System.out.println("}");
        identifier.removeTable();
        identifier.setGlobal(true);
        return null;
    }

    /**
     *  funcFParam: bType Ident ('[' ']' ( '[' exp ']' )*)?;
     */
    // need to update
    @Override
    public String visitFuncFParam(miniSysYParser.FuncFParamContext ctx) {
        // TODO Auto-generated method stub
        var btype = visit(ctx.bType());
        var ident = ctx.Ident().getText();
        var shape = new ArrayList<Integer>();
        if (ctx.LBrackets().size()!=0){
            shape.add(-1);
        }
        for (var chd: ctx.exp()){
            var dim = visit(chd);
            shape.add(Tool.string2int(dim));
        }
        var type = Tool.getType(shape);
        var reg = identifier.alloca(ident, type);
        identifier.addShape(reg, shape);
        return reg;
    }
    /**
     *  funcFParams: funcFParam ( ',' funcFParam )*;
     */
    @Override
    public String visitFuncFParams(miniSysYParser.FuncFParamsContext ctx) {
        // TODO Auto-generated method stub
        
        for (var chd: ctx.funcFParam()){
            var param = visit(chd);
            identifier.addParam(param);
        }
        var params = identifier.getParams();
        for (int i = 0 ; i < params.size(); i++){
            var param = params.get(i);
            var type = identifier.getType(param);
            if (i != params.size()-1){
                System.out.printf("%s %s, ",type, param);
            }
            else{
                System.out.printf("%s %s", type, param);
            }
        }
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
        if (identifier.isConst(reg1)){  // 左边不能是常量
            Output.exit("left can't be const!");
        }
        String reg2 = visit(ctx.exp());
        if (reg2.equals("void")){
            Output.exit("none result");
        }
        var shape1 = identifier.getShape(reg1);
        var shape2 = identifier.getShape(reg2);
        if (shape1.size() != shape2.size()){
            Output.exit("size not equal");
        }
        reg2 = loadIdent(reg2);
        Output.store(reg2, reg1);
        return null;
    }
    @Override
    public String visitStmtExp(miniSysYParser.StmtExpContext ctx) {
        // TODO Auto-generated method stub
        if (ctx.exp() != null)
            visit(ctx.exp());
        return null;
    }
    // need to update
    @Override
    public String visitStmtReturnExp(miniSysYParser.StmtReturnExpContext ctx) {
        // TODO Auto-generated method stub
        if (ctx.exp() != null){
            var reg = visit(ctx.exp());
            reg = loadIdent(reg);
            Output.ret(reg);
        }
        else{
            Output.ret();
        }
        return null;
    }


    /**
     * funcType: 'int | void';
     */
    @Override
    public String visitFuncType(miniSysYParser.FuncTypeContext ctx) {
        // TODO Auto-generated method stub
        var type = ctx.getText();
        return type.equals("int") ? "i32" : "void";
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
        var list = new ArrayList<String>();
        String func = ctx.Ident().getText();
        for (var chd: ctx.exp()){
            var reg = visit(chd);
            reg = loadIdent(reg);
            list.add(reg);
        }
        if (!Tool.checkFunc(func, list)){
            Output.exit("funcParams don't match");
        }
        String funcType = identifier.getFuncType(func);
        String reg0 = "void";
        if (!funcType.equals("void")){
            reg0 = identifier.newRegister(funcType);
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
    varDef: Ident ('['constExp']')* # varDefIdent
    | Ident ('['constExp']')* '=' initVal #varDefIdentInitval
    ;
     */
    // need to update
    @Override
    public String visitVarDefIdent(miniSysYParser.VarDefIdentContext ctx) {
        // TODO Auto-generated method stub
        var ident = ctx.Ident().getText();
        

        var shape = arrayProcess(ctx);
        
        var reg = identifier.alloca(ident, shape);
        var shapeSize = identifier.getShape();
        var end = Tool.getShape(shapeSize, 0);
        identifier.addShape(reg, shape);
        for (int i = 0; i < end; i++){
            identifier.addInitDate("0");
        }
        
        if (identifier.isGlobal()){
            if (shape.size() == 0){
                Output.global(reg, "0");
            }
            else{
                Output.zeroinitializer(reg, "global");
            }
        }
        else{
            Output.alloca(reg);
            if (shape.size() != 0){
                // var ptr = identifier.newRegister("i32*");
                var initData = identifier.getInitData();
                for (int i = 0; i < initData.size(); i++){
                    var ptr_i = identifier.newRegister("i32*");
                    Output.getelementptr(ptr_i, reg, 0, i);
                    var tmp1 = initData.get(i);
                    var tmp2 = loadIdent(tmp1);
                    Output.store(tmp2, ptr_i);
                }
            }
        }
        return null;
    }
    // need to update
    @Override
    public String visitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx) {
        var ident = ctx.Ident().getText();
        var shape = arrayProcess(ctx);
        String reg1 = identifier.alloca(ident, shape);
        identifier.addShape(reg1, shape);
        if (identifier.isGlobal()){ // 全局模式
            String reg2 = visit(ctx.initVal());
            if (reg2 == null){
                Output.global(reg1, identifier.getInitData());
            }
            else{
                if (!identifier.isConst(reg2)){
                    Output.exit("global var right must be a const!");
                }
                reg2 = loadIdent(reg2);
                Output.global(reg1, reg2);
            }

        }
        else{
            Output.alloca(reg1); 
            String reg2 = visit(ctx.initVal()); 

            if (reg2 == null){
                var initData = identifier.getInitData();
                for (int i = 0; i < initData.size(); i++){
                    var ptr_i = identifier.newRegister("i32*");
                    Output.getelementptr(ptr_i, reg1, 0, i);
                    var tmp1 = initData.get(i);
                    var tmp2 = loadIdent(tmp1);
                    Output.store(tmp2, ptr_i);
                }
            }
            else{
                if (reg2.equals("void")){
                    Output.exit("none result");
                }
                reg2 = loadIdent(reg2);
                Output.store(reg2, reg1);
            }
        }
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
    public ArrayList<Integer> arrayProcess(Object ctx){
        var shape = new ArrayList<Integer>();
        if (ctx instanceof miniSysYParser.ConstDefContext){
            var _ctx = (miniSysYParser.ConstDefContext)ctx;
            for (var chd: _ctx.constExp()){
                String reg2 = visit(chd); 
                shape.add(Tool.string2int(reg2));
            }
        }
        if (ctx instanceof miniSysYParser.VarDefIdentInitvalContext){
            var _ctx = (miniSysYParser.VarDefIdentInitvalContext)ctx;
            for (var chd: _ctx.constExp()){
                String reg2 = visit(chd); 
                shape.add(Tool.string2int(reg2));
            }
        }
        if (ctx instanceof miniSysYParser.VarDefIdentContext){
            var _ctx = (miniSysYParser.VarDefIdentContext)ctx;
            for (var chd: _ctx.constExp()){
                String reg2 = visit(chd); 
                shape.add(Tool.string2int(reg2));
            }
        }
        identifier.setShape(shape);
        var initData = new ArrayList<String>();
        identifier.setInitData(initData);
        // System.out.println(shape);
        return shape;
    }

    /**
     * constDef: Ident ('[' constExp ']')* '=' constInitVal;
     */
    
    @Override
    public String visitConstDef(miniSysYParser.ConstDefContext ctx) {
        // TODO Auto-generated method stub
        var shape = arrayProcess(ctx);
        var ident = ctx.Ident().getText();
        var reg1 = identifier.alloca(ident, shape);
        identifier.addShape(reg1, shape);

        if (identifier.isGlobal()){ // 全局模式
            String reg2 = visit(ctx.constInitVal());
            if (reg2 == null){  // 数组
                Output.constGlobal(reg1, identifier.getInitData());
                identifier.addConstSet(reg1, identifier.getInitData());
            }
            else{
                reg2 = loadIdent(reg2);
                Output.constGlobal(reg1, reg2);
                identifier.addConstSet(reg1, reg2);
            }
        }
        else{
            Output.alloca(reg1);  
            String reg2 = visit(ctx.constInitVal());
            if (reg2 == null){
                var initData = identifier.getInitData();
                for (int i = 0; i < initData.size(); i++){
                    var ptr_i = identifier.newRegister("i32*");
                    Output.getelementptr(ptr_i, reg1, 0, i);
                    var tmp1 = initData.get(i);
                    var tmp2 = loadIdent(tmp1);
                    Output.store(tmp2, ptr_i);
                }
                identifier.addConstSet(reg1, identifier.getInitData());
                // System.out.println(reg1);
                // System.out.println(identifier.getInitData());
                
            }
            else{
                reg2 = loadIdent(reg2);
                Output.store(reg2, reg1);
                identifier.addConstSet(reg1, reg2);
            }
        }
        return null;
    }
    
    /**
     * constInitVal: constExp #constInitValConstExp
            | '{' (constInitVal (',' constInitVal)*)? '}' #constInitValLBrackets
            ;

     */
    @Override
    public String visitConstInitValConstExp(miniSysYParser.ConstInitValConstExpContext ctx) {
        // TODO Auto-generated method stub
        var reg = visit(ctx.constExp());
        if (identifier.getDim() > 0){
            identifier.addInitDate(reg);
        } 
        return reg;
    }
    @Override
    public String visitConstInitValLBrackets(miniSysYParser.ConstInitValLBracketsContext ctx) {
        // TODO Auto-generated method stub
        identifier.addDim();
        for (var chd: ctx.constInitVal()){
            visit(chd);
        }
        var shape = identifier.getShape();
        var dim = identifier.getDim()-1;
        var n = shape.get(dim);
        var size = ctx.constInitVal().size();
        var end = (n-size) * Tool.getShape(shape, dim+1);

        for (int i = 0; i < end; i++){
            identifier.addInitDate("0");
        }
        identifier.subDim();
        return null;
    }

    /**
     * constExp: addExp;
     */
    @Override
    public String visitConstExp(miniSysYParser.ConstExpContext ctx) {
        // TODO Auto-generated method stub
        var reg = visit(ctx.addExp());
        if (!identifier.isConst(reg)){  // 右边必须是常量
            Output.exit("right is not const!");
        }
        return identifier.getConst(reg);
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
     * initVal: exp #initValExp
        | '{' (initVal (',' initVal)*)? '}' #initValInitVal
        ;
     */
    @Override
    public String visitInitValExp(miniSysYParser.InitValExpContext ctx) {
        var reg = visit(ctx.exp());
        if (identifier.getDim() > 0){
            identifier.addInitDate(reg);
        }   
        return reg;
    }

    
    @Override
    public String visitInitValInitVal(miniSysYParser.InitValInitValContext ctx) {
        // TODO Auto-generated method stub
        identifier.addDim();
        for (var chd: ctx.initVal()){
            visit(chd);
        }
        var shape = identifier.getShape();
        var dim = identifier.getDim()-1;
        var n = shape.get(dim);
        var size = ctx.initVal().size();
        var end = (n-size) * Tool.getShape(shape, dim+1);

        for (int i = 0; i < end; i++){
            identifier.addInitDate("0");
        }
        identifier.subDim();
        return null;
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
     *  
        lVal: Ident ('['exp']')*;
     */
    
    @Override
    public String visitLVal(miniSysYParser.LValContext ctx) {
        // TODO Auto-generated method stub
        var ident = ctx.Ident().getText();
        var reg = identifier.getIdentRegister(ident);
        var shape = identifier.getShape(reg);
        var dims = ctx.exp().size();
        var subShape = new ArrayList<Integer>();
        if (shape.size() < dims){
            Output.exit("dim can't be bigger than shape");
        }
        if (shape.size() == 0){
            return identifier.getIdentRegister(ident);
        }
        String ty = "i32";
        String result = null;
        for (int i = 0; i < dims; i++){
            var dim = visit(ctx.exp(i));
            var prob = Tool.getShape(shape, i+1);
            dim = loadIdent(dim);
            var tmp = identifier.newRegister(ty);
            Output.opPrint(tmp, "mul", ty, dim, prob.toString());
            var last = result;
            result = identifier.newRegister(ty);
            Output.opPrint(result, "add", ty, tmp, last == null? "0":last);
        }

        for (int i = dims; i < shape.size(); i++){
            subShape.add(shape.get(i));
        }
        var ptr_i = identifier.newRegister("i32*");
        if (result == null){
            result = "0";
        }
        if (shape.get(0) != -1){
            Output.getelementptr(ptr_i, reg, 0, result);
        }
        else{
            Output.getelementptr(ptr_i, reg, result);
        }
        identifier.addShape(ptr_i, subShape);
        // if (identifier.isConst(reg) && ){
        //     identifier.addConstSet(ptr_i, );
        // }
        return ptr_i;
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
        var L1 = identifier.newRegister("label");
        var L2 = identifier.newRegister("label");
        var L3 = identifier.newRegister("label");
        identifier.pushL0L1L2(L3, L1, L2);
        var cond = visit(ctx.cond());
        cond = loadIdent(cond);
        
        cond = convert(cond, "i1");
        Output.brLabel(cond, L1, L2);
        Output.label(L1);
        visit(ctx.stmt(0));
        Output.brDest(L3);
        Output.label(L2);
        if (ctx.Else() != null){
            visit(ctx.stmt(1));
        }
        Output.brDest(L3);
        Output.label(L3);
        identifier.popL0L1L2();
        return null;
    }
    /*
     Stmt: 'while' '(' Cond ')' Stmt
    */
    @Override
    public String visitStmtWhileExp(miniSysYParser.StmtWhileExpContext ctx) {
        var L0 = identifier.newRegister("label");
        var L1 = identifier.newRegister("label");
        var L2 = identifier.newRegister("label");
        identifier.pushL0L1L2(L0, L1, L2);
        Output.brDest(L0);
        Output.label(L0);
        var cond = visit(ctx.cond());
        cond = loadIdent(cond);
        cond = convert(cond, "i1");
        Output.brLabel(cond, L1, L2);
        Output.label(L1);
        visit(ctx.stmt());
        Output.brDest(L0);
        Output.label(L2);
        identifier.popL0L1L2();
        return null;
    }
    @Override
    public String visitStmtContinue(miniSysYParser.StmtContinueContext ctx) {
        var L1 = identifier.newRegister("label");
        var L2 = identifier.newRegister("label");
        Output.brDest(L1);
        Output.label(L1);
        Output.brDest(identifier.peekL0());
        Output.label(L2);
        return null;
    }
    @Override
    public String visitStmtBreak(miniSysYParser.StmtBreakContext ctx) {
        // TODO Auto-generated method stub
        var L1 = identifier.newRegister("label");
        var L2 = identifier.newRegister("label");
        Output.brDest(L1);
        Output.label(L1);
        Output.brDest(identifier.peekL2());
        Output.label(L2);
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
        var _L1 = identifier.newRegister("label");
        // System.out.println(_L1);
        var L1 = identifier.peekL1();
        var L2 = identifier.peekL2();
        String ty = "i1";
        identifier.pushL2(_L1);
        String cond1 = visit(ctx.lOrExp());
        identifier.popL2();
        cond1 = loadIdent(cond1);
        cond1 = convert(cond1, ty);
        Output.brLabel(cond1, L1, _L1);
        Output.label(_L1);
        String cond2 = visit(ctx.lAndExp());
        cond2 = loadIdent(cond2);
        cond2 = convert(cond2, ty);
        Output.brLabel(cond2, L1, L2);
        return cond2;
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
        var _L1 = identifier.newRegister("label");
        var L1 = identifier.peekL1();
        var L2 = identifier.peekL2();
        String ty = "i1";
        String cond1 = visit(ctx.lAndExp());
        cond1 = loadIdent(cond1);
        cond1 = convert(cond1, ty);
        Output.brLabel(cond1, _L1, L2);
        Output.label(_L1);
        String cond2 = visit(ctx.eqExp());
        cond2 = loadIdent(cond2);
        cond2 = convert(cond2, ty);
        // Output.brLabel(cond2, L1, L2);
        return cond2;
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
