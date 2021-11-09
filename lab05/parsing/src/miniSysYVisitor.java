// Generated from miniSysY.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniSysYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniSysYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code declConstDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclConstDecl(miniSysYParser.DeclConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declVarDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVarDecl(miniSysYParser.DeclVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(miniSysYParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(miniSysYParser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(miniSysYParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(miniSysYParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(miniSysYParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(miniSysYParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefIdent}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefIdent(miniSysYParser.VarDefIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefIdentInitval}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(miniSysYParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItemDecl}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemDecl(miniSysYParser.BlockItemDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItemStmt}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemStmt(miniSysYParser.BlockItemStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtlVal}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtlVal(miniSysYParser.StmtlValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(miniSysYParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExp(miniSysYParser.StmtExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtReturnExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturnExp(miniSysYParser.StmtReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIfStmt(miniSysYParser.StmtIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(miniSysYParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpAddExp(miniSysYParser.RelExpAddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpRelExpCmpOpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpRelExpCmpOpAddExp(miniSysYParser.RelExpRelExpCmpOpAddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpEqExpEqOpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpEqExpEqOpRelExp(miniSysYParser.EqExpEqExpEqOpRelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpRelExp(miniSysYParser.EqExpRelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lAndExpLAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExpLAndExpEqExp(miniSysYParser.LAndExpLAndExpEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExpEqExp(miniSysYParser.LAndExpEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExplAndExp(miniSysYParser.LOrExplAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lOrExplOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExplOrExplAndExp(miniSysYParser.LOrExplOrExplAndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(miniSysYParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(miniSysYParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpMulExp(miniSysYParser.AddExpMulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpAddExpOpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpAddExpOpMulExp(miniSysYParser.AddExpAddExpOpMulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpMulExpOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpMulExpOpUnaryExp(miniSysYParser.MulExpMulExpOpUnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpUnaryExp(miniSysYParser.MulExpUnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpPrimaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpPrimaryExp(miniSysYParser.UnaryExpPrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpFunc}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpFunc(miniSysYParser.UnaryExpFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpUnaryOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpUnaryOpUnaryExp(miniSysYParser.UnaryExpUnaryOpUnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpExp}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpExp(miniSysYParser.PrimaryExpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumber(miniSysYParser.PrimaryNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryLVal}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryLVal(miniSysYParser.PrimaryLValContext ctx);
}