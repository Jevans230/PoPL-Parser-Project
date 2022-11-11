# Generated from PythonGrammar.g4 by ANTLR 4.9.3
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r")
        buf.write("C\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3")
        buf.write("\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\n\6\n\60\n\n\r\n\16\n\61\3\13\6\13")
        buf.write("\65\n\13\r\13\16\13\66\3\f\6\f:\n\f\r\f\16\f;\3\f\3\f")
        buf.write("\6\f@\n\f\r\f\16\fA\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17")
        buf.write("\t\21\n\23\13\25\f\27\r\3\2\4\3\2\f\f\3\2\62;\2F\2\3\3")
        buf.write("\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2")
        buf.write("\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2")
        buf.write("\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7")
        buf.write("\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17%\3")
        buf.write("\2\2\2\21\'\3\2\2\2\23/\3\2\2\2\25\64\3\2\2\2\279\3\2")
        buf.write("\2\2\31\32\7,\2\2\32\4\3\2\2\2\33\34\7\61\2\2\34\6\3\2")
        buf.write("\2\2\35\36\7-\2\2\36\b\3\2\2\2\37 \7/\2\2 \n\3\2\2\2!")
        buf.write("\"\7\'\2\2\"\f\3\2\2\2#$\7*\2\2$\16\3\2\2\2%&\7+\2\2&")
        buf.write("\20\3\2\2\2\'(\7r\2\2()\7t\2\2)*\7k\2\2*+\7p\2\2+,\7v")
        buf.write("\2\2,-\7*\2\2-\22\3\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\61")
        buf.write("\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\24\3\2\2\2\63\65")
        buf.write("\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66")
        buf.write("\67\3\2\2\2\67\26\3\2\2\28:\t\3\2\298\3\2\2\2:;\3\2\2")
        buf.write("\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\7\60\2\2>@\t\3\2\2")
        buf.write("?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\30\3\2\2\2\7")
        buf.write("\2\61\66;A\2")
        return buf.getvalue()


class PythonGrammarLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    NEWLINE = 9
    INT = 10
    FLOAT = 11

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'print('" ]

    symbolicNames = [ "<INVALID>",
            "NEWLINE", "INT", "FLOAT" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "NEWLINE", "INT", "FLOAT" ]

    grammarFileName = "PythonGrammar.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


