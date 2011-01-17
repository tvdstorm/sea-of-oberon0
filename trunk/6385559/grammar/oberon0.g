grammar oberon0;

options
{
  language = Java;
}

@header{
  package parser;
  
  import ASTnodes.*;
}

@lexer::header
{
  package parser;
}

module returns [ ASTnode e ]
	: 'MODULE' ind1=IDENT ';' declarations ('BEGIN' statementsequence)? 'END' ind2=IDENT '.' 
	{
	  $e = new ModuleNode( $ind1.text, $ind2.text, $declarations.e, $statementsequence.e ); // also send the indent.text for error logging 
	}
	;

declarations returns [ ASTnode e ]
	: ('CONST' (IDENT '=' expression ';')+)? ('TYPE' (IDENT '=' type)+)? ('VAR' (identlist ':' type ';')+ )? (proceduredeclaration ';')*
	{
	  $e = new DeclarationsNode();
	}
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

number returns [ ASTnode e ]
	: INTEGER
	{
	   $e = new IntegerNode( Integer.parseInt( $INTEGER.text ) );
	}
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

statementsequence returns [ ASTnode e ]
	: statement ( ';' statement)*
	{
	  $e = new StatementSequenceNode();
	}
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
	:	( ' '
		| '\t'
		| '\n'
		| '\r'
	)+
	{ $channel = HIDDEN; }
	;