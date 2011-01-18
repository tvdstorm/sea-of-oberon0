grammar Oberon0;

options {
	language = Java;
	backtrack = true;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens
{
	MODULE_KW 	= 	'MODULE'	;
	BEGIN_KW	=	'BEGIN'		;
	END_KW		=	'END'		;
	CONST_KW	=	'CONST'		;
	TYPE_KW		=	'TYPE'		;
	VAR_KW		=	'VAR'		;
	PROCEDURE_KW
				=	'PROCEDURE'	;
	ARRAY_KW	=	'ARRAY'		;
	OF_KW		=	'OF'		;
	RECORD_KW	=	'RECORD'	;
	WHILE_KW	=	'WHILE'		;
	DO_KW		=	'DO'		;
	IF_KW		=	'IF'		;
	THEN_KW		=	'THEN'		;
	ELSIF_KW	=	'ELSIF'		;
	ELSE_KW		=	'ELSE'		;

	SEMI_COLON	=	';'			;
	COLON		=	':'			;
	DOT			=	'.'			;
	COMMA		=	','			;
	TILDE		=	'~'			;
	EQUALS		=	'='			;
	RND_OPEN 	=	'('			;
	RND_CLOSE 	=	')'			;
	SQR_OPEN	=	'['			;
	SQR_CLOSE	=	']'			;
	HASH		=	'#'			;
	LESSER		=	'<'			;
	LESSER_OR_EQUAL
				=	'<='		;
	GREATER		=	'>'			;
	GREATER_OR_EQUAL
				=	'>='		;
	ASSIGN_OP	=	':='		;
	PLUS_OP		=	'+'			;
	MINUS_OP	=	'-'			;
	MULTIPLY_OP	=	'*'			;
	DIVIDE_OP	=	'DIV'		;
	MODULO_OP	=	'MOD'		;
	AND_OP		=	'&'			;
	OR_OP		=	'OR'		;

	MODULE			;
	CONST			;
	TYPE			;
	VAR				;
	PARAMS			;
	ARRAY			;
	RECORD 			;
	PROCEDURE 		;
	SELECTOR 		;
	WHILE_LOOP		;
	ASSIGNMENT		;
	PROCEDURE_CALL	;
	IF_STATEMENT	;
	EXPRESSION		;

}

@header {package org.elcid.oberon0.parser;}
@lexer::header {package org.elcid.oberon0.parser;}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog			:	module+ ;

module			:	MODULE_KW identifier SEMI_COLON declarations (BEGIN_KW statementSequence)+ END_KW identifier DOT ;

declarations	:	(CONST_KW (identifier EQUALS expression SEMI_COLON)*)?
					(TYPE_KW (identifier EQUALS type SEMI_COLON)*)?
					(VAR_KW (identList COLON type SEMI_COLON)*)?
					(procedureDeclaration SEMI_COLON)* ;

procedureDeclaration
				:	procedureHeading SEMI_COLON procedureBody ;

procedureBody	:	declarations (BEGIN_KW statementSequence)? END_KW identifier ;

procedureHeading
				:	PROCEDURE_KW identifier (formalParameters)? ;

formalParameters
				:	RND_OPEN (fPSection (SEMI_COLON fPSection)*)? RND_CLOSE ;

fPSection		:	(VAR_KW)? identList COLON type ;

type			:	identifier | arrayType | recordType ;

recordType		:	RECORD_KW fieldList (SEMI_COLON fieldList)* END_KW ;

fieldList		:	(identList COLON type)? ;

arrayType		:	ARRAY_KW expression OF_KW type ;

identList		:	identifier (COMMA identifier)* ;

statementSequence
				:	statement (SEMI_COLON statement)* ;

statement		:	(assignment | procedureCall | ifStatement | whileStatement)? ;

whileStatement	:	WHILE_KW expression DO_KW statementSequence END_KW ;

ifStatement		:	IF_KW expression THEN_KW statementSequence
					(ELSIF_KW expression THEN_KW statementSequence)*
					(ELSE_KW statementSequence)?  END_KW ;

procedureCall	:	identifier selector (actualParameters)? ;

actualParameters
				:	RND_OPEN (expression (COMMA expression)*)? RND_CLOSE ;

assignment		:	identifier selector ASSIGN_OP expression ;

expression
				:	simpleExpression (( EQUALS | HASH |  LESSER | LESSER_OR_EQUAL | GREATER | GREATER_OR_EQUAL ) simpleExpression)? ;

simpleExpression
				:	(PLUS_OP | MINUS_OP )? term (( PLUS_OP | MINUS_OP | OR_OP ) term)* ;

term			:	factor ((MULTIPLY_OP |  DIVIDE_OP | MODULO_OP | AND_OP ) factor)* ;

factor			:	identifier selector | integer | RND_OPEN expression RND_CLOSE | '~' factor ;

selector		:	(DOT identifier | SQR_OPEN expression SQR_CLOSE)* ;

identifier		:	IDENT ;

integer			:	INT ;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

INT				:	DIGIT+ ;

IDENT 			:	LETTER (LETTER | DIGIT)*;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;

fragment DIGIT	:	'0'..'9' ;

fragment LETTER	:	('a'..'z' | 'A'..'Z') ;