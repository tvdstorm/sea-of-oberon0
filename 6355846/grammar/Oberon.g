grammar Oberon;

options {
	output = AST;
	/* ASTLabelType = OberonRootNode; */
}

@header {
package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.OberonRootNode;
}

@lexer::header {
package nl.bve.uva.oberon.parser;
}

DECL	:	;
PROCEDURE
	:	'PROCEDURE';


TYPEDEF	:	'TYPE';
CONSTDEF:	'CONST';
VARDEF	:	'VAR';


NEWLINE	:	'\r'? '\n' { $channel = HIDDEN; } ;
WS	:	(' '|'\t'|'\n'|'\r')+ { $channel = HIDDEN; } ;
LETTER	:	('a'..'z'|'A'..'Z')+;
DIGIT	:	'0'..'9'+;
ident	:	LETTER (LETTER | DIGIT)*; 

integer	:	DIGIT (DIGIT)*;

number	:	integer;

selector:	('.' ident | '[' expression ']')*; 
	 
factor	:	ident selector | number | '(' expression ')' | '~' factor; 

term	:	factor (('*' | 'DIV' | 'MOD' | '&') factor)*; 

simpleExpression	
	:	('+' | '-')? term (('+'|'-' | 'OR') term)*;
	
expression
	:	simpleExpression (('=' | '#' | '<' | '<=' | '>' | '>=') simpleExpression)?;
		
assignment
	:	ident selector ':=' expression;
	
actualParameters
	:	'(' (expression (',' expression)*)? ')';
	 
procedureCall
	:	ident selector (actualParameters)?;

subCall	:	ident selector (':=' expression | (actualParameters)?);

ifStatement
	:	'IF' expression 'THEN' statementSequence ('ELSIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END';

whileStatement
	:	'WHILE' expression 'DO' statementSequence 'END'; 


statement
	:	(subCall | ifStatement | whileStatement)?; 

statementSequence
	:	statement (';' statement)*;

identList
	:	ident (',' ident)*; 

arrayType
	:	'ARRAY' expression 'OF' type;

fieldList
	:	(identList ':' type)?; 
recordType
	:	'RECORD' fieldList (';'  fieldList)* 'END';
	 
type	:	ident -> ident 
		| arrayType -> arrayType
		| recordType -> recordType;

fPSection
	:	('VAR')? identList ':' type;

formalParameters
	:	'(' (fPSection (';' fPSection)*)? ')';

procedureBody
	:	declarations ('BEGIN' statementSequence)? 'END' ident; 

procedureHeading
	:	'PROCEDURE' ident (formalParameters)?
	->	^(ident ^(formalParameters)?);

procedureDeclaration
	:	procedureHeading ';' procedureBody
	->	^(PROCEDURE procedureHeading procedureBody);

procedureDeclarations
	:	(procedureDeclaration ';')?;

varDeclarations
	:	(VARDEF (identList ':' type ';')* )?
	-> 	( ^(VARDEF identList? type)*)?;
	
typeDeclarations
	:	(TYPEDEF (ident '=' type ';')*)?
	-> 	( ^(TYPEDEF ident type)*)?;

constantDeclarations
	:	(CONSTDEF (ident '=' expression ';')*)?
	-> 	( ^(CONSTDEF ident expression)*)?;

declarations
	:	constantDeclarations typeDeclarations varDeclarations procedureDeclarations;

module	:	'MODULE' ident ';' declarations ('BEGIN' statementSequence)? 'END' ident '.' 
	-> 	^('MODULE' ^(DECL declarations) statementSequence);

