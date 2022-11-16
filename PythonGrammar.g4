grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr: expr ('*' | '/') expr 
    | expr ('+' | '-') expr
    | expr ('%') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=') expr
    | ifstatement
    | LITERAL
    | SIGNS
    | '(' expr ')'
    | printRule
    | assignment
    ;

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

assignment: VARNAME WS* ASSSIGNMENTOPERATOR WS* VARNAME assignment
        | VARNAME WS* ASSSIGNMENTOPERATOR WS* VARNAME 
        | VARNAME WS* ASSSIGNMENTOPERATOR WS* LITERAL;
        
ASSSIGNMENTOPERATOR: '='
    | '+='
    | '-='
    | '*='
    | '/=';

SIGNS
    : '+'
    | '-'
    | '/'
    | '*'
    | '%'
    | '^'
    | '!'
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

WS: ' '
            | ' ' WS;

TAB: [\t]+;


CONOPERATORS
    : '>='
    | '<='
    | '>'
    | '<'
    | '=='
    | '!='
    | 'and'
    | 'or'
    ;


CONSTATEMENTS
        : VARNAME WS* CONOPERATORS WS* VARNAME 
        | LITERAL WS* CONOPERATORS WS* LITERAL
        | VARNAME WS* CONOPERATORS WS* LITERAL;

ifstatement
    : 'if' WS* '(' WS* (CONSTATEMENTS WS* (WS+('and' | 'or')WS+)? )+ WS* ')' WS* ':' WS* then elifstatement+ elsestatement
    | 'if' WS* (WS* CONSTATEMENTS (WS+('and' | 'or')WS+)?)+ WS* ':' WS* then elifstatement+ elsestatement;


elifstatement: 'elif' WS* '(' WS* (CONSTATEMENTS WS* (WS+('and' | 'or')WS+)? )+ WS* ')' WS* ':' WS* then
    | 'elif' WS* (WS* CONSTATEMENTS (WS+('and' | 'or')WS+)?)+ WS* ':' WS* then;

elsestatement: 'else:' WS* then;

then: (NEWLINE+ TAB expr)*;
