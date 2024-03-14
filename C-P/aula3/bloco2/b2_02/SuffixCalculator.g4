grammar SuffixCalculator;

program:
    stat *EOF;

stat:
    expr? NEWLINE;

expr:
    expr expr op=('*' | '+' | '-' | '/') | NUMBER;

NUMBER: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;