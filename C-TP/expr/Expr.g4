grammar Expr;

main: stat* EOF;

stat: assignment | expression;

assignment: Identifier '=' expression;

expression: Integer | Identifier;

Identifier: [a-zA-Z_][a-zA-Z_0-9]*;
Integer: [0-9]+;
WhiteSpace: [ \t\r\n]+ -> skip;
