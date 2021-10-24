import org.antlr.v4.runtime.tree.ParseTree;

public class Visitor extends miniSysYBaseVisitor<String> {
    private Identifier identifier = new Identifier();
    @Override
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.funcDef());
        return null;
    }
    @Override
    public String visitFuncDef(miniSysYParser.FuncDefContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.funcType());
        visit(ctx.ident());
        System.out.printf("%s%s", ctx.LPar().getText(), ctx.RPar().getText());
        visit(ctx.block());
        return null;
    }
    @Override
    public String visitIdent(miniSysYParser.IdentContext ctx) {
        // TODO Auto-generated method stub
        System.out.print("@main ");
        return null;
    }
    @Override
    public String visitStmt(miniSysYParser.StmtContext ctx) {
        // TODO Auto-generated method stub
        visit(ctx.exp());
        System.out.print("ret i32 ");
        System.out.println(identifier.getRegister(ctx.exp()));
        return null;
    }
    @Override
    public String visitFuncType(miniSysYParser.FuncTypeContext ctx) {
        // TODO Auto-generated method stub
        System.out.print("define dso_local i32 ");
        return null;
    }
    @Override
    public String visitBlock(miniSysYParser.BlockContext ctx) {
        // TODO Auto-generated method stub
        System.out.println(ctx.LBrace().getText());
        visit(ctx.stmt());
        System.out.println(ctx.RBrace().getText());
        return null;
    }

    /*lab03 表达式 */
    @Override
    public String visitExp(miniSysYParser.ExpContext ctx) {
        // TODO Auto-generated method stub
        identifier.setRegister(ctx, visit(ctx.addExp()));
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitAddExpMulExp(miniSysYParser.AddExpMulExpContext ctx) {
        // TODO Auto-generated method stub
        identifier.setRegister(ctx, visit(ctx.mulExp()));
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitAddExpAddExpOpMulExp(miniSysYParser.AddExpAddExpOpMulExpContext ctx) {
        // TODO Auto-generated method stub
        String op1 = visit(ctx.addExp());
        String op2 = visit(ctx.mulExp());
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        System.out.println(String.format("%s = %s %s %s , %s", result, op, ty, op1, op2));
        
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitMulExpUnaryExp(miniSysYParser.MulExpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        identifier.setRegister(ctx, visit(ctx.unaryExp()));
        return identifier.getRegister(ctx);
    }
    @Override
    public String visitMulExpMulExpOpUnaryExp(miniSysYParser.MulExpMulExpOpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        String op1 = visit(ctx.mulExp());
        String op2 = visit(ctx.unaryExp());
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.fOp());
        System.out.println(String.format("%s = %s %s %s , %s", result, op, ty, op1, op2));
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitUnaryExpPrimaryExp(miniSysYParser.UnaryExpPrimaryExpContext ctx) {
        identifier.setRegister(ctx, visit(ctx.primaryExp()));
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitUnaryExpUnaryOpUnaryExp(miniSysYParser.UnaryExpUnaryOpUnaryExpContext ctx) {
        // TODO Auto-generated method stub
        String op1 = "0";
        String op2 = visit(ctx.unaryExp());
        String result = identifier.getRegister(ctx);
        String ty = "i32";
        String op = Tool.getOp(ctx.unaryOp());
        System.out.println(String.format("%s = %s %s %s , %s", result, op, ty, op1, op2));
        
        return identifier.getRegister(ctx);
    }

    @Override
    public String visitPrimaryExpExp(miniSysYParser.PrimaryExpExpContext ctx) {
        // TODO Auto-generated method stub
        identifier.setRegister(ctx, visit(ctx.exp()));
        return identifier.getRegister(ctx);
    }
    @Override
    public String visitPrimaryNumber(miniSysYParser.PrimaryNumberContext ctx) {
        return Integer.toString(Tool.string2int(ctx.Number().getText()));
    }

    @Override
    public String visitUnaryOp(miniSysYParser.UnaryOpContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }
}
