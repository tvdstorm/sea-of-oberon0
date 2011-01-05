grammar Oberon0;

options {
	language = Java;
	/* Without this backtrack option Antlr will fail at 'statement' -- not sure why */
	backtrack=true;
}

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

fragment DIGIT	:	'0'..'9' ;

fragment LETTER	:	('a'..'z' | 'A'..'Z');

INTEGER			:	(DIGIT)+ ;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

number			:	INTEGER;

ident			:	LETTER (LETTER | DIGIT)*;

selector		:	('.' ident | '[' expression ']')+;

factor			:	ident selector | number | '(' expression ')' | '~' factor;

term			:	factor (('*' |  'DIV' | 'MOD' | '&') factor)*;

simpleExpression
				:	('+'|'-')? term (('+'|'-' | 'OR') term)*;

expression
				:	simpleExpression (('=' | '#' |  '<' | '<=' | '>' | '>=') simpleExpression)?;

assignment		:	ident selector ':=' expression;

actualParameters
				:	'(' (expression (',' expression)*)? ')';

procedureCall	:	ident selector (actualParameters)?;

ifStatement		:	'IF' expression 'THEN' statementSequence
					('ELSEIF' expression 'THEN' statementSequence)*
					('ELSE' statementSequence)?  'END';

whileStatement	:	'WHILE' expression 'DO' statementSequence 'END';

statement		:	(assignment | procedureCall | ifStatement | whileStatement)?;

statementSequence
				:	statement (';' statement)*;

identList		:	ident (',' ident)*;

arrayType		:	'ARRAY' expression 'OF' type;

fieldList		:	(identList ':' type)?;

recordType		:	'RECORD' fieldList (';' fieldList)* 'END';

type			:	ident | arrayType | recordType;

fPSection		:	('VAR')? identList ':' type;

formalParameters
				:	'(' (fPSection (';' fPSection)*)? ')';

procedureHeading
				:	'PROCEDURE' ident (formalParameters)?;

procedureBody	:	declarations ('BEGIN' statementSequence)? 'END' ident;

procedureDeclaration
				:	procedureHeading ';' procedureBody;

declarations	:	('CONST' (ident '=' expression ';')*)?
					('TYPE' (ident '=' type ';')*)?
					('VAR' (identList ':' type ';')*)?
					(procedureDeclaration ';')*;

module			:	'MODULE' ident ';' declarations
					('BEGIN' statementSequence) 'END' ident '.';
