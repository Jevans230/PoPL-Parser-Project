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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r")
        buf.write("-\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16")
        buf.write("\2\17\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\31\n\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16\3")
        buf.write("\'\13\3\3\4\3\4\3\4\3\4\3\4\2\3\4\5\2\4\6\2\4\3\2\3\4")
        buf.write("\3\2\5\6\2\60\2\r\3\2\2\2\4\30\3\2\2\2\6(\3\2\2\2\b\t")
        buf.write("\5\4\3\2\t\n\7\13\2\2\n\f\3\2\2\2\13\b\3\2\2\2\f\17\3")
        buf.write("\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\r\3\2")
        buf.write("\2\2\20\21\b\3\1\2\21\31\7\f\2\2\22\31\7\r\2\2\23\24\7")
        buf.write("\b\2\2\24\25\5\4\3\2\25\26\7\t\2\2\26\31\3\2\2\2\27\31")
        buf.write("\5\6\4\2\30\20\3\2\2\2\30\22\3\2\2\2\30\23\3\2\2\2\30")
        buf.write("\27\3\2\2\2\31%\3\2\2\2\32\33\f\t\2\2\33\34\t\2\2\2\34")
        buf.write("$\5\4\3\n\35\36\f\b\2\2\36\37\t\3\2\2\37$\5\4\3\t !\f")
        buf.write("\7\2\2!\"\7\7\2\2\"$\5\4\3\b#\32\3\2\2\2#\35\3\2\2\2#")
        buf.write(" \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'")
        buf.write("%\3\2\2\2()\7\n\2\2)*\5\4\3\2*+\7\t\2\2+\7\3\2\2\2\6\r")
        buf.write("\30#%")
        return buf.getvalue()


class PythonGrammarParser ( Parser ):

    grammarFileName = "PythonGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", 
                     "')'", "'print('" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "NEWLINE", "INT", "FLOAT" ]

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
    NEWLINE=9
    INT=10
    FLOAT=11

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
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__5) | (1 << PythonGrammarParser.T__7) | (1 << PythonGrammarParser.INT) | (1 << PythonGrammarParser.FLOAT))) != 0):
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
            self.state = 22
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
            elif token in [PythonGrammarParser.T__5]:
                self.state = 17
                self.match(PythonGrammarParser.T__5)
                self.state = 18
                self.expr(0)
                self.state = 19
                self.match(PythonGrammarParser.T__6)
                pass
            elif token in [PythonGrammarParser.T__7]:
                self.state = 21
                self.printRule()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 35
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 33
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 24
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 25
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__0 or _la==PythonGrammarParser.T__1):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 26
                        self.expr(8)
                        pass

                    elif la_ == 2:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 27
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 28
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__2 or _la==PythonGrammarParser.T__3):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 29
                        self.expr(7)
                        pass

                    elif la_ == 3:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 30
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")

                        self.state = 31
                        self.match(PythonGrammarParser.T__4)
                        self.state = 32
                        self.expr(6)
                        pass

             
                self.state = 37
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
            self.state = 38
            self.match(PythonGrammarParser.T__7)
            self.state = 39
            self.expr(0)
            self.state = 40
            self.match(PythonGrammarParser.T__6)
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
                return self.precpred(self._ctx, 7)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 5)
         




