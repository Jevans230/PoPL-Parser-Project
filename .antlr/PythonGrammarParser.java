// Generated from /Users/jevans230/Desktop/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
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
		T__9=10, COMMENT=11, NEWLINE=12, INT=13, FLOAT=14, STRING=15, DOUBLE=16, 
		BOOL=17, LITERAL=18, VARNAME=19, ASSIGNMENT=20, ASSSIGNMENTOPERATOR=21, 
		ARITHMETICOPERATOR=22, ARITHMETICSTATEMENT=23, SIGNS=24, IFELSE=25, LIST=26, 
		LISTITEM=27, TRUE=28, FALSE=29, WS=30, TAB=31, NOT=32, CONOPERATORS=33, 
		CONSTATEMENT=34;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_printRule = 2, RULE_constatements = 3, 
		RULE_ifstatement = 4, RULE_elifstatement = 5, RULE_elsestatement = 6, 
		RULE_blockstatement = 7, RULE_whilestatement = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "printRule", "constatements", "ifstatement", "elifstatement", 
			"elsestatement", "blockstatement", "whilestatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'print('", "'and'", "'or'", "'if'", "':'", "'\nelif'", 
			"'\nelse:'", "'while'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'True'", "'False'", 
			"' '", null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
			"NEWLINE", "INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", 
			"ASSIGNMENT", "ASSSIGNMENTOPERATOR", "ARITHMETICOPERATOR", "ARITHMETICSTATEMENT", 
			"SIGNS", "IFELSE", "LIST", "LISTITEM", "TRUE", "FALSE", "WS", "TAB", 
			"NOT", "CONOPERATORS", "CONSTATEMENT"
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
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(PythonGrammarParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(PythonGrammarParser.COMMENT, i);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << COMMENT) | (1L << ASSIGNMENT))) != 0)) {
				{
				{
				setState(18);
				expr();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(19);
					match(WS);
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(25);
					match(COMMENT);
					}
				}

				setState(28);
				match(NEWLINE);
				}
				}
				setState(34);
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
		public TerminalNode COMMENT() { return getToken(PythonGrammarParser.COMMENT, 0); }
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(COMMENT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				ifstatement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__0);
				setState(38);
				expr();
				setState(39);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				printRule();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(ASSIGNMENT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
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
			setState(46);
			match(T__2);
			setState(47);
			expr();
			setState(48);
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

	public static class ConstatementsContext extends ParserRuleContext {
		public List<TerminalNode> CONSTATEMENT() { return getTokens(PythonGrammarParser.CONSTATEMENT); }
		public TerminalNode CONSTATEMENT(int i) {
			return getToken(PythonGrammarParser.CONSTATEMENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(PythonGrammarParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PythonGrammarParser.VARNAME, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(PythonGrammarParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(PythonGrammarParser.LITERAL, i);
		}
		public List<TerminalNode> NOT() { return getTokens(PythonGrammarParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(PythonGrammarParser.NOT, i);
		}
		public ConstatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constatements; }
	}

	public final ConstatementsContext constatements() throws RecognitionException {
		ConstatementsContext _localctx = new ConstatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CONSTATEMENT);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(WS);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__4) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(58);
							match(WS);
							}
							} 
						}
						setState(63);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(64);
						match(CONSTATEMENT);
						}
						break;
					case 2:
						{
						setState(66);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(65);
							match(NOT);
							}
						}

						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(68);
							match(WS);
							}
							}
							setState(73);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(74);
						match(VARNAME);
						}
						break;
					case 3:
						{
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(75);
							match(NOT);
							}
						}

						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(78);
							match(WS);
							}
							}
							setState(83);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(84);
						match(LITERAL);
						}
						break;
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(87);
							match(WS);
							}
							} 
						}
						setState(92);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class IfstatementContext extends ParserRuleContext {
		public ConstatementsContext constatements() {
			return getRuleContext(ConstatementsContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__5);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(99);
					match(WS);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(106);
					match(WS);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				constatements();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(113);
					match(WS);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__1);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(120);
					match(WS);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__6);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(127);
					match(WS);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				blockstatement();
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						elifstatement();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(140);
					elsestatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__5);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(144);
					match(WS);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				constatements();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(151);
					match(WS);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__6);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(158);
					match(WS);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				blockstatement();
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						elifstatement();
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(171);
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
		public ConstatementsContext constatements() {
			return getRuleContext(ConstatementsContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_elifstatement);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__7);
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
				match(T__0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(184);
					match(WS);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				constatements();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(191);
					match(WS);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__1);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(198);
					match(WS);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__6);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(205);
					match(WS);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				blockstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__7);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(214);
					match(WS);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				constatements();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(221);
					match(WS);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__6);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(228);
					match(WS);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
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
		enterRule(_localctx, 12, RULE_elsestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__8);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(239);
				match(WS);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
		enterRule(_localctx, 14, RULE_blockstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247);
					match(NEWLINE);
					setState(248);
					match(TAB);
					setState(249);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public List<ConstatementsContext> constatements() {
			return getRuleContexts(ConstatementsContext.class);
		}
		public ConstatementsContext constatements(int i) {
			return getRuleContext(ConstatementsContext.class,i);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__9);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(WS);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(261);
				match(T__0);
				}
			}

			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(264);
					match(WS);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				constatements();
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(272);
						match(WS);
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==CONSTATEMENT );
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(282);
				match(T__1);
				}
			}

			setState(285);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\5\2\35\n\2\3\2\3\2\7\2!\n\2\f\2\16\2"+
		"$\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3"+
		"\5\5\5E\n\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\5\7\5R\n\5"+
		"\f\5\16\5U\13\5\3\5\5\5X\n\5\3\5\7\5[\n\5\f\5\16\5^\13\5\7\5`\n\5\f\5"+
		"\16\5c\13\5\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\7\6n\n\6\f\6\16\6"+
		"q\13\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13"+
		"\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086\13\6\3\6\3\6\7\6\u008a\n\6\f\6"+
		"\16\6\u008d\13\6\3\6\5\6\u0090\n\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097"+
		"\13\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\7\6\u00a2\n\6"+
		"\f\6\16\6\u00a5\13\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\5\6"+
		"\u00af\n\6\5\6\u00b1\n\6\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7"+
		"\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf\13\7\3\7\3\7\7\7\u00c3\n\7\f\7\16\7"+
		"\u00c6\13\7\3\7\3\7\7\7\u00ca\n\7\f\7\16\7\u00cd\13\7\3\7\3\7\7\7\u00d1"+
		"\n\7\f\7\16\7\u00d4\13\7\3\7\3\7\3\7\3\7\7\7\u00da\n\7\f\7\16\7\u00dd"+
		"\13\7\3\7\3\7\7\7\u00e1\n\7\f\7\16\7\u00e4\13\7\3\7\3\7\7\7\u00e8\n\7"+
		"\f\7\16\7\u00eb\13\7\3\7\3\7\5\7\u00ef\n\7\3\b\3\b\7\b\u00f3\n\b\f\b\16"+
		"\b\u00f6\13\b\3\b\3\b\3\t\3\t\3\t\6\t\u00fd\n\t\r\t\16\t\u00fe\3\n\3\n"+
		"\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\5\n\u0109\n\n\3\n\7\n\u010c\n\n"+
		"\f\n\16\n\u010f\13\n\3\n\3\n\3\n\7\n\u0114\n\n\f\n\16\n\u0117\13\n\6\n"+
		"\u0119\n\n\r\n\16\n\u011a\3\n\5\n\u011e\n\n\3\n\3\n\3\n\3\u0115\2\13\2"+
		"\4\6\b\n\f\16\20\22\2\3\3\2\6\7\2\u0148\2\"\3\2\2\2\4.\3\2\2\2\6\60\3"+
		"\2\2\2\b\64\3\2\2\2\n\u00b0\3\2\2\2\f\u00ee\3\2\2\2\16\u00f0\3\2\2\2\20"+
		"\u00fc\3\2\2\2\22\u0100\3\2\2\2\24\30\5\4\3\2\25\27\7 \2\2\26\25\3\2\2"+
		"\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2"+
		"\2\33\35\7\r\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\16"+
		"\2\2\37!\3\2\2\2 \24\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2"+
		"\2$\"\3\2\2\2%/\7\r\2\2&/\5\n\6\2\'(\7\3\2\2()\5\4\3\2)*\7\4\2\2*/\3\2"+
		"\2\2+/\5\6\4\2,/\7\26\2\2-/\5\22\n\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.+"+
		"\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\7\5\2\2\61\62\5\4\3\2\62"+
		"\63\7\4\2\2\63\7\3\2\2\2\648\7$\2\2\65\67\7 \2\2\66\65\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29a\3\2\2\2:8\3\2\2\2;?\t\2\2\2<>\7 \2\2=<\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@W\3\2\2\2A?\3\2\2\2BX\7$\2\2CE\7"+
		"\"\2\2DC\3\2\2\2DE\3\2\2\2EI\3\2\2\2FH\7 \2\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LX\7\25\2\2MO\7\"\2\2NM\3\2\2\2NO"+
		"\3\2\2\2OS\3\2\2\2PR\7 \2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV"+
		"\3\2\2\2US\3\2\2\2VX\7\24\2\2WB\3\2\2\2WD\3\2\2\2WN\3\2\2\2X\\\3\2\2\2"+
		"Y[\7 \2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2_;\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2dh\7\b"+
		"\2\2eg\7 \2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2"+
		"\2\2ko\7\3\2\2ln\7 \2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qo\3\2\2\2rv\5\b\5\2su\7 \2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wy\3\2\2\2xv\3\2\2\2y}\7\4\2\2z|\7 \2\2{z\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\7\t\2\2\u0081"+
		"\u0083\7 \2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008b\5\20\t\2\u0088\u008a\5\f\7\2\u0089\u0088\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\5\16\b\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u00b1\3\2\2\2\u0091\u0095\7\b\2\2\u0092\u0094\7 \2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\5\b\5\2\u0099"+
		"\u009b\7 \2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a3\7\t\2\2\u00a0\u00a2\7 \2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00aa\5\20\t\2\u00a7\u00a9\5\f\7\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\16\b\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0d\3\2\2\2\u00b0\u0091"+
		"\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b6\7\n\2\2\u00b3\u00b5\7 \2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\7\3\2\2\u00ba"+
		"\u00bc\7 \2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c4\5\b\5\2\u00c1\u00c3\7 \2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00cb\7\4\2\2\u00c8\u00ca\7 \2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\7\t\2\2\u00cf\u00d1\7 "+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\20"+
		"\t\2\u00d6\u00ef\3\2\2\2\u00d7\u00db\7\n\2\2\u00d8\u00da\7 \2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5\b\5\2\u00df"+
		"\u00e1\7 \2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e9\7\t\2\2\u00e6\u00e8\7 \2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\5\20\t\2\u00ed\u00ef\3\2\2\2\u00ee\u00b2\3"+
		"\2\2\2\u00ee\u00d7\3\2\2\2\u00ef\r\3\2\2\2\u00f0\u00f4\7\13\2\2\u00f1"+
		"\u00f3\7 \2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\5\20\t\2\u00f8\17\3\2\2\2\u00f9\u00fa\7\16\2\2\u00fa\u00fb\7!\2"+
		"\2\u00fb\u00fd\5\4\3\2\u00fc\u00f9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\21\3\2\2\2\u0100\u0104\7\f\2\2\u0101"+
		"\u0103\7 \2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\7\3\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0118\3\2"+
		"\2\2\u010a\u010c\7 \2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0111\5\b\5\2\u0111\u0115\t\2\2\2\u0112\u0114\7 \2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u010d\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011e\7\4\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7\t\2\2\u0120\23\3\2\2\2-\30\34\".8?DINSW\\"+
		"ahov}\u0084\u008b\u008f\u0095\u009c\u00a3\u00aa\u00ae\u00b0\u00b6\u00bd"+
		"\u00c4\u00cb\u00d2\u00db\u00e2\u00e9\u00ee\u00f4\u00fe\u0104\u0108\u010d"+
		"\u0115\u011a\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}