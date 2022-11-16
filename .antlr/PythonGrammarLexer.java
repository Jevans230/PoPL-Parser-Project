// Generated from /Users/tristen/Desktop/Documents/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
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
		DOUBLE=18, BOOL=19, LITERAL=20, VARNAME=21, ASSSIGNMENTOPERATOR=22, SIGNS=23, 
		IFELSE=24, LIST=25, LISTITEM=26, TRUE=27, FALSE=28, WHITESPACE=29, CONOPERATORS=30;
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
			"DOUBLE", "BOOL", "LITERAL", "VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", 
			"IFELSE", "LIST", "LISTITEM", "TRUE", "FALSE", "WHITESPACE", "CONOPERATORS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'('", "')'", "'print('", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", 
			"VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", "LISTITEM", 
			"TRUE", "FALSE", "WHITESPACE", "CONOPERATORS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\6\17d\n\17\r\17\16\17e\3\20\5\20i\n\20\3\20\6\20l\n\20\r\20\16\20"+
		"m\3\21\5\21q\n\21\3\21\6\21t\n\21\r\21\16\21u\3\21\3\21\6\21z\n\21\r\21"+
		"\16\21{\3\22\3\22\6\22\u0080\n\22\r\22\16\22\u0081\3\22\3\22\3\23\5\23"+
		"\u0087\n\23\3\23\6\23\u008a\n\23\r\23\16\23\u008b\3\23\3\23\6\23\u0090"+
		"\n\23\r\23\16\23\u0091\3\24\3\24\5\24\u0096\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u009e\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a7"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00b2\n\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c0\n\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00c6\n\32\f\32\16\32\u00c9\13\32\3\32\5\32"+
		"\u00cc\n\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u00e0\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f0\n\37\2\2 \3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3"+
		"\2\13\3\2\f\f\3\2//\3\2\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7"+
		"\2\'\',-//\61\61``\4\2>>@@\2\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2"+
		"\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21N\3\2\2"+
		"\2\23Q\3\2\2\2\25T\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35c\3\2"+
		"\2\2\37h\3\2\2\2!p\3\2\2\2#}\3\2\2\2%\u0086\3\2\2\2\'\u0095\3\2\2\2)\u009d"+
		"\3\2\2\2+\u00a6\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61\u00bf\3\2\2\2"+
		"\63\u00c1\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d6\3\2\2\2;\u00df"+
		"\3\2\2\2=\u00ef\3\2\2\2?@\7,\2\2@\4\3\2\2\2AB\7\61\2\2B\6\3\2\2\2CD\7"+
		"-\2\2D\b\3\2\2\2EF\7/\2\2F\n\3\2\2\2GH\7\'\2\2H\f\3\2\2\2IJ\7?\2\2J\16"+
		"\3\2\2\2KL\7-\2\2LM\7?\2\2M\20\3\2\2\2NO\7/\2\2OP\7?\2\2P\22\3\2\2\2Q"+
		"R\7,\2\2RS\7?\2\2S\24\3\2\2\2TU\7\61\2\2UV\7?\2\2V\26\3\2\2\2WX\7*\2\2"+
		"X\30\3\2\2\2YZ\7+\2\2Z\32\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2"+
		"\2_`\7v\2\2`a\7*\2\2a\34\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2f\36\3\2\2\2gi\t\3\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\t\4"+
		"\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n \3\2\2\2oq\t\3\2\2po\3\2"+
		"\2\2pq\3\2\2\2qs\3\2\2\2rt\t\4\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wy\7\60\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|\"\3\2\2\2}\177\7$\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7$\2\2\u0084$\3\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\7\60\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"&\3\2\2\2\u0093\u0096\5\67\34\2\u0094\u0096\59\35\2\u0095\u0093\3\2\2"+
		"\2\u0095\u0094\3\2\2\2\u0096(\3\2\2\2\u0097\u009e\5\37\20\2\u0098\u009e"+
		"\5!\21\2\u0099\u009e\5#\22\2\u009a\u009e\5%\23\2\u009b\u009e\5\'\24\2"+
		"\u009c\u009e\5\63\32\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099"+
		"\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"*\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\u00a7\5+\26\2\u00a1\u00a2\t\7\2\2"+
		"\u00a2\u00a7\5+\26\2\u00a3\u00a4\t\4\2\2\u00a4\u00a7\5+\26\2\u00a5\u00a7"+
		"\t\b\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7,\3\2\2\2\u00a8\u00b2\7?\2\2\u00a9\u00aa\7-\2\2\u00aa"+
		"\u00b2\7?\2\2\u00ab\u00ac\7/\2\2\u00ac\u00b2\7?\2\2\u00ad\u00ae\7,\2\2"+
		"\u00ae\u00b2\7?\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b2\7?\2\2\u00b1\u00a8"+
		"\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2.\3\2\2\2\u00b3\u00b4\t\t\2\2\u00b4\60\3\2\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00c0\7h\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7n\2\2"+
		"\u00b9\u00ba\7k\2\2\u00ba\u00c0\7h\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00c0\7g\2\2\u00bf\u00b5\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\62\3\2\2\2\u00c1\u00c7\7]\2\2"+
		"\u00c2\u00c3\5\65\33\2\u00c3\u00c4\7.\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c2"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\5\65\33\2\u00cb\u00ca\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7_\2\2\u00ce"+
		"\64\3\2\2\2\u00cf\u00d0\5)\25\2\u00d0\66\3\2\2\2\u00d1\u00d2\7V\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2\u00d58\3\2\2\2\u00d6"+
		"\u00d7\7H\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2"+
		"\u00da\u00db\7g\2\2\u00db:\3\2\2\2\u00dc\u00e0\7\"\2\2\u00dd\u00de\7\""+
		"\2\2\u00de\u00e0\5;\36\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"<\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00f0\7?\2\2\u00e3\u00e4\7>\2\2\u00e4"+
		"\u00f0\7?\2\2\u00e5\u00f0\t\n\2\2\u00e6\u00e7\7?\2\2\u00e7\u00f0\7?\2"+
		"\2\u00e8\u00e9\7#\2\2\u00e9\u00f0\7?\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00f0\7f\2\2\u00ed\u00ee\7q\2\2\u00ee\u00f0\7t\2\2\u00ef"+
		"\u00e1\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e6\3\2"+
		"\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		">\3\2\2\2\27\2ehmpu{\177\u0081\u0086\u008b\u0091\u0095\u009d\u00a6\u00b1"+
		"\u00bf\u00c7\u00cb\u00df\u00ef\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}