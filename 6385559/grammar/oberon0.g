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
	
expression returns [ ExpressionNode e ] 
	: simpleLeft=simpleexpression (operator=('='|'#'|'<'|'<='|'>'|'>=') simpleRight=simpleexpression)?
	{
	  $e = new ExpressionNode( $simpleLeft.e, $operator.text, $simpleRight.e );
	}
	;
	
simpleexpression returns [ SimpleExpression e ]
	: specialTerm ( operator=('+'|'-'|'OR') simpleExpressionFollowup)?
	{
	  $e = new SimpleExpression( $operator.text, $specialTerm.e, $simpleExpressionFollowup.e );
	}
	;
	
specialTerm returns [ ASTnode e ]
  : operator=('+') term { $e = $term.e; }
  | operator=('-') term { $e = new MinusNode( $term.e ); }
  | term { $e = $term.e; }
  ;
	
simpleExpressionFollowup returns [ SimpleExpression e ]
	:  term (operator=('+'|'-'|'OR') follow2=simpleExpressionFollowup)?
	{
	  $e = new SimpleExpression( $operator.text, $term.e, $follow2.e );
	}
	;
	
term returns [ TermNode e ]
	: factor (operator=('*'|'DIV'|'MOD'|'&') termFollowUp)?
	{
	  $e = new TermNode( $factor.e, $operator.text, $termFollowUp.e );
	}
	;
	
termFollowUp returns [ TermNode e ]
  : factor (operator=('*'|'DIV'|'MOD'|'&') follow2=termFollowUp)?
  {
    $e = new TermNode( $factor.e, $operator.text, $follow2.e );
  }
  ;

factor returns [ ASTnode e ]
	: IDENT selector { $e = new SelectorNode( $IDENT.text ); }
	| number { $e = $number.e; }
	| '(' expression ')' { $e = $expression.e; }
	| '~' factorOperand=factor { $e = new NotNode( $factorOperand.e ); }
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
	  $e = new AssignmentNode( $IDENT.text, $expression.e );
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
	: 'IF' expression 'THEN' statementsequence elsestatement? 'END'
	{
	  $e = new IfStatementNode( $expression.e, $statementsequence.e, $elsestatement.e );
	}
	;
	
elsestatement returns [ StatementNode e ]
  : 'ELSIF' expression 'THEN' statementsequence elseNode=elsestatement
  {
    $e = new IfStatementNode( $expression.e, $statementsequence.e, $elseNode.e );
  } 
  | 'ELSE' statementsequence
  {
    $e = new ElseStatementNode( $statementsequence.e );
  }
  ;
	
whilestatement returns [ StatementNode e ]
	: 'WHILE' cond=expression 'DO' ifTrueDo=statementsequence 'END'
	{
	  $e = new WhileStatementNode( $cond.e, $ifTrueDo.e );
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