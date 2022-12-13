grammar PythonGrammar;

start: (expr Comment? Newline)* ;

expr:
    Comment
    | ifstatement
    | '(' expr ')'
    | Newline expr
    | printRule
    | assignment
    | whilestatement
    | forloopstatement
    | functionDeclaration
    | functionCall
    ;

Comment: '#' ~[\r\t\n]* ;

Tab: '\t' | '    ';
Newline: [\n]+ ;

WS: [\t ]+ -> skip;

printRule: 'print(' (expr | varitem) ')';

Int    : [-]?[0-9]+ ;
Float  : [-]?[0-9]+ '.' [0-9]+;
String : '"' ([a-z] | [A-Z] | [0-9] | '_')+ '"';
Bool   : TRUE | FALSE;
Literal: Int
        | Float
        | String
        | Bool
        | List;

Varname: ([A-Z] | [a-z] | [0-9] | '_')+;
        
Assignmentoperator
    : '='
    | '+='
    | '-='
    | '*='
    | '/=';

Arithmeticoperator
    : '+'
    | '-'
    | '/'
    | '*'
    | '%'
    | '^';

arithmeticstatement
    : (Varname | Literal) Arithmeticoperator (Varname | Literal) (Arithmeticoperator (Varname | Literal) )*;

Signs
    : '+'
    | '-'
    | '/'
    | '*'
    | '%'
    | '^'
    | '!'
    ;

Ifelse
    : 'if'
    | 'elif'
    | 'else'
    ;
    
List : '[' Listitem (',' Listitem )* ']';
Listitem : Literal;

TRUE: 'True';
FALSE: 'False';

Not: 'not';

Conoperators
    : '>='
    | '<='
    | '>'
    | '<'
    | '=='
    | '!='
    | 'and'
    | 'or'
    ;

varitem
    : Int
    | Float
    | String
    | Bool
    | List;

constatement: Not? (Varname | varitem) Conoperators Not? (Varname | varitem);

arguments
    : Varname (',' Varname)*
    | '*' Varname
    ;

assignment: Varname Assignmentoperator (Varname | varitem | Arithmeticoperator) ;

constatements
        : constatement (('and' | 'or') (constatement | Not? Varname | Not? Literal) )*;

ifstatement
    : 'if' '(' constatements ')' ':' blockstatement elifstatement*  elsestatement?
    | 'if' constatements ':' blockstatement elifstatement* elsestatement?;


elifstatement: '\nelif' '(' constatements ')' ':' blockstatement
    | '\nelif' constatements ':' blockstatement;

elsestatement: '\nelse:' blockstatement;

blockstatement: (Newline Tab? expr)+;

whilestatement
    : 'while' '(' constatements ')' ':' blockstatement
    | 'while' constatements ':' blockstatement;

forloopstatement
    : 'for' Varname 'in' Varname ':' blockstatement
    | 'for' '(' Varname 'in' Varname ')' ':' blockstatement;

functionDeclaration
    : 'def' Varname '(' arguments? ')' ':' blockstatement
    ;

functionCall
    : Varname '(' arguments? ')'
    | Varname '(' (Varname '=' varitem) (',' Varname '=' varitem)* ')'
    ;