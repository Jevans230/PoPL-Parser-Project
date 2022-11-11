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
		DOUBLE=18, BOOL=19, LITERAL=20, VARNAME=21, ASSSIGNMENTOPERATOR=22, SIGNS=23, 
		LIST=24, LISTITEM=25, TRUE=26, FALSE=27;
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
			"LIST", "LISTITEM", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'('", "')'", "'print('", null, null, null, null, null, null, 
			null, null, null, null, null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", 
			"VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", "LIST", "LISTITEM", "TRUE", 
			"FALSE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17^\n\17\r\17\16"+
		"\17_\3\20\5\20c\n\20\3\20\6\20f\n\20\r\20\16\20g\3\21\5\21k\n\21\3\21"+
		"\6\21n\n\21\r\21\16\21o\3\21\3\21\6\21t\n\21\r\21\16\21u\3\22\3\22\6\22"+
		"z\n\22\r\22\16\22{\3\22\3\22\3\23\5\23\u0081\n\23\3\23\6\23\u0084\n\23"+
		"\r\23\16\23\u0085\3\23\3\23\6\23\u008a\n\23\r\23\16\23\u008b\3\24\3\24"+
		"\5\24\u0090\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0098\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a1\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00b6\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00be\n\31\f\31\16"+
		"\31\u00c1\13\31\3\31\5\31\u00c4\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\n\3\2\f\f\3\2//\3\2\62;\6"+
		"\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7\2\'\',-//\61\61``\2\u00ec\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2"+
		"\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21H\3\2"+
		"\2\2\23K\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35]\3"+
		"\2\2\2\37b\3\2\2\2!j\3\2\2\2#w\3\2\2\2%\u0080\3\2\2\2\'\u008f\3\2\2\2"+
		")\u0097\3\2\2\2+\u00a0\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9"+
		"\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00ce\3\2\2\29:\7,\2\2:"+
		"\4\3\2\2\2;<\7\61\2\2<\6\3\2\2\2=>\7-\2\2>\b\3\2\2\2?@\7/\2\2@\n\3\2\2"+
		"\2AB\7\'\2\2B\f\3\2\2\2CD\7?\2\2D\16\3\2\2\2EF\7-\2\2FG\7?\2\2G\20\3\2"+
		"\2\2HI\7/\2\2IJ\7?\2\2J\22\3\2\2\2KL\7,\2\2LM\7?\2\2M\24\3\2\2\2NO\7\61"+
		"\2\2OP\7?\2\2P\26\3\2\2\2QR\7*\2\2R\30\3\2\2\2ST\7+\2\2T\32\3\2\2\2UV"+
		"\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z[\7*\2\2[\34\3\2\2\2\\^\t"+
		"\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\36\3\2\2\2ac\t\3\2\2"+
		"ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\t\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h \3\2\2\2ik\t\3\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\t\4\2\2"+
		"ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7\60\2\2rt\t\4\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\"\3\2\2\2wy\7$\2\2xz\t\5\2"+
		"\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7$\2\2~$\3\2\2"+
		"\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\60"+
		"\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c&\3\2\2\2\u008d\u0090\5\65\33"+
		"\2\u008e\u0090\5\67\34\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"(\3\2\2\2\u0091\u0098\5\37\20\2\u0092\u0098\5!\21\2\u0093\u0098\5#\22"+
		"\2\u0094\u0098\5%\23\2\u0095\u0098\5\'\24\2\u0096\u0098\5\61\31\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098*\3\2\2\2\u0099\u009a"+
		"\t\6\2\2\u009a\u00a1\5+\26\2\u009b\u009c\t\7\2\2\u009c\u00a1\5+\26\2\u009d"+
		"\u009e\t\4\2\2\u009e\u00a1\5+\26\2\u009f\u00a1\t\b\2\2\u00a0\u0099\3\2"+
		"\2\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		",\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7?\2\2\u00a4\u00b6\7\"\2\2\u00a5"+
		"\u00a6\7\"\2\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\7?\2\2\u00a8\u00b6\7\"\2"+
		"\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\7?\2\2\u00ac\u00b6"+
		"\7\"\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\u00b6\7\"\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7"+
		"?\2\2\u00b4\u00b6\7\"\2\2\u00b5\u00a2\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5"+
		"\u00a9\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6.\3\2\2\2"+
		"\u00b7\u00b8\t\t\2\2\u00b8\60\3\2\2\2\u00b9\u00bf\7]\2\2\u00ba\u00bb\5"+
		"\63\32\2\u00bb\u00bc\7.\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\63\32\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7_\2\2\u00c6\62\3\2\2\2"+
		"\u00c7\u00c8\5)\25\2\u00c8\64\3\2\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7"+
		"t\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7g\2\2\u00cd\66\3\2\2\2\u00ce\u00cf"+
		"\7H\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d38\3\2\2\2\24\2_bgjouy{\u0080\u0085\u008b\u008f\u0097"+
		"\u00a0\u00b5\u00bf\u00c3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}