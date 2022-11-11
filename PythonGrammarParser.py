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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25")
        buf.write("@\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2")
        buf.write("\7\2\20\n\2\f\2\16\2\23\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4")
        buf.write("\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6")
        buf.write("\2\3\4\7\2\4\6\b\n\2\6\3\2\3\4\3\2\5\6\3\2\b\f\3\2\21")
        buf.write("\23\2E\2\21\3\2\2\2\4\36\3\2\2\2\6\61\3\2\2\2\b\65\3\2")
        buf.write("\2\2\n=\3\2\2\2\f\r\5\4\3\2\r\16\7\20\2\2\16\20\3\2\2")
        buf.write("\2\17\f\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2")
        buf.write("\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\b\3\1\2\25\37\7")
        buf.write("\21\2\2\26\37\7\22\2\2\27\37\7\23\2\2\30\31\7\r\2\2\31")
        buf.write("\32\5\4\3\2\32\33\7\16\2\2\33\37\3\2\2\2\34\37\5\6\4\2")
        buf.write("\35\37\5\n\6\2\36\24\3\2\2\2\36\26\3\2\2\2\36\27\3\2\2")
        buf.write("\2\36\30\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37.\3\2\2")
        buf.write("\2 !\f\f\2\2!\"\t\2\2\2\"-\5\4\3\r#$\f\13\2\2$%\t\3\2")
        buf.write("\2%-\5\4\3\f&\'\f\n\2\2\'(\7\7\2\2(-\5\4\3\13)*\f\t\2")
        buf.write("\2*+\t\4\2\2+-\5\4\3\n, \3\2\2\2,#\3\2\2\2,&\3\2\2\2,")
        buf.write(")\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60")
        buf.write(".\3\2\2\2\61\62\7\17\2\2\62\63\5\4\3\2\63\64\7\16\2\2")
        buf.write("\64\7\3\2\2\2\65\66\t\5\2\2\66\t\3\2\2\2\678\7\24\2\2")
        buf.write("89\7\25\2\29>\7\24\2\2:;\7\24\2\2;<\7\25\2\2<>\5\b\5\2")
        buf.write("=\67\3\2\2\2=:\3\2\2\2>\13\3\2\2\2\7\21\36,.=")
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
                      "STRING", "VARNAME", "ASSSIGNMENTOPERATOR" ]

    RULE_start = 0
    RULE_expr = 1
    RULE_printRule = 2
    RULE_literal = 3
    RULE_assignment = 4

    ruleNames =  [ "start", "expr", "printRule", "literal", "assignment" ]

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
    VARNAME=18
    ASSSIGNMENTOPERATOR=19

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
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__10) | (1 << PythonGrammarParser.T__12) | (1 << PythonGrammarParser.INT) | (1 << PythonGrammarParser.FLOAT) | (1 << PythonGrammarParser.STRING) | (1 << PythonGrammarParser.VARNAME))) != 0):
                self.state = 10
                self.expr(0)
                self.state = 11
                self.match(PythonGrammarParser.NEWLINE)
                self.state = 17
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


        def assignment(self):
            return self.getTypedRuleContext(PythonGrammarParser.AssignmentContext,0)


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
            self.state = 28
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PythonGrammarParser.INT]:
                self.state = 19
                self.match(PythonGrammarParser.INT)
                pass
            elif token in [PythonGrammarParser.FLOAT]:
                self.state = 20
                self.match(PythonGrammarParser.FLOAT)
                pass
            elif token in [PythonGrammarParser.STRING]:
                self.state = 21
                self.match(PythonGrammarParser.STRING)
                pass
            elif token in [PythonGrammarParser.T__10]:
                self.state = 22
                self.match(PythonGrammarParser.T__10)
                self.state = 23
                self.expr(0)
                self.state = 24
                self.match(PythonGrammarParser.T__11)
                pass
            elif token in [PythonGrammarParser.T__12]:
                self.state = 26
                self.printRule()
                pass
            elif token in [PythonGrammarParser.VARNAME]:
                self.state = 27
                self.assignment()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 44
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 42
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 30
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 31
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__0 or _la==PythonGrammarParser.T__1):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 32
                        self.expr(11)
                        pass

                    elif la_ == 2:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 33
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 34
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__2 or _la==PythonGrammarParser.T__3):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 35
                        self.expr(10)
                        pass

                    elif la_ == 3:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 36
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")

                        self.state = 37
                        self.match(PythonGrammarParser.T__4)
                        self.state = 38
                        self.expr(9)
                        pass

                    elif la_ == 4:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 39
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 40
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__5) | (1 << PythonGrammarParser.T__6) | (1 << PythonGrammarParser.T__7) | (1 << PythonGrammarParser.T__8) | (1 << PythonGrammarParser.T__9))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 41
                        self.expr(8)
                        pass

             
                self.state = 46
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
            self.state = 47
            self.match(PythonGrammarParser.T__12)
            self.state = 48
            self.expr(0)
            self.state = 49
            self.match(PythonGrammarParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
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

        def getRuleIndex(self):
            return PythonGrammarParser.RULE_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLiteral" ):
                listener.enterLiteral(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLiteral" ):
                listener.exitLiteral(self)




    def literal(self):

        localctx = PythonGrammarParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.INT) | (1 << PythonGrammarParser.FLOAT) | (1 << PythonGrammarParser.STRING))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self, i:int=None):
            if i is None:
                return self.getTokens(PythonGrammarParser.VARNAME)
            else:
                return self.getToken(PythonGrammarParser.VARNAME, i)

        def ASSSIGNMENTOPERATOR(self):
            return self.getToken(PythonGrammarParser.ASSSIGNMENTOPERATOR, 0)

        def literal(self):
            return self.getTypedRuleContext(PythonGrammarParser.LiteralContext,0)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = PythonGrammarParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_assignment)
        try:
            self.state = 59
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 53
                self.match(PythonGrammarParser.VARNAME)
                self.state = 54
                self.match(PythonGrammarParser.ASSSIGNMENTOPERATOR)
                self.state = 55
                self.match(PythonGrammarParser.VARNAME)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 56
                self.match(PythonGrammarParser.VARNAME)
                self.state = 57
                self.match(PythonGrammarParser.ASSSIGNMENTOPERATOR)
                self.state = 58
                self.literal()
                pass


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
                return self.precpred(self._ctx, 10)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 7)
         




