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

	
selector returns [VariableSelector result]
	:												{VariableSelector variableSelector = new VariableSelector();}
		(	'.' IDENT 								{variableSelector.AddSelector(new IdentSelector($IDENT.getText()));}
		| 	'[' expression ']' 						{variableSelector.AddSelector(new ArrayItemSelector($expression.result));}
		)*
													{$result = variableSelector;}
	; 

factor returns [Interpretable result]
	:	IDENT selector 								{$selector.result.SetRootVariable(new IdentSelector($IDENT.getText())); $result = $selector.result;}
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
	:	IDENT selector ':=' expression 				{$selector.result.SetRootVariable(new IdentSelector($IDENT.getText())); $result = new AssignmentNode($selector.result,$expression.result);}
	; 

actualParameters
	:	'(' (expression (',' expression)*)? ')' 
	; 

procedureCall
	:	IDENT (actualParameters)? 
	;
	
ifStatement
	:	'IF' expression 'THEN' statementSequence ('ELSIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END'
	;

whileStatement
	:	'WHILE' expression 'DO' statementSequence 'END'
	;

statement
	:	(assignment | procedureCall | ifStatement | whileStatement)? 
	;

statementSequence
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
	:	'MODULE'! IDENT ';' declarations 
		('BEGIN'! statementSequence)? 
		'END'! IDENT
	;






fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
 