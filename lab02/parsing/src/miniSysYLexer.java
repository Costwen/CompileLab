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
		Number=9, OctalConst=10, DecimalConst=11, HexaDecimalConst=12, WS=13, 
		Space=14, COMMENT=15, LINE_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", "Semicolon", 
			"Number", "OctalConst", "DecimalConst", "HexaDecimalConst", "WS", "Space", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'('", "')'", "'int'", "'main'", "'{'", "'}'", "';'", 
			null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Return", "LPar", "RPar", "Int", "Main", "LBrace", "RBrace", "Semicolon", 
			"Number", "OctalConst", "DecimalConst", "HexaDecimalConst", "WS", "Space", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\nA\n\n\3\13\6\13D\n\13\r\13\16"+
		"\13E\3\f\3\f\3\f\6\fK\n\f\r\f\16\fL\5\fO\n\f\3\r\3\r\3\r\6\rT\n\r\r\r"+
		"\16\rU\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"d\n\20\f\20\16\20g\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21r\n\21\f\21\16\21u\13\21\3\21\3\21\3\21\3\21\4es\2\22\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3"+
		"\2\b\3\2\629\3\2\63;\3\2\62;\6\2*+ZZzz~~\5\2\62;CHch\4\2\13\f\17\17\2"+
		"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\3#\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\62\3\2\2\2\r\67\3\2\2"+
		"\2\179\3\2\2\2\21;\3\2\2\2\23@\3\2\2\2\25C\3\2\2\2\27N\3\2\2\2\31P\3\2"+
		"\2\2\33W\3\2\2\2\35[\3\2\2\2\37_\3\2\2\2!m\3\2\2\2#$\7t\2\2$%\7g\2\2%"+
		"&\7v\2\2&\'\7w\2\2\'(\7t\2\2()\7p\2\2)\4\3\2\2\2*+\7*\2\2+\6\3\2\2\2,"+
		"-\7+\2\2-\b\3\2\2\2./\7k\2\2/\60\7p\2\2\60\61\7v\2\2\61\n\3\2\2\2\62\63"+
		"\7o\2\2\63\64\7c\2\2\64\65\7k\2\2\65\66\7p\2\2\66\f\3\2\2\2\678\7}\2\2"+
		"8\16\3\2\2\29:\7\177\2\2:\20\3\2\2\2;<\7=\2\2<\22\3\2\2\2=A\5\27\f\2>"+
		"A\5\25\13\2?A\5\31\r\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\24\3\2\2\2BD\t\2"+
		"\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GO\7\62\2\2HJ"+
		"\t\3\2\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2N"+
		"G\3\2\2\2NH\3\2\2\2O\30\3\2\2\2PQ\7\62\2\2QS\t\5\2\2RT\t\6\2\2SR\3\2\2"+
		"\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\32\3\2\2\2WX\t\7\2\2XY\3\2\2\2YZ\b\16"+
		"\2\2Z\34\3\2\2\2[\\\7\"\2\2\\]\3\2\2\2]^\b\17\2\2^\36\3\2\2\2_`\7\61\2"+
		"\2`a\7,\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2"+
		"\2fh\3\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\61\2\2jk\3\2\2\2kl\b\20\2\2l \3\2"+
		"\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st"+
		"\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\f\2\2wx\3\2\2\2xy\b\21\2\2"+
		"y\"\3\2\2\2\13\2@ELNSUes\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}