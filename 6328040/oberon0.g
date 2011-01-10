grammar oberon0;

options { 	
	output=AST; 
	backtrack=true; 
	memoize=true; 
}

tokens
{
	STAR	= 	'*';
	DIV	=	'DIV';
	MOD	=	'MOD';
	AMPERSAND
		=	'&';
	PLUS	=	'+';
	MINUS	=	'-';
	OR	=	'OR';
	EQUALS	=	'=';
	HASH	=	'#';
	SMALLERTHEN
		=	'<';
	SMALLEREQUAL
		=	'<=';
	GREATERTHEN
		=	'>';
	GREATEREQUAL
		=	'>=';
	DOT	=	'.';
	COMMA	=	',';
	COLON	=	':';
	RNDOPEN	=	'(';				//round bracket open
	RNDCLOSE=	')';				//round bracket close
	SQROPEN	=	'[';				//square bracket open
	SQRCLOSE=	']';				//square bracket close
	OF	=	'OF';
	THEN	=	'THEN';
	DO	=	'DO';
	TILDE	=	'~';
	ASSIGN	=	':=';
	SEMICOLON
		=	';';
	END	=	'END';
	ELSE	=	'ELSE';
	ELSIF	=	'ELSIF';
	IF	=	'IF';
	WHILE	=	'WHILE';
	ARRAY	=	'ARRAY';
	RECORD	=	'RECORD';
	CONST	=	'CONST';
	NWTYPE	=	'TYPE';
	VAR	=	'VAR';
	PROCEDURE
		=	'PROCEDURE';
	BEGIN	=	'BEGIN';
	MODULE	=	'MODULE';
	PARAMETERS;
	BODY;
	CONDITION;
	TYPE;
	NAME;
}

module	:	MODULE nameident semicolon moduleBody IDENT DOT EOF
			-> ^(MODULE nameident moduleBody);

moduleBody
	:	declarations (BEGIN statementSequence)? END
			-> declarations? ^(BODY statementSequence)?;

declarations
	:		constDeclaration? typeDeclaration? varDeclarations? 
			(procedureDeclaration semicolon)*
				-> constDeclaration? typeDeclaration? varDeclarations? 
				(procedureDeclaration)*;
				
constDeclaration
	:	(CONST (nameident EQUALS expression semicolon)*)
			-> ^(CONST (nameident expression)*);
				
typeDeclaration
	:	(NWTYPE (IDENT EQUALS type semicolon)*)
			-> ^(NWTYPE (IDENT type)*);
				
varDeclarations
	:	(VAR (identList colon type semicolon)*)
			-> ^(VAR type identList)*;

procedureDeclaration
	:	PROCEDURE IDENT (formalParameters)? semicolon declarations (procedureBody)? IDENT 
			-> ^(PROCEDURE IDENT (formalParameters)? declarations (procedureBody)?);
				
procedureBody
	:	BEGIN statementSequence END
			-> ^(BODY statementSequence);

selector: 	(DOT IDENT -> ^(IDENT) | sqrExpression 
			-> ^(sqrExpression))*;

identselector
	:	IDENT selector;

factor 	:	(identselector | number | rndExpression | TILDE factor);

term 	:	factor ((STAR | DIV | MOD | AMPERSAND)^ factor)*;

simpleExpression 
	:	(PLUS | MINUS)? term ((PLUS|MINUS|OR)^ term)*;

expression 
	:	simpleExpression
		((EQUALS|HASH|SMALLERTHEN|SMALLEREQUAL|GREATERTHEN|GREATEREQUAL)^ 
		simpleExpression)?;

sqrExpression
	:	SQROPEN expression SQRCLOSE -> expression;
rndExpression
	:	RNDOPEN expression RNDCLOSE-> expression;

assignment
	:	identselector ASSIGN^ expression;

actualParameters
	:	RNDOPEN (expression (comma expression)*)? RNDCLOSE
			-> ^(PARAMETERS expression+);

procedureCall
	:	identselector^ (actualParameters)? ;


ifStatement:		IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ (ELSE statementSequence) END
				-> ^(IF ^(CONDITION expression) ^(BODY statementSequence) ^(ELSIF ^(CONDITION expression) ^(BODY statementSequence))+ ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ END
				-> ^(IF ^(CONDITION expression) ^(BODY statementSequence) ^(ELSIF ^(CONDITION expression) ^(BODY statementSequence))+) |
			IF expression THEN statementSequence (ELSE statementSequence) END
				-> ^(IF ^(CONDITION expression)^(BODY statementSequence)  ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence END
				-> ^(IF ^(CONDITION expression) ^(BODY statementSequence));
whileStatement:		WHILE expression DO statementSequence END
				-> ^(WHILE ^(CONDITION expression) ^(BODY statementSequence));

statement
	:	(assignment | procedureCall | ifStatement | whileStatement)?;
	
statementSequence
	:	statement (semicolon statement)*;

identList
	:	IDENT (comma IDENT)*;

arrayType 
	:	ARRAY expression OF type 
			-> ^(ARRAY expression type);	
	
fieldList
	:	(identList colon type)?;

recordType 
	:	RECORD fieldList (semicolon fieldList)* END;

type	:	(IDENT | arrayType | recordType);	

fpSection
	:	VAR? identList colon type;

formalParameters 
	:	RNDOPEN (fpSection (semicolon fpSection)*)? RNDCLOSE 
			-> ^(PARAMETERS (fpSection (fpSection)*)?);

nameident
	:	IDENT -> ^(NAME IDENT);

number	:	INTEGER;

semicolon 
	:	SEMICOLON!;
	
comma	:	COMMA!;

colon	:	COLON!;

IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;

WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
