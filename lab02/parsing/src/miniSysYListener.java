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
}