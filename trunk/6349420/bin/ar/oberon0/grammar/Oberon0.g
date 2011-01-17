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



	
selector
	:	('.'! IDENT | '['! expression ']'!)*
	; 

factor
	:	IDENT selector | INTEGER | '(' expression ')' | '~' factor
	; 

term
	:	factor (('*' | 'DIV' | 'MOD' | '&') factor)*
	; 

simpleExpression returns [Interpretable e]  
	:{ boolean positive = true; }	('+'|'-' {positive = !positive;})? 
		term (('+'|'-' | 'OR') term)*
	; 

expression returns [Interpretable e] 
	:	leftExpression=simpleExpression { $e = $leftExpression.e; } 
		(	'=' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.EQUAL); }
		| 	'#' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.NOT_EQUAL); }
		| 	'<' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.SMALLER); }
		| 	'<=' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.SMALLER_OR_EQUAL); }
		| 	'>' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.GREATER); }
		| 	'>=' rightExpression=simpleExpression { $e = new CompareExpression($e, $rightExpression.e, CompareOperator.GREATER_OR_EQUAL); } 
		)?
	; 

assignment
	:	IDENT selector ':=' expression
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
 