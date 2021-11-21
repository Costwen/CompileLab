// Generated from miniSysY.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniSysYParser}.
 */
public interface miniSysYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code declConstDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclConstDecl(miniSysYParser.DeclConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declConstDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclConstDecl(miniSysYParser.DeclConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declVarDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclVarDecl(miniSysYParser.DeclVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declVarDecl}
	 * labeled alternative in {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclVarDecl(miniSysYParser.DeclVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(miniSysYParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(miniSysYParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(miniSysYParser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(miniSysYParser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(miniSysYParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(miniSysYParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(miniSysYParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(miniSysYParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(miniSysYParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(miniSysYParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(miniSysYParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(miniSysYParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDefIdent}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDefIdent(miniSysYParser.VarDefIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDefIdent}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDefIdent(miniSysYParser.VarDefIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDefIdentInitval}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDefIdentInitval}
	 * labeled alternative in {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDefIdentInitval(miniSysYParser.VarDefIdentInitvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(miniSysYParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(miniSysYParser.InitValContext ctx);
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
	 * Enter a parse tree produced by the {@code blockItemDecl}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemDecl(miniSysYParser.BlockItemDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockItemDecl}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemDecl(miniSysYParser.BlockItemDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockItemStmt}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemStmt(miniSysYParser.BlockItemStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockItemStmt}
	 * labeled alternative in {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemStmt(miniSysYParser.BlockItemStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtlVal}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtlVal(miniSysYParser.StmtlValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtlVal}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtlVal(miniSysYParser.StmtlValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(miniSysYParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(miniSysYParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtExp(miniSysYParser.StmtExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtExp(miniSysYParser.StmtExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReturnExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturnExp(miniSysYParser.StmtReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReturnExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturnExp(miniSysYParser.StmtReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhileExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhileExp(miniSysYParser.StmtWhileExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhileExp}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhileExp(miniSysYParser.StmtWhileExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtBreak(miniSysYParser.StmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtBreak(miniSysYParser.StmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtContinue(miniSysYParser.StmtContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtContinue(miniSysYParser.StmtContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIfStmt(miniSysYParser.StmtIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIfStmt(miniSysYParser.StmtIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(miniSysYParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(miniSysYParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExpAddExp(miniSysYParser.RelExpAddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExpAddExp(miniSysYParser.RelExpAddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpRelExpCmpOpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExpRelExpCmpOpAddExp(miniSysYParser.RelExpRelExpCmpOpAddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpRelExpCmpOpAddExp}
	 * labeled alternative in {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExpRelExpCmpOpAddExp(miniSysYParser.RelExpRelExpCmpOpAddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpEqExpEqOpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExpEqExpEqOpRelExp(miniSysYParser.EqExpEqExpEqOpRelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpEqExpEqOpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExpEqExpEqOpRelExp(miniSysYParser.EqExpEqExpEqOpRelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExpRelExp(miniSysYParser.EqExpRelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpRelExp}
	 * labeled alternative in {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExpRelExp(miniSysYParser.EqExpRelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lAndExpLAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExpLAndExpEqExp(miniSysYParser.LAndExpLAndExpEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lAndExpLAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExpLAndExpEqExp(miniSysYParser.LAndExpLAndExpEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExpEqExp(miniSysYParser.LAndExpEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lAndExpEqExp}
	 * labeled alternative in {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExpEqExp(miniSysYParser.LAndExpEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExplAndExp(miniSysYParser.LOrExplAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExplAndExp(miniSysYParser.LOrExplAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lOrExplOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExplOrExplAndExp(miniSysYParser.LOrExplOrExplAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lOrExplOrExplAndExp}
	 * labeled alternative in {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExplOrExplAndExp(miniSysYParser.LOrExplOrExplAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(miniSysYParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(miniSysYParser.LValContext ctx);
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
	 * Enter a parse tree produced by the {@code unaryExpFunc}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpFunc(miniSysYParser.UnaryExpFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpFunc}
	 * labeled alternative in {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpFunc(miniSysYParser.UnaryExpFuncContext ctx);
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
	 * Enter a parse tree produced by the {@code primaryLVal}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryLVal(miniSysYParser.PrimaryLValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryLVal}
	 * labeled alternative in {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryLVal(miniSysYParser.PrimaryLValContext ctx);
}