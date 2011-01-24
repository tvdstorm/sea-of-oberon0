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
	: ('CONST' constants)? ('TYPE' typeDefs)? ('VAR' (identlist ':' type ';')+ )? (proceduredeclaration ';')*
	{
	  $e = new DeclarationsNode( $constants.e, $typeDefs.e );
	}
	;
	
constants returns [ ConstantNode e ]
	: (IDENT '=' expression ';') constantFollowUp=constants?
	{
	  $e = new ConstantNode( $IDENT.text, $expression.e, $constantFollowUp.e );
	}
	;

typeDefs returns [ TypeDefNode e ]
	: (IDENT '=' type ';') typeDefsFollowUp=typeDefs?
	{
	  $e = new TypeDefNode( $IDENT.text, $type.e, $typeDefsFollowUp.e );
	}
	;

type returns [ ASTnode e ]
	: IDENT { $e = new TypeNode( $IDENT.text ); }
	| arraytype { $e = $arraytype.e; }
	| recordtype { $e  = $recordtype.e; }
	;

arraytype returns [ ArrayNode e ]
	: 'ARRAY' expression 'OF' type
	{
	  $e = new ArrayNode( $expression.e, $type.e );
	}
	;
	
recordtype returns [ RecordNode e ]
	: 'RECORD' fields 'END'
	{
	  $e = new RecordNode( $fields.e );
	}
	;
	
fields returns [ FieldsNode e ]
	: fieldlist (fieldsFollowup)?
	{
	  $e = new FieldsNode( $fieldlist.e, $fieldsFollowup.e );
	}
	;

fieldsFollowup returns [ FieldsNode e ]
	: ';' fieldlist (followup=fieldsFollowup)?
	{
	  $e = new FieldsNode( $fieldlist.e, $followup.e );
        }
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
	: variable { $e = $variable.e; }
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
	
selector returns [ ASTnode e ]
	: 
	( 
	'.' var=IDENT selectorFollowup=selector 
	{
	  $e = new SelectorRecordNode( $var.text, $selectorFollowup.e );
	}
	| 
	'[' exp=expression ']' selectorFollowup=selector 
	{
	  $e = new SelectorArrayNode( $exp.e, $selectorFollowup.e );
	}
	)?
	;
	
variable returns [ VarNode e ]
        : IDENT selector
        {
          $e = new VarNode( $IDENT.text, $selector.e );
        }
        ;
	
fieldlist returns [ FieldlistNode e ]
	: (identlist ':' type)?
	{
	  $e = new FieldlistNode( $identlist.e, $type.e );
	}
	;
	
identlist returns [ IdentListNode e ]
	: IDENT ( identlistFollowUp )?
	{
	  $e = new IdentListNode( $IDENT.text, $identlistFollowUp.e );
	}
	;
	
identlistFollowUp returns [ IdentListNode e ]
	: ',' IDENT ( followup=identlistFollowUp)?
	{
	  $e = new IdentListNode( $IDENT.text, $followup.e );
	}
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
	: variable ':=' expression
	{
	  $e = new AssignmentNode( $variable.e, $expression.e );
	}
	;
	
procedurecall returns [ StatementNode e ]
	: IDENT (actualparameters)?
	{
	  $e = new ProcedureCallNode( $IDENT.text, $actualparameters.e );
	}
	;
	
actualparameters returns [ ParamNode e ]
	: '(' ( expression ( follow=actualparametersfollowup)? )? ')'
	{
	  $e = new ParamNode( $expression.e, $follow.e );
	}
	;
	
actualparametersfollowup returns [ ParamNode e]
	: ',' expression (follow=actualparametersfollowup)?
	{
	  $e = new ParamNode( $expression.e, $follow.e );
	}
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
  | 
  {
    $e = null;
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