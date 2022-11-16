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
		DOUBLE=18, BOOL=19, LITERAL=20, VARNAME=21, ASSSIGNMENTOPERATOR=22, SIGNS=23, 
<<<<<<< HEAD
		LIST=24, LISTITEM=25, TRUE=26, FALSE=27, CONSTATEMENTS=28;
=======
		IFELSE=24, LIST=25, LISTITEM=26, TRUE=27, FALSE=28;
>>>>>>> b4450d9b175b3e323cfcec412de8d28458c24ee5
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
<<<<<<< HEAD
			"LIST", "LISTITEM", "TRUE", "FALSE", "CONSTATEMENTS"
=======
			"IFELSE", "LIST", "LISTITEM", "TRUE", "FALSE"
>>>>>>> b4450d9b175b3e323cfcec412de8d28458c24ee5
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
<<<<<<< HEAD
			"VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", "LIST", "LISTITEM", "TRUE", 
			"FALSE", "CONSTATEMENTS"
=======
			"VARNAME", "ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", "LISTITEM", 
			"TRUE", "FALSE"
>>>>>>> b4450d9b175b3e323cfcec412de8d28458c24ee5
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e5\b\1\4\2"+
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e2\b\1\4\2"+
>>>>>>> b4450d9b175b3e323cfcec412de8d28458c24ee5
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17`\n"+
		"\17\r\17\16\17a\3\20\5\20e\n\20\3\20\6\20h\n\20\r\20\16\20i\3\21\5\21"+
		"m\n\21\3\21\6\21p\n\21\r\21\16\21q\3\21\3\21\6\21v\n\21\r\21\16\21w\3"+
		"\22\3\22\6\22|\n\22\r\22\16\22}\3\22\3\22\3\23\5\23\u0083\n\23\3\23\6"+
		"\23\u0086\n\23\r\23\16\23\u0087\3\23\3\23\6\23\u008c\n\23\r\23\16\23\u008d"+
		"\3\24\3\24\5\24\u0092\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009a\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a3\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
<<<<<<< HEAD
		"\3\27\3\27\5\27\u00b8\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00c0\n"+
		"\31\f\31\16\31\u00c3\13\31\3\31\5\31\u00c6\n\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00e4\n\35\2\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3"+
		"\2\13\3\2\f\f\3\2//\3\2\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7"+
		"\2\'\',-//\61\61``\4\2>>@@\2\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2"+
		"\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25P\3\2"+
		"\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35_\3\2\2\2\37d\3\2\2\2!l\3\2"+
		"\2\2#y\3\2\2\2%\u0082\3\2\2\2\'\u0091\3\2\2\2)\u0099\3\2\2\2+\u00a2\3"+
		"\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00c9\3\2\2\2"+
		"\65\u00cb\3\2\2\2\67\u00d0\3\2\2\29\u00e3\3\2\2\2;<\7,\2\2<\4\3\2\2\2"+
		"=>\7\61\2\2>\6\3\2\2\2?@\7-\2\2@\b\3\2\2\2AB\7/\2\2B\n\3\2\2\2CD\7\'\2"+
		"\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7-\2\2HI\7?\2\2I\20\3\2\2\2JK\7/"+
		"\2\2KL\7?\2\2L\22\3\2\2\2MN\7,\2\2NO\7?\2\2O\24\3\2\2\2PQ\7\61\2\2QR\7"+
		"?\2\2R\26\3\2\2\2ST\7*\2\2T\30\3\2\2\2UV\7+\2\2V\32\3\2\2\2WX\7r\2\2X"+
		"Y\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\]\7*\2\2]\34\3\2\2\2^`\t\2\2\2_"+
		"^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\36\3\2\2\2ce\t\3\2\2dc\3\2\2"+
		"\2de\3\2\2\2eg\3\2\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j \3\2\2\2km\t\3\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\t\4\2\2on\3\2\2"+
		"\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\60\2\2tv\t\4\2\2ut\3\2"+
		"\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2y{\7$\2\2z|\t\5\2\2{z\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7$\2\2\u0080"+
		"$\3\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0085\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\7\60\2\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e&\3\2\2\2\u008f\u0092"+
		"\5\65\33\2\u0090\u0092\5\67\34\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2"+
		"\2\u0092(\3\2\2\2\u0093\u009a\5\37\20\2\u0094\u009a\5!\21\2\u0095\u009a"+
		"\5#\22\2\u0096\u009a\5%\23\2\u0097\u009a\5\'\24\2\u0098\u009a\5\61\31"+
		"\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a*\3\2\2\2\u009b"+
		"\u009c\t\6\2\2\u009c\u00a3\5+\26\2\u009d\u009e\t\7\2\2\u009e\u00a3\5+"+
		"\26\2\u009f\u00a0\t\4\2\2\u00a0\u00a3\5+\26\2\u00a1\u00a3\t\b\2\2\u00a2"+
		"\u009b\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7?\2\2\u00a6\u00b8"+
		"\7\"\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"\u00b8\7\"\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7?\2"+
		"\2\u00ae\u00b8\7\"\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2\u00b8\7\"\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7\61\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\u00b8\7\"\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00a7\3\2"+
		"\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		".\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba\60\3\2\2\2\u00bb\u00c1\7]\2\2\u00bc"+
		"\u00bd\5\63\32\2\u00bd\u00be\7.\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\5\63\32\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7_\2\2\u00c8"+
		"\62\3\2\2\2\u00c9\u00ca\5)\25\2\u00ca\64\3\2\2\2\u00cb\u00cc\7V\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\66\3\2\2\2\u00d0"+
		"\u00d1\7H\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d58\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00e4\7?\2"+
		"\2\u00d8\u00d9\7>\2\2\u00d9\u00e4\7?\2\2\u00da\u00e4\t\n\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\u00e4\7?\2\2\u00dd\u00de\7#\2\2\u00de\u00e4\7?\2\2\u00df"+
		"\u00e0\7(\2\2\u00e0\u00e4\7(\2\2\u00e1\u00e2\7~\2\2\u00e2\u00e4\7~\2\2"+
		"\u00e3\u00d6\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db"+
		"\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		":\3\2\2\2\25\2adilqw{}\u0082\u0087\u008d\u0091\u0099\u00a2\u00b7\u00c1"+
		"\u00c5\u00e3\2";
=======
		"\3\27\3\27\5\27\u00b8\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00c6\n\31\3\32\3\32\3\32\3\32\7\32\u00cc\n\32\f"+
		"\32\16\32\u00cf\13\32\3\32\5\32\u00d2\n\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\n\3\2\f\f\3"+
		"\2//\3\2\62;\6\2\62;C\\aac|\3\2c|\3\2C\\\5\2\62;C\\c|\7\2\'\',-//\61\61"+
		"``\2\u00fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2"+
		"\2\17G\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25P\3\2\2\2\27S\3\2\2\2\31U\3\2"+
		"\2\2\33W\3\2\2\2\35_\3\2\2\2\37d\3\2\2\2!l\3\2\2\2#y\3\2\2\2%\u0082\3"+
		"\2\2\2\'\u0091\3\2\2\2)\u0099\3\2\2\2+\u00a2\3\2\2\2-\u00b7\3\2\2\2/\u00b9"+
		"\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3"+
		"\2\2\29\u00dc\3\2\2\2;<\7,\2\2<\4\3\2\2\2=>\7\61\2\2>\6\3\2\2\2?@\7-\2"+
		"\2@\b\3\2\2\2AB\7/\2\2B\n\3\2\2\2CD\7\'\2\2D\f\3\2\2\2EF\7?\2\2F\16\3"+
		"\2\2\2GH\7-\2\2HI\7?\2\2I\20\3\2\2\2JK\7/\2\2KL\7?\2\2L\22\3\2\2\2MN\7"+
		",\2\2NO\7?\2\2O\24\3\2\2\2PQ\7\61\2\2QR\7?\2\2R\26\3\2\2\2ST\7*\2\2T\30"+
		"\3\2\2\2UV\7+\2\2V\32\3\2\2\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7"+
		"v\2\2\\]\7*\2\2]\34\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2b\36\3\2\2\2ce\t\3\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\t\4\2\2"+
		"gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3\2\2\2km\t\3\2\2lk\3\2\2\2"+
		"lm\3\2\2\2mo\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2su\7\60\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2x\"\3\2\2\2y{\7$\2\2z|\t\5\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\7$\2\2\u0080$\3\2\2\2\u0081\u0083\t\3\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\t\4"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\7\60\2\2\u008a\u008c\t"+
		"\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e&\3\2\2\2\u008f\u0092\5\67\34\2\u0090\u0092\59\35"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092(\3\2\2\2\u0093\u009a"+
		"\5\37\20\2\u0094\u009a\5!\21\2\u0095\u009a\5#\22\2\u0096\u009a\5%\23\2"+
		"\u0097\u009a\5\'\24\2\u0098\u009a\5\63\32\2\u0099\u0093\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a*\3\2\2\2\u009b\u009c\t\6\2\2\u009c\u00a3"+
		"\5+\26\2\u009d\u009e\t\7\2\2\u009e\u00a3\5+\26\2\u009f\u00a0\t\4\2\2\u00a0"+
		"\u00a3\5+\26\2\u00a1\u00a3\t\b\2\2\u00a2\u009b\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a5"+
		"\7\"\2\2\u00a5\u00a6\7?\2\2\u00a6\u00b8\7\"\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7-\2\2\u00a9\u00aa\7?\2\2\u00aa\u00b8\7\"\2\2\u00ab\u00ac\7\"\2"+
		"\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7?\2\2\u00ae\u00b8\7\"\2\2\u00af\u00b0"+
		"\7\"\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7?\2\2\u00b2\u00b8\7\"\2\2\u00b3"+
		"\u00b4\7\"\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b8\7\""+
		"\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7"+
		"\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8.\3\2\2\2\u00b9\u00ba\t\t\2\2"+
		"\u00ba\60\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00c6\7h\2\2\u00bd\u00be\7"+
		"g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c6\7h\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c6\7g\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\62\3\2\2"+
		"\2\u00c7\u00cd\7]\2\2\u00c8\u00c9\5\65\33\2\u00c9\u00ca\7.\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\65"+
		"\33\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7_\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\5)\25\2\u00d6\66\3\2\2\2\u00d7"+
		"\u00d8\7V\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7g\2\2"+
		"\u00db8\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2"+
		"\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1:\3\2\2\2\25\2adilqw{}\u0082"+
		"\u0087\u008d\u0091\u0099\u00a2\u00b7\u00c5\u00cd\u00d1\2";
>>>>>>> b4450d9b175b3e323cfcec412de8d28458c24ee5
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}