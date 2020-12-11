grammar grammarFree;

if_rule : IF '(' ')' '{' var_def* '}';

var_def : ('int' | 'str') 'status' '=' ('0' | '1');

IFoooo : 'if';