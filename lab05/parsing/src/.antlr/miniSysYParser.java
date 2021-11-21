// Generated from /home/costwen/CompileLab/lab05/parsing/src/miniSysY.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Return=2, LPar=3, RPar=4, Int=5, LBrace=6, RBrace=7, Semicolon=8, 
		Const=9, Equal=10, If=11, Else=12, AndAnd=13, OrOr=14, OctalConst=15, 
		DecimalConst=16, HexaDecimalConst=17, Ident=18, UnaryOp=19, FOp=20, CmpOp=21, 
		EqOp=22, Whitespace=23, Newline=24, BlockComment=25, LineComment=26;
	public static final int
		RULE_decl = 0, RULE_number = 1, RULE_constDecl = 2, RULE_bType = 3, RULE_constDef = 4, 
		RULE_constInitVal = 5, RULE_constExp = 6, RULE_varDecl = 7, RULE_varDef = 8, 
		RULE_initVal = 9, RULE_compUnit = 10, RULE_funcDef = 11, RULE_funcType = 12, 
		RULE_block = 13, RULE_blockItem = 14, RULE_stmt = 15, RULE_cond = 16, 
		RULE_relExp = 17, RULE_eqExp = 18, RULE_lAndExp = 19, RULE_lOrExp = 20, 
		RULE_lVal = 21, RULE_exp = 22, RULE_addExp = 23, RULE_mulExp = 24, RULE_unaryExp = 25, 
		RULE_primaryExp = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"decl", "number", "constDecl", "bType", "constDef", "constInitVal", "constExp", 
			"varDecl", "varDef", "initVal", "compUnit", "funcDef", "funcType", "block", 
			"blockItem", "stmt", "cond", "relExp", "eqExp", "lAndExp", "lOrExp", 
			"lVal", "exp", "addExp", "mulExp", "unaryExp", "primaryExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'return'", "'('", "')'", "'int'", "'{'", "'}'", "';'", 
			"'const'", "'='", "'if'", "'else'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Return", "LPar", "RPar", "Int", "LBrace", "RBrace", "Semicolon", 
			"Const", "Equal", "If", "Else", "AndAnd", "OrOr", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "Ident", "UnaryOp", "FOp", "CmpOp", "EqOp", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "miniSysY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniSysYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclConstDeclContext extends DeclContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public DeclConstDeclContext(DeclContext ctx) { copyFrom(ctx); }
	}
	public static class DeclVarDeclContext extends DeclContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclVarDeclContext(DeclContext ctx) { copyFrom(ctx); }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decl);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				_localctx = new DeclConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				constDecl();
				}
				break;
			case Int:
				_localctx = new DeclVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DecimalConst() { return getToken(miniSysYParser.DecimalConst, 0); }
		public TerminalNode OctalConst() { return getToken(miniSysYParser.OctalConst, 0); }
		public TerminalNode HexaDecimalConst() { return getToken(miniSysYParser.HexaDecimalConst, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(miniSysYParser.Const, 0); }
		public BTypeContext bType() {
			return getRuleContext(BTypeContext.class,0);
		}
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Const);
			setState(61);
			bType();
			setState(62);
			constDef();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(63);
				match(T__0);
				setState(64);
				constDef();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(miniSysYParser.Int, 0); }
		public BTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bType; }
	}

	public final BTypeContext bType() throws RecognitionException {
		BTypeContext _localctx = new BTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode Equal() { return getToken(miniSysYParser.Equal, 0); }
		public ConstInitValContext constInitVal() {
			return getRuleContext(ConstInitValContext.class,0);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Ident);
			setState(75);
			match(Equal);
			setState(76);
			constInitVal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstInitValContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constInitVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			constExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			addExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public BTypeContext bType() {
			return getRuleContext(BTypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			bType();
			setState(83);
			varDef();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				match(T__0);
				setState(85);
				varDef();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDefIdentInitvalContext extends VarDefContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode Equal() { return getToken(miniSysYParser.Equal, 0); }
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public VarDefIdentInitvalContext(VarDefContext ctx) { copyFrom(ctx); }
	}
	public static class VarDefIdentContext extends VarDefContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public VarDefIdentContext(VarDefContext ctx) { copyFrom(ctx); }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDef);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarDefIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(Ident);
				}
				break;
			case 2:
				_localctx = new VarDefIdentInitvalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(Ident);
				setState(95);
				match(Equal);
				setState(96);
				initVal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitValContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			funcDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			funcType();
			setState(104);
			match(Ident);
			setState(105);
			match(LPar);
			setState(106);
			match(RPar);
			setState(107);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(miniSysYParser.Int, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(miniSysYParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(miniSysYParser.RBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LBrace);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Return) | (1L << LPar) | (1L << Int) | (1L << LBrace) | (1L << Semicolon) | (1L << Const) | (1L << If) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
				{
				{
				setState(112);
				blockItem();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	 
		public BlockItemContext() { }
		public void copyFrom(BlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockItemStmtContext extends BlockItemContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemStmtContext(BlockItemContext ctx) { copyFrom(ctx); }
	}
	public static class BlockItemDeclContext extends BlockItemContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlockItemDeclContext(BlockItemContext ctx) { copyFrom(ctx); }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockItem);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Const:
				_localctx = new BlockItemDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				decl();
				}
				break;
			case Return:
			case LPar:
			case LBrace:
			case Semicolon:
			case If:
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
			case Ident:
			case UnaryOp:
				_localctx = new BlockItemStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtBlockContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtExpContext extends StmtContext {
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtExpContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtlValContext extends StmtContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public TerminalNode Equal() { return getToken(miniSysYParser.Equal, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public StmtlValContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtReturnExpContext extends StmtContext {
		public TerminalNode Return() { return getToken(miniSysYParser.Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public StmtReturnExpContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfStmtContext extends StmtContext {
		public TerminalNode If() { return getToken(miniSysYParser.If, 0); }
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(miniSysYParser.Else, 0); }
		public StmtIfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmtlValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				lVal();
				setState(125);
				match(Equal);
				setState(126);
				exp();
				setState(127);
				match(Semicolon);
				}
				break;
			case 2:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				block();
				}
				break;
			case 3:
				_localctx = new StmtExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(130);
					exp();
					}
				}

				setState(133);
				match(Semicolon);
				}
				break;
			case 4:
				_localctx = new StmtReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(Return);
				setState(135);
				exp();
				setState(136);
				match(Semicolon);
				}
				break;
			case 5:
				_localctx = new StmtIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(If);
				setState(139);
				match(LPar);
				setState(140);
				cond();
				setState(141);
				match(RPar);
				setState(142);
				stmt();
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(143);
					match(Else);
					setState(144);
					stmt();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			lOrExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpContext extends ParserRuleContext {
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
	 
		public RelExpContext() { }
		public void copyFrom(RelExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelExpAddExpContext extends RelExpContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public RelExpAddExpContext(RelExpContext ctx) { copyFrom(ctx); }
	}
	public static class RelExpRelExpCmpOpAddExpContext extends RelExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode CmpOp() { return getToken(miniSysYParser.CmpOp, 0); }
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public RelExpRelExpCmpOpAddExpContext(RelExpContext ctx) { copyFrom(ctx); }
	}

	public final RelExpContext relExp() throws RecognitionException {
		return relExp(0);
	}

	private RelExpContext relExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpContext _localctx = new RelExpContext(_ctx, _parentState);
		RelExpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelExpAddExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(152);
			addExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelExpRelExpCmpOpAddExpContext(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(154);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(155);
					match(CmpOp);
					setState(156);
					addExp(0);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExpContext extends ParserRuleContext {
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
	 
		public EqExpContext() { }
		public void copyFrom(EqExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqExpEqExpEqOpRelExpContext extends EqExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public TerminalNode EqOp() { return getToken(miniSysYParser.EqOp, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExpEqExpEqOpRelExpContext(EqExpContext ctx) { copyFrom(ctx); }
	}
	public static class EqExpRelExpContext extends EqExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExpRelExpContext(EqExpContext ctx) { copyFrom(ctx); }
	}

	public final EqExpContext eqExp() throws RecognitionException {
		return eqExp(0);
	}

	private EqExpContext eqExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpContext _localctx = new EqExpContext(_ctx, _parentState);
		EqExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_eqExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqExpRelExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(163);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExpEqExpEqOpRelExpContext(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(165);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(166);
					match(EqOp);
					setState(167);
					relExp(0);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LAndExpContext extends ParserRuleContext {
		public LAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAndExp; }
	 
		public LAndExpContext() { }
		public void copyFrom(LAndExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LAndExpLAndExpEqExpContext extends LAndExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(miniSysYParser.AndAnd, 0); }
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExpLAndExpEqExpContext(LAndExpContext ctx) { copyFrom(ctx); }
	}
	public static class LAndExpEqExpContext extends LAndExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExpEqExpContext(LAndExpContext ctx) { copyFrom(ctx); }
	}

	public final LAndExpContext lAndExp() throws RecognitionException {
		return lAndExp(0);
	}

	private LAndExpContext lAndExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LAndExpContext _localctx = new LAndExpContext(_ctx, _parentState);
		LAndExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LAndExpEqExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(174);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LAndExpLAndExpEqExpContext(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(176);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(177);
					match(AndAnd);
					setState(178);
					eqExp(0);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LOrExpContext extends ParserRuleContext {
		public LOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lOrExp; }
	 
		public LOrExpContext() { }
		public void copyFrom(LOrExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LOrExplAndExpContext extends LOrExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LOrExplAndExpContext(LOrExpContext ctx) { copyFrom(ctx); }
	}
	public static class LOrExplOrExplAndExpContext extends LOrExpContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(miniSysYParser.OrOr, 0); }
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LOrExplOrExplAndExpContext(LOrExpContext ctx) { copyFrom(ctx); }
	}

	public final LOrExpContext lOrExp() throws RecognitionException {
		return lOrExp(0);
	}

	private LOrExpContext lOrExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LOrExpContext _localctx = new LOrExpContext(_ctx, _parentState);
		LOrExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LOrExplAndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(185);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOrExplOrExplAndExpContext(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(187);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(188);
					match(OrOr);
					setState(189);
					lAndExp(0);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LValContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			addExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpContext extends ParserRuleContext {
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
	 
		public AddExpContext() { }
		public void copyFrom(AddExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpMulExpContext extends AddExpContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExpMulExpContext(AddExpContext ctx) { copyFrom(ctx); }
	}
	public static class AddExpAddExpOpMulExpContext extends AddExpContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public TerminalNode UnaryOp() { return getToken(miniSysYParser.UnaryOp, 0); }
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExpAddExpOpMulExpContext(AddExpContext ctx) { copyFrom(ctx); }
	}

	public final AddExpContext addExp() throws RecognitionException {
		return addExp(0);
	}

	private AddExpContext addExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpContext _localctx = new AddExpContext(_ctx, _parentState);
		AddExpContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_addExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExpMulExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(200);
			mulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExpAddExpOpMulExpContext(new AddExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addExp);
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203);
					match(UnaryOp);
					setState(204);
					mulExp(0);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExpContext extends ParserRuleContext {
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
	 
		public MulExpContext() { }
		public void copyFrom(MulExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulExpMulExpOpUnaryExpContext extends MulExpContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public TerminalNode FOp() { return getToken(miniSysYParser.FOp, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExpMulExpOpUnaryExpContext(MulExpContext ctx) { copyFrom(ctx); }
	}
	public static class MulExpUnaryExpContext extends MulExpContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExpUnaryExpContext(MulExpContext ctx) { copyFrom(ctx); }
	}

	public final MulExpContext mulExp() throws RecognitionException {
		return mulExp(0);
	}

	private MulExpContext mulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpContext _localctx = new MulExpContext(_ctx, _parentState);
		MulExpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_mulExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulExpUnaryExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(211);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpMulExpOpUnaryExpContext(new MulExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulExp);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(FOp);
					setState(215);
					unaryExp();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
	 
		public UnaryExpContext() { }
		public void copyFrom(UnaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpFuncContext extends UnaryExpContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public UnaryExpFuncContext(UnaryExpContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpUnaryOpUnaryExpContext extends UnaryExpContext {
		public TerminalNode UnaryOp() { return getToken(miniSysYParser.UnaryOp, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public UnaryExpUnaryOpUnaryExpContext(UnaryExpContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpPrimaryExpContext extends UnaryExpContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public UnaryExpPrimaryExpContext(UnaryExpContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExp);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new UnaryExpPrimaryExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new UnaryExpFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Ident);
				setState(223);
				match(LPar);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(224);
					exp();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(225);
						match(T__0);
						setState(226);
						exp();
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
				match(RPar);
				}
				break;
			case 3:
				_localctx = new UnaryExpUnaryOpUnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(UnaryOp);
				setState(236);
				unaryExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpContext extends ParserRuleContext {
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
	 
		public PrimaryExpContext() { }
		public void copyFrom(PrimaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryLValContext extends PrimaryExpContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public PrimaryLValContext(PrimaryExpContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExpExpContext extends PrimaryExpContext {
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public PrimaryExpExpContext(PrimaryExpContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryNumberContext extends PrimaryExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimaryNumberContext(PrimaryExpContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExp);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
				_localctx = new PrimaryExpExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(LPar);
				setState(240);
				exp();
				setState(241);
				match(RPar);
				}
				break;
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
				_localctx = new PrimaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				number();
				}
				break;
			case Ident:
				_localctx = new PrimaryLValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				lVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 18:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 19:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 20:
			return lOrExp_sempred((LOrExpContext)_localctx, predIndex);
		case 23:
			return addExp_sempred((AddExpContext)_localctx, predIndex);
		case 24:
			return mulExp_sempred((MulExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relExp_sempred(RelExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExp_sempred(EqExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lAndExp_sempred(LAndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lOrExp_sempred(LOrExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExp_sempred(AddExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulExp_sempred(MulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\nd\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\7\17t\n\17\f\17\16\17w\13\17\3\17\3\17\3\20\3\20\5\20}\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0086\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0094\n\21\5\21\u0096\n\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ab\n\24\f\24\16\24\u00ae"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00b6\n\25\f\25\16\25\u00b9"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00c1\n\26\f\26\16\26\u00c4"+
		"\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00d0\n"+
		"\31\f\31\16\31\u00d3\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00db\n"+
		"\32\f\32\16\32\u00de\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00e6\n"+
		"\33\f\33\16\33\u00e9\13\33\5\33\u00eb\n\33\3\33\3\33\3\33\5\33\u00f0\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f8\n\34\3\34\2\b$&(*\60\62\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2\21"+
		"\23\2\u00f6\2:\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fP"+
		"\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22c\3\2\2\2\24e\3\2\2\2\26g\3\2\2\2\30"+
		"i\3\2\2\2\32o\3\2\2\2\34q\3\2\2\2\36|\3\2\2\2 \u0095\3\2\2\2\"\u0097\3"+
		"\2\2\2$\u0099\3\2\2\2&\u00a4\3\2\2\2(\u00af\3\2\2\2*\u00ba\3\2\2\2,\u00c5"+
		"\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00d4\3\2\2\2\64\u00ef\3\2"+
		"\2\2\66\u00f7\3\2\2\28;\5\6\4\29;\5\20\t\2:8\3\2\2\2:9\3\2\2\2;\3\3\2"+
		"\2\2<=\t\2\2\2=\5\3\2\2\2>?\7\13\2\2?@\5\b\5\2@E\5\n\6\2AB\7\3\2\2BD\5"+
		"\n\6\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7"+
		"\n\2\2I\7\3\2\2\2JK\7\7\2\2K\t\3\2\2\2LM\7\24\2\2MN\7\f\2\2NO\5\f\7\2"+
		"O\13\3\2\2\2PQ\5\16\b\2Q\r\3\2\2\2RS\5\60\31\2S\17\3\2\2\2TU\5\b\5\2U"+
		"Z\5\22\n\2VW\7\3\2\2WY\5\22\n\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[]\3\2\2\2\\Z\3\2\2\2]^\7\n\2\2^\21\3\2\2\2_d\7\24\2\2`a\7\24\2\2ab"+
		"\7\f\2\2bd\5\24\13\2c_\3\2\2\2c`\3\2\2\2d\23\3\2\2\2ef\5.\30\2f\25\3\2"+
		"\2\2gh\5\30\r\2h\27\3\2\2\2ij\5\32\16\2jk\7\24\2\2kl\7\5\2\2lm\7\6\2\2"+
		"mn\5\34\17\2n\31\3\2\2\2op\7\7\2\2p\33\3\2\2\2qu\7\b\2\2rt\5\36\20\2s"+
		"r\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\t\2\2"+
		"y\35\3\2\2\2z}\5\2\2\2{}\5 \21\2|z\3\2\2\2|{\3\2\2\2}\37\3\2\2\2~\177"+
		"\5,\27\2\177\u0080\7\f\2\2\u0080\u0081\5.\30\2\u0081\u0082\7\n\2\2\u0082"+
		"\u0096\3\2\2\2\u0083\u0096\5\34\17\2\u0084\u0086\5.\30\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0096\7\n\2\2\u0088"+
		"\u0089\7\4\2\2\u0089\u008a\5.\30\2\u008a\u008b\7\n\2\2\u008b\u0096\3\2"+
		"\2\2\u008c\u008d\7\r\2\2\u008d\u008e\7\5\2\2\u008e\u008f\5\"\22\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0093\5 \21\2\u0091\u0092\7\16\2\2\u0092\u0094\5"+
		" \21\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"~\3\2\2\2\u0095\u0083\3\2\2\2\u0095\u0085\3\2\2\2\u0095\u0088\3\2\2\2"+
		"\u0095\u008c\3\2\2\2\u0096!\3\2\2\2\u0097\u0098\5*\26\2\u0098#\3\2\2\2"+
		"\u0099\u009a\b\23\1\2\u009a\u009b\5\60\31\2\u009b\u00a1\3\2\2\2\u009c"+
		"\u009d\f\3\2\2\u009d\u009e\7\27\2\2\u009e\u00a0\5\60\31\2\u009f\u009c"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"%\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\24\1\2\u00a5\u00a6\5$\23\2"+
		"\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00ab"+
		"\5$\23\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\'\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\25\1"+
		"\2\u00b0\u00b1\5&\24\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\f\3\2\2\u00b3\u00b4"+
		"\7\17\2\2\u00b4\u00b6\5&\24\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00ba\u00bb\b\26\1\2\u00bb\u00bc\5(\25\2\u00bc\u00c2\3\2\2\2\u00bd"+
		"\u00be\f\3\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c1\5(\25\2\u00c0\u00bd\3"+
		"\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"+\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6-\3\2\2\2\u00c7"+
		"\u00c8\5\60\31\2\u00c8/\3\2\2\2\u00c9\u00ca\b\31\1\2\u00ca\u00cb\5\62"+
		"\32\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\f\3\2\2\u00cd\u00ce\7\25\2\2\u00ce"+
		"\u00d0\5\62\32\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\61\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\b\32\1\2\u00d5\u00d6\5\64\33\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8"+
		"\f\3\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00db\5\64\33\2\u00da\u00d7\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\63"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00f0\5\66\34\2\u00e0\u00e1\7\24\2"+
		"\2\u00e1\u00ea\7\5\2\2\u00e2\u00e7\5.\30\2\u00e3\u00e4\7\3\2\2\u00e4\u00e6"+
		"\5.\30\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e2\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\7\6\2\2\u00ed"+
		"\u00ee\7\25\2\2\u00ee\u00f0\5\64\33\2\u00ef\u00df\3\2\2\2\u00ef\u00e0"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\65\3\2\2\2\u00f1\u00f2\7\5\2\2\u00f2"+
		"\u00f3\5.\30\2\u00f3\u00f4\7\6\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f8\5\4"+
		"\3\2\u00f6\u00f8\5,\27\2\u00f7\u00f1\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\67\3\2\2\2\25:EZcu|\u0085\u0093\u0095\u00a1\u00ac"+
		"\u00b7\u00c2\u00d1\u00dc\u00e7\u00ea\u00ef\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}