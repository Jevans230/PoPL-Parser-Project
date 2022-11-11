grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr: expr ('*' | '/') expr 
    | expr ('+' | '-') expr
    | expr ('%') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=') expr
    | literal
    | '(' expr ')'
    | printRule
    | assignment;

printRule: 'print(' expr ')';

NEWLINE: [\n]+ ;

INT    : [-]?[0-9]+ ; // satisfies all integers
FLOAT  : [-]?[0-9]+ '.' [0-9]+;
STRING : '"' ([a-z] | [A-Z] | [0-9] | '_')+ '"';
DOUBLE : [-]?[0-9]+ '.' [0-9]+;
BOOL   : TRUE | FALSE;
literal: INT
        | FLOAT
        | STRING
        | DOUBLE;

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

SIGNS
    : '+'
    | '-'
    | '/'
    | '*'
    | '%'
    | '^'
    ;

TRUE: 'True';
FALSE: 'False';