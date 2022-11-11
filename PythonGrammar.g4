grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr: expr ('*' | '/') expr 
    | expr ('+' | '-') expr
    | expr ('%') expr
    | INT | FLOAT
    | '(' expr ')'
    | printRule;

printRule: 'print(' expr ')';

NEWLINE: [\n]+ ;

INT    : [0-9]+ ; // satisfies all integers
FLOAT  : [0-9]+ '.' [0-9]+;