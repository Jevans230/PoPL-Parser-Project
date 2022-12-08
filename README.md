# PoPL-Parser-Project
In this project we are required to implement a parser for Python language, using Context-free Grammar (CFG) or BNF with ANTLR (or something equivalent to ANTLR, for example, bison, yacc, lex, etc.). We are expected to write a grammar for Python for the parsing operation. 

## Group Members 
- Jalin Evans (aka. Jevans230) 
- Henry Heese (aka. hheese) 
- Tyler Dunaway (aka. CEODunawayGaming) my commits come up as Tyler Dunaway and do not show me as a contributor for some reason.
- Tristen Brown (aka. TristenBrown)

## Environment
For the environment we used 

## How to run?
You can run the application by using: 
    java -jar antlr-4.9.3-complete.jar -Dlanguage=Python3 PythonGrammar.g4

## Bonus
We ran these commands to get the parser tree inspector 
antlr4 PythonGrammar.g4
java org.antlr.v4.Tool PythonGrammar.g4
javac PythonGrammar*.java
grun PythonGrammar expr test.py -gui

then to run your test file:
    python3 antlr_project.py test.py

## Demo Video
