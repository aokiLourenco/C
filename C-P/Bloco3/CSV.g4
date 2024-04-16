grammar CSV;

program:
    stat * EOF;

stat:
    line? NEWLINE;

line:
    field (',' field)*;

field:
    STRING
    | NUMBER
    ;

STRING: [a-zA-Z]+;
NUMBER: [0-9]+;
NEWLINE: '\r'? '\n';

WS: [ \t]+ -> skip;

//-----------------------------------------------------

// grammar CSV;

// file : header row+;

// header : row;

// row : field (',' field)* '\r'? '\n';

// field : TEXT | QUOTED_TEXT;

// TEXT : ~[,\r\n"]+;
// QUOTED_TEXT : '"' (~'"' | '""')* '"';

// WS : [ \t]+ -> skip;

