grammar grammarFree;

if_rule : 'if' '(' ')' '{' var_def* '}';

var_def : ('int' | 'str') 'status' '=' ('0' | '1');