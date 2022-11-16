grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr: expr ('*' | '/') expr 
    | expr ('+' | '-') expr
    | expr ('%') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=') expr
    | LITERAL
    | '(' expr ')'
    | printRule
    | assignment
    | CONSTATEMENTS;

printRule: 'print(' expr ')';

NEWLINE: [\n]+ ;

INT    : [-]?[0-9]+ ; // satisfies all integers
FLOAT  : [-]?[0-9]+ '.' [0-9]+;
STRING : '"' ([a-z] | [A-Z] | [0-9] | '_')+ '"';
DOUBLE : [-]?[0-9]+ '.' [0-9]+;
BOOL   : TRUE | FALSE;
LITERAL: INT
        | FLOAT
        | STRING
        | DOUBLE
        | BOOL
        | LIST;

VARNAME: [a-z] VARNAME
        | [A-Z] VARNAME
        | [0-9] VARNAME
        | [a-z]
        | [A-Z]
        | [0-9];

assignment: VARNAME ASSSIGNMENTOPERATOR VARNAME assignment
        | VARNAME ASSSIGNMENTOPERATOR VARNAME 
        | VARNAME ASSSIGNMENTOPERATOR LITERAL;
        
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

IFELSE
    : 'if'
    | 'elif'
    | 'else'
    ;
    
LIST : '[' (LISTITEM ',')* (LISTITEM)? ']';
LISTITEM : LITERAL;

TRUE: 'True';
FALSE: 'False'; //example commit

CONSTATEMENTS
    : '>='
    | '<='
    | '>'
    | '<'
    | '=='
    | '!='
    | 'and'
    | 'or'
    ;