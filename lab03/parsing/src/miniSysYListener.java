// Generated from miniSysY.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniSysYParser}.
 */
public interface miniSysYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniSysYParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniSysYParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExpMulExp(miniSysYParser.AddExpMulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExpMulExp(miniSysYParser.AddExpMulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpAddExpOpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExpAddExpOpMulExp(miniSysYParser.AddExpAddExpOpMulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpAddExpOpMulExp}
	 * labeled alternative in {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExpAddExpOpMulExp(miniSysYParser.AddExpAddExpOpMulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpMulExpOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExpMulExpOpUnaryExp(miniSysYParser.MulExpMulExpOpUnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpMulExpOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExpMulExpOpUnaryExp(miniSysYParser.MulExpMulExpOpUnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExpUnaryExp(miniSysYParser.MulExpUnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExpUnaryExp(miniSysYParser.MulExpUnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpPrimaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpPrimaryExp(miniSysYParser.UnaryExpPrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpPrimaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpPrimaryExp(miniSysYParser.UnaryExpPrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpUnaryOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpUnaryOpUnaryExp(miniSysYParser.UnaryExpUnaryOpUnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpUnaryOpUnaryExp}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpUnaryOpUnaryExp(miniSysYParser.UnaryExpUnaryOpUnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpExp}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpExp(miniSysYParser.PrimaryExpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpExp}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpExp(miniSysYParser.PrimaryExpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumber(miniSysYParser.PrimaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumber(miniSysYParser.PrimaryNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(miniSysYParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(miniSysYParser.UnaryOpContext ctx);
}