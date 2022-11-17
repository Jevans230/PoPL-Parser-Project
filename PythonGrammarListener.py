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


    # Enter a parse tree produced by PythonGrammarParser#ifstatement.
    def enterIfstatement(self, ctx:PythonGrammarParser.IfstatementContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#ifstatement.
    def exitIfstatement(self, ctx:PythonGrammarParser.IfstatementContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#elifstatement.
    def enterElifstatement(self, ctx:PythonGrammarParser.ElifstatementContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#elifstatement.
    def exitElifstatement(self, ctx:PythonGrammarParser.ElifstatementContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#elsestatement.
    def enterElsestatement(self, ctx:PythonGrammarParser.ElsestatementContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#elsestatement.
    def exitElsestatement(self, ctx:PythonGrammarParser.ElsestatementContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#thenstatement.
    def enterThenstatement(self, ctx:PythonGrammarParser.ThenstatementContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#thenstatement.
    def exitThenstatement(self, ctx:PythonGrammarParser.ThenstatementContext):
        pass



del PythonGrammarParser