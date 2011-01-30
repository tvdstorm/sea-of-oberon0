grammar Oberon;
options {output=AST;}
tokens
{
MODULE;
CONST;
VAR;
VARREF;
PROCEDURE;
BODY;
EXIT;
RETURN;
}
@header
{
package Parser;
}
@lexer::header
{
package Parser;
}

IF	:	'IF';
THEN	:	'THEN';
ELSE	:	'ELSE';
ELSIF   :   	'ELSIF';
END	:	'END';
WHILE	:	'WHILE';

EQUAL	:	'=';
UNEQUAL	:	'#';
LESS	:	'<';
LESS_EQUAL
	:	'<=';
GREAT	:	'>';
GREAT_EQUAL
	:	'>=';

MIN	:	'-';
PLUS	:	'+';
MUL	:	'*';
DIV	:	'DIV';
MOD	:	'MOD';

AND	:	'&';
OR	:	'OR';
NOT	:	'~';

DECLARATIONS
	:	'DECLARATIONS';
INPUTVARS
	:	'INPUTVARS';
CALL	:	'CALL';
CALL_READ
	:	'Read';
CALL_WRITE
	:	'Write';
CALL_WRITELN
	:	'WriteLn';
CALLVARS
	:	'CALLVARS';
CONST	:	'CONST';
VAR	:	'VAR';
ASSIGN	:	':=';

INT_TYPE:	'INTEGER';
ARRAY	:	'ARRAY';


module  :	'MODULE' ID ';'
		declarations
		'BEGIN'
		statements
		'END' ID '.'
	->	^(MODULE ID declarations ^(BODY statements));

declarations		
	:	declaration*
	->	^(DECLARATIONS declaration*);
		
declaration		
	:	constDeclaration|varDeclaration|procedure;
	
constDeclaration	
	:	'CONST' (ID '=' expression ';')
	->	^(CONST ID expression);

varDeclaration
	:	'VAR' (idList ':' type ';')*
	->	^(VAR idList type)*;

procedure
	:	'PROCEDURE' ID procedureVars? ';'
		declarations
		'BEGIN'
		statements
		'END' ID ';'
	->	^(PROCEDURE ID procedureVars? ^(BODY declarations statements));

procedureVars
	:	'(' procedureVar (';' procedureVar)* ')'
	->	^(INPUTVARS procedureVar*);
			
procedureVar
	:	procedureVarRef|procedureVarNonRef;
procedureVarRef
	:	'VAR' idList ':' type -> ^(VARREF idList type);
procedureVarNonRef
	:	idList ':' type -> ^(VAR idList type);

procedureCall
    	:   	(CALL_READ|CALL_WRITE|CALL_WRITELN|id) ('(' (expression (',' expression)* )? ')')?
    	->	^(CALL CALL_READ? CALL_WRITE? CALL_WRITELN? id? ^(CALLVARS expression*)?);

type	:	arrayType|INT_TYPE;

arrayType
	:	ARRAY expression 'OF'! type;

number	:	INT;
    
factor 	:   	id | number | ('('! expression ')'!) | (NOT^ factor);

term    :   	factor ((MUL^|DIV^|MOD^|AND^) factor)* ;

base 
    	:   	(MIN^|PLUS^)? term ((MIN^|PLUS^|OR^)+ term)* ;

expression
    	:  	 base ((EQUAL^|UNEQUAL^|LESS^|LESS_EQUAL^|GREAT^|GREAT_EQUAL^) base)?;
    
statements
	:	statement (';'! statement)*;

statement
   	:	(((id ASSIGN expression) => assignment) | procedureCall | ifStatement | whileStatement )? ;
        
assignment 
	:	id ASSIGN^ expression;

ifStatement
    	:   	IF^ expression ifThen (ifElsIf)* (ifElse)? END!;
ifThen	:	'THEN' statements
	-> 	^(THEN statements);
ifElsIf	:	'ELSIF' expression ifThen
	->	^(ELSIF expression ifThen);
ifElse	:	'ELSE' statements
	->	^(ELSE statements);
		
whileStatement  
	:	'WHILE' expression 'DO' statements 'END'
	->	^(WHILE expression ^(BODY statements));

idList	:	ID (','! ID)*;
id	:	ID^ idSelector;
idSelector
    	:   	(('.' ID) | ('['! expression ']'!))*;

ID  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INT  	:	('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+;
WHITESPACE
       :       ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;
