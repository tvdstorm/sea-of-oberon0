grammar Oberon0;

options {
  language = Java;
}

@header {
  package ar.oberon0.parser;
  import ar.oberon0.interpreter.*;
}

@lexer::header {
  package ar.oberon0.parser;
}

	
selector [Selector selector] returns [Selector result]
@init											{Selector tempSelector = $selector;}
	:
		(	'.' IDENT 								{tempSelector.setNextNode(new IdentSelector($IDENT.getText())); tempSelector = tempSelector.getNextNode();}
		| 	'[' expression ']' 						{tempSelector.setNextNode(new ArrayItemSelector($expression.result)); tempSelector = tempSelector.getNextNode();}
		)*
													{$result = selector;}
	; 

factor returns [Interpretable result]
	:	IDENT 										{Selector sel = new IdentSelector($IDENT.getText());}
		selector[sel]								{$result = sel;}
	| 	INTEGER 									{$result = new IntegerNode($INTEGER.getText());}
	| 	'(' expression ')' 							{$result = $expression.result;} 
	| 	'~' factor									{$result = null;}
	; 
	


term returns [Interpretable result]
	:	left=factor									{$result = $left.result;} 
		(
			(	'*' 	right=factor				{$result = new MultNode($result, $right.result);}
			| 	'DIV' right=factor					{$result = new DivNode($result, $right.result);}
			| 	'MOD' right=factor 					{$result = new ModNode($result, $right.result);}
			| 	'&' 	right=factor				{$result = new AndNode($result, $right.result);}
			)*
		)		
	; 

simpleExpression returns [Interpretable result]  
	:												{ boolean positive = true; }	
		(	'+'
		|	'-' 									{positive = !positive;}
		)? 
		left=term 									{$result = $left.result;}
		(	'+' right=term							{$result = new AddNode($result, $right.result);}
		|	'-' right=term							{$result = new MinNode($result, $right.result);}
		| 	'OR' right=term							{$result = new OrNode($result, $right.result);}
		)*
													{if(!positive) { $result = new NegationNode($result);}}
	; 

expression returns [Interpretable result] 
	:	leftExpression=simpleExpression 			{ $result = $leftExpression.result; } 
		(	'=' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.EQUAL); }
		| 	'#' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.NOT_EQUAL); }
		| 	'<' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.SMALLER); }
		| 	'<=' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.SMALLER_OR_EQUAL); }
		| 	'>' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.GREATER); }
		| 	'>=' rightExpression=simpleExpression 	{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.GREATER_OR_EQUAL); } 
		)?
	; 

assignment returns [Interpretable result]
	:	IDENT 
													{Selector sel = new IdentSelector($IDENT.getText());} 
		selector[sel] ':=' expression 				{$result = new AssignmentNode(sel,$expression.result);}
	; 

actualParameters returns [ActualParametersNode result]
	:												{$result = new ActualParametersNode();}	
		'(' 
		(	firstParameter=expression				{$result.AddParameter($firstParameter.result);} 
			(	',' 
				otherParameter=expression			{$result.AddParameter($otherParameter.result);}
			)*
		)? 
		')' 
	; 

procedureCall returns [Interpretable result]
	:	IDENT (actualParameters)? 					{$result = new ProcedureCallNode($IDENT.getText(),$actualParameters.result); }
	;
	
ifStatement returns [Interpretable result]
	:	'IF' ifExpression=expression 
		'THEN' ifStatementSequence=statementSequence			{$result = new IfNode($ifExpression.result,$ifStatementSequence.result);} 
		(	'ELSIF' elseIfExpression=expression 
			'THEN' elseIfStatementSequence=statementSequence	{$result.addElseIf($elseIfExpression.result,$elseIfStatementSequence.result);}
		)* 
		(	'ELSE' elseStatementSequence=statementSequence		{$result.setElse($elseStatementSequence.result);}
		)? 
		'END'
	;

whileStatement returns [Interpretable result]
	:	'WHILE' expression 
		'DO' statementSequence 
		'END'
	;

statement returns [Interpretable result]
	:	(assignment												{$result = $assignment.result;} 
		| procedureCall 										{$result = $procedureCall.result;}
		| ifStatement 											{$result = $ifStatement.result;}
		| whileStatement										{$result = $whileStatement.result;}
		)? 
	;

statementSequence returns [Interpretable result]
	:	statement (';' statement)* 
	;

identList
	:	IDENT (',' IDENT)* 
	;

arrayType
	:	'ARRAY' expression 'OF' type
	; 

fieldList
	:	(identList ':' type)?
	; 

recordType
	:  'RECORD' fieldList (';' fieldList)* 'END'
	; 

type
	:	IDENT | arrayType | recordType
	; 

fPSection
	:	('VAR')? identList ':' type 
	;

formalParameters 
	:	'(' (fPSection (';' fPSection)*)? ')'
	; 

procedureHeading
	:	'PROCEDURE' IDENT (formalParameters)?
	; 

procedureBody  
	:	declarations ('BEGIN' statementSequence)? 'END' 
	;


procedureDeclaration
	:	procedureHeading ';' procedureBody IDENT
	;
	
declarations 
	:	('CONST' (IDENT '=' expression ';')*)?
		('TYPE' (IDENT '=' expression ';')*)?
		('VAR' (identList ':' type ';')*)?
		(procedureDeclaration ';')*
	;
	
module 
	:	'MODULE' IDENT ';' declarations 
		('BEGIN' statementSequence)? 
		'END'! IDENT
	;






fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
 
