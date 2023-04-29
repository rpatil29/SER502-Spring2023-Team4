grammar Orange;

program: statement_list;

statement_list: statement (OP_SEMICOLON statement)*;

statement: print | expression | assignment | conditional | loop;

assignment : (data_type)? IDENTIFIER OP_ASSIGN (literal | expression);

print: 'print' '(' print_argument_list ')' ;
print_argument_list: IDENTIFIER (',' print_argument_list)? |  literal (',' print_argument_list)? | ;

conditional: 'if' '(' expression ')' '{' statement_list '}' ( 'else' '{' statement_list '}')?;

loop: traditional_for_loop | traditional_while_loop | range_for_loop;

traditional_for_loop: 'for' '(' data_type IDENTIFIER OP_ASSIGN expression_term OP_SEMICOLON comparison_expression OP_SEMICOLON expression ')' '{' statement_list '}';

traditional_while_loop: 'while' '(' expression ')' '{' statement_list '}';

range_for_loop: 'for' IDENTIFIER 'in' 'range' '(' range ')' '{' statement_list '}';

range: INTEGER_L ',' INTEGER_L;

expression: boolean_expression | numeric_expression | comparison_expression | ternary_expression ;

boolean_expression: expression_term (OP_LOGICAL_AND | OP_LOGICAL_OR) expression_term | OP_LOGICAL_NOT expression_term | expression_term;

comparison_expression: expression_term (OP_EQUALS | OP_GREATER | OP_SMALLER | OP_GREATER_EQUALS | OP_SMALLER_EQUALS) expression_term | expression_term;

numeric_expression: expression_term
                    | '(' numeric_expression ')'
                    | numeric_expression (OP_ADD|OP_SUB) numeric_expression
                    | numeric_expression (OP_MUL|OP_DIV) numeric_expression
                    | numeric_expression (OP_SUCCESSOR | OP_PREDECESSOR)
                    ;

string_expression: string_term ( OP_ADD string_term)*;

string_term: STRING_L | IDENTIFIER;

ternary_expression: comparison_expression OP_TERNARY_TRUE expression OP_TERNARY_FALSE expression;

expression_term : IDENTIFIER | literal | BOOLEAN_FALSE | BOOLEAN_TRUE;

literal : INTEGER_L | BOOLEAN_L | string_expression;

data_type : 'int' | 'boolean' | 'string';

BOOLEAN_L : BOOLEAN_FALSE | BOOLEAN_TRUE;

INTEGER_L: DIGIT+;

STRING_L: '"' .*? '"';

DIGIT : [0-9] | [1-9][0-9]+;

BOOLEAN_TRUE : 'true' ;
BOOLEAN_FALSE : 'false' ;

/* ASSIGNMENT OPERATOR DEFINITION */
OP_ASSIGN : '=';

/* ARITHMETIC OPERATOR DEFINTIONS */
//OP_SET_ARITHMETIC : OP_ADD | OP_SUB | OP_MUL | OP_DIV;
OP_ADD : '+';
OP_SUB : '-';
OP_MUL : '*';
OP_DIV : '/';
OP_SUCCESSOR : '++';
OP_PREDECESSOR : '--';

/* RELATIONAL OPERATOR DEFINITIONS */
//OP_SET_RELATIONAL : OP_EQUALS | OP_SMALLER | OP_GREATER | OP_SMALLER_EQUALS | OP_GREATER_EQUALS;
OP_EQUALS : '==';
OP_SMALLER : '<';
OP_GREATER : '>';
OP_SMALLER_EQUALS : '<=';
OP_GREATER_EQUALS : '>=';

/* LOGICAL OPERATOR DEFINITIONS */
OP_LOGICAL_AND : '&&';
OP_LOGICAL_OR  : '||';
OP_LOGICAL_NOT : '!';

OP_TERNARY_TRUE  : '?' ;
OP_TERNARY_FALSE : ':' ;

OP_SEMICOLON : ';';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

WS: ('\t' | '\r' | '\n')-> skip;