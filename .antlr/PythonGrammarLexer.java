// Generated from /Users/tylerdunaway/Developer/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
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
		DOUBLE=18, VARNAME=19, ASSSIGNMENTOPERATOR=20, NUM=21, SIGNS=22;
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
			"DOUBLE", "VARNAME", "ASSSIGNMENTOPERATOR", "NUM", "SIGNS"
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
			null, null, "NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "VARNAME", 
			"ASSSIGNMENTOPERATOR", "NUM", "SIGNS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\6\17T\n\17\r\17\16\17U\3\20\5\20Y\n\20\3\20\6\20\\\n\20\r\20\16\20]\3"+
		"\21\5\21a\n\21\3\21\6\21d\n\21\r\21\16\21e\3\21\3\21\6\21j\n\21\r\21\16"+
		"\21k\3\22\3\22\6\22p\n\22\r\22\16\22q\3\22\3\22\3\23\5\23w\n\23\3\23\6"+
		"\23z\n\23\r\23\16\23{\3\23\3\23\6\23\u0080\n\23\r\23\16\23\u0081\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u008b\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00a0\n\25\3\26\5\26\u00a3\n\26\3\26\6\26\u00a6\n\26\r\26\16\26"+
		"\u00a7\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\n\3\2\f"+
		"\f\3\2//\3\2\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7\2\'\',-//"+
		"\61\61``\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2"+
		"\r9\3\2\2\2\17;\3\2\2\2\21>\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27G\3\2\2"+
		"\2\31I\3\2\2\2\33K\3\2\2\2\35S\3\2\2\2\37X\3\2\2\2!`\3\2\2\2#m\3\2\2\2"+
		"%v\3\2\2\2\'\u008a\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2-\u00a9\3\2\2"+
		"\2/\60\7,\2\2\60\4\3\2\2\2\61\62\7\61\2\2\62\6\3\2\2\2\63\64\7-\2\2\64"+
		"\b\3\2\2\2\65\66\7/\2\2\66\n\3\2\2\2\678\7\'\2\28\f\3\2\2\29:\7?\2\2:"+
		"\16\3\2\2\2;<\7-\2\2<=\7?\2\2=\20\3\2\2\2>?\7/\2\2?@\7?\2\2@\22\3\2\2"+
		"\2AB\7,\2\2BC\7?\2\2C\24\3\2\2\2DE\7\61\2\2EF\7?\2\2F\26\3\2\2\2GH\7*"+
		"\2\2H\30\3\2\2\2IJ\7+\2\2J\32\3\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p"+
		"\2\2OP\7v\2\2PQ\7*\2\2Q\34\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2V\36\3\2\2\2WY\t\3\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\"+
		"\t\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^ \3\2\2\2_a\t\3\2\2"+
		"`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fg\3\2\2\2gi\7\60\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2l\"\3\2\2\2mo\7$\2\2np\t\5\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rs\3\2\2\2st\7$\2\2t$\3\2\2\2uw\t\3\2\2vu\3\2\2\2vw\3\2\2"+
		"\2wy\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2"+
		"\2}\177\7\60\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082&\3\2\2\2\u0083\u0084\t\6\2\2\u0084"+
		"\u008b\5\'\24\2\u0085\u0086\t\7\2\2\u0086\u008b\5\'\24\2\u0087\u0088\t"+
		"\4\2\2\u0088\u008b\5\'\24\2\u0089\u008b\t\b\2\2\u008a\u0083\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0089\3\2\2\2\u008b(\3\2\2\2"+
		"\u008c\u008d\7\"\2\2\u008d\u008e\7?\2\2\u008e\u00a0\7\"\2\2\u008f\u0090"+
		"\7\"\2\2\u0090\u0091\7-\2\2\u0091\u0092\7?\2\2\u0092\u00a0\7\"\2\2\u0093"+
		"\u0094\7\"\2\2\u0094\u0095\7/\2\2\u0095\u0096\7?\2\2\u0096\u00a0\7\"\2"+
		"\2\u0097\u0098\7\"\2\2\u0098\u0099\7,\2\2\u0099\u009a\7?\2\2\u009a\u00a0"+
		"\7\"\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7?\2\2\u009e"+
		"\u00a0\7\"\2\2\u009f\u008c\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0093\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u00a0*\3\2\2\2\u00a1\u00a3"+
		"\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8,\3\2\2\2\u00a9\u00aa\t\t\2\2\u00aa.\3\2"+
		"\2\2\22\2UX]`ekoqv{\u0081\u008a\u009f\u00a2\u00a7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}