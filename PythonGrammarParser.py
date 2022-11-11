# Generated from PythonGrammar.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23")
        buf.write("\61\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2")
        buf.write("\16\2\17\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3")
        buf.write("\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\2\3\4\5")
        buf.write("\2\4\6\2\5\3\2\3\4\3\2\5\6\3\2\b\f\2\66\2\r\3\2\2\2\4")
        buf.write("\31\3\2\2\2\6,\3\2\2\2\b\t\5\4\3\2\t\n\7\20\2\2\n\f\3")
        buf.write("\2\2\2\13\b\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2")
        buf.write("\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\b\3\1\2\21\32\7\21")
        buf.write("\2\2\22\32\7\22\2\2\23\32\7\23\2\2\24\25\7\r\2\2\25\26")
        buf.write("\5\4\3\2\26\27\7\16\2\2\27\32\3\2\2\2\30\32\5\6\4\2\31")
        buf.write("\20\3\2\2\2\31\22\3\2\2\2\31\23\3\2\2\2\31\24\3\2\2\2")
        buf.write("\31\30\3\2\2\2\32)\3\2\2\2\33\34\f\13\2\2\34\35\t\2\2")
        buf.write("\2\35(\5\4\3\f\36\37\f\n\2\2\37 \t\3\2\2 (\5\4\3\13!\"")
        buf.write("\f\t\2\2\"#\7\7\2\2#(\5\4\3\n$%\f\b\2\2%&\t\4\2\2&(\5")
        buf.write("\4\3\t\'\33\3\2\2\2\'\36\3\2\2\2\'!\3\2\2\2\'$\3\2\2\2")
        buf.write("(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,")
        buf.write("-\7\17\2\2-.\5\4\3\2./\7\16\2\2/\7\3\2\2\2\6\r\31\')")
        return buf.getvalue()


class PythonGrammarParser ( Parser ):

    grammarFileName = "PythonGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'%'", "'='", 
                     "'+='", "'-='", "'*='", "'/='", "'('", "')'", "'print('" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NEWLINE", "INT", "FLOAT", 
                      "STRING" ]

    RULE_start = 0
    RULE_expr = 1
    RULE_printRule = 2

    ruleNames =  [ "start", "expr", "printRule" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    NEWLINE=14
    INT=15
    FLOAT=16
    STRING=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PythonGrammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(PythonGrammarParser.ExprContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(PythonGrammarParser.NEWLINE)
            else:
                return self.getToken(PythonGrammarParser.NEWLINE, i)

        def getRuleIndex(self):
            return PythonGrammarParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = PythonGrammarParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__10) | (1 << PythonGrammarParser.T__12) | (1 << PythonGrammarParser.INT) | (1 << PythonGrammarParser.FLOAT) | (1 << PythonGrammarParser.STRING))) != 0):
                self.state = 6
                self.expr(0)
                self.state = 7
                self.match(PythonGrammarParser.NEWLINE)
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(PythonGrammarParser.INT, 0)

        def FLOAT(self):
            return self.getToken(PythonGrammarParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(PythonGrammarParser.STRING, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PythonGrammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(PythonGrammarParser.ExprContext,i)


        def printRule(self):
            return self.getTypedRuleContext(PythonGrammarParser.PrintRuleContext,0)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = PythonGrammarParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PythonGrammarParser.INT]:
                self.state = 15
                self.match(PythonGrammarParser.INT)
                pass
            elif token in [PythonGrammarParser.FLOAT]:
                self.state = 16
                self.match(PythonGrammarParser.FLOAT)
                pass
            elif token in [PythonGrammarParser.STRING]:
                self.state = 17
                self.match(PythonGrammarParser.STRING)
                pass
            elif token in [PythonGrammarParser.T__10]:
                self.state = 18
                self.match(PythonGrammarParser.T__10)
                self.state = 19
                self.expr(0)
                self.state = 20
                self.match(PythonGrammarParser.T__11)
                pass
            elif token in [PythonGrammarParser.T__12]:
                self.state = 22
                self.printRule()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 39
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 37
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 25
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 26
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__0 or _la==PythonGrammarParser.T__1):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 27
                        self.expr(10)
                        pass

                    elif la_ == 2:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 28
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 29
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__2 or _la==PythonGrammarParser.T__3):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 30
                        self.expr(9)
                        pass

                    elif la_ == 3:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 31
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")

                        self.state = 32
                        self.match(PythonGrammarParser.T__4)
                        self.state = 33
                        self.expr(8)
                        pass

                    elif la_ == 4:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 34
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 35
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__5) | (1 << PythonGrammarParser.T__6) | (1 << PythonGrammarParser.T__7) | (1 << PythonGrammarParser.T__8) | (1 << PythonGrammarParser.T__9))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 36
                        self.expr(7)
                        pass

             
                self.state = 41
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class PrintRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(PythonGrammarParser.ExprContext,0)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_printRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintRule" ):
                listener.enterPrintRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintRule" ):
                listener.exitPrintRule(self)




    def printRule(self):

        localctx = PythonGrammarParser.PrintRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_printRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(PythonGrammarParser.T__12)
            self.state = 43
            self.expr(0)
            self.state = 44
            self.match(PythonGrammarParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 6)
         




