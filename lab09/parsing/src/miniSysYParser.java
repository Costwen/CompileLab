// Generated from miniSysY.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Return=2, LPar=3, RPar=4, Int=5, LBrace=6, RBrace=7, Semicolon=8, 
		While=9, Const=10, Equal=11, Break=12, If=13, Else=14, Continue=15, LBrackets=16, 
		RBrackets=17, Void=18, AndAnd=19, OrOr=20, OctalConst=21, DecimalConst=22, 
		HexaDecimalConst=23, Ident=24, UnaryOp=25, FOp=26, CmpOp=27, EqOp=28, 
		Whitespace=29, Newline=30, BlockComment=31, LineComment=32;
	public static final int
		RULE_decl = 0, RULE_number = 1, RULE_constDecl = 2, RULE_bType = 3, RULE_constDef = 4, 
		RULE_constInitVal = 5, RULE_constExp = 6, RULE_varDecl = 7, RULE_varDef = 8, 
		RULE_initVal = 9, RULE_compUnit = 10, RULE_funcDef = 11, RULE_funcType = 12, 
		RULE_funcFParams = 13, RULE_funcFParam = 14, RULE_block = 15, RULE_blockItem = 16, 
		RULE_stmt = 17, RULE_cond = 18, RULE_relExp = 19, RULE_eqExp = 20, RULE_lAndExp = 21, 
		RULE_lOrExp = 22, RULE_lVal = 23, RULE_exp = 24, RULE_addExp = 25, RULE_mulExp = 26, 
		RULE_unaryExp = 27, RULE_primaryExp = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"decl", "number", "constDecl", "bType", "constDef", "constInitVal", "constExp", 
			"varDecl", "varDef", "initVal", "compUnit", "funcDef", "funcType", "funcFParams", 
			"funcFParam", "block", "blockItem", "stmt", "cond", "relExp", "eqExp", 
			"lAndExp", "lOrExp", "lVal", "exp", "addExp", "mulExp", "unaryExp", "primaryExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'return'", "'('", "')'", "'int'", "'{'", "'}'", "';'", 
			"'while'", "'const'", "'='", "'break'", "'if'", "'else'", "'continue'", 
			"'['", "']'", "'void'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Return", "LPar", "RPar", "Int", "LBrace", "RBrace", "Semicolon", 
			"While", "Const", "Equal", "Break", "If", "Else", "Continue", "LBrackets", 
			"RBrackets", "Void", "AndAnd", "OrOr", "OctalConst", "DecimalConst", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterDeclConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitDeclConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitDeclConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclVarDeclContext extends DeclContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclVarDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterDeclVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitDeclVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitDeclVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decl);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				_localctx = new DeclConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				constDecl();
				}
				break;
			case Int:
				_localctx = new DeclVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Const);
			setState(65);
			bType();
			setState(66);
			constDef();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(67);
				match(T__0);
				setState(68);
				constDef();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BTypeContext bType() throws RecognitionException {
		BTypeContext _localctx = new BTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		public List<TerminalNode> LBrackets() { return getTokens(miniSysYParser.LBrackets); }
		public TerminalNode LBrackets(int i) {
			return getToken(miniSysYParser.LBrackets, i);
		}
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public List<TerminalNode> RBrackets() { return getTokens(miniSysYParser.RBrackets); }
		public TerminalNode RBrackets(int i) {
			return getToken(miniSysYParser.RBrackets, i);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Ident);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBrackets) {
				{
				{
				setState(79);
				match(LBrackets);
				setState(80);
				constExp();
				setState(81);
				match(RBrackets);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(Equal);
			setState(89);
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
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
	 
		public ConstInitValContext() { }
		public void copyFrom(ConstInitValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstInitValConstExpContext extends ConstInitValContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstInitValConstExpContext(ConstInitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstInitValConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstInitValConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstInitValConstExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstInitValLBracketsContext extends ConstInitValContext {
		public TerminalNode LBrace() { return getToken(miniSysYParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(miniSysYParser.RBrace, 0); }
		public List<ConstInitValContext> constInitVal() {
			return getRuleContexts(ConstInitValContext.class);
		}
		public ConstInitValContext constInitVal(int i) {
			return getRuleContext(ConstInitValContext.class,i);
		}
		public ConstInitValLBracketsContext(ConstInitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstInitValLBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstInitValLBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstInitValLBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constInitVal);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
			case Ident:
			case UnaryOp:
				_localctx = new ConstInitValConstExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				constExp();
				}
				break;
			case LBrace:
				_localctx = new ConstInitValLBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(LBrace);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << LBrace) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(93);
					constInitVal();
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(94);
						match(T__0);
						setState(95);
						constInitVal();
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(103);
				match(RBrace);
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

	public static class ConstExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			bType();
			setState(109);
			varDef();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				match(T__0);
				setState(111);
				varDef();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		public List<TerminalNode> LBrackets() { return getTokens(miniSysYParser.LBrackets); }
		public TerminalNode LBrackets(int i) {
			return getToken(miniSysYParser.LBrackets, i);
		}
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public List<TerminalNode> RBrackets() { return getTokens(miniSysYParser.RBrackets); }
		public TerminalNode RBrackets(int i) {
			return getToken(miniSysYParser.RBrackets, i);
		}
		public VarDefIdentInitvalContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterVarDefIdentInitval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitVarDefIdentInitval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitVarDefIdentInitval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefIdentContext extends VarDefContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public List<TerminalNode> LBrackets() { return getTokens(miniSysYParser.LBrackets); }
		public TerminalNode LBrackets(int i) {
			return getToken(miniSysYParser.LBrackets, i);
		}
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public List<TerminalNode> RBrackets() { return getTokens(miniSysYParser.RBrackets); }
		public TerminalNode RBrackets(int i) {
			return getToken(miniSysYParser.RBrackets, i);
		}
		public VarDefIdentContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterVarDefIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitVarDefIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitVarDefIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDef);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VarDefIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(Ident);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBrackets) {
					{
					{
					setState(120);
					match(LBrackets);
					setState(121);
					constExp();
					setState(122);
					match(RBrackets);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new VarDefIdentInitvalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(Ident);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBrackets) {
					{
					{
					setState(130);
					match(LBrackets);
					setState(131);
					constExp();
					setState(132);
					match(RBrackets);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(Equal);
				setState(140);
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
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
	 
		public InitValContext() { }
		public void copyFrom(InitValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitValExpContext extends InitValContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitValExpContext(InitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterInitValExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitInitValExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitInitValExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitValInitValContext extends InitValContext {
		public TerminalNode LBrace() { return getToken(miniSysYParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(miniSysYParser.RBrace, 0); }
		public List<InitValContext> initVal() {
			return getRuleContexts(InitValContext.class);
		}
		public InitValContext initVal(int i) {
			return getRuleContext(InitValContext.class,i);
		}
		public InitValInitValContext(InitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterInitValInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitInitValInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitInitValInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initVal);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
			case Ident:
			case UnaryOp:
				_localctx = new InitValExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				exp();
				}
				break;
			case LBrace:
				_localctx = new InitValInitValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(LBrace);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << LBrace) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(145);
					initVal();
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(146);
						match(T__0);
						setState(147);
						initVal();
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(155);
				match(RBrace);
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

	public static class CompUnitContext extends ParserRuleContext {
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
	 
		public CompUnitContext() { }
		public void copyFrom(CompUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompUnitcompUnitDeclContext extends CompUnitContext {
		public CompUnitContext compUnit() {
			return getRuleContext(CompUnitContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CompUnitcompUnitDeclContext(CompUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnitcompUnitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnitcompUnitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnitcompUnitDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompUnitFuncDefContext extends CompUnitContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitFuncDefContext(CompUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnitFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompUnitDeclContext extends CompUnitContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CompUnitDeclContext(CompUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnitDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompUnitcompUnitFuncDefContext extends CompUnitContext {
		public CompUnitContext compUnit() {
			return getRuleContext(CompUnitContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitcompUnitFuncDefContext(CompUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnitcompUnitFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnitcompUnitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnitcompUnitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		return compUnit(0);
	}

	private CompUnitContext compUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompUnitContext _localctx = new CompUnitContext(_ctx, _parentState);
		CompUnitContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_compUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CompUnitDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				decl();
				}
				break;
			case 2:
				{
				_localctx = new CompUnitFuncDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				funcDef();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new CompUnitcompUnitDeclContext(new CompUnitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compUnit);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						decl();
						}
						break;
					case 2:
						{
						_localctx = new CompUnitcompUnitFuncDefContext(new CompUnitContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compUnit);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						funcDef();
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public FuncFParamsContext funcFParams() {
			return getRuleContext(FuncFParamsContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			funcType();
			setState(173);
			match(Ident);
			setState(174);
			match(LPar);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int) {
				{
				setState(175);
				funcFParams();
				}
			}

			setState(178);
			match(RPar);
			setState(179);
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
		public TerminalNode Void() { return getToken(miniSysYParser.Void, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Void) ) {
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

	public static class FuncFParamsContext extends ParserRuleContext {
		public List<FuncFParamContext> funcFParam() {
			return getRuleContexts(FuncFParamContext.class);
		}
		public FuncFParamContext funcFParam(int i) {
			return getRuleContext(FuncFParamContext.class,i);
		}
		public FuncFParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncFParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncFParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncFParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncFParamsContext funcFParams() throws RecognitionException {
		FuncFParamsContext _localctx = new FuncFParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcFParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			funcFParam();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(184);
				match(T__0);
				setState(185);
				funcFParam();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FuncFParamContext extends ParserRuleContext {
		public BTypeContext bType() {
			return getRuleContext(BTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public List<TerminalNode> LBrackets() { return getTokens(miniSysYParser.LBrackets); }
		public TerminalNode LBrackets(int i) {
			return getToken(miniSysYParser.LBrackets, i);
		}
		public List<TerminalNode> RBrackets() { return getTokens(miniSysYParser.RBrackets); }
		public TerminalNode RBrackets(int i) {
			return getToken(miniSysYParser.RBrackets, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncFParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncFParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncFParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncFParamContext funcFParam() throws RecognitionException {
		FuncFParamContext _localctx = new FuncFParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcFParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			bType();
			setState(192);
			match(Ident);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBrackets) {
				{
				setState(193);
				match(LBrackets);
				setState(194);
				match(RBrackets);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBrackets) {
					{
					{
					setState(195);
					match(LBrackets);
					setState(196);
					exp();
					setState(197);
					match(RBrackets);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LBrace);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Return) | (1L << LPar) | (1L << Int) | (1L << LBrace) | (1L << Semicolon) | (1L << While) | (1L << Const) | (1L << Break) | (1L << If) | (1L << Continue) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
				{
				{
				setState(207);
				blockItem();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlockItemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlockItemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlockItemStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockItemDeclContext extends BlockItemContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlockItemDeclContext(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlockItemDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlockItemDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlockItemDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockItem);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Const:
				_localctx = new BlockItemDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				decl();
				}
				break;
			case Return:
			case LPar:
			case LBrace:
			case Semicolon:
			case While:
			case Break:
			case If:
			case Continue:
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
			case Ident:
			case UnaryOp:
				_localctx = new BlockItemStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtExpContext extends StmtContext {
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtBreakContext extends StmtContext {
		public TerminalNode Break() { return getToken(miniSysYParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public StmtBreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtBreak(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtlVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtlVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtlVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReturnExpContext extends StmtContext {
		public TerminalNode Return() { return getToken(miniSysYParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtReturnExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtReturnExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtWhileExpContext extends StmtContext {
		public TerminalNode While() { return getToken(miniSysYParser.While, 0); }
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtWhileExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtWhileExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtWhileExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtWhileExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtContinueContext extends StmtContext {
		public TerminalNode Continue() { return getToken(miniSysYParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public StmtContinueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmtContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmtContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmtContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new StmtlValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				lVal();
				setState(220);
				match(Equal);
				setState(221);
				exp();
				setState(222);
				match(Semicolon);
				}
				break;
			case 2:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				block();
				}
				break;
			case 3:
				_localctx = new StmtExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(225);
					exp();
					}
				}

				setState(228);
				match(Semicolon);
				}
				break;
			case 4:
				_localctx = new StmtReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(Return);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(230);
					exp();
					}
				}

				setState(233);
				match(Semicolon);
				}
				break;
			case 5:
				_localctx = new StmtWhileExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(While);
				setState(235);
				match(LPar);
				setState(236);
				cond();
				setState(237);
				match(RPar);
				setState(238);
				stmt();
				}
				break;
			case 6:
				_localctx = new StmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(Break);
				setState(241);
				match(Semicolon);
				}
				break;
			case 7:
				_localctx = new StmtContinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(Continue);
				setState(243);
				match(Semicolon);
				}
				break;
			case 8:
				_localctx = new StmtIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(If);
				setState(245);
				match(LPar);
				setState(246);
				cond();
				setState(247);
				match(RPar);
				setState(248);
				stmt();
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(249);
					match(Else);
					setState(250);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterRelExpAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitRelExpAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitRelExpAddExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterRelExpRelExpCmpOpAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitRelExpRelExpCmpOpAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitRelExpRelExpCmpOpAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		return relExp(0);
	}

	private RelExpContext relExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpContext _localctx = new RelExpContext(_ctx, _parentState);
		RelExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_relExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelExpAddExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(258);
			addExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelExpRelExpCmpOpAddExpContext(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(260);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(261);
					match(CmpOp);
					setState(262);
					addExp(0);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterEqExpEqExpEqOpRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitEqExpEqExpEqOpRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitEqExpEqExpEqOpRelExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpRelExpContext extends EqExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExpRelExpContext(EqExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterEqExpRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitEqExpRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitEqExpRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		return eqExp(0);
	}

	private EqExpContext eqExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpContext _localctx = new EqExpContext(_ctx, _parentState);
		EqExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_eqExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqExpRelExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(269);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExpEqExpEqOpRelExpContext(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(271);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(272);
					match(EqOp);
					setState(273);
					relExp(0);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLAndExpLAndExpEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLAndExpLAndExpEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLAndExpLAndExpEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LAndExpEqExpContext extends LAndExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExpEqExpContext(LAndExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLAndExpEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLAndExpEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLAndExpEqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LAndExpContext lAndExp() throws RecognitionException {
		return lAndExp(0);
	}

	private LAndExpContext lAndExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LAndExpContext _localctx = new LAndExpContext(_ctx, _parentState);
		LAndExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LAndExpEqExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(280);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LAndExpLAndExpEqExpContext(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(282);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(283);
					match(AndAnd);
					setState(284);
					eqExp(0);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLOrExplAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLOrExplAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLOrExplAndExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLOrExplOrExplAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLOrExplOrExplAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLOrExplOrExplAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LOrExpContext lOrExp() throws RecognitionException {
		return lOrExp(0);
	}

	private LOrExpContext lOrExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LOrExpContext _localctx = new LOrExpContext(_ctx, _parentState);
		LOrExpContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LOrExplAndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(291);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOrExplOrExplAndExpContext(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(293);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(294);
					match(OrOr);
					setState(295);
					lAndExp(0);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<TerminalNode> LBrackets() { return getTokens(miniSysYParser.LBrackets); }
		public TerminalNode LBrackets(int i) {
			return getToken(miniSysYParser.LBrackets, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> RBrackets() { return getTokens(miniSysYParser.RBrackets); }
		public TerminalNode RBrackets(int i) {
			return getToken(miniSysYParser.RBrackets, i);
		}
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lVal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Ident);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(LBrackets);
					setState(303);
					exp();
					setState(304);
					match(RBrackets);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterAddExpMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitAddExpMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitAddExpMulExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterAddExpAddExpOpMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitAddExpAddExpOpMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitAddExpAddExpOpMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		return addExp(0);
	}

	private AddExpContext addExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpContext _localctx = new AddExpContext(_ctx, _parentState);
		AddExpContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_addExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExpMulExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(314);
			mulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExpAddExpOpMulExpContext(new AddExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addExp);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					match(UnaryOp);
					setState(318);
					mulExp(0);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterMulExpMulExpOpUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitMulExpMulExpOpUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitMulExpMulExpOpUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpUnaryExpContext extends MulExpContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExpUnaryExpContext(MulExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterMulExpUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitMulExpUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitMulExpUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		return mulExp(0);
	}

	private MulExpContext mulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpContext _localctx = new MulExpContext(_ctx, _parentState);
		MulExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_mulExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulExpUnaryExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(325);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpMulExpOpUnaryExpContext(new MulExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulExp);
					setState(327);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(328);
					match(FOp);
					setState(329);
					unaryExp();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterUnaryExpFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitUnaryExpFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitUnaryExpFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpUnaryOpUnaryExpContext extends UnaryExpContext {
		public TerminalNode UnaryOp() { return getToken(miniSysYParser.UnaryOp, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public UnaryExpUnaryOpUnaryExpContext(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterUnaryExpUnaryOpUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitUnaryExpUnaryOpUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitUnaryExpUnaryOpUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpPrimaryExpContext extends UnaryExpContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public UnaryExpPrimaryExpContext(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterUnaryExpPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitUnaryExpPrimaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitUnaryExpPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExp);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new UnaryExpPrimaryExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new UnaryExpFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(Ident);
				setState(337);
				match(LPar);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPar) | (1L << OctalConst) | (1L << DecimalConst) | (1L << HexaDecimalConst) | (1L << Ident) | (1L << UnaryOp))) != 0)) {
					{
					setState(338);
					exp();
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(339);
						match(T__0);
						setState(340);
						exp();
						}
						}
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(348);
				match(RPar);
				}
				break;
			case 3:
				_localctx = new UnaryExpUnaryOpUnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(UnaryOp);
				setState(350);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterPrimaryLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitPrimaryLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitPrimaryLVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpExpContext extends PrimaryExpContext {
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public PrimaryExpExpContext(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterPrimaryExpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitPrimaryExpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitPrimaryExpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryNumberContext extends PrimaryExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimaryNumberContext(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterPrimaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitPrimaryNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitPrimaryNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryExp);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
				_localctx = new PrimaryExpExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(LPar);
				setState(354);
				exp();
				setState(355);
				match(RPar);
				}
				break;
			case OctalConst:
			case DecimalConst:
			case HexaDecimalConst:
				_localctx = new PrimaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				number();
				}
				break;
			case Ident:
				_localctx = new PrimaryLValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
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
		case 10:
			return compUnit_sempred((CompUnitContext)_localctx, predIndex);
		case 19:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 20:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 21:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 22:
			return lOrExp_sempred((LOrExpContext)_localctx, predIndex);
		case 25:
			return addExp_sempred((AddExpContext)_localctx, predIndex);
		case 26:
			return mulExp_sempred((MulExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compUnit_sempred(CompUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean relExp_sempred(RelExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExp_sempred(EqExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lAndExp_sempred(LAndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lOrExp_sempred(LOrExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExp_sempred(AddExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulExp_sempred(MulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\5\2?\n\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7c\n\7\f\7\16\7f\13\7\5\7h\n\7\3\7\5\7k\n\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n"+
		"\16\n\u0082\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n"+
		"\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16"+
		"\13\u009a\13\13\5\13\u009c\n\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f\5\f\u00a4"+
		"\n\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\3\r"+
		"\5\r\u00b3\n\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u00bd\n\17\f"+
		"\17\16\17\u00c0\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ca"+
		"\n\20\f\20\16\20\u00cd\13\20\5\20\u00cf\n\20\3\21\3\21\7\21\u00d3\n\21"+
		"\f\21\16\21\u00d6\13\21\3\21\3\21\3\22\3\22\5\22\u00dc\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00e5\n\23\3\23\3\23\3\23\5\23\u00ea\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\5\23\u0100\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u010a\n\25\f\25\16\25\u010d\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0115\n\26\f\26\16\26\u0118\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0120\n\27\f\27\16\27\u0123\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u012b\n\30\f\30\16\30\u012e\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0135\n\31\f\31\16\31\u0138\13\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0142\n\33\f\33\16\33\u0145\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u014d\n\34\f\34\16\34\u0150\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0158\n\35\f\35\16\35\u015b\13\35"+
		"\5\35\u015d\n\35\3\35\3\35\3\35\5\35\u0162\n\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u016a\n\36\3\36\2\t\26(*,.\64\66\37\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4\3\2\27\31\4\2\7\7\24\24"+
		"\2\u017b\2>\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fj\3\2"+
		"\2\2\16l\3\2\2\2\20n\3\2\2\2\22\u008f\3\2\2\2\24\u009e\3\2\2\2\26\u00a3"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b7\3\2\2\2\34\u00b9\3\2\2\2\36\u00c1\3"+
		"\2\2\2 \u00d0\3\2\2\2\"\u00db\3\2\2\2$\u00ff\3\2\2\2&\u0101\3\2\2\2(\u0103"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0119\3\2\2\2.\u0124\3\2\2\2\60\u012f\3\2\2\2"+
		"\62\u0139\3\2\2\2\64\u013b\3\2\2\2\66\u0146\3\2\2\28\u0161\3\2\2\2:\u0169"+
		"\3\2\2\2<?\5\6\4\2=?\5\20\t\2><\3\2\2\2>=\3\2\2\2?\3\3\2\2\2@A\t\2\2\2"+
		"A\5\3\2\2\2BC\7\f\2\2CD\5\b\5\2DI\5\n\6\2EF\7\3\2\2FH\5\n\6\2GE\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\n\2\2M\7\3\2"+
		"\2\2NO\7\7\2\2O\t\3\2\2\2PW\7\32\2\2QR\7\22\2\2RS\5\16\b\2ST\7\23\2\2"+
		"TV\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2"+
		"Z[\7\r\2\2[\\\5\f\7\2\\\13\3\2\2\2]k\5\16\b\2^g\7\b\2\2_d\5\f\7\2`a\7"+
		"\3\2\2ac\5\f\7\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2g_\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\t\2\2j]\3\2\2\2j^\3\2\2\2k\r"+
		"\3\2\2\2lm\5\64\33\2m\17\3\2\2\2no\5\b\5\2ot\5\22\n\2pq\7\3\2\2qs\5\22"+
		"\n\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\n"+
		"\2\2x\21\3\2\2\2y\u0080\7\32\2\2z{\7\22\2\2{|\5\16\b\2|}\7\23\2\2}\177"+
		"\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0090\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u008a\7\32\2\2\u0084"+
		"\u0085\7\22\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\23\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\r"+
		"\2\2\u008e\u0090\5\24\13\2\u008fy\3\2\2\2\u008f\u0083\3\2\2\2\u0090\23"+
		"\3\2\2\2\u0091\u009f\5\62\32\2\u0092\u009b\7\b\2\2\u0093\u0098\5\24\13"+
		"\2\u0094\u0095\7\3\2\2\u0095\u0097\5\24\13\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\7\t\2\2\u009e\u0091\3\2\2\2\u009e\u0092\3\2"+
		"\2\2\u009f\25\3\2\2\2\u00a0\u00a1\b\f\1\2\u00a1\u00a4\5\2\2\2\u00a2\u00a4"+
		"\5\30\r\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00ab\3\2\2\2"+
		"\u00a5\u00a6\f\6\2\2\u00a6\u00aa\5\2\2\2\u00a7\u00a8\f\5\2\2\u00a8\u00aa"+
		"\5\30\r\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\7\32\2\2\u00b0\u00b2\7\5\2"+
		"\2\u00b1\u00b3\5\34\17\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5 \21\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b8\t\3\2\2\u00b8\33\3\2\2\2\u00b9\u00be\5\36\20\2\u00ba\u00bb"+
		"\7\3\2\2\u00bb\u00bd\5\36\20\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00ce\7\32\2\2\u00c3\u00c4\7\22\2\2"+
		"\u00c4\u00cb\7\23\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\62\32\2\u00c7"+
		"\u00c8\7\23\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\37\3\2\2"+
		"\2\u00d0\u00d4\7\b\2\2\u00d1\u00d3\5\"\22\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8!\3\2\2\2\u00d9\u00dc"+
		"\5\2\2\2\u00da\u00dc\5$\23\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00de\5\60\31\2\u00de\u00df\7\r\2\2\u00df\u00e0\5\62\32"+
		"\2\u00e0\u00e1\7\n\2\2\u00e1\u0100\3\2\2\2\u00e2\u0100\5 \21\2\u00e3\u00e5"+
		"\5\62\32\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u0100\7\n\2\2\u00e7\u00e9\7\4\2\2\u00e8\u00ea\5\62\32\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0100\7\n\2\2\u00ec"+
		"\u00ed\7\13\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\7"+
		"\6\2\2\u00f0\u00f1\5$\23\2\u00f1\u0100\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3"+
		"\u0100\7\n\2\2\u00f4\u00f5\7\21\2\2\u00f5\u0100\7\n\2\2\u00f6\u00f7\7"+
		"\17\2\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\7\6\2\2\u00fa"+
		"\u00fd\5$\23\2\u00fb\u00fc\7\20\2\2\u00fc\u00fe\5$\23\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00dd\3\2\2\2\u00ff"+
		"\u00e2\3\2\2\2\u00ff\u00e4\3\2\2\2\u00ff\u00e7\3\2\2\2\u00ff\u00ec\3\2"+
		"\2\2\u00ff\u00f2\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f6\3\2\2\2\u0100"+
		"%\3\2\2\2\u0101\u0102\5.\30\2\u0102\'\3\2\2\2\u0103\u0104\b\25\1\2\u0104"+
		"\u0105\5\64\33\2\u0105\u010b\3\2\2\2\u0106\u0107\f\3\2\2\u0107\u0108\7"+
		"\35\2\2\u0108\u010a\5\64\33\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c)\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010e\u010f\b\26\1\2\u010f\u0110\5(\25\2\u0110\u0116\3\2\2\2\u0111"+
		"\u0112\f\3\2\2\u0112\u0113\7\36\2\2\u0113\u0115\5(\25\2\u0114\u0111\3"+
		"\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"+\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\b\27\1\2\u011a\u011b\5*\26\2"+
		"\u011b\u0121\3\2\2\2\u011c\u011d\f\3\2\2\u011d\u011e\7\25\2\2\u011e\u0120"+
		"\5*\26\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122-\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b\30\1\2"+
		"\u0125\u0126\5,\27\2\u0126\u012c\3\2\2\2\u0127\u0128\f\3\2\2\u0128\u0129"+
		"\7\26\2\2\u0129\u012b\5,\27\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d/\3\2\2\2\u012e\u012c\3"+
		"\2\2\2\u012f\u0136\7\32\2\2\u0130\u0131\7\22\2\2\u0131\u0132\5\62\32\2"+
		"\u0132\u0133\7\23\2\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\61\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\5\64\33\2\u013a\63\3\2\2\2\u013b\u013c\b\33"+
		"\1\2\u013c\u013d\5\66\34\2\u013d\u0143\3\2\2\2\u013e\u013f\f\3\2\2\u013f"+
		"\u0140\7\33\2\2\u0140\u0142\5\66\34\2\u0141\u013e\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\65\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\b\34\1\2\u0147\u0148\58\35\2\u0148\u014e\3"+
		"\2\2\2\u0149\u014a\f\3\2\2\u014a\u014b\7\34\2\2\u014b\u014d\58\35\2\u014c"+
		"\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\67\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0162\5:\36\2\u0152\u0153"+
		"\7\32\2\2\u0153\u015c\7\5\2\2\u0154\u0159\5\62\32\2\u0155\u0156\7\3\2"+
		"\2\u0156\u0158\5\62\32\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u0154\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0162\7\6\2\2\u015f\u0160\7\33\2\2\u0160\u0162\58\35\2\u0161\u0151\3"+
		"\2\2\2\u0161\u0152\3\2\2\2\u0161\u015f\3\2\2\2\u01629\3\2\2\2\u0163\u0164"+
		"\7\5\2\2\u0164\u0165\5\62\32\2\u0165\u0166\7\6\2\2\u0166\u016a\3\2\2\2"+
		"\u0167\u016a\5\4\3\2\u0168\u016a\5\60\31\2\u0169\u0163\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a;\3\2\2\2\'>IWdgjt\u0080\u008a\u008f"+
		"\u0098\u009b\u009e\u00a3\u00a9\u00ab\u00b2\u00be\u00cb\u00ce\u00d4\u00db"+
		"\u00e4\u00e9\u00fd\u00ff\u010b\u0116\u0121\u012c\u0136\u0143\u014e\u0159"+
		"\u015c\u0161\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}