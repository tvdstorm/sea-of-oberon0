grammar oberon0;
options { output=AST; }

module	:	MODULE IDENT SEMICOLON! declarations 
		(BEGIN statementSequence)? END IDENT DOT;

selector: 	(DOT IDENT | SQROPEN^ expression SQRCLOSE)*;

number	:	INTEGER;

factor 	:	(IDENT selector | number | RNDOPEN^ expression RNDCLOSE | TILDE factor);

term 	:	factor ((STAR | DIV | MOD | AMPERSAND)^ factor)*;

simpleExpression 
	:	(PLUS | MINUS)? term ((PLUS|MINUS|OR)^ term)*;

expression 
	:	simpleExpression ((EQUALS|HASH|SMALLERTHEN|SMALLEREQUAL|GREATERTHEN|GREATEREQUAL)^ simpleExpression)?;

assignment
	:	ASSIGN expression ;

actualParameters
	:	RNDOPEN^ (expression (COMMA expression)*)? RNDCLOSE;

procedureCall
	:	(actualParameters)?;

ifStatement
	:	IF^ expression THEN statementSequence
		(ELSIF expression THEN statementSequence)*
		(ELSE statementSequence)?
		 END;

whileStatement 
	:	WHILE expression DO statementSequence END;

statement
	:	( (IDENT selector (assignment | procedureCall)) | ifStatement | whileStatement)?;
	
statementSequence
	:	statement (SEMICOLON statement)*;

identList
	:	IDENT (COMMA IDENT )*;

arrayType 
	:	ARRAY expression OF type;
	
fieldList
	:	(identList COLON type)?;

recordType 
	:	RECORD fieldList (SEMICOLON fieldList)* END;

type	:	(IDENT | arrayType | recordType);	

fpSection
	:	(VAR)? identList COLON type;

formalParameters 
	:	RNDOPEN (fpSection (SEMICOLON! fpSection)*)? RNDCLOSE;

procedureHeading
	:	PROCEDURE^ IDENT (formalParameters)?;

procedureBody
	:	declarations (BEGIN statementSequence)? END IDENT;
	
procedureDeclaration
	:	procedureHeading SEMICOLON^ procedureBody;

declarations
	:	(CONST^ (IDENT EQUALS^ expression SEMICOLON!)*)?
		(TYPE^ (IDENT EQUALS^ type SEMICOLON!)*)?
		(VAR^ (identList COLON^ type SEMICOLON!)*)?
		(procedureDeclaration SEMICOLON!)*;

STAR	: 	'*';
DIV	:	'DIV';
MOD	:	'MOD';
AMPERSAND
	:	'&';
PLUS	:	'+';
MINUS	:	'-';
OR	:	'OR';
EQUALS	:	'=';
HASH	:	'#';
SMALLERTHEN
	:	'<';
SMALLEREQUAL
	:	'<=';
GREATERTHEN
	:	'>';
GREATEREQUAL
	:	'>=';
DOT	:	'.';
COMMA	:	',';
COLON	:	':';
RNDOPEN	:	'(';				//round bracket open
RNDCLOSE:	')';				//round bracket close
SQROPEN	:	'[';				//square bracket open
SQRCLOSE:	']';				//square bracket close
OF	:	'OF';
THEN	:	'THEN';
DO	:	'DO';
TILDE	:	'~';
ASSIGN	:	':=';
SEMICOLON
	:	';';
END	:	'END';
ELSE	:	'ELSE';
ELSIF	:	'ELSIF';
IF	:	'IF';
WHILE	:	'WHILE';
ARRAY	:	'ARRAY';
RECORD	:	'RECORD';
CONST	:	'CONST';
TYPE	:	'TYPE';
VAR	:	'VAR';
PROCEDURE
	:	'PROCEDURE';
BEGIN	:	'BEGIN';
MODULE	:	'MODULE';

IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;

WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
