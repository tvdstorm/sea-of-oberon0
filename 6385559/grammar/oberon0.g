grammar oberon0;

options
{
  output=AST;
}

tokens
{
  MODULE = 'MODULE';
}

module
	: MODULE IDENT ';' modulebody IDENT '.' -> ^(MODULE IDENT modulebody)
	;
	
modulebody
  : declarations ('BEGIN' statementsequence)? 'END'
  ;

declarations
	: ('CONST' (IDENT '=' expression ';')+)? ('TYPE' (IDENT '=' type)+)? ('VAR' (identlist ':' type ';')+ )? (proceduredeclaration ';')*
	;

type
	: IDENT
	| arraytype
	| recordtype
	;

arraytype
	: 'ARRAY' expression 'OF' type
	;
	
expression
	: simpleexpression (('='|'#'|'<'|'<='|'>'|'>=') simpleexpression)?
	;
	
simpleexpression
	: ('+'|'-')? term (('+'|'-'|'OR')? term)*
	;
	
term
	: factor (('*'|'DIV'|'MOD'|'&') factor)*
	;

factor
	: IDENT selector
	| number
	| '(' expression ')'
	| '~' factor
	;

number
	: INTEGER
	;
	
selector
	: ( '.' IDENT | '[' expression ']' )*
	;

recordtype
	: 'RECORD' fieldlist (';' fieldlist)* 'END'
	;
	
fieldlist
	: (identlist ':' type)?
	;
	
identlist
	: IDENT (',' IDENT)*
	;

statementsequence
	: statement ( ';' statement)*
	;

statement
	: ( assProc | ifstatement | whilestatement )?
	;
	
assProc
	: IDENT selector ( assignment | procedurecall )
	;
	
assignment
	: ':=' expression
	;
	
procedurecall
	: (actualparameters)?
	;
	
actualparameters
	: '(' ( expression ( ',' expression)*)? ')'
	;
	
ifstatement
	: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
	;
	
whilestatement
	: 'WHILE' expression 'DO' statementsequence 'END'
	;
	
proceduredeclaration
	: procedureheading ';' procedurebody
	;
	
procedureheading
	: 'PROCEDURE' IDENT (formalparameters)?
	;
	
procedurebody
	: declarations ('BEGIN' statementsequence)? 'END' IDENT
	;
	
formalparameters
	: '(' (fpsection (';' fpsection)*)? ')'
	;

fpsection
	: ('VAR')? identlist ':' type
	;
			
INTEGER
	: ('0'..'9')+
	;

IDENT
	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*
	;
	
WS
	:	(	' '
		|	'\t'
		| '\n'
		| '\r'
	)+
	{ $channel = HIDDEN; }
	;