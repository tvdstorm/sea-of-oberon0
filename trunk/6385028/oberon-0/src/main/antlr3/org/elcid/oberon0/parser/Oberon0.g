grammar Oberon0;

options {
	language = Java;
}

@header {package org.elcid.oberon0.parser;}
@lexer::header {package org.elcid.oberon0.parser;}



/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

fragment DIGIT	:	'0'..'9' ;

fragment LETTER	:	('a'..'z' | 'A'..'Z');

INT			:	(DIGIT)+ ;

IDENT 			:	LETTER (LETTER | DIGIT)*;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

integer			:	INT ;

identifier		:	IDENT ;

selector		:	('.' identifier | '[' expression ']')*;

factor			:	identifier selector | integer | '(' expression ')' | '~' factor;

term			:	factor (('*' |  'DIV' | 'MOD' | '&') factor)*;

simpleExpression
				:	('+'|'-')? term (('+'|'-' | 'OR') term)*;

expression
				:	simpleExpression (('=' | '#' |  '<' | '<=' | '>' | '>=') simpleExpression)?;

assignment		:	identifier selector ':=' expression;

actualParameters
				:	'(' (expression (',' expression)*)? ')';

procedureCall	:	identifier selector (actualParameters)?;

ifStatement		:	'IF' expression 'THEN' statementSequence
					('ELSIF' expression 'THEN' statementSequence)*
					('ELSE' statementSequence)?  'END';

whileStatement	:	'WHILE' expression 'DO' statementSequence 'END';

statement		:	(assignment | procedureCall | ifStatement | whileStatement)?;

statementSequence
				:	statement (';' statement)*;

identList		:	identifier (',' identifier)*;

arrayType		:	'ARRAY' expression 'OF' type;

fieldList		:	(identList ':' type)?;

recordType		:	'RECORD' fieldList (';' fieldList)* 'END';

type			:	identifier | arrayType | recordType;

fPSection		:	('VAR')? identList ':' type;

formalParameters
				:	'(' (fPSection (';' fPSection)*)? ')';

procedureHeading
				:	'PROCEDURE' identifier (formalParameters)?;

procedureBody	:	declarations ('BEGIN' statementSequence)? 'END' identifier;

procedureDeclaration
				:	procedureHeading ';' procedureBody;

declarations	:	('CONST' (identifier '=' expression ';')*)?
					('TYPE' (identifier '=' type ';')*)?
					('VAR' (identList ':' type ';')*)?
					(procedureDeclaration ';')*;

module			:	'MODULE' identifier ';' declarations
					('BEGIN' statementSequence) 'END' identifier '.';
