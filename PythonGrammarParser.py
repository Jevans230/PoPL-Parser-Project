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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#")
        buf.write("c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n")
        buf.write("\2\f\2\16\2\21\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\5\3")
        buf.write("\5\7\5\65\n\5\f\5\16\58\13\5\3\5\3\5\7\5<\n\5\f\5\16\5")
        buf.write("?\13\5\3\5\3\5\3\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5")
        buf.write("\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\5\7\5T\n\5\f\5\16\5")
        buf.write("W\13\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\5\5a\n\5\3")
        buf.write("\5\2\3\4\6\2\4\6\b\2\5\3\2\3\4\3\2\5\6\3\2\b\f\2o\2\17")
        buf.write("\3\2\2\2\4\33\3\2\2\2\6.\3\2\2\2\b`\3\2\2\2\n\13\5\4\3")
        buf.write("\2\13\f\7\20\2\2\f\16\3\2\2\2\r\n\3\2\2\2\16\21\3\2\2")
        buf.write("\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2")
        buf.write("\2\22\23\b\3\1\2\23\34\7#\2\2\24\34\7\26\2\2\25\26\7\r")
        buf.write("\2\2\26\27\5\4\3\2\27\30\7\16\2\2\30\34\3\2\2\2\31\34")
        buf.write("\5\6\4\2\32\34\5\b\5\2\33\22\3\2\2\2\33\24\3\2\2\2\33")
        buf.write("\25\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34+\3\2\2\2\35")
        buf.write("\36\f\13\2\2\36\37\t\2\2\2\37*\5\4\3\f !\f\n\2\2!\"\t")
        buf.write("\3\2\2\"*\5\4\3\13#$\f\t\2\2$%\7\7\2\2%*\5\4\3\n&\'\f")
        buf.write("\b\2\2\'(\t\4\2\2(*\5\4\3\t)\35\3\2\2\2) \3\2\2\2)#\3")
        buf.write("\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2")
        buf.write("\2\2-+\3\2\2\2./\7\17\2\2/\60\5\4\3\2\60\61\7\16\2\2\61")
        buf.write("\7\3\2\2\2\62\66\7\27\2\2\63\65\7\37\2\2\64\63\3\2\2\2")
        buf.write("\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28")
        buf.write("\66\3\2\2\29=\7\30\2\2:<\7\37\2\2;:\3\2\2\2<?\3\2\2\2")
        buf.write("=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\27\2\2Aa")
        buf.write("\5\b\5\2BF\7\27\2\2CE\7\37\2\2DC\3\2\2\2EH\3\2\2\2FD\3")
        buf.write("\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IM\7\30\2\2JL\7\37")
        buf.write("\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2")
        buf.write("OM\3\2\2\2Pa\7\27\2\2QU\7\27\2\2RT\7\37\2\2SR\3\2\2\2")
        buf.write("TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\")
        buf.write("\7\30\2\2Y[\7\37\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\")
        buf.write("]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_a\7\26\2\2`\62\3\2\2\2")
        buf.write("`B\3\2\2\2`Q\3\2\2\2a\t\3\2\2\2\r\17\33)+\66=FMU\\`")
        return buf.getvalue()


class PythonGrammarParser ( Parser ):

    grammarFileName = "PythonGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'%'", "'='", 
                     "'+='", "'-='", "'*='", "'/='", "'('", "')'", "'print('", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'True'", "'False'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NEWLINE", "INT", "FLOAT", 
                      "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", 
                      "ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", 
                      "LISTITEM", "TRUE", "FALSE", "WHITESPACE", "TAB", 
                      "CONOPERATORS", "CONSTATEMENTS", "IF" ]

    RULE_start = 0
    RULE_expr = 1
    RULE_printRule = 2
    RULE_assignment = 3

    ruleNames =  [ "start", "expr", "printRule", "assignment" ]

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
    DOUBLE=18
    BOOL=19
    LITERAL=20
    VARNAME=21
    ASSSIGNMENTOPERATOR=22
    SIGNS=23
    IFELSE=24
    LIST=25
    LISTITEM=26
    TRUE=27
    FALSE=28
    WHITESPACE=29
    TAB=30
    CONOPERATORS=31
    CONSTATEMENTS=32
    IF=33

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
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__10) | (1 << PythonGrammarParser.T__12) | (1 << PythonGrammarParser.LITERAL) | (1 << PythonGrammarParser.VARNAME) | (1 << PythonGrammarParser.IF))) != 0):
                self.state = 8
                self.expr(0)
                self.state = 9
                self.match(PythonGrammarParser.NEWLINE)
                self.state = 15
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

        def IF(self):
            return self.getToken(PythonGrammarParser.IF, 0)

        def LITERAL(self):
            return self.getToken(PythonGrammarParser.LITERAL, 0)

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
            self.state = 25
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PythonGrammarParser.IF]:
                self.state = 17
                self.match(PythonGrammarParser.IF)
                pass
            elif token in [PythonGrammarParser.LITERAL]:
                self.state = 18
                self.match(PythonGrammarParser.LITERAL)
                pass
            elif token in [PythonGrammarParser.T__10]:
                self.state = 19
                self.match(PythonGrammarParser.T__10)
                self.state = 20
                self.expr(0)
                self.state = 21
                self.match(PythonGrammarParser.T__11)
                pass
            elif token in [PythonGrammarParser.T__12]:
                self.state = 23
                self.printRule()
                pass
            elif token in [PythonGrammarParser.VARNAME]:
                self.state = 24
                self.assignment()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 41
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 39
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 27
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 28
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__0 or _la==PythonGrammarParser.T__1):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 29
                        self.expr(10)
                        pass

                    elif la_ == 2:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 30
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 31
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__2 or _la==PythonGrammarParser.T__3):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 32
                        self.expr(9)
                        pass

                    elif la_ == 3:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 33
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")

                        self.state = 34
                        self.match(PythonGrammarParser.T__4)
                        self.state = 35
                        self.expr(8)
                        pass

                    elif la_ == 4:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 36
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 37
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__5) | (1 << PythonGrammarParser.T__6) | (1 << PythonGrammarParser.T__7) | (1 << PythonGrammarParser.T__8) | (1 << PythonGrammarParser.T__9))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 38
                        self.expr(7)
                        pass

             
                self.state = 43
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
            self.state = 44
            self.match(PythonGrammarParser.T__12)
            self.state = 45
            self.expr(0)
            self.state = 46
            self.match(PythonGrammarParser.T__11)
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

        def assignment(self):
            return self.getTypedRuleContext(PythonGrammarParser.AssignmentContext,0)


        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(PythonGrammarParser.WHITESPACE)
            else:
                return self.getToken(PythonGrammarParser.WHITESPACE, i)

        def LITERAL(self):
            return self.getToken(PythonGrammarParser.LITERAL, 0)

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
        self.enterRule(localctx, 6, self.RULE_assignment)
        self._la = 0 # Token type
        try:
            self.state = 94
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 48
                self.match(PythonGrammarParser.VARNAME)
                self.state = 52
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 49
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 54
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 55
                self.match(PythonGrammarParser.ASSSIGNMENTOPERATOR)
                self.state = 59
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 56
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 61
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 62
                self.match(PythonGrammarParser.VARNAME)
                self.state = 63
                self.assignment()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 64
                self.match(PythonGrammarParser.VARNAME)
                self.state = 68
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 65
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 70
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 71
                self.match(PythonGrammarParser.ASSSIGNMENTOPERATOR)
                self.state = 75
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 72
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 77
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 78
                self.match(PythonGrammarParser.VARNAME)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 79
                self.match(PythonGrammarParser.VARNAME)
                self.state = 83
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 80
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 85
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 86
                self.match(PythonGrammarParser.ASSSIGNMENTOPERATOR)
                self.state = 90
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PythonGrammarParser.WHITESPACE:
                    self.state = 87
                    self.match(PythonGrammarParser.WHITESPACE)
                    self.state = 92
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 93
                self.match(PythonGrammarParser.LITERAL)
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
                return self.precpred(self._ctx, 9)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 6)
         




