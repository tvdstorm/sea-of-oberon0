grammar oberon0;

options
{
  language = Java;
  backtrack = true;
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
	  $e = new StatementSequenceNode( $statement.e, $followOne.e );
	}
	;

followupStatementSequence returns [ StatementSequenceNode e ]
	: ';' statement ( followTwo=followupStatementSequence)?
	{
	  $e = new StatementSequenceNode( $statement.e, $followTwo.e );
	}
	;

statement returns [ StatementNode e ]
	: ( statementRv=assignment | statementRv=procedurecall | statementRv=ifstatement | statementRv=whilestatement )?
	{
	  $e = $statementRv.e;
	}
	;
	
assignment returns [ StatementNode e ]
	: IDENT selector ':=' expression
	{
	  $e = new AssignmentNode( $IDENT.text, $expression.text );
	}
	;
	
procedurecall returns [ StatementNode e ]
	: IDENT selector (actualparameters)?
	{
	  $e = new ProcedureCallNode();
	}
	;
	
actualparameters
	: '(' ( expression ( ',' expression)*)? ')'
	;
	
ifstatement returns [ StatementNode e ]
	: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
	{
	  $e = new IfStatementNode( );
	}
	;
	
whilestatement returns [ StatementNode e ]
	: 'WHILE' cond=expression 'DO' ifTrueDo=statementsequence 'END'
	{
	  $e = new WhileStatementNode( $cond.text, $ifTrueDo.e );
	}
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