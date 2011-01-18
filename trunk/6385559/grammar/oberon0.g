grammar oberon0;

options
{
  language = Java;
  backtrace = true;
}

@header{
  package parser;
  
  import ASTnodes.*;
}

@lexer::header
{
  package parser;
}

module returns [ ModuleNode e ]
	: 'MODULE' ind1=IDENT ';' declarations ('BEGIN' statementsequence)? 'END' ind2=IDENT '.' 
	{
	  $e = new ModuleNode( $ind1.text, $ind2.text, $declarations.e, $statementsequence.e ); // also send the indent.text for error logging 
	}
	;

declarations returns [ DeclarationsNode e ]
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

number returns [ IntegerNode e ]
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

statementsequence returns [ StatementSequenceNode e ]
	: statement ( followOne=followupStatementSequence )?
	{
	  $e = new StatementSequenceNode( $statement.text, $followOne.e );
	}
	;

followupStatementSequence returns [ StatementSequenceNode e ]
	: ';' statement ( followTwo=followupStatementSequence)?
	{
	  $e = new StatementSequenceNode( $statement.text, $followTwo.e );
	}
	;

statement returns [ StatementNode e ]
	: statementRv=( assignment | procedurecall | ifstatement | whilestatement )?
	{
	  $e = $statementRv;
	}
	;
	
assignment
	: IDENT selector ':=' expression
	;
	
procedurecall
	: IDENT selector (actualparameters)?
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