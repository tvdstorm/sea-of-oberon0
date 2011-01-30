grammar Oberon0;

options {
  language = Java;
}
@header {
  package oberon0;
}
@lexer::header {
  package oberon0;
}

/* Production rules */ 
module:
  'MODULE' IDENTIFIER ';'
    ( constant | variable )*
    'BEGIN'
    'END' IDENTIFIER '.'
;

constant:
  'CONST' IDENTIFIER '=' expression ';'
;

variable:
  'VAR' IDENTIFIER ':' type ';'
;

type:
  'INTEGER'
;

expression
  : INTEGER
;
  

 /* Tokens */   
INTEGER : '0'..'9'+;  

IDENTIFIER:
  ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*
;

WHITESPACE:
  (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;}
;

/*
ident = letter {letter | digit};
integer = digit {digit};
selector = {"." ident | "[" expression "]"};
factor = ident selector | integer | "(" expression ")" | "~" factor;
term = factor {("*" | "DIV" | "MOD" | "&") factor};
SimpleExpression = ["+"|"-"] term {("+"|"-" | "OR") term};
expression = SimpleExpression
[("=" | "#" | "<" | "<=" | ">" | ">=") SimpleExpression];
assignment = ident selector ":=" expression;
ActualParameters = "(" [expression {"," expression}] ")" .
ProcedureCall = ident [ActualParameters].
IfStatement = "IF" expression "THEN" StatementSequence
{"ELSIF" expression "THEN" StatementSequence}
["ELSE" StatementSequence] "END".
WhileStatement = "WHILE" expression "DO" StatementSequence "END".
statement = [assignment | ProcedureCall | IfStatement | WhileStatement].
StatementSequence = statement {";" statement}.
IdentList = ident {"," ident}.
ArrayType = "ARRAY" expression "OF" type.
FieldList = [IdentList ":" type].
RecordType = "RECORD" FieldList {";" FieldList} "END".
type = ident | ArrayType | RecordType.
FPSection = ["VAR"] IdentList ":" type.
FormalParameters = "(" [FPSection {";" FPSection}] ")".
ProcedureHeading = "PROCEDURE" ident [FormalParameters].
ProcedureBody = declarations ["BEGIN" StatementSequence] "END".
ProcedureDeclaration = ProcedureHeading ";" ProcedureBody ident.
declarations = ["CONST" {ident "=" expression ";"}]
["TYPE" {ident "=" type ";"}]
["VAR" {IdentList ":" type ";"}]
{ProcedureDeclaration ";"}.
module = "MODULE" ident ";" declarations
["BEGIN" StatementSequence] "END" ident "." .
*/
