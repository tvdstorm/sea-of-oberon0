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

IDENT 			:	LETTER (LETTER | DIGIT)*;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

selector		:	('.' IDENT | '[' expression ']')+;

factor			:	IDENT selector | INTEGER | '(' expression ')' | '~' factor;

term			:	factor (('*' |  'DIV' | 'MOD' | '&') factor)*;

simpleExpression
				:	('+'|'-')? term (('+'|'-' | 'OR') term)*;

expression
				:	simpleExpression (('=' | '#' |  '<' | '<=' | '>' | '>=') simpleExpression)?;

assignment		:	IDENT selector ':=' expression;

actualParameters
				:	'(' (expression (',' expression)*)? ')';

procedureCall	:	IDENT selector (actualParameters)?;

ifStatement		:	'IF' expression 'THEN' statementSequence
					('ELSEIF' expression 'THEN' statementSequence)*
					('ELSE' statementSequence)?  'END';

whileStatement	:	'WHILE' expression 'DO' statementSequence 'END';

statement		:	(assignment | procedureCall | ifStatement | whileStatement)?;

statementSequence
				:	statement (';' statement)*;

identList		:	IDENT (',' IDENT)*;

arrayType		:	'ARRAY' expression 'OF' type;

fieldList		:	(identList ':' type)?;

recordType		:	'RECORD' fieldList (';' fieldList)* 'END';

type			:	IDENT | arrayType | recordType;

fPSection		:	('VAR')? identList ':' type;

formalParameters
				:	'(' (fPSection (';' fPSection)*)? ')';

procedureHeading
				:	'PROCEDURE' IDENT (formalParameters)?;

procedureBody	:	declarations ('BEGIN' statementSequence)? 'END' IDENT;

procedureDeclaration
				:	procedureHeading ';' procedureBody;

declarations	:	('CONST' (IDENT '=' expression ';')*)?
					('TYPE' (IDENT '=' type ';')*)?
					('VAR' (identList ':' type ';')*)?
					(procedureDeclaration ';')*;

module			:	'MODULE' IDENT ';' declarations
					('BEGIN' statementSequence) 'END' IDENT '.';
