grammar Orange;

program: statement_list;

statement_list: statement (';' statement)*;

statement: assignment | print_statement | conditional | loop;

assignment: identifier '=' expression;

print_statement: 'print' '(' identifier ')';

conditional: 'if' '(' expression ')' '{' statement_list '}' 'else' '{' statement_list '}';

loop: traditional_for_loop | traditional_while_loop | range_for_loop;

traditional_for_loop: 'for' '(' identifier '=' expression ';' expression ';' expression ')' '{' statement_list '}';

traditional_while_loop: 'while' '(' expression ')' '{' statement_list '}';

range_for_loop: 'for' identifier 'in' 'range' '(' expression ')' '{' statement_list '}';

expression: boolean_expression | numeric_expression | string_expression | ternary_expression;

boolean_expression: boolean_term ('or' boolean_term)*;

boolean_term: boolean_factor ('and' boolean_factor)*;

boolean_factor: 'not' boolean_factor | comparison_expression |  boolean_literal | '(' boolean_expression ')' ;

comparison_expression: numeric_expression ('<' | '>' | '<=' | '>=') numeric_expression;

boolean_literal: 'true' | 'false';

numeric_expression: numeric_term (('+'|'-') numeric_term)*;

numeric_term: numeric_factor (('*'|'/') numeric_factor)*;

numeric_factor: integer_literal | identifier | '(' numeric_expression ')' | identifier ('++' | '--');

string_expression: string_term ('+' string_term)*;

string_term: string_literal | identifier;

ternary_expression: boolean_expression '?' expression ':' expression;

identifier: letter identifier_tail*;

identifier_tail: letter | digit | '_';

integer_literal: digit+;

string_literal: '"' string_character* '"';

string_character: letter | digit | special_character;

letter : ('a' | 'b' |'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' );

digit : ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9');

special_character: '_' | '-' | '+' | '*' | '/' | '%' | '&' | '|' | '!' ;

WS: ('\t' | '\r' | '\n')-> skip;
