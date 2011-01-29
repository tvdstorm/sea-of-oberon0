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
	TRUE='TRUE';
	FALSE='FALSE';
	NIL='NIL';
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
	POINTERTO='POINTER TO';
	MOD='MOD';
	AND='&';
	OR='OR';
	ASSIGNMENT=':=';
	EQUALS='=';
	NOTEQUALS='#';
	SMALLERTHEN='<';
	GREATERTHEN='>';
	SMALLEREQUALS='<=';
	GREATEREQUALS='>=';
	NOT='~';
	REFVAR;
	PROCEDURECALL;
	PARAMETERS;
	EXPRESSION;
	BODY;
	LH;
	RH;
	TYPE;
	DOTSELECTOR='.';
	ARRAYSELECTOR='[';
}

@parser::header
{
package randy.generated.antlr;
}

@lexer::header
{
package randy.generated.antlr;
}

IDENT:			('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*; // TODO: moet LETTER (LETTER|DIGIT)* worden
WHITESPACE:		(' '|'\t'|'\r'|'\n') { skip(); };
ws:			(WHITESPACE)*;
ident:			IDENT;
INTEGER:		('0'..'9')+;
selector:		ident ((DOTSELECTOR^ ident)|(ARRAYSELECTOR^ expression ']'!))+ | ident;
numberLiteral:		INTEGER;
booleanLiteral:		TRUE|FALSE;
factor:			selector | NIL | booleanLiteral | numberLiteral | '('! expression ')'! | NOT^ factor;
term:			factor ((TIMES|DIVIDE|MOD|AND)^ factor)*;
simpleExpression:	(PLUS|MINUS^ )? term ((PLUS|MINUS |OR)^ term)*;
infixOperand:		EQUALS | NOTEQUALS | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS;
expression:		simpleExpression infixOperand simpleExpression 
				-> ^(infixOperand simpleExpression simpleExpression) |
			simpleExpression
				-> simpleExpression;
actualParameters:	'(' (expression (',' expression)*)? ')'
				-> (expression (expression)*)?;
ifStatement:		IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ (ELSE statementSequence) END
				-> ^(IF ^(EXPRESSION expression) ^(BODY statementSequence) ^(ELSIF ^(EXPRESSION expression) ^(BODY statementSequence))+ ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence (ELSIF expression THEN statementSequence)+ END
				-> ^(IF ^(EXPRESSION expression) ^(BODY statementSequence) ^(ELSIF ^(EXPRESSION expression) ^(BODY statementSequence))+) |
			IF expression THEN statementSequence (ELSE statementSequence) END
				-> ^(IF ^(EXPRESSION expression)^(BODY statementSequence) ^(ELSE ^(BODY statementSequence))) |
			IF expression THEN statementSequence END
				-> ^(IF ^(EXPRESSION expression) ^(BODY statementSequence));
whileStatement:		WHILE expression DO statementSequence END
				-> ^(WHILE ^(EXPRESSION expression) ^(BODY statementSequence));
assignment:		selector ASSIGNMENT expression
				-> ^(ASSIGNMENT ^(LH selector) ^(RH expression));
procedureCall:		selector (actualParameters)?
				-> ^(EXPRESSION ^(PROCEDURECALL selector actualParameters?));
statement:		(assignment | procedureCall| ifStatement | whileStatement)?;
statementSequence:	statement (';' statement)*
				-> statement (statement)*;
identList:		ident ( ',' ident)*
				-> ident (ident)*;
arrayType:		ARRAY expression OF type
				-> ^(ARRAY ^(TYPE type) ^(EXPRESSION expression));
fieldList:		(identList ':' type )?
				-> ^(VAR type? identList?);
recordType:		RECORD fieldList (';' fieldList)* END
				-> ^(RECORD fieldList*);
pointerType:		POINTERTO ident
				-> ^(POINTERTO ident);
type:			ident | arrayType | recordType | pointerType;
fPSection:		VAR identList ':' type
				-> ^(REFVAR type identList) |
			identList ':' type
				-> ^(VAR type identList);
formalParameters:	'(' (fPSection (';' fPSection)*)? ')'
				-> ^(PARAMETERS (fPSection (fPSection)*)?);
procedureBody:		BEGIN statementSequence
				-> ^(BODY statementSequence);
procedureDeclaration:	PROCEDURE ident ( formalParameters)? ';' declarations (procedureBody)? END ident 
				-> ^(PROCEDURE ident (formalParameters)? declarations? (procedureBody)?);
constDeclaration:	(CONST (ident '=' expression ';')*)
				-> ^(CONST ident expression)*;
typeDeclaration:	(TYPE (ident '=' type ';')*)
				-> ^(TYPE ident type)*;
varDeclarations:	(VAR (identList ':' type ';')*)
				-> ^(VAR type identList)*;
declarations:		constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration ';')*
				-> constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration)*;
moduleBody:		declarations (BEGIN statementSequence)? END
				-> declarations? ^(BODY statementSequence)?;
module:			MODULE ident ';' moduleBody ident '.' EOF
				-> ^(MODULE ident moduleBody);