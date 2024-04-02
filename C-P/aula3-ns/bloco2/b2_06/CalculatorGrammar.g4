grammar CalculatorGrammar;

program:
    stat* EOF
    ;

stat:
    expr? NEWLINE
    | assignment NEWLINE
    | NEWLINE
    ;

assignment:
    ID '=' expr                         #AssignID
    ;

expr: 
    expr op=('*' | '/' | '%') expr      #ExprMultDivMod
    | expr op=('+' | '-') expr          #ExprAddSub
    | Integer                           #ExprInteger
    | ID                                #ExprID
    | '('expr')'                        #ExprParent
    ;

ID: [a-zA-Z_]+;

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