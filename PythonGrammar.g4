grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr:
    ifstatement
    | '(' expr ')'
    | printRule
    | ASSIGNMENT
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

ASSIGNMENT: VARNAME WS* ASSSIGNMENTOPERATOR WS* VARNAME ASSIGNMENT
        | VARNAME WS* ASSSIGNMENTOPERATOR WS* (VARNAME | LITERAL | ARITHMETICSTATEMENT);
        
ASSSIGNMENTOPERATOR
    : '='
    | '+='
    | '-='
    | '*='
    | '/=';

ARITHMETICOPERATOR
    : '+'
    | '-'
    | '/'
    | '*'
    | '%'
    | '^';

ARITHMETICSTATEMENT
    : (VARNAME | LITERAL) WS* ARITHMETICOPERATOR WS* (VARNAME | LITERAL) WS* (ARITHMETICOPERATOR WS* (VARNAME | LITERAL) WS*)*;

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

WS: ' ';

TAB: ('\t' | '    ');

NOT: 'not';

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
        : NOT? WS* (VARNAME | LITERAL) WS* CONOPERATORS WS* NOT? WS* (VARNAME | LITERAL);

ifstatement
    : 'if' WS* '(' WS* (CONSTATEMENTS WS* (WS+('and' | 'or')WS+)? )+ WS* ')' WS* ':' WS* thenstatement elifstatement*  elsestatement?
    | 'if' WS* (WS* CONSTATEMENTS (WS+('and' | 'or')WS+)?)+ WS* ':' WS* thenstatement elifstatement* elsestatement?;


elifstatement: '\nelif' WS* '(' WS* (CONSTATEMENTS WS* (WS+('and' | 'or')WS+)? )+ WS* ')' WS* ':' WS* thenstatement
    | '\nelif' WS* (WS* CONSTATEMENTS (WS+('and' | 'or')WS+)?)+ WS* ':' WS* thenstatement;

elsestatement: '\nelse:' WS* thenstatement;

thenstatement: (NEWLINE+ TAB expr)+;
