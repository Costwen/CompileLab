// Generated from /home/costwen/CompileLab/lab05/parsing/src/miniSysY.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Return=2, LPar=3, RPar=4, Int=5, LBrace=6, RBrace=7, Semicolon=8, 
		Const=9, Equal=10, If=11, Else=12, AndAnd=13, OrOr=14, OctalConst=15, 
		DecimalConst=16, HexaDecimalConst=17, Ident=18, CmpOp=19, EqOp=20, UnaryOp=21, 
		FOp=22, Whitespace=23, Newline=24, BlockComment=25, LineComment=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Return", "LPar", "RPar", "Int", "LBrace", "RBrace", "Semicolon", 
			"Const", "Equal", "If", "Else", "AndAnd", "OrOr", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "Ident", "CmpOp", "EqOp", "UnaryOp", "FOp", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
			"HexaDecimalConst", "Ident", "CmpOp", "EqOp", "UnaryOp", "FOp", "Whitespace", 
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


	public miniSysYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniSysY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\6\20f\n\20\r\20\16\20g\3\21\3\21\3\21\7\21m\n\21\f\21\16\21"+
		"p\13\21\5\21r\n\21\3\22\3\22\3\22\6\22w\n\22\r\22\16\22x\3\23\3\23\7\23"+
		"}\n\23\f\23\16\23\u0080\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u0087\n\24"+
		"\3\25\3\25\3\25\3\25\5\25\u008d\n\25\3\26\3\26\3\27\3\27\3\30\6\30\u0094"+
		"\n\30\r\30\16\30\u0095\3\30\3\30\3\31\3\31\5\31\u009c\n\31\3\31\5\31\u009f"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00a7\n\32\f\32\16\32\u00aa\13"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00b5\n\33\f\33"+
		"\16\33\u00b8\13\33\3\33\3\33\3\u00a8\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\3\2\16\3\2\629\3\2\63;\3\2\62;\6\2*+ZZz"+
		"z~~\5\2\62;CHch\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\5\2##--//\5\2\'\',,"+
		"\61\61\4\2\13\13\"\"\4\2\f\f\17\17\2\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2"+
		"\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25T\3\2\2\2\27V\3\2"+
		"\2\2\31Y\3\2\2\2\33^\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!q\3\2\2\2#s\3\2\2"+
		"\2%z\3\2\2\2\'\u0086\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0090\3\2"+
		"\2\2/\u0093\3\2\2\2\61\u009e\3\2\2\2\63\u00a2\3\2\2\2\65\u00b0\3\2\2\2"+
		"\678\7.\2\28\4\3\2\2\29:\7t\2\2:;\7g\2\2;<\7v\2\2<=\7w\2\2=>\7t\2\2>?"+
		"\7p\2\2?\6\3\2\2\2@A\7*\2\2A\b\3\2\2\2BC\7+\2\2C\n\3\2\2\2DE\7k\2\2EF"+
		"\7p\2\2FG\7v\2\2G\f\3\2\2\2HI\7}\2\2I\16\3\2\2\2JK\7\177\2\2K\20\3\2\2"+
		"\2LM\7=\2\2M\22\3\2\2\2NO\7e\2\2OP\7q\2\2PQ\7p\2\2QR\7u\2\2RS\7v\2\2S"+
		"\24\3\2\2\2TU\7?\2\2U\26\3\2\2\2VW\7k\2\2WX\7h\2\2X\30\3\2\2\2YZ\7g\2"+
		"\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\32\3\2\2\2^_\7(\2\2_`\7(\2\2`\34\3\2"+
		"\2\2ab\7~\2\2bc\7~\2\2c\36\3\2\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2h \3\2\2\2ir\7\62\2\2jn\t\3\2\2km\t\4\2\2lk\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2qj\3\2\2\2r\""+
		"\3\2\2\2st\7\62\2\2tv\t\5\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y$\3\2\2\2z~\t\7\2\2{}\t\b\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177&\3\2\2\2\u0080~\3\2\2\2\u0081\u0087\t\t\2\2\u0082"+
		"\u0083\7>\2\2\u0083\u0087\7?\2\2\u0084\u0085\7@\2\2\u0085\u0087\7?\2\2"+
		"\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087(\3"+
		"\2\2\2\u0088\u0089\7?\2\2\u0089\u008d\7?\2\2\u008a\u008b\7#\2\2\u008b"+
		"\u008d\7?\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d*\3\2\2\2\u008e"+
		"\u008f\t\n\2\2\u008f,\3\2\2\2\u0090\u0091\t\13\2\2\u0091.\3\2\2\2\u0092"+
		"\u0094\t\f\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\30\2\2\u0098"+
		"\60\3\2\2\2\u0099\u009b\7\17\2\2\u009a\u009c\7\f\2\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009f\7\f\2\2\u009e\u0099"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\31\2\2"+
		"\u00a1\62\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a8"+
		"\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\b\32\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7\61"+
		"\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\n\r\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\33\2\2\u00ba\66\3\2\2\2\20\2gn"+
		"qvx~\u0086\u008c\u0095\u009b\u009e\u00a8\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}