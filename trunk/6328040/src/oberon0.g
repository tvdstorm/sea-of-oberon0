grammar Oberon0;

options { 	
	output=AST; 
	backtrack=true; 
	memoize=true; 
	//ASTLabelType = OberonAST;
}

tokens
{
	MULTIPLY	= 	'*';
	DIVIDE		=	'DIV';
	MOD		=	'MOD';
	AMPERSAND	=	'&';
	ADD		=	'+';
	SUBTRACT	=	'-';
	OR		=	'OR';
	EQUALS		=	'=';
	HASH		=	'#';
	SMALLERTHEN	=	'<';
	SMALLEREQUAL	=	'<=';
	GREATERTHEN	=	'>';
	GREATEREQUAL	=	'>=';
	DOT		=	'.';
	COMMA		=	',';
	COLON		=	':';
	RNDOPEN		=	'(';			//round bracket open
	RNDCLOSE	=	')';			//round bracket close
	SQROPEN		=	'[';			//square bracket open
	SQRCLOSE	=	']';			//square bracket close
	OF		=	'OF';
	THEN		=	'THEN';
	DO		=	'DO';
	TILDE		=	'~';
	ASSIGNMENT	=	':=';
	SEMICOLON	=	';';
	END		=	'END';
	ELSE		=	'ELSE';
	ELSIF		=	'ELSIF';
	IF		=	'IF';
	WHILE		=	'WHILE';
	ARRAY		=	'ARRAY';
	RECORD		=	'RECORD';
	CONST		=	'CONST';
	TYPEDECL	=	'TYPE';
	VAR		=	'VAR';
	PROCEDURE	=	'PROCEDURE';
	BEGIN		=	'BEGIN';
	MODULE		=	'MODULE';
	PARAMETERS;
	REFVAR;
	BODY;
	CONDITION;
	PROCEDURECALL;
	SELECTOR;
	OBERONPROGRAM;
	DECLARATIONS;
	IFBLOCK;
	}

@header {package oberon0.grammar; 
//import oberon0.OberonAST;
}

@lexer::header {
	package oberon0.grammar;
}

oberonprogram
	:	module 
			-> ^(OBERONPROGRAM module);
module	:	MODULE IDENT semicolon moduleBody IDENT DOT EOF
			-> ^(MODULE IDENT moduleBody);
moduleBody
	:	declarations (BEGIN statementSequence)? END
			-> declarations? ^(BODY statementSequence)?;
declarations
	:		constDeclaration? typeDeclaration? varDeclarations? 
			(procedureDeclaration semicolon)*
				-> ^(DECLARATIONS constDeclaration? typeDeclaration? varDeclarations? 
				(procedureDeclaration)*);			
constDeclaration
	:	(CONST (IDENT EQUALS expression semicolon)*)
			-> ^(CONST (IDENT expression)*);		
typeDeclaration
	:	(TYPEDECL (IDENT EQUALS type semicolon)*)
			-> ^(TYPEDECL (IDENT type)*);		
varDeclarations
	:	(VAR (identList COLON type semicolon)*)
			-> ^(VAR identList type)*;
procedureDeclaration
	:	PROCEDURE IDENT (formalParameters)? SEMICOLON declarations (procedureBody)? IDENT 
			-> ^(PROCEDURE IDENT (formalParameters)? declarations (procedureBody)?);		
procedureBody
	:	BEGIN statementSequence END
			-> ^(BODY statementSequence);
assignment
	:	identselector ASSIGNMENT^ expression;
actualParameters
	:	RNDOPEN (expression (COMMA expression)*)? RNDCLOSE
			-> ^(PARAMETERS expression+);
procedureCall
	:	identselector (actualParameters)? 
			-> ^(PROCEDURECALL identselector (actualParameters)?)  ;

elseStatementPart
	:	ELSE statementSequence 
			-> ^(ELSE ^(BODY statementSequence));
elseifStatementPart
	:	ELSIF expression THEN statementSequence
			-> ^(ELSIF ^(CONDITION expression) 
				^(BODY statementSequence));
ifStatementPart
	:	IF expression THEN statementSequence 
			->^(IF ^(CONDITION expression) 
				^(BODY statementSequence)) ;

ifStatement:		ifStatementPart elseifStatementPart+ 
				elseStatementPart END
			-> ^(IFBLOCK ifStatementPart 
				elseifStatementPart+ 
				elseStatementPart)
			| ifStatementPart elseifStatementPart+ END
				-> ^(IFBLOCK ifStatementPart elseifStatementPart+)
			| ifStatementPart elseStatementPart END
				-> ^(IFBLOCK ifStatementPart elseStatementPart) 
			| ifStatementPart END
				-> ^(IFBLOCK ifStatementPart);

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
	:	RECORD fieldList (semicolon fieldList)* END
			-> ^(RECORD fieldList+);
type	:	(IDENT | arrayType | recordType);	
fpSection
	:	identList COLON type
			-> ^(REFVAR identList type)
		|VAR identList COLON type
			-> ^(VAR identList type);
formalParameters 
	:	RNDOPEN (fpSection (SEMICOLON fpSection)*)? RNDCLOSE 
			-> ^(PARAMETERS (fpSection+)?);
selector: 	(DOT IDENT 
			-> ^(SELECTOR IDENT) 
		| sqrExpression
			-> ^(SELECTOR sqrExpression)
		)*;
identselector
	:	IDENT^ selector;
factor 	:	(identselector | number | rndExpression | TILDE factor);
term 	:	factor ((MULTIPLY | DIVIDE | MOD | AMPERSAND)^ factor)*;
simpleExpression 
	:	(ADD | SUBTRACT)? term ((ADD | SUBTRACT | OR)^ term)*;
expression 
	:	simpleExpression
		((EQUALS|HASH|SMALLERTHEN|SMALLEREQUAL|GREATERTHEN|GREATEREQUAL)^ 
		simpleExpression)?;
sqrExpression
	:	SQROPEN expression SQRCLOSE -> expression;
rndExpression
	:	RNDOPEN expression RNDCLOSE-> expression;

number	:	INTEGER;
semicolon 
	:	SEMICOLON!;
comma	:	COMMA!;
colon	:	COLON!;

BOOLEAN	:	'FALSE' | 'TRUE';				//not directly specified, unimplemented
IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;
WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
