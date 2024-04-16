grammar Numbers;

file: line+ EOF;

line: INT '-' STRING '\n';

INT: [0-9]+;

STRING: [a-zA-Z]+;

WS: [ \t]+ -> skip;