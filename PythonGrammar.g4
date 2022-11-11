grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr: expr ('*' | '/') expr 
    | expr ('+' | '-') expr
    | expr ('%') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=') expr
    | INT | FLOAT | STRING
    | '(' expr ')'
    | printRule
    | assignment;

printRule: 'print(' expr ')';

NEWLINE: [\n]+ ;

INT    : [-]?[0-9]+ ; // satisfies all integers
FLOAT  : [-]?[0-9]+ '.' [0-9]+;
STRING : '"' ([a-z] | [A-Z] | [0-9] | '_')+ '"';
<<<<<<< HEAD
DOUBLE : [-]?[0-9]+ '.' [0-9]+;
=======
literal: INT
        | FLOAT
        | STRING;

VARNAME: [a-z] VARNAME
        | [A-Z] VARNAME
        | [0-9] VARNAME
        | [a-z]
        | [A-Z]
        | [0-9];

assignment: VARNAME ASSSIGNMENTOPERATOR VARNAME
        | VARNAME ASSSIGNMENTOPERATOR literal;
        
ASSSIGNMENTOPERATOR: ' = '
    | ' += '
    | ' -= '
    | ' *= '
    | ' /= ';
>>>>>>> 92fbc512c560023ca3b2641c3c37a5b8c9d992c7
