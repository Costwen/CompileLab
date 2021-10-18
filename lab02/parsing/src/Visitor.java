import org.antlr.v4.runtime.tree.ParseTree;

public class Visitor extends miniSysYBaseVisitor<String> {
    @Override
    public String visit(ParseTree tree) {
        // TODO Auto-generated method stub
        return super.visit(tree);
    }
    @Override
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx) {
        // TODO Auto-generated method stub
        return visit(ctx.funcDef());
    }
    @Override
    public String visitFuncDef(miniSysYParser.FuncDefContext ctx) {
        // TODO Auto-generated method stub
        String func =String.format("%s %s %s%s %s", visit(ctx.funcType()), visit(ctx.ident()), ctx.LPar().getText(), ctx.RPar().getText(), visit(ctx.block()));
        return func;
    }
    @Override
    public String visitIdent(miniSysYParser.IdentContext ctx) {
        // TODO Auto-generated method stub
        return "@main";
    }
    @Override
    public String visitStmt(miniSysYParser.StmtContext ctx) {
        // TODO Auto-generated method stub
        String number = ctx.Number().getText();
        if (number.startsWith("0x")||number.startsWith("0X")){
            number = Integer.valueOf(number.substring(2), 16).toString();
        }
        else if (number.startsWith("0")){
            number = Integer.valueOf(number, 8).toString();
        }
        else {
            number = Integer.valueOf(number, 10).toString();
        }
        return "ret i32 " + number;
    }
    @Override
    public String visitFuncType(miniSysYParser.FuncTypeContext ctx) {
        // TODO Auto-generated method stub
        return "define dso_local i32";
    }
    @Override
    public String visitBlock(miniSysYParser.BlockContext ctx) {
        // TODO Auto-generated method stub
        return String.format("%s %s %s", ctx.LBrace().getText(), visit(ctx.stmt()), ctx.RBrace().getText());
    }
}
