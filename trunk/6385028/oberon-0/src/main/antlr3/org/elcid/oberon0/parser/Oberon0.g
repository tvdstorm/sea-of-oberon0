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
	IDENTIFIER		;
	INTEGER			;
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

module			:	MODULE_KW identifier SEMI_COLON declarations (BEGIN_KW statementSequence)? END_KW identifier DOT
				->	^(MODULE identifier declarations statementSequence?) ;

declarations 	: 	constDecl?
					typeDecl?
					varDecl?
					(procedureDecl SEMI_COLON)*
				->	constDecl? typeDecl? varDecl? procedureDecl* ;

constDecl		:	CONST_KW (identifier EQUALS expression SEMI_COLON)*
				-> 	^(CONST identifier expression) ;

typeDecl		:	TYPE_KW (identifier EQUALS type SEMI_COLON)*
				->	^(TYPE identifier type) ;

varDecl			:	VAR_KW (identList COLON type SEMI_COLON)*
				->	^(VAR identList type) ;

procedureDecl 	: 	PROCEDURE_KW identifier (formalParams)? SEMI_COLON procedureBody
				->	^(PROCEDURE identifier (formalParams)? procedureBody) ;

procedureBody	:	declarations (BEGIN_KW statementSequence)? END_KW identifier
				->	declarations statementSequence ;

formalParams 	:	RND_OPEN (fPSection (SEMI_COLON fPSection)*)? RND_CLOSE
				->	^(PARAMS fPSection*) ;

fPSection 		: 	VAR_KW identList COLON type
				->	^(VAR identList type)
				|	identList COLON type
				->	identList type ;

type			:	identifier | arrayType | recordType ;

identList		:	identifier (COMMA identifier)*
				->	identifier+ ;

arrayType		:	ARRAY_KW expression OF_KW type
				->	^(ARRAY expression type) ;

fieldList		:	(identList COLON type)?
				->	identList type ;

recordType		:	RECORD_KW fieldList (SEMI_COLON fieldList)* END_KW
				->	^(RECORD fieldList+) ;

statementSequence
				:	statement (SEMI_COLON statement)*
				->	statement+ ;

statement		:	assignment 
				|	procedureCall
				|	ifStatement
				|	whileStatement ;

assignment		:	identSelector ASSIGN_OP expression
				->	^(ASSIGNMENT identSelector expression);

procedureCall	:	identSelector (actualParameters)?
				->	^(PROCEDURE_CALL identSelector actualParameters?);

whileStatement	:	WHILE_KW expression DO_KW statementSequence END_KW
				->	^(WHILE_LOOP expression statementSequence) ;

ifStatement		:	IF_KW expression THEN_KW statementSequence
					(ELSIF_KW expression THEN_KW statementSequence)*
					(ELSE_KW statementSequence)?  END_KW ;

actualParameters
				: 	RND_OPEN RND_CLOSE
				->
				|	RND_OPEN expression (COMMA expression)* RND_CLOSE
				->	expression+ ;

expression
				:	simpleExpression (( EQUALS | HASH |  LESSER | LESSER_OR_EQUAL | GREATER | GREATER_OR_EQUAL ) simpleExpression)? ;

simpleExpression
				:	(PLUS_OP | MINUS_OP )? term (( PLUS_OP | MINUS_OP | OR_OP ) term)* ;

term			:	factor ((MULTIPLY_OP |  DIVIDE_OP | MODULO_OP | AND_OP ) factor)* ;

factor			:	identSelector | integer | RND_OPEN expression RND_CLOSE | '~' factor ;

identSelector	:	identifier selector* ;

selector		:	DOT identifier
				->	^(SELECTOR identifier)
				|	SQR_OPEN expression SQR_CLOSE
				->	^(SELECTOR expression) ;

identifier		:	IDENT
				->	^(IDENTIFIER IDENT) ;

integer			:	INT
				->	^(INTEGER INT) ;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

INT				:	DIGIT+ ;

IDENT 			:	LETTER (LETTER | DIGIT)*;

WHITESPACE		:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;

fragment DIGIT	:	'0'..'9' ;

fragment LETTER	:	('a'..'z' | 'A'..'Z') ;