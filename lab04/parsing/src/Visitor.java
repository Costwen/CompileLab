import java.util.LinkedList;
import java.util.List;

public class Visitor extends miniSysYBaseVisitor<String> {
    private Identifier identifier = new Identifier();
    /**
     * compUnit: funcDef;
     */
    public String loadIdent(String reg1){
        if (!identifier.isIdentReg(reg1)){
            return reg1;
        }
        var reg2 = identifier.getTempRegister();
        Output.load(reg2, reg1);
        return reg2;
    }

    @Override
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx) {
        // TODO Auto-generated method stub
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
        String ident = ctx.lVal().getText();
        if (identifier.isConst(ident)){
            System.exit(-1);
        }
        String reg1 = visit(ctx.lVal());
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
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        Output.opPrint(result, op, ty, op1, op2);
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
        String op1 = visit(ctx.mulExp());
        String op2 = visit(ctx.unaryExp());
        op1 = loadIdent(op1);
        op2 = loadIdent(op2);
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.fOp());
        Output.opPrint(result, op, ty, op1, op2);
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
        String op1 = "0";
        String op2 = visit(ctx.unaryExp());
        op1 = loadIdent(op1);
        op2 = loadIdent(op2);
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        Output.opPrint(result, op, ty, op1, op2);
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
            reg0 = identifier.getTempRegister();
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
        var reg = identifier.alloca(ident);
        Output.alloca(reg);
        return null;
    }
    @Override
    public String visitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx) {
        var ident = ctx.Ident().getText();
        String reg1 = identifier.alloca(ident);
        Output.alloca(reg1); 
        String reg2 = visit(ctx.initVal()); 
        reg2 = loadIdent(reg2);

        Output.store(reg2, reg1);
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
        Output.alloca(reg1); 
        String reg2 = visit(ctx.constInitVal()); 
        reg2 = loadIdent(reg2);
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

    
}
