// Generated from /Users/jevans230/Desktop/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
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
		DOUBLE=18, BOOL=19, VARNAME=20, ASSSIGNMENTOPERATOR=21, SIGNS=22, TRUE=23, 
		FALSE=24;
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
			"DOUBLE", "BOOL", "VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", "TRUE", 
			"FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'('", "')'", "'print('", null, null, null, null, null, null, 
			null, null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "VARNAME", 
			"ASSSIGNMENTOPERATOR", "SIGNS", "TRUE", "FALSE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\6\17X\n\17\r\17\16\17Y\3\20\5\20]\n\20\3\20\6\20"+
		"`\n\20\r\20\16\20a\3\21\5\21e\n\21\3\21\6\21h\n\21\r\21\16\21i\3\21\3"+
		"\21\6\21n\n\21\r\21\16\21o\3\22\3\22\6\22t\n\22\r\22\16\22u\3\22\3\22"+
		"\3\23\5\23{\n\23\3\23\6\23~\n\23\r\23\16\23\177\3\23\3\23\6\23\u0084\n"+
		"\23\r\23\16\23\u0085\3\24\3\24\5\24\u008a\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0093\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a8\n\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\2\2\32\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\n\3\2\f\f\3\2//\3\2\62"+
		";\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7\2\'\',-//\61\61``\2\u00c7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;"+
		"\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21B\3\2\2\2\23E\3\2\2\2\25H\3\2\2\2\27"+
		"K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35W\3\2\2\2\37\\\3\2\2\2!d\3\2\2\2#"+
		"q\3\2\2\2%z\3\2\2\2\'\u0089\3\2\2\2)\u0092\3\2\2\2+\u00a7\3\2\2\2-\u00a9"+
		"\3\2\2\2/\u00ab\3\2\2\2\61\u00b0\3\2\2\2\63\64\7,\2\2\64\4\3\2\2\2\65"+
		"\66\7\61\2\2\66\6\3\2\2\2\678\7-\2\28\b\3\2\2\29:\7/\2\2:\n\3\2\2\2;<"+
		"\7\'\2\2<\f\3\2\2\2=>\7?\2\2>\16\3\2\2\2?@\7-\2\2@A\7?\2\2A\20\3\2\2\2"+
		"BC\7/\2\2CD\7?\2\2D\22\3\2\2\2EF\7,\2\2FG\7?\2\2G\24\3\2\2\2HI\7\61\2"+
		"\2IJ\7?\2\2J\26\3\2\2\2KL\7*\2\2L\30\3\2\2\2MN\7+\2\2N\32\3\2\2\2OP\7"+
		"r\2\2PQ\7t\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2TU\7*\2\2U\34\3\2\2\2VX\t\2\2"+
		"\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\36\3\2\2\2[]\t\3\2\2\\[\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2b \3\2\2\2ce\t\3\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\t\4\2\2g"+
		"f\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\60\2\2ln\t\4\2\2"+
		"ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\"\3\2\2\2qs\7$\2\2rt\t\5\2\2"+
		"sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7$\2\2x$\3\2\2\2"+
		"y{\t\3\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\t\4\2\2}|\3\2\2\2~\177\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7"+
		"\60\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086&\3\2\2\2\u0087\u008a\5/\30\2"+
		"\u0088\u008a\5\61\31\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a("+
		"\3\2\2\2\u008b\u008c\t\6\2\2\u008c\u0093\5)\25\2\u008d\u008e\t\7\2\2\u008e"+
		"\u0093\5)\25\2\u008f\u0090\t\4\2\2\u0090\u0093\5)\25\2\u0091\u0093\t\b"+
		"\2\2\u0092\u008b\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093*\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7?\2\2\u0096"+
		"\u00a8\7\"\2\2\u0097\u0098\7\"\2\2\u0098\u0099\7-\2\2\u0099\u009a\7?\2"+
		"\2\u009a\u00a8\7\"\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7/\2\2\u009d\u009e"+
		"\7?\2\2\u009e\u00a8\7\"\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7,\2\2\u00a1"+
		"\u00a2\7?\2\2\u00a2\u00a8\7\"\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7\61"+
		"\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a8\7\"\2\2\u00a7\u0094\3\2\2\2\u00a7"+
		"\u0097\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a8,\3\2\2\2\u00a9\u00aa\t\t\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7V"+
		"\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7g\2\2\u00af\60"+
		"\3\2\2\2\u00b0\u00b1\7H\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\62\3\2\2\2\21\2Y\\adiosuz\177\u0085"+
		"\u0089\u0092\u00a7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}