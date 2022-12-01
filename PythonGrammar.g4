grammar PythonGrammar;

start: (expr COMMENT? NEWLINE)* ;

expr:
    COMMENT
    | ifstatement
    | '(' expr ')'
    | printRule
    | assignment
    | whilestatement
    | forloopstatement
    ;

COMMENT: '#' ~[\r\t\n]* ;
// ~ 'except' operator taken from "The Definitive ANTLR4 Reference"

WS: [ ]+ -> skip;

TAB: ('\t' | '    ');
NEWLINE: [\n]+ ;

printRule: 'print(' expr ')';

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

assignment: VARNAME ASSSIGNMENTOPERATOR INT
        | VARNAME ASSSIGNMENTOPERATOR (VARNAME | LITERAL | ARITHMETICSTATEMENT);
        
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
    : (VARNAME | LITERAL) ARITHMETICOPERATOR (VARNAME | LITERAL) (ARITHMETICOPERATOR (VARNAME | LITERAL) )*;

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
    
LIST : '[' LISTITEM (',' LISTITEM )* ']';
LISTITEM : LITERAL;

TRUE: 'True';
FALSE: 'False'; //example commit

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

CONSTATEMENT: NOT? (VARNAME | LITERAL) CONOPERATORS NOT? (VARNAME | LITERAL);

constatements
        : CONSTATEMENT  (('and' | 'or') (CONSTATEMENT | NOT? VARNAME | NOT? LITERAL) )*;

ifstatement
    : 'if' '(' constatements ')' ':' blockstatement elifstatement*  elsestatement?
    | 'if' constatements ':' blockstatement elifstatement* elsestatement?;


elifstatement: '\nelif' '(' constatements ')' ':' blockstatement
    | '\nelif' constatements ':' blockstatement;

elsestatement: '\nelse:' blockstatement;

blockstatement: (NEWLINE TAB expr)+;

whilestatement
    : 'while' '(' constatements ')' ':' blockstatement
    | 'while' constatements ':' blockstatement;

forloopstatement
    : 'for' VARNAME 'in' VARNAME ':' blockstatement
    | 'for' '(' VARNAME 'in' VARNAME ')' ':' blockstatement;
