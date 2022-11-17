// Generated from /Users/henryheese/Desktop/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
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
		NEWLINE=10, INT=11, FLOAT=12, STRING=13, DOUBLE=14, BOOL=15, LITERAL=16, 
		VARNAME=17, ASSIGNMENT=18, ASSSIGNMENTOPERATOR=19, SIGNS=20, IFELSE=21, 
		LIST=22, LISTITEM=23, TRUE=24, FALSE=25, WS=26, TAB=27, CONOPERATORS=28, 
		CONSTATEMENTS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", 
			"ASSIGNMENT", "ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", "LISTITEM", 
			"TRUE", "FALSE", "WS", "TAB", "CONOPERATORS", "CONSTATEMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'print('", "'if'", "'and'", "'or'", "':'", "'\nelif'", 
			"'\nelse:'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'True'", "'False'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", "ASSIGNMENT", 
			"ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", "LISTITEM", "TRUE", 
			"FALSE", "WS", "TAB", "CONOPERATORS", "CONSTATEMENTS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0159\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13"+
		"c\n\13\r\13\16\13d\3\f\5\fh\n\f\3\f\6\fk\n\f\r\f\16\fl\3\r\5\rp\n\r\3"+
		"\r\6\rs\n\r\r\r\16\rt\3\r\3\r\6\ry\n\r\r\r\16\rz\3\16\3\16\6\16\177\n"+
		"\16\r\16\16\16\u0080\3\16\3\16\3\17\5\17\u0086\n\17\3\17\6\17\u0089\n"+
		"\17\r\17\16\17\u008a\3\17\3\17\6\17\u008f\n\17\r\17\16\17\u0090\3\20\3"+
		"\20\5\20\u0095\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009d\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\23\3\23\7\23\u00aa\n"+
		"\23\f\23\16\23\u00ad\13\23\3\23\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u00bb\n\23\f\23\16\23\u00be\13\23"+
		"\3\23\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\23\3\23\7\23\u00d2\n\23\f\23"+
		"\16\23\u00d5\13\23\3\23\3\23\5\23\u00d9\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00e4\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00f2\n\26\3\27\3\27\3\27\3\27\7\27\u00f8"+
		"\n\27\f\27\16\27\u00fb\13\27\3\27\5\27\u00fe\n\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0116\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0126\n\35\3\36\3\36\7\36\u012a"+
		"\n\36\f\36\16\36\u012d\13\36\3\36\3\36\7\36\u0131\n\36\f\36\16\36\u0134"+
		"\13\36\3\36\3\36\3\36\3\36\7\36\u013a\n\36\f\36\16\36\u013d\13\36\3\36"+
		"\3\36\7\36\u0141\n\36\f\36\16\36\u0144\13\36\3\36\3\36\3\36\3\36\7\36"+
		"\u014a\n\36\f\36\16\36\u014d\13\36\3\36\3\36\7\36\u0151\n\36\f\36\16\36"+
		"\u0154\13\36\3\36\3\36\5\36\u0158\n\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\13\3\2\f\f\3\2//\3\2"+
		"\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\b\2##\'\',-//\61\61``\4"+
		"\2>>@@\2\u018a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tH\3\2\2\2\13K\3"+
		"\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23Z\3\2\2\2\25b\3\2\2\2\27g"+
		"\3\2\2\2\31o\3\2\2\2\33|\3\2\2\2\35\u0085\3\2\2\2\37\u0094\3\2\2\2!\u009c"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00d8\3\2\2\2\'\u00e3\3\2\2\2)\u00e5\3\2\2\2"+
		"+\u00f1\3\2\2\2-\u00f3\3\2\2\2/\u0101\3\2\2\2\61\u0103\3\2\2\2\63\u0108"+
		"\3\2\2\2\65\u010e\3\2\2\2\67\u0115\3\2\2\29\u0125\3\2\2\2;\u0157\3\2\2"+
		"\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7k\2\2"+
		"DE\7p\2\2EF\7v\2\2FG\7*\2\2G\b\3\2\2\2HI\7k\2\2IJ\7h\2\2J\n\3\2\2\2KL"+
		"\7c\2\2LM\7p\2\2MN\7f\2\2N\f\3\2\2\2OP\7q\2\2PQ\7t\2\2Q\16\3\2\2\2RS\7"+
		"<\2\2S\20\3\2\2\2TU\7\f\2\2UV\7g\2\2VW\7n\2\2WX\7k\2\2XY\7h\2\2Y\22\3"+
		"\2\2\2Z[\7\f\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_`\7<\2\2`\24\3"+
		"\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\26\3\2\2\2f"+
		"h\t\3\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2m\30\3\2\2\2np\t\3\2\2on\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qs\t\4\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\7\60"+
		"\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\32\3\2\2\2|~\7"+
		"$\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7$\2\2\u0083\34\3\2\2\2\u0084"+
		"\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\60"+
		"\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\36\3\2\2\2\u0092\u0095\5\61\31"+
		"\2\u0093\u0095\5\63\32\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		" \3\2\2\2\u0096\u009d\5\27\f\2\u0097\u009d\5\31\r\2\u0098\u009d\5\33\16"+
		"\2\u0099\u009d\5\35\17\2\u009a\u009d\5\37\20\2\u009b\u009d\5-\27\2\u009c"+
		"\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\"\3\2\2\2\u009e\u009f"+
		"\t\6\2\2\u009f\u00a6\5#\22\2\u00a0\u00a1\t\7\2\2\u00a1\u00a6\5#\22\2\u00a2"+
		"\u00a3\t\4\2\2\u00a3\u00a6\5#\22\2\u00a4\u00a6\t\b\2\2\u00a5\u009e\3\2"+
		"\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00ab\5#\22\2\u00a8\u00aa\5\65\33\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\5\'\24\2\u00af\u00b1\5\65\33"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5#\22\2\u00b6"+
		"\u00b7\5%\23\2\u00b7\u00d9\3\2\2\2\u00b8\u00bc\5#\22\2\u00b9\u00bb\5\65"+
		"\33\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\5\'"+
		"\24\2\u00c0\u00c2\5\65\33\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\5#\22\2\u00c7\u00d9\3\2\2\2\u00c8\u00cc\5#\22\2\u00c9"+
		"\u00cb\5\65\33\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d3\5\'\24\2\u00d0\u00d2\5\65\33\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\5!\21\2\u00d7\u00d9\3\2\2\2\u00d8\u00a7\3\2"+
		"\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00c8\3\2\2\2\u00d9&\3\2\2\2\u00da\u00e4"+
		"\7?\2\2\u00db\u00dc\7-\2\2\u00dc\u00e4\7?\2\2\u00dd\u00de\7/\2\2\u00de"+
		"\u00e4\7?\2\2\u00df\u00e0\7,\2\2\u00e0\u00e4\7?\2\2\u00e1\u00e2\7\61\2"+
		"\2\u00e2\u00e4\7?\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4(\3\2\2\2\u00e5"+
		"\u00e6\t\t\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00f2\7h\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00f2\7h\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f2"+
		"\7g\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		",\3\2\2\2\u00f3\u00f9\7]\2\2\u00f4\u00f5\5/\30\2\u00f5\u00f6\7.\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fe\5/\30\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\7_\2\2\u0100.\3\2\2\2\u0101\u0102\5!\21\2\u0102\60\3"+
		"\2\2\2\u0103\u0104\7V\2\2\u0104\u0105\7t\2\2\u0105\u0106\7w\2\2\u0106"+
		"\u0107\7g\2\2\u0107\62\3\2\2\2\u0108\u0109\7H\2\2\u0109\u010a\7c\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d\64\3\2\2\2\u010e"+
		"\u010f\7\"\2\2\u010f\66\3\2\2\2\u0110\u0116\7\13\2\2\u0111\u0112\7\"\2"+
		"\2\u0112\u0113\7\"\2\2\u0113\u0114\7\"\2\2\u0114\u0116\7\"\2\2\u0115\u0110"+
		"\3\2\2\2\u0115\u0111\3\2\2\2\u01168\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0126"+
		"\7?\2\2\u0119\u011a\7>\2\2\u011a\u0126\7?\2\2\u011b\u0126\t\n\2\2\u011c"+
		"\u011d\7?\2\2\u011d\u0126\7?\2\2\u011e\u011f\7#\2\2\u011f\u0126\7?\2\2"+
		"\u0120\u0121\7c\2\2\u0121\u0122\7p\2\2\u0122\u0126\7f\2\2\u0123\u0124"+
		"\7q\2\2\u0124\u0126\7t\2\2\u0125\u0117\3\2\2\2\u0125\u0119\3\2\2\2\u0125"+
		"\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u0120\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126:\3\2\2\2\u0127\u012b\5#\22\2\u0128\u012a"+
		"\5\65\33\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0132"+
		"\59\35\2\u012f\u0131\5\65\33\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\5#\22\2\u0136\u0158\3\2\2\2\u0137\u013b\5!\21\2\u0138"+
		"\u013a\5\65\33\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0142\59\35\2\u013f\u0141\5\65\33\2\u0140\u013f\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\5!\21\2\u0146\u0158\3\2\2\2\u0147\u014b\5#"+
		"\22\2\u0148\u014a\5\65\33\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014e\u0152\59\35\2\u014f\u0151\5\65\33\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5!\21\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0127\3\2\2\2\u0157\u0137\3\2\2\2\u0157\u0147\3\2\2\2\u0158<\3\2\2\2"+
		"%\2dglotz~\u0080\u0085\u008a\u0090\u0094\u009c\u00a5\u00ab\u00b2\u00bc"+
		"\u00c3\u00cc\u00d3\u00d8\u00e3\u00f1\u00f9\u00fd\u0115\u0125\u012b\u0132"+
		"\u013b\u0142\u014b\u0152\u0157\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}