grammar Oberon0;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
    backtrack=true;
//    memoize=true;
}

tokens
{
	MINUS='-';
	PLUS='+';
	TIMES='*';
	DIVIDE='DIV';
	PROCEDURECALL;
	PARAMETERS;
	EXPRESSION;
	BODY;
	LH;
	RH;
	TYPE;
	SELECTOR;
	DOTSELECTOR;
	ARRAYSELECTOR;
	MODULE;
}

@parser::header
{
package randy.grammar;
}

@lexer::header
{
package randy.grammar;
}

IDENT:			('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*; // TODO: moet LETTER (LETTER|DIGIT)* worden
WHITESPACE:		(' '|'\t'|'\r'|'\n')  {$channel = HIDDEN;};
ws:			(WHITESPACE)*;
ident:			IDENT;
INTEGER:		('0'..'9')+;
dotSelector:		'.' ident
				-> ^(DOTSELECTOR ident);
arraySelector:		'[' ws expression ws ']'
				-> ^(ARRAYSELECTOR expression);
selectorPart:		dotSelector | arraySelector;
selector:		ident (selectorPart)+
				-> ^(SELECTOR ident (selectorPart)+) |
			ident
				-> ident;
number:			INTEGER;
factor:			selector | number | '('! ws expression ')'! | '~'^ ws factor; // TODO: kijken of () een extra node nodig heeft of niet
term:			factor ((TIMES|DIVIDE|'MOD'|'&')^ ws factor)*;

simpleExpression
 	:	 (PLUS|MINUS^ ws)? term ((PLUS|MINUS | 'OR')^ ws term)*;

infixOperand:		'=' | '#' | '<' | '<=' | '>' | '>=';
expression:		simpleExpression infixOperand ws simpleExpression ws
				-> ^(infixOperand ^(LH simpleExpression) ^(RH simpleExpression)) |
			simpleExpression
				-> simpleExpression;
actualParameters:	'(' ws (expression (',' ws expression)*)? ')' ws
				-> ^(PARAMETERS expression+);
ifStatement:		'IF' ws expression 'THEN' ws statementSequence ('ELSIF' ws expression 'THEN' ws statementSequence)+ ('ELSE' ws statementSequence) 'END'
				-> ^('IF' ^(EXPRESSION expression) ^(BODY statementSequence) ^('ELSIF' ^(EXPRESSION expression) ^(BODY statementSequence))+ ^('ELSE' ^(BODY statementSequence))) |
			'IF' ws expression 'THEN' ws statementSequence ('ELSIF' ws expression 'THEN' ws statementSequence)+ 'END'
				-> ^('IF' ^(EXPRESSION expression) ^(BODY statementSequence) ^('ELSIF' ^(EXPRESSION expression) ^(BODY statementSequence))+) |
			'IF' ws expression 'THEN' ws statementSequence ('ELSE' ws statementSequence) 'END'
				-> ^('IF' ^(EXPRESSION expression)^(BODY statementSequence)  ^('ELSE' ^(BODY statementSequence))) |
			'IF' ws expression 'THEN' ws statementSequence 'END'
				-> ^('IF' ^(EXPRESSION expression) ^(BODY statementSequence));
whileStatement:		'WHILE' ws expression 'DO' ws statementSequence 'END'
				-> ^('WHILE' ^(EXPRESSION expression) ^(BODY statementSequence));
assignment:		selector ':=' expression
				-> ^(':=' ^(LH selector) ^(RH expression?));
procedureCall:		selector (actualParameters)?
				-> ^(EXPRESSION ^(PROCEDURECALL selector actualParameters?));
statement:		(assignment | procedureCall| ifStatement | whileStatement)?;
statementSequence:	statement (';' ws statement)*
				-> statement (statement)*;
identList:		ident (ws ',' ws ident)*
				-> ident (ident)*;
arrayType:		'ARRAY' ws expression 'OF' ws type
				-> ^('ARRAY' ^(TYPE type) ^(EXPRESSION expression));

fieldList 
	:	 (identList ':' ws type ws)?;
recordType
	:	 'RECORD' ws fieldList (';' ws fieldList)* 'END';
type 	
	:	 ident | arrayType | recordType;
fPSection 
	:	 ('VAR' ws)? identList ':' ws type;
formalParameters 
	:	 '(' ws (fPSection ws (';' ws fPSection)*)? ')';
	
procedureBody:		'BEGIN' ws statementSequence
				-> ^(BODY statementSequence);
procedureDeclaration:	'PROCEDURE' ws ident (ws formalParameters)? ws ';' ws declarations (procedureBody)? 'END' ws ident 
				-> ^('PROCEDURE' ident (formalParameters)? declarations (procedureBody)?);
constDeclaration:	('CONST' ws (ident ws '=' ws expression ';')*)
				-> ^('CONST' (ident '=' expression)*);
typeDeclaration:	('TYPE' ws (ident ws '=' ws type ws ';')*)
				-> ^('TYPE' (ident '=' type)*);
varDeclarations:	('VAR' ws (identList ':' ws type ws ';')*)
				-> ^('VAR' type identList)*;
declarations:		constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration ws ';')*
				-> constDeclaration? typeDeclaration? varDeclarations? (procedureDeclaration)*;
moduleBody:		ws declarations ('BEGIN' ws statementSequence)? 'END'
				-> declarations? ^(BODY statementSequence)?;
module:			'MODULE' ws ident ws ';' moduleBody ws ident ws '.' ws EOF
				-> ^(MODULE ident moduleBody);