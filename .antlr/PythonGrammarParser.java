// Generated from /Users/tylerdunaway/Developer/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NEWLINE=11, INT=12, FLOAT=13, STRING=14, DOUBLE=15, BOOL=16, 
		LITERAL=17, VARNAME=18, ASSIGNMENT=19, ASSSIGNMENTOPERATOR=20, ARITHMETICOPERATOR=21, 
		ARITHMETICSTATEMENT=22, SIGNS=23, IFELSE=24, LIST=25, LISTITEM=26, TRUE=27, 
		FALSE=28, WS=29, TAB=30, NOT=31, CONOPERATORS=32, CONSTATEMENT=33, CONSTATEMENTS=34;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_printRule = 2, RULE_ifstatement = 3, 
		RULE_elifstatement = 4, RULE_elsestatement = 5, RULE_blockstatement = 6, 
		RULE_whilestatement = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "printRule", "ifstatement", "elifstatement", "elsestatement", 
			"blockstatement", "whilestatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'print('", "'if'", "':'", "'\nelif'", "'\nelse:'", 
			"'while'", "'and'", "'or'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'True'", "'False'", 
			"' '", null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", "ASSIGNMENT", 
			"ASSSIGNMENTOPERATOR", "ARITHMETICOPERATOR", "ARITHMETICSTATEMENT", "SIGNS", 
			"IFELSE", "LIST", "LISTITEM", "TRUE", "FALSE", "WS", "TAB", "NOT", "CONOPERATORS", 
			"CONSTATEMENT", "CONSTATEMENTS"
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

	@Override
	public String getGrammarFileName() { return "PythonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonGrammarParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << ASSIGNMENT))) != 0)) {
				{
				{
				setState(16);
				expr();
				setState(17);
				match(NEWLINE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PythonGrammarParser.ASSIGNMENT, 0); }
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				ifstatement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__0);
				setState(26);
				expr();
				setState(27);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				printRule();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(ASSIGNMENT);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				whilestatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRule; }
	}

	public final PrintRuleContext printRule() throws RecognitionException {
		PrintRuleContext _localctx = new PrintRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__2);
			setState(35);
			expr();
			setState(36);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode CONSTATEMENTS() { return getToken(PythonGrammarParser.CONSTATEMENTS, 0); }
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<ElifstatementContext> elifstatement() {
			return getRuleContexts(ElifstatementContext.class);
		}
		public ElifstatementContext elifstatement(int i) {
			return getRuleContext(ElifstatementContext.class,i);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__3);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(39);
					match(WS);
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				match(T__0);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(46);
					match(WS);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(CONSTATEMENTS);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(53);
					match(WS);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__1);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(60);
					match(WS);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__4);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(67);
					match(WS);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				blockstatement();
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						elifstatement();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(80);
					elsestatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__3);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(84);
					match(WS);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(CONSTATEMENTS);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(91);
					match(WS);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(T__4);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(98);
					match(WS);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				blockstatement();
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						elifstatement();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(111);
					elsestatement();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifstatementContext extends ParserRuleContext {
		public TerminalNode CONSTATEMENTS() { return getToken(PythonGrammarParser.CONSTATEMENTS, 0); }
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public ElifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstatement; }
	}

	public final ElifstatementContext elifstatement() throws RecognitionException {
		ElifstatementContext _localctx = new ElifstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elifstatement);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__5);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(117);
					match(WS);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__0);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(124);
					match(WS);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(CONSTATEMENTS);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(131);
					match(WS);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__1);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(138);
					match(WS);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__4);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(145);
					match(WS);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				blockstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__5);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(153);
					match(WS);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(CONSTATEMENTS);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(160);
					match(WS);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__4);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(167);
					match(WS);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				blockstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestatementContext extends ParserRuleContext {
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__6);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(177);
				match(WS);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			blockstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockstatementContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PythonGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonGrammarParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(PythonGrammarParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(PythonGrammarParser.TAB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstatement; }
	}

	public final BlockstatementContext blockstatement() throws RecognitionException {
		BlockstatementContext _localctx = new BlockstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					match(NEWLINE);
					setState(186);
					match(TAB);
					setState(187);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<TerminalNode> CONSTATEMENTS() { return getTokens(PythonGrammarParser.CONSTATEMENTS); }
		public TerminalNode CONSTATEMENTS(int i) {
			return getToken(PythonGrammarParser.CONSTATEMENTS, i);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whilestatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__7);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(WS);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(199);
				match(T__0);
				}
			}

			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(202);
					match(WS);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(CONSTATEMENTS);
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(210);
						match(WS);
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==CONSTATEMENTS );
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(220);
				match(T__1);
				}
			}

			setState(223);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\3\5\7\5\62\n\5\f\5\16"+
		"\5\65\13\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\7\5@\n\5\f\5\16\5C"+
		"\13\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\5\5\5T\n\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13"+
		"\5\3\5\5\5s\n\5\5\5u\n\5\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\7\6\u0080"+
		"\n\6\f\6\16\6\u0083\13\6\3\6\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\6"+
		"\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6"+
		"\u0098\13\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\6\3\6\7\6"+
		"\u00a4\n\6\f\6\16\6\u00a7\13\6\3\6\3\6\7\6\u00ab\n\6\f\6\16\6\u00ae\13"+
		"\6\3\6\5\6\u00b1\n\6\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\6\b\u00bf\n\b\r\b\16\b\u00c0\3\t\3\t\7\t\u00c5\n\t\f\t\16"+
		"\t\u00c8\13\t\3\t\5\t\u00cb\n\t\3\t\7\t\u00ce\n\t\f\t\16\t\u00d1\13\t"+
		"\3\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t\u00d9\13\t\6\t\u00db\n\t\r\t\16\t"+
		"\u00dc\3\t\5\t\u00e0\n\t\3\t\3\t\3\t\3\u00d7\2\n\2\4\6\b\n\f\16\20\2\3"+
		"\3\2\13\f\2\u00fe\2\27\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\bt\3\2\2\2\n\u00b0"+
		"\3\2\2\2\f\u00b2\3\2\2\2\16\u00be\3\2\2\2\20\u00c2\3\2\2\2\22\23\5\4\3"+
		"\2\23\24\7\r\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2"+
		"\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32#\5\b\5\2\33\34\7\3\2\2"+
		"\34\35\5\4\3\2\35\36\7\4\2\2\36#\3\2\2\2\37#\5\6\4\2 #\7\25\2\2!#\5\20"+
		"\t\2\"\32\3\2\2\2\"\33\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3"+
		"\2\2\2$%\7\5\2\2%&\5\4\3\2&\'\7\4\2\2\'\7\3\2\2\2(,\7\6\2\2)+\7\37\2\2"+
		"*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\63\7\3\2"+
		"\2\60\62\7\37\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7$\2\2\679\7\37\2\28\67\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=A\7\4\2\2>@\7\37\2\2"+
		"?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DH\7\7\2\2"+
		"EG\7\37\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2"+
		"\2KO\5\16\b\2LN\5\n\6\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2RT\5\f\7\2SR\3\2\2\2ST\3\2\2\2Tu\3\2\2\2UY\7\6\2\2VX\7\37"+
		"\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\7"+
		"$\2\2]_\7\37\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3"+
		"\2\2\2cg\7\7\2\2df\7\37\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj"+
		"\3\2\2\2ig\3\2\2\2jn\5\16\b\2km\5\n\6\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\5\f\7\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"t(\3\2\2\2tU\3\2\2\2u\t\3\2\2\2vz\7\b\2\2wy\7\37\2\2xw\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0081\7\3\2\2~\u0080\7\37"+
		"\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\7$\2\2\u0085"+
		"\u0087\7\37\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008f\7\4\2\2\u008c\u008e\7\37\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0096\7\7\2\2\u0093\u0095\7\37\2\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u00b1\5\16\b\2\u009a\u009e\7"+
		"\b\2\2\u009b\u009d\7\37\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a4\7\37\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ac\7\7\2\2\u00a9\u00ab\7\37\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\5\16\b\2\u00b0"+
		"v\3\2\2\2\u00b0\u009a\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b6\7\t\2\2\u00b3"+
		"\u00b5\7\37\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\5\16\b\2\u00ba\r\3\2\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd\7 \2\2"+
		"\u00bd\u00bf\5\4\3\2\u00be\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c6\7\n\2\2\u00c3"+
		"\u00c5\7\37\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cb\7\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00da\3\2"+
		"\2\2\u00cc\u00ce\7\37\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d7\t\2\2\2\u00d4\u00d6\7\37\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00cf\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00e0\7\4\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\7\2\2\u00e2\21\3\2\2\2\"\27\",\63:AHOSY`"+
		"gnrtz\u0081\u0088\u008f\u0096\u009e\u00a5\u00ac\u00b0\u00b6\u00c0\u00c6"+
		"\u00ca\u00cf\u00d7\u00dc\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}