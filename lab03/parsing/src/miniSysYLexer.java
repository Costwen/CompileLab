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
		T__0=1, Return=2, LPar=3, RPar=4, Int=5, Main=6, LBrace=7, RBrace=8, Semicolon=9, 
		Sub=10, Mod=11, Plus=12, Mul=13, Div=14, Number=15, OctalConst=16, DecimalConst=17, 
		HexaDecimalConst=18, WS=19, Space=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", 
			"Semicolon", "Sub", "Mod", "Plus", "Mul", "Div", "Number", "OctalConst", 
			"DecimalConst", "HexaDecimalConst", "WS", "Space", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u2212'", "'return'", "'('", "')'", "'int'", "'main'", "'{'", 
			"'}'", "';'", "'-'", "'%'", "'+'", "'*'", "'/'", null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", 
			"Semicolon", "Sub", "Mod", "Plus", "Mul", "Div", "Number", "OctalConst", 
			"DecimalConst", "HexaDecimalConst", "WS", "Space", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\5\20Y\n\20\3\21\6\21\\\n\21\r\21\16\21]\3\22\3\22"+
		"\3\22\6\22c\n\22\r\22\16\22d\5\22g\n\22\3\23\3\23\3\23\6\23l\n\23\r\23"+
		"\16\23m\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7"+
		"\26|\n\26\f\26\16\26\177\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\7\27\u008a\n\27\f\27\16\27\u008d\13\27\3\27\3\27\3\27\3\27\4}\u008b"+
		"\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\3\2\629\3\2\63;\3\2\62;\6"+
		"\2*+ZZzz~~\5\2\62;CHch\4\2\13\f\17\17\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\78\3\2\2"+
		"\2\t:\3\2\2\2\13<\3\2\2\2\r@\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2"+
		"\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37X\3\2"+
		"\2\2![\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'o\3\2\2\2)s\3\2\2\2+w\3\2\2\2-\u0085"+
		"\3\2\2\2/\60\7\u2214\2\2\60\4\3\2\2\2\61\62\7t\2\2\62\63\7g\2\2\63\64"+
		"\7v\2\2\64\65\7w\2\2\65\66\7t\2\2\66\67\7p\2\2\67\6\3\2\2\289\7*\2\29"+
		"\b\3\2\2\2:;\7+\2\2;\n\3\2\2\2<=\7k\2\2=>\7p\2\2>?\7v\2\2?\f\3\2\2\2@"+
		"A\7o\2\2AB\7c\2\2BC\7k\2\2CD\7p\2\2D\16\3\2\2\2EF\7}\2\2F\20\3\2\2\2G"+
		"H\7\177\2\2H\22\3\2\2\2IJ\7=\2\2J\24\3\2\2\2KL\7/\2\2L\26\3\2\2\2MN\7"+
		"\'\2\2N\30\3\2\2\2OP\7-\2\2P\32\3\2\2\2QR\7,\2\2R\34\3\2\2\2ST\7\61\2"+
		"\2T\36\3\2\2\2UY\5#\22\2VY\5!\21\2WY\5%\23\2XU\3\2\2\2XV\3\2\2\2XW\3\2"+
		"\2\2Y \3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\""+
		"\3\2\2\2_g\7\62\2\2`b\t\3\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2f_\3\2\2\2f`\3\2\2\2g$\3\2\2\2hi\7\62\2\2ik\t\5\2"+
		"\2jl\t\6\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n&\3\2\2\2op\t\7\2"+
		"\2pq\3\2\2\2qr\b\24\2\2r(\3\2\2\2st\7\"\2\2tu\3\2\2\2uv\b\25\2\2v*\3\2"+
		"\2\2wx\7\61\2\2xy\7,\2\2y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}"+
		"~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7,\2\2\u0081"+
		"\u0082\7\61\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\26\2\2\u0084,\3\2\2"+
		"\2\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\f\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2\2"+
		"\13\2X]dfkm}\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}