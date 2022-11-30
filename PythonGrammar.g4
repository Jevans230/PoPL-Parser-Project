grammar PythonGrammar;

start: (expr NEWLINE)* ;

expr:
    ifstatement
    | '(' expr ')'
    | printRule
    | ASSIGNMENT
    | whilestatement
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
    
LIST : '[' WS* LISTITEM WS* (',' WS* LISTITEM WS*)* ']';
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

CONSTATEMENT: NOT? WS* (VARNAME | LITERAL) WS* CONOPERATORS WS* NOT? WS* (VARNAME | LITERAL);

CONSTATEMENTS
        : CONSTATEMENT  WS* (('and' | 'or') WS* (CONSTATEMENT | NOT? WS* VARNAME | NOT? WS* LITERAL) WS*)*;

ifstatement
    : 'if' WS* '(' WS* CONSTATEMENTS WS* ')' WS* ':' WS* blockstatement elifstatement*  elsestatement?
    | 'if' WS* CONSTATEMENTS WS*':' WS* blockstatement elifstatement* elsestatement?;


elifstatement: '\nelif' WS* '(' WS* CONSTATEMENTS WS* ')' WS* ':' WS* blockstatement
    | '\nelif' WS* CONSTATEMENTS WS* ':' WS* blockstatement;

elsestatement: '\nelse:' WS* blockstatement;

blockstatement: (NEWLINE TAB expr)+;

whilestatement: 'while''('?(CONSTATEMENTS('and' | 'or')?)+')'?':';