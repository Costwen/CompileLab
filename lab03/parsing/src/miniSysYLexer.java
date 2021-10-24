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
		Return=1, LPar=2, RPar=3, Int=4, Main=5, LBrace=6, RBrace=7, Semicolon=8, 
		Sub=9, Mod=10, Plus=11, Mul=12, Div=13, Number=14, OctalConst=15, DecimalConst=16, 
		HexaDecimalConst=17, WS=18, Space=19, COMMENT=20, LINE_COMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", "Semicolon", 
			"Sub", "Mod", "Plus", "Mul", "Div", "Number", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "WS", "Space", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'('", "')'", "'int'", "'main'", "'{'", "'}'", "';'", 
			"'-'", "'%'", "'+'", "'*'", "'/'", null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", "Semicolon", 
			"Sub", "Mod", "Plus", "Mul", "Div", "Number", "OctalConst", "DecimalConst", 
			"HexaDecimalConst", "WS", "Space", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\5\17U\n\17\3\20\6\20X\n\20\r\20\16\20Y\3\21\3\21\3\21\6\21_\n\21\r\21"+
		"\16\21`\5\21c\n\21\3\22\3\22\3\22\6\22h\n\22\r\22\16\22i\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25x\n\25\f\25\16\25{\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0086\n\26\f\26"+
		"\16\26\u0089\13\26\3\26\3\26\3\26\3\26\4y\u0087\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\b\3\2\629\3\2\63;\3\2\62;\6\2*+ZZzz~~\5\2\62;CHch\4\2"+
		"\13\f\17\17\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\3-\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13<\3\2\2\2\rA\3\2\2"+
		"\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2"+
		"\2\2\33O\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!b\3\2\2\2#d\3\2\2\2%k\3\2\2\2"+
		"\'o\3\2\2\2)s\3\2\2\2+\u0081\3\2\2\2-.\7t\2\2./\7g\2\2/\60\7v\2\2\60\61"+
		"\7w\2\2\61\62\7t\2\2\62\63\7p\2\2\63\4\3\2\2\2\64\65\7*\2\2\65\6\3\2\2"+
		"\2\66\67\7+\2\2\67\b\3\2\2\289\7k\2\29:\7p\2\2:;\7v\2\2;\n\3\2\2\2<=\7"+
		"o\2\2=>\7c\2\2>?\7k\2\2?@\7p\2\2@\f\3\2\2\2AB\7}\2\2B\16\3\2\2\2CD\7\177"+
		"\2\2D\20\3\2\2\2EF\7=\2\2F\22\3\2\2\2GH\7/\2\2H\24\3\2\2\2IJ\7\'\2\2J"+
		"\26\3\2\2\2KL\7-\2\2L\30\3\2\2\2MN\7,\2\2N\32\3\2\2\2OP\7\61\2\2P\34\3"+
		"\2\2\2QU\5!\21\2RU\5\37\20\2SU\5#\22\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U"+
		"\36\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z \3\2\2"+
		"\2[c\7\62\2\2\\^\t\3\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ac\3\2\2\2b[\3\2\2\2b\\\3\2\2\2c\"\3\2\2\2de\7\62\2\2eg\t\5\2\2fh"+
		"\t\6\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j$\3\2\2\2kl\t\7\2\2l"+
		"m\3\2\2\2mn\b\23\2\2n&\3\2\2\2op\7\"\2\2pq\3\2\2\2qr\b\24\2\2r(\3\2\2"+
		"\2st\7\61\2\2tu\7,\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2"+
		"\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177\3\2\2\2\177"+
		"\u0080\b\25\2\2\u0080*\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7\61\2"+
		"\2\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\f\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\b\26\2\2\u008d,\3\2\2\2\13\2TY`bgiy\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}