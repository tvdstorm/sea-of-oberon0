grammar Oberon0;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
	backtrack=true;
	// memoize=true;
}

tokens
{
	MINUS='-';
	PLUS='+';
	TIMES='*';
	DIVIDE='DIV';
	CONST='CONST';
	VAR='VAR';
	TYPE='TYPE';
	IF='IF';
	THEN='THEN';
	ELSE='ELSE';
	ELSIF='ELSIF';
	END='END';
	MODULE='MODULE';
	DO='DO';
	WHILE='WHILE';
	BEGIN='BEGIN';
	PROCEDURE='PROCEDURE';
	ARRAY='ARRAY';
	OF='OF';
	RECORD='RECORD';
	MOD='MOD';
	AND='&';
	OR='OR';
	ASSIGNMENT=':=';
	EQUALS='=';
	NOTEQUALS='#';
	SMALLERTHAN='<';
	GREATERTHAN='>';
	SMALLEREQUALS='<=';
	GREATEREQUALS='>=';
	NOT='~';
	REFVAR;
	PROCEDURECALL;
	PARAMETERS;
	BODY;
	TYPE;
	DOTSELECTOR='.';
	ARRAYSELECTOR='[';
}

@parser::header
{
package randy.oberon0.generated.antlr;
}

@lexer::header
{
package randy.oberon0.generated.antlr;
}

WHITESPACE:		(' '|'\t'|'\r'|'\n') { skip(); };
IDENT:			('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;
INTEGER:		('0'..'9')+;
selector:		IDENT ((DOTSELECTOR^ IDENT)|(ARRAYSELECTOR^ expression ']'!))+ | IDENT;
factor:			selector | INTEGER | '('! expression ')'! | NOT^ factor;
term:			factor ((TIMES|DIVIDE|MOD|AND)^ factor)*;
simpleExpression:	(PLUS!|MINUS^)? term ((PLUS|MINUS |OR)^ term)*;
infixOperand:		EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS;
expression:		simpleExpression infixOperand simpleExpression 
				-> ^(infixOperand simpleExpression simpleExpression) |
			simpleExpression
				-> simpleExpression;
actualParameters:	'(' (expression (',' expression)*)? ')'
				-> (expression (expression)*)?;
ifStatement:		IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ (ELSE statementSequence) END
				-> ^(IF expression ^(BODY statementSequence) ^(ELSIF expression ^(BODY statementSequence))+ ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ END
				-> ^(IF expression ^(BODY statementSequence) ^(ELSIF expression ^(BODY statementSequence))+) |
			IF expression THEN statementSequence (ELSE statementSequence) END
				-> ^(IF expression ^(BODY statementSequence) ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence END
				-> ^(IF expression ^(BODY statementSequence));
whileStatement:		WHILE expression DO statementSequence END
				-> ^(WHILE expression ^(BODY statementSequence));
assignment:		selector ASSIGNMENT expression
				-> ^(ASSIGNMENT selector expression);
procedureCall:		selector (actualParameters)?
				-> ^(PROCEDURECALL selector actualParameters?);
statement:		(assignment | procedureCall| ifStatement | whileStatement)?;
statementSequence:	statement (';' statement)*
				-> statement (statement)*;
identList:		IDENT ( ',' IDENT)*
				-> IDENT (IDENT)*;
arrayType:		ARRAY expression OF type
				-> ^(ARRAY type expression);
fieldList:		(identList ':' type )?
				-> ^(VAR type? identList?);
recordType:		RECORD fieldList (';' fieldList)* END
				-> ^(RECORD fieldList*);
type:			IDENT | arrayType | recordType;
fPSection:		VAR identList ':' type
				-> ^(REFVAR type identList) |
			identList ':' type
				-> ^(VAR type identList);
formalParameters:	'(' (fPSection (';' fPSection)*)? ')'
				-> ^(PARAMETERS (fPSection (fPSection)*)?);
procedureBody:		BEGIN statementSequence
				-> ^(BODY statementSequence);
procedureDeclaration:	PROCEDURE IDENT ( formalParameters)? ';' declarations (procedureBody)? END IDENT 
				-> ^(PROCEDURE IDENT (formalParameters)? declarations? (procedureBody)?);
constDeclaration:	(CONST (IDENT '=' expression ';')*)
				-> ^(CONST IDENT expression)*;
typeDeclaration:	(TYPE (IDENT '=' type ';')*)
				-> ^(TYPE IDENT type)*;
varDeclarations:	(VAR (identList ':' type ';')*)
				-> ^(VAR type identList)*;
declarations:		constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration ';')*
				-> constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration)*;
moduleBody:		declarations (BEGIN statementSequence)? END
				-> declarations? ^(BODY statementSequence)?;
module:			MODULE IDENT ';' moduleBody IDENT '.' EOF
				-> ^(MODULE IDENT moduleBody);