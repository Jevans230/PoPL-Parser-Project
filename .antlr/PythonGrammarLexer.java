<<<<<<< HEAD
// Generated from /Users/tylerdunaway/Developer/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
=======
// Generated from /Users/tristen/Desktop/Documents/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NEWLINE=14, INT=15, FLOAT=16, STRING=17, 
<<<<<<< HEAD
		DOUBLE=18;
=======
		VARNAME=18, ASSSIGNMENTOPERATOR=19;
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NEWLINE", "INT", "FLOAT", "STRING", 
<<<<<<< HEAD
			"DOUBLE"
=======
			"VARNAME", "ASSSIGNMENTOPERATOR"
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'('", "')'", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
<<<<<<< HEAD
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE"
=======
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "VARNAME", "ASSSIGNMENTOPERATOR"
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
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


	public PythonGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonGrammar.g4"; }

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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\6\17L\n\17\r\17\16\17M\3\20\5\20Q\n\20\3\20"+
		"\6\20T\n\20\r\20\16\20U\3\21\5\21Y\n\21\3\21\6\21\\\n\21\r\21\16\21]\3"+
		"\21\3\21\6\21b\n\21\r\21\16\21c\3\22\3\22\6\22h\n\22\r\22\16\22i\3\22"+
		"\3\22\3\23\5\23o\n\23\3\23\6\23r\n\23\r\23\16\23s\3\23\3\23\6\23x\n\23"+
		"\r\23\16\23y\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2\f\f\3\2//\3\2\62;\6\2\62"+
		";C\\aac|\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3"+
		"\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\239\3\2\2"+
		"\2\25<\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35K\3\2\2\2\37P\3\2"+
		"\2\2!X\3\2\2\2#e\3\2\2\2%n\3\2\2\2\'(\7,\2\2(\4\3\2\2\2)*\7\61\2\2*\6"+
		"\3\2\2\2+,\7-\2\2,\b\3\2\2\2-.\7/\2\2.\n\3\2\2\2/\60\7\'\2\2\60\f\3\2"+
		"\2\2\61\62\7?\2\2\62\16\3\2\2\2\63\64\7-\2\2\64\65\7?\2\2\65\20\3\2\2"+
		"\2\66\67\7/\2\2\678\7?\2\28\22\3\2\2\29:\7,\2\2:;\7?\2\2;\24\3\2\2\2<"+
		"=\7\61\2\2=>\7?\2\2>\26\3\2\2\2?@\7*\2\2@\30\3\2\2\2AB\7+\2\2B\32\3\2"+
		"\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2HI\7*\2\2I\34\3\2\2\2"+
		"JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\36\3\2\2\2OQ\t\3\2"+
		"\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V \3\2\2\2WY\t\3\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\t\4"+
		"\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\60\2\2`b\t"+
		"\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\"\3\2\2\2eg\7$\2\2fh\t"+
		"\5\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7$\2\2l$\3"+
		"\2\2\2mo\t\3\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\t\4\2\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\60\2\2vx\t\4\2\2wv\3\2\2\2xy"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z&\3\2\2\2\16\2MPUX]cginsy\2";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17N\n\17\r\17\16\17O\3\20"+
		"\5\20S\n\20\3\20\6\20V\n\20\r\20\16\20W\3\21\5\21[\n\21\3\21\6\21^\n\21"+
		"\r\21\16\21_\3\21\3\21\6\21d\n\21\r\21\16\21e\3\22\3\22\6\22j\n\22\r\22"+
		"\16\22k\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23w\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u008c\n\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\t"+
		"\3\2\f\f\3\2//\3\2\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\2\u009a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2"+
		"\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\218\3\2\2\2\23;\3\2\2\2\25"+
		">\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35M\3\2\2\2\37R\3\2\2\2"+
		"!Z\3\2\2\2#g\3\2\2\2%v\3\2\2\2\'\u008b\3\2\2\2)*\7,\2\2*\4\3\2\2\2+,\7"+
		"\61\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60\7/\2\2\60\n\3\2\2\2\61\62\7"+
		"\'\2\2\62\f\3\2\2\2\63\64\7?\2\2\64\16\3\2\2\2\65\66\7-\2\2\66\67\7?\2"+
		"\2\67\20\3\2\2\289\7/\2\29:\7?\2\2:\22\3\2\2\2;<\7,\2\2<=\7?\2\2=\24\3"+
		"\2\2\2>?\7\61\2\2?@\7?\2\2@\26\3\2\2\2AB\7*\2\2B\30\3\2\2\2CD\7+\2\2D"+
		"\32\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2JK\7*\2\2K\34"+
		"\3\2\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\36\3\2\2\2"+
		"QS\t\3\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\t\4\2\2UT\3\2\2\2VW\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X \3\2\2\2Y[\t\3\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2"+
		"\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\60"+
		"\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\"\3\2\2\2gi\7"+
		"$\2\2hj\t\5\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7"+
		"$\2\2n$\3\2\2\2op\t\6\2\2pw\5%\23\2qr\t\7\2\2rw\5%\23\2st\t\4\2\2tw\5"+
		"%\23\2uw\t\b\2\2vo\3\2\2\2vq\3\2\2\2vs\3\2\2\2vu\3\2\2\2w&\3\2\2\2xy\7"+
		"\"\2\2yz\7?\2\2z\u008c\7\"\2\2{|\7\"\2\2|}\7-\2\2}~\7?\2\2~\u008c\7\""+
		"\2\2\177\u0080\7\"\2\2\u0080\u0081\7/\2\2\u0081\u0082\7?\2\2\u0082\u008c"+
		"\7\"\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7,\2\2\u0085\u0086\7?\2\2\u0086"+
		"\u008c\7\"\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7"+
		"?\2\2\u008a\u008c\7\"\2\2\u008bx\3\2\2\2\u008b{\3\2\2\2\u008b\177\3\2"+
		"\2\2\u008b\u0083\3\2\2\2\u008b\u0087\3\2\2\2\u008c(\3\2\2\2\r\2ORWZ_e"+
		"ikv\u008b\2";
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}