// Generated from miniSysY.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Return=2, LPar=3, RPar=4, Int=5, LBrace=6, RBrace=7, Semicolon=8, 
		Sub=9, Mod=10, Plus=11, Mul=12, Div=13, Const=14, Equal=15, OctalConst=16, 
		DecimalConst=17, HexaDecimalConst=18, Ident=19, Whitespace=20, Newline=21, 
		BlockComment=22, LineComment=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Return", "LPar", "RPar", "Int", "LBrace", "RBrace", "Semicolon", 
			"Sub", "Mod", "Plus", "Mul", "Div", "Const", "Equal", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "Ident", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'return'", "'('", "')'", "'int'", "'{'", "'}'", "';'", 
			"'-'", "'%'", "'+'", "'*'", "'/'", "'const'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Return", "LPar", "RPar", "Int", "LBrace", "RBrace", "Semicolon", 
			"Sub", "Mod", "Plus", "Mul", "Div", "Const", "Equal", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "Ident", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\6\21\\\n\21\r\21\16\21]\3\22\3"+
		"\22\3\22\7\22c\n\22\f\22\16\22f\13\22\5\22h\n\22\3\23\3\23\3\23\6\23m"+
		"\n\23\r\23\16\23n\3\24\3\24\7\24s\n\24\f\24\16\24v\13\24\3\25\6\25y\n"+
		"\25\r\25\16\25z\3\25\3\25\3\26\3\26\5\26\u0081\n\26\3\26\5\26\u0084\n"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u008c\n\27\f\27\16\27\u008f\13"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u009a\n\30\f\30"+
		"\16\30\u009d\13\30\3\30\3\30\3\u008d\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\3\2\13\3\2\629\3\2\63;\3\2\62;\6\2*+ZZzz~~\5\2\62;CHch\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00a9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\5\63\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17D\3\2\2"+
		"\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2"+
		"\2\2\35R\3\2\2\2\37X\3\2\2\2![\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'p\3\2\2\2"+
		")x\3\2\2\2+\u0083\3\2\2\2-\u0087\3\2\2\2/\u0095\3\2\2\2\61\62\7.\2\2\62"+
		"\4\3\2\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7v\2\2\66\67\7w\2\2\678\7t"+
		"\2\289\7p\2\29\6\3\2\2\2:;\7*\2\2;\b\3\2\2\2<=\7+\2\2=\n\3\2\2\2>?\7k"+
		"\2\2?@\7p\2\2@A\7v\2\2A\f\3\2\2\2BC\7}\2\2C\16\3\2\2\2DE\7\177\2\2E\20"+
		"\3\2\2\2FG\7=\2\2G\22\3\2\2\2HI\7/\2\2I\24\3\2\2\2JK\7\'\2\2K\26\3\2\2"+
		"\2LM\7-\2\2M\30\3\2\2\2NO\7,\2\2O\32\3\2\2\2PQ\7\61\2\2Q\34\3\2\2\2RS"+
		"\7e\2\2ST\7q\2\2TU\7p\2\2UV\7u\2\2VW\7v\2\2W\36\3\2\2\2XY\7?\2\2Y \3\2"+
		"\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\"\3\2\2\2_h"+
		"\7\62\2\2`d\t\3\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2g_\3\2\2\2g`\3\2\2\2h$\3\2\2\2ij\7\62\2\2jl\t\5\2"+
		"\2km\t\6\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o&\3\2\2\2pt\t\7\2"+
		"\2qs\t\b\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vt\3\2\2"+
		"\2wy\t\t\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\25"+
		"\2\2}*\3\2\2\2~\u0080\7\17\2\2\177\u0081\7\f\2\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0084\7\f\2\2\u0083~\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\26\2\2\u0086,\3"+
		"\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7,\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7,\2\2\u0091\u0092\7\61\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\27"+
		"\2\2\u0094.\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\61\2\2\u0097\u009b"+
		"\3\2\2\2\u0098\u009a\n\n\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\b\30\2\2\u009f\60\3\2\2\2\16\2]dglntz\u0080\u0083\u008d"+
		"\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}