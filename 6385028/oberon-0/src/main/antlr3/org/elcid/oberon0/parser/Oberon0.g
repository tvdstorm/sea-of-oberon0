grammar Oberon0;

options {
	language = Java;
}

tokens
{
	/* Key words */
	MODULE_KW		= 	'MODULE'		;
	BEGIN_KW		=	'BEGIN'			;
	END_KW			=	'END'			;
	CONST_KW		=	'CONST'			;
	TYPE_KW			=	'TYPE'			;
	VAR_KW			=	'VAR'			;
	PROCEDURE_KW	=	'PROCEDURE'		;
	ARRAY_KW		=	'ARRAY'			;
	OF_KW			=	'OF'			;
	RECORD_KW		=	'RECORD'		;
	WHILE_KW		=	'WHILE'			;
	DO_KW			=	'DO'			;
	IF_KW			=	'IF'			;
	THEN_KW			=	'THEN'			;
	ELSIF_KW		=	'ELSIF'			;
	ELSE_KW			=	'ELSE'			;

	/* Symbols */
	SEMI_COLON			=	';'			;
	COLON				=	':'			;
	DOT					=	'.'			;
	COMMA				=	','			;
	TILDE				=	'~'			;
	RND_OPEN			=	'('			;
	RND_CLOSE			=	')'			;
	SQR_OPEN			=	'['			;
	SQR_CLOSE			=	']'			;

	/* Operators */
	EQUALS_OP			=	'='			;
	HASH_OP				=	'#'			;
	LESSER_OP			=	'<'			;
	LESSER_OR_EQUAL_OP	=	'<='		;
	GREATER_OP			=	'>'			;
	GREATER_OR_EQUAL_OP	=	'>='		;
	ASSIGN_OP			=	':='		;
	PLUS_OP				=	'+'			;
	MINUS_OP			=	'-'			;
	MULTIPLY_OP			=	'*'			;
	DIVIDE_OP			=	'DIV'		;
	MODULO_OP			=	'MOD'		;
	AND_OP				=	'&'			;
	OR_OP				=	'OR'		;

}

@header {package org.elcid.oberon0.parser;}
@lexer::header {package org.elcid.oberon0.parser;}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

module			:	MODULE_KW identifier SEMI_COLON declarations (BEGIN_KW statementSequence)? END_KW identifier DOT
				;

declarations 	: 	constDecl?
					typeDecl?
					varDecl?
					(procedureDecl SEMI_COLON)*
				;

constDecl		:	CONST_KW (identifier EQUALS_OP expression SEMI_COLON)*
				;

typeDecl		:	TYPE_KW (identifier EQUALS_OP type SEMI_COLON)*
				;

varDecl			:	VAR_KW (identList COLON type SEMI_COLON)*
				;

procedureDecl 	: 	PROCEDURE_KW identifier (formalParams)? SEMI_COLON procedureBody
				;

procedureBody	:	declarations (BEGIN_KW statementSequence)? END_KW identifier
				;

formalParams 	:	RND_OPEN (fPSection (SEMI_COLON fPSection)*)? RND_CLOSE
				;

fPSection 		: 	VAR_KW identList COLON type
				|	identList COLON type
				;

type			:	identifier | arrayType | recordType ;

identList		:	identifier (COMMA identifier)*
				;

arrayType		:	ARRAY_KW expression OF_KW type
				;

fieldList		:	(identList COLON type)?
				;

recordType		:	RECORD_KW fieldList (SEMI_COLON fieldList)* END_KW
				;

statementSequence
				:	statement (SEMI_COLON statement)*
				;

statement		:	((identSelector ASSIGN_OP) => assignment)
				|	procedureCall
				|	ifStatement
				|	whileStatement ;

assignment		:	identSelector ASSIGN_OP expression
				;

procedureCall	:	identSelector (actualParameters)?
				;

whileStatement	:	WHILE_KW expression DO_KW statementSequence END_KW
				;

ifStatement		:	IF_KW expression THEN_KW statementSequence (elsifStatement)* (elseStatement)? END_KW
				;

elsifStatement	:	ELSIF_KW expression THEN_KW statementSequence
				;

elseStatement	:	ELSE_KW statementSequence
				;

actualParameters
				: 	RND_OPEN RND_CLOSE
				|	RND_OPEN expression (COMMA expression)* RND_CLOSE
				;

expression
				:	simpleExpression (expressionOperator simpleExpression)? ;

expressionOperator
				:	EQUALS_OP
				|	HASH_OP
				|	LESSER_OP
				|	LESSER_OR_EQUAL_OP
				|	GREATER_OP
				|	GREATER_OR_EQUAL_OP
				;


simpleExpression
				:	(PLUS_OP | MINUS_OP)? term (simpleExpressionOperator term)* ;

simpleExpressionOperator
				:	PLUS_OP
				|	MINUS_OP
				|	OR_OP
				;

term			:	factor (termOperator factor)* ;

termOperator
				:	MULTIPLY_OP
				|	DIVIDE_OP
				|	MODULO_OP
				|	AND_OP
				;

factor			:	identSelector 
				|	integer
				|	RND_OPEN expression RND_CLOSE
				|	TILDE factor
				;

identSelector	:	identifier selector* ;

selector		:	DOT identifier
				|	SQR_OPEN expression SQR_CLOSE
				;

identifier		:	IDENT
				;

integer			:	INT
				;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

INT				:	DIGIT+ ;

IDENT 			:	LETTER (LETTER | DIGIT)*;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;

fragment DIGIT	:	'0'..'9' ;

fragment LETTER	:	('a'..'z' | 'A'..'Z') ;