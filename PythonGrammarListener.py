# Generated from PythonGrammar.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PythonGrammarParser import PythonGrammarParser
else:
    from PythonGrammarParser import PythonGrammarParser

# This class defines a complete listener for a parse tree produced by PythonGrammarParser.
class PythonGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by PythonGrammarParser#start.
    def enterStart(self, ctx:PythonGrammarParser.StartContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#start.
    def exitStart(self, ctx:PythonGrammarParser.StartContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#expr.
    def enterExpr(self, ctx:PythonGrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#expr.
    def exitExpr(self, ctx:PythonGrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#printRule.
    def enterPrintRule(self, ctx:PythonGrammarParser.PrintRuleContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#printRule.
    def exitPrintRule(self, ctx:PythonGrammarParser.PrintRuleContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#literal.
    def enterLiteral(self, ctx:PythonGrammarParser.LiteralContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#literal.
    def exitLiteral(self, ctx:PythonGrammarParser.LiteralContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#assignment.
    def enterAssignment(self, ctx:PythonGrammarParser.AssignmentContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#assignment.
    def exitAssignment(self, ctx:PythonGrammarParser.AssignmentContext):
        pass



del PythonGrammarParser