grammar ArrayOperation;

program : (instruction)+ EOF;

instruction : simpleop #simpleopinstruction
| vardecl #vardeclinstruction
| affectation #affectationinstruction
| varout #varoutinstruction // print variable
;

simpleop : SUM array ';' #sum
| SUM ID ';' #sumid
| PROD array ';' #prod
| PROD ID ';' #prodid
| MAX array ';' #max
| MAX ID ';' #maxid
| MIN array ';' #min
| MIN ID ';' #minid
| SORT array ';' #sort
| SORT ID ';' #sortid
| CONCAT arrayconcat ';' #concat
;
vardecl : ARRAY_TYPE ID ';' #vararray
| ARRAY_TYPE ID '=' array ';' #initvararray
| INT_TYPE ID ';' #varint
| INT_TYPE ID '=' INT ';' #initvarint
;
affectation : ID '=' simpleop #affectsimpleop
| ID '=' array ';' #affectarray
| ID '=' INT ';' #affectint
;

arrayconcat : ID ( '+' ID )+ #concatwithid
| array ( '+' array )+ #concatwitharray
;


varout : ID ';'
;
array : '(' INT (',' INT)* ')';

/** LEXER RULES, they use UPPERCASE letters */
// tokens are matched in the order they are declared
INT : '0' | [1-9][0-9]* ; // Define token INT as 0 or [1-9] followed by digits
// KEYWORDS, before other "words" because of the top-down match
// we want to recognize them first, if not a keyword then something else
SUM : 'sum';
PROD : 'prod';
MAX : 'max';
MIN : 'min';
SORT : 'sort';
ARRAY_TYPE : 'array';
INT_TYPE : 'int';
CONCAT : 'concat';
// IDENTIFIERS, after the keywords
ID : [a-z][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out