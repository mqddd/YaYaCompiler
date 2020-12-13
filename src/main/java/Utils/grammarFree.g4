grammar grammarFree;

firs_rule : ;

// 01 KEYWORDS
KEYWORD_VOID : 'void';
KEYWORD_INT : 'int';
KEYWORD_DOUBLE : 'double';
KEYWORD_BOOL : 'bool';
KEYWORD_STRING : 'string';
KEYWORD_NULL : 'null';
KEYWORD_THIS : 'this';
KEYWORD_FOR : 'for';
KEYWORD_WHILE : 'while';
KEYWORD_IF : 'if';
KEYWORD_ELSE : 'else';
KEYWORD_RETURN : 'return';
KEYWORD_BREAK : 'break';
KEYWORD_NEW : 'new';
KEYWORD_NEWARRAY : 'NewArray';
KEYWORD_PRINT : 'Print';
KEYWORD_READiNTEGER : 'ReadInteger';
KEYWORD_READLINE : 'ReadLine';

// 02 CONST VALUES
T_INT : (('0'('x'|'X'))('0'..'9'|'a'..'f'|'A'..'F')+) | (('0'..'9')+);
T_DOUBLE : (('0'..'9')+)('.')(('0'..'9')*)(('e'|'E')('-'|'+')?('0'..'9')+)?;
T_STRING : '"' ~('\n'|'\r'|'"')* '\r'? '"';
T_BOOLEAN : ('true'|'false');

// 03 IDENTIFIERS
T_ID : ('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'0'..'9'|'_')*);

// 04 OPERATORS
OP_PLUS : '+';
OP_DASH : '-';
OP_STAR : '*';
OP_SLASH : '/';
OP_PERCENT : '%';
OP_LESS : '<';
OP_LESSEQUAL : '<=';
OP_GREATER : '>';
OP_GREATEREQUAL : '>=';
OP_ASSIGN : '=';
OP_EQUAL : '==';
OP_NOTEQUAL : '!=';
OP_AND : '&&';
OP_OR : '||';
OP_NOT : '!';
OP_SEMICOLON : ';';
OP_COMA : ',';
OP_DOT : '.';
OP_OPENCLOSEBRACKET : '[]';
OP_OPENBRACKET : '[';
OP_CLOSEBRACKET : ']';
OP_OPENPARENTHESIS : '(';
OP_CLOSEPARENTHESIS : ')';
OP_OPENBRACE : '{';
OP_CLOSEBRACE : '}';

// 05 COMMENTS
COMMENT_MULTILINE : '/*' .*? '*/' -> channel(HIDDEN);
COMMENT_SINGLELINE : '//' ~('\n'|'\r')* '\r'? '\n'  -> channel(HIDDEN);

// 06 WHITESPACE
WHITESPACE : ([ \n\t\r])+ -> skip;