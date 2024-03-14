grammar Calculator;

program:
    stat* EOF
    ;

stat:
    expr? NEWLINE
    ;

expr: 
    expr op=('*' | '/' | '%') expr      #ExprMultDivMod
    | expr op=('+' | '-') expr          #ExprAddSub
    | Integer                           #ExprInteger
    | '('expr')'                        #ExprParent
    ;

Integer:                                // implement with long integers
    [0-9]+
    ;

NEWLINE:
    'r'? '\n'
    ;

WS:
    [ \t]+ -> skip
    ;

COMMENT:
    '#' .*? '\n' -> skip
    ;