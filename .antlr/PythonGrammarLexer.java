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
		IFELSE=24, LIST=25, LISTITEM=26, TRUE=27, FALSE=28, WS=29, TAB=30, CONOPERATORS=31, 
		CONSTATEMENTS=32, IF=33;
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
			"IFELSE", "LIST", "LISTITEM", "TRUE", "FALSE", "WS", "TAB", "CONOPERATORS", 
			"CONSTATEMENTS", "IF"
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
			"TRUE", "FALSE", "WS", "TAB", "CONOPERATORS", "CONSTATEMENTS", "IF"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\6\17j\n\17\r\17\16\17k\3\20\5\20o\n\20\3"+
		"\20\6\20r\n\20\r\20\16\20s\3\21\5\21w\n\21\3\21\6\21z\n\21\r\21\16\21"+
		"{\3\21\3\21\6\21\u0080\n\21\r\21\16\21\u0081\3\22\3\22\6\22\u0086\n\22"+
		"\r\22\16\22\u0087\3\22\3\22\3\23\5\23\u008d\n\23\3\23\6\23\u0090\n\23"+
		"\r\23\16\23\u0091\3\23\3\23\6\23\u0096\n\23\r\23\16\23\u0097\3\24\3\24"+
		"\5\24\u009c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a4\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ad\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00b8\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00c6\n\31\3\32\3\32\3\32\3\32\7\32\u00cc"+
		"\n\32\f\32\16\32\u00cf\13\32\3\32\5\32\u00d2\n\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u00e6\n\36\3\37\6\37\u00e9\n\37\r\37\16\37\u00ea\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00fb\n \3!\3!\7!\u00ff\n!\f!\16!\u0102"+
		"\13!\3!\3!\7!\u0106\n!\f!\16!\u0109\13!\3!\3!\3!\3!\7!\u010f\n!\f!\16"+
		"!\u0112\13!\3!\3!\7!\u0116\n!\f!\16!\u0119\13!\3!\3!\3!\3!\7!\u011f\n"+
		"!\f!\16!\u0122\13!\3!\3!\7!\u0126\n!\f!\16!\u0129\13!\3!\3!\5!\u012d\n"+
		"!\3\"\3\"\7\"\u0131\n\"\f\"\16\"\u0134\13\"\3\"\3\"\7\"\u0138\n\"\f\""+
		"\16\"\u013b\13\"\3\"\3\"\7\"\u013f\n\"\f\"\16\"\u0142\13\"\3\"\6\"\u0145"+
		"\n\"\r\"\16\"\u0146\3\"\3\"\3\"\3\"\3\"\5\"\u014e\n\"\3\"\6\"\u0151\n"+
		"\"\r\"\16\"\u0152\5\"\u0155\n\"\6\"\u0157\n\"\r\"\16\"\u0158\3\"\7\"\u015c"+
		"\n\"\f\"\16\"\u015f\13\"\3\"\3\"\7\"\u0163\n\"\f\"\16\"\u0166\13\"\3\""+
		"\3\"\7\"\u016a\n\"\f\"\16\"\u016d\13\"\3\"\3\"\7\"\u0171\n\"\f\"\16\""+
		"\u0174\13\"\3\"\7\"\u0177\n\"\f\"\16\"\u017a\13\"\3\"\3\"\6\"\u017e\n"+
		"\"\r\"\16\"\u017f\3\"\3\"\3\"\3\"\3\"\5\"\u0187\n\"\3\"\6\"\u018a\n\""+
		"\r\"\16\"\u018b\5\"\u018e\n\"\6\"\u0190\n\"\r\"\16\"\u0191\3\"\7\"\u0195"+
		"\n\"\f\"\16\"\u0198\13\"\3\"\3\"\7\"\u019c\n\"\f\"\16\"\u019f\13\"\5\""+
		"\u01a1\n\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#\3\2\f\3\2\f\f\3\2//\3\2\62;\6\2\62;C\\aac|"+
		"\3\2c|\3\2C\\\5\2\62;C\\c|\7\2\'\',-//\61\61``\3\2\13\13\4\2>>@@\2\u01e1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2"+
		"\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21T\3\2\2"+
		"\2\23W\3\2\2\2\25Z\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35i\3\2"+
		"\2\2\37n\3\2\2\2!v\3\2\2\2#\u0083\3\2\2\2%\u008c\3\2\2\2\'\u009b\3\2\2"+
		"\2)\u00a3\3\2\2\2+\u00ac\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00c5"+
		"\3\2\2\2\63\u00c7\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00dc\3\2"+
		"\2\2;\u00e5\3\2\2\2=\u00e8\3\2\2\2?\u00fa\3\2\2\2A\u012c\3\2\2\2C\u01a0"+
		"\3\2\2\2EF\7,\2\2F\4\3\2\2\2GH\7\61\2\2H\6\3\2\2\2IJ\7-\2\2J\b\3\2\2\2"+
		"KL\7/\2\2L\n\3\2\2\2MN\7\'\2\2N\f\3\2\2\2OP\7?\2\2P\16\3\2\2\2QR\7-\2"+
		"\2RS\7?\2\2S\20\3\2\2\2TU\7/\2\2UV\7?\2\2V\22\3\2\2\2WX\7,\2\2XY\7?\2"+
		"\2Y\24\3\2\2\2Z[\7\61\2\2[\\\7?\2\2\\\26\3\2\2\2]^\7*\2\2^\30\3\2\2\2"+
		"_`\7+\2\2`\32\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2fg\7"+
		"*\2\2g\34\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\36"+
		"\3\2\2\2mo\t\3\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\t\4\2\2qp\3\2\2\2r"+
		"s\3\2\2\2sq\3\2\2\2st\3\2\2\2t \3\2\2\2uw\t\3\2\2vu\3\2\2\2vw\3\2\2\2"+
		"wy\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2"+
		"}\177\7\60\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\"\3\2\2\2\u0083\u0085\7$\2\2\u0084"+
		"\u0086\t\5\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7$\2\2\u008a"+
		"$\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008f\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\7\60\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098&\3\2\2\2\u0099\u009c"+
		"\5\67\34\2\u009a\u009c\59\35\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c(\3\2\2\2\u009d\u00a4\5\37\20\2\u009e\u00a4\5!\21\2\u009f\u00a4"+
		"\5#\22\2\u00a0\u00a4\5%\23\2\u00a1\u00a4\5\'\24\2\u00a2\u00a4\5\63\32"+
		"\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4*\3\2\2\2\u00a5"+
		"\u00a6\t\6\2\2\u00a6\u00ad\5+\26\2\u00a7\u00a8\t\7\2\2\u00a8\u00ad\5+"+
		"\26\2\u00a9\u00aa\t\4\2\2\u00aa\u00ad\5+\26\2\u00ab\u00ad\t\b\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad,\3\2\2\2\u00ae\u00b8\7?\2\2\u00af\u00b0\7-\2\2\u00b0\u00b8"+
		"\7?\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b8\7?\2\2\u00b3\u00b4\7,\2\2\u00b4"+
		"\u00b8\7?\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b8\7?\2\2\u00b7\u00ae\3\2"+
		"\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8.\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba\60\3\2\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00c6\7h\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c6\7h\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c6\7g\2\2\u00c5\u00bb\3\2\2\2\u00c5"+
		"\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\62\3\2\2\2\u00c7\u00cd\7]\2\2"+
		"\u00c8\u00c9\5\65\33\2\u00c9\u00ca\7.\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\65\33\2\u00d1\u00d0\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7_\2\2\u00d4"+
		"\64\3\2\2\2\u00d5\u00d6\5)\25\2\u00d6\66\3\2\2\2\u00d7\u00d8\7V\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7g\2\2\u00db8\3\2\2\2\u00dc"+
		"\u00dd\7H\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2"+
		"\u00e0\u00e1\7g\2\2\u00e1:\3\2\2\2\u00e2\u00e6\7\"\2\2\u00e3\u00e4\7\""+
		"\2\2\u00e4\u00e6\5;\36\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"<\3\2\2\2\u00e7\u00e9\t\n\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7"+
		"@\2\2\u00ed\u00fb\7?\2\2\u00ee\u00ef\7>\2\2\u00ef\u00fb\7?\2\2\u00f0\u00fb"+
		"\t\13\2\2\u00f1\u00f2\7?\2\2\u00f2\u00fb\7?\2\2\u00f3\u00f4\7#\2\2\u00f4"+
		"\u00fb\7?\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00fb\7f\2\2"+
		"\u00f8\u00f9\7q\2\2\u00f9\u00fb\7t\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ee"+
		"\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f5\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb@\3\2\2\2\u00fc\u0100\5+\26\2"+
		"\u00fd\u00ff\5;\36\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0107\5? \2\u0104\u0106\5;\36\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\5+\26\2\u010b\u012d\3\2\2\2\u010c\u0110\5)\25\2\u010d"+
		"\u010f\5;\36\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0117\5? \2\u0114\u0116\5;\36\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011b\5)\25\2\u011b\u012d\3\2\2\2\u011c\u0120\5+\26\2\u011d"+
		"\u011f\5;\36\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0127\5? \2\u0124\u0126\5;\36\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\5)\25\2\u012b\u012d\3\2\2\2\u012c\u00fc\3\2\2\2\u012c"+
		"\u010c\3\2\2\2\u012c\u011c\3\2\2\2\u012dB\3\2\2\2\u012e\u0132\5\61\31"+
		"\2\u012f\u0131\5;\36\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0139\7*\2\2\u0136\u0138\5;\36\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0156\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u0140\5A!\2\u013d\u013f\5;\36\2\u013e\u013d\3\2\2"+
		"\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0154"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\5;\36\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014d\3\2"+
		"\2\2\u0148\u0149\7c\2\2\u0149\u014a\7p\2\2\u014a\u014e\7f\2\2\u014b\u014c"+
		"\7q\2\2\u014c\u014e\7t\2\2\u014d\u0148\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\5;\36\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0144\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u013c\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015d\3\2\2\2\u015a\u015c\5;\36\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0164\7+\2\2\u0161\u0163\5;\36\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016b\7<\2\2\u0168\u016a\5;\36"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u01a1\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0172\5\61\31\2"+
		"\u016f\u0171\5;\36\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u018f\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0177\5;\36\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u018d\5A!\2\u017c\u017e\5;\36\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0186\3\2\2\2\u0181\u0182"+
		"\7c\2\2\u0182\u0183\7p\2\2\u0183\u0187\7f\2\2\u0184\u0185\7q\2\2\u0185"+
		"\u0187\7t\2\2\u0186\u0181\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u018a\5;\36\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u017d\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0178\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2"+
		"\2\2\u0193\u0195\5;\36\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199\u019d\7<\2\2\u019a\u019c\5;\36\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u012e\3\2\2\2\u01a0\u016e\3\2\2\2\u01a1"+
		"D\3\2\2\2\64\2knsv{\u0081\u0085\u0087\u008c\u0091\u0097\u009b\u00a3\u00ac"+
		"\u00b7\u00c5\u00cd\u00d1\u00e5\u00ea\u00fa\u0100\u0107\u0110\u0117\u0120"+
		"\u0127\u012c\u0132\u0139\u0140\u0146\u014d\u0152\u0154\u0158\u015d\u0164"+
		"\u016b\u0172\u0178\u017f\u0186\u018b\u018d\u0191\u0196\u019d\u01a0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}