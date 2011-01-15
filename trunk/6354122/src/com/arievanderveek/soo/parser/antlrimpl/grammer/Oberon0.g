grammar Oberon0;

options {
  language = Java;
}

@header {
  package com.arievanderveek.soo.parser.antlrimpl.generated;
}

@lexer::header {
  package com.arievanderveek.soo.parser.antlrimpl.generated;
}


expression
	:	simpleExpression (('=' | '#' | '<' | '<=' | '>' | '>=') simpleExpression)?
	;

simpleExpression
		: ('+'|'-')? term (('+'|'-' | 'OR') term)?
		;
		
term
	: factor (('*' | 'DIV' | 'MOD' | '&') factor)?
	;

factor
	:	IDENT selector 
	| INTEGER 
	| '(' expression ')' 
	| '~' factor
	;
	
selector
	:	('.'	IDENT	|	'['	expression	']')*
	;
	
assignment
	: IDENT selector ':=' expression
	;

actualParameters
		: '(' (expression (',' expression)*)? ')'
		;
procedureCall
	:	IDENT actualParameters?;

ifStatement
	:	'IF' expression 'THEN' statementSequence
		('ELSIF' expression 'THEN' statementSequence)*
		('ELSE' statementSequence)? 'END';
		
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
	:	'ARRAY'	expression 'OF' type
	;
	
fieldList
	:	(identList ':' type)?
	;

recordType
	:	'RECORD' fieldList (';' fieldList)* 'END'
	;

type
	:	IDENT | arrayType | recordType
	;
	
fpSection
	:	'VAR'* identList ':' type
	;
	
formalParameters
	:
	'(' (fpSection (';' fpSection)*)? ')'
	;
	
procedureHeading
	:	'PROCEDURE' IDENT formalParameters?
	;

procedureBody
	:	declarations ('BEGIN' statementSequence)? 'END'
	;
	
procedureDeclaration
	:	procedureHeading ';' procedureBody IDENT
	;

declarations
	:	('CONST' (IDENT '=' expression ';')*)?
	('TYPE' (IDENT '=' type ';')*)?
	('VAR' (identList ':' type ';')*)?
	(procedureDeclaration ';')*
	;
	
module
	:	'MODULE' IDENT ';' declarations
	('BEGIN' statementSequence)? 'END' IDENT '.'
	;

fragment DIGIT : '0'..'9';
fragment LETTER : ('a'..'z' | 'A'..'Z') ;
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
// Put Whitespaces on a hidden channel, so they dont end up in the tree
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;} ;