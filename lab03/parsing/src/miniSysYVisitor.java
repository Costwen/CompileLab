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
	 * Visit a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(miniSysYParser.StmtContext ctx);
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
	 * Visit a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(miniSysYParser.UnaryOpContext ctx);
}