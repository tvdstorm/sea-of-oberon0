grammar Oberon0;

options {
  language = Java;
  output=AST;
  backtrack=true;
  ASTLabelType=CommonTree;
}
tokens {
// Keywords
	MODULE = 'MODULE';
	BEGIN = 'BEGIN';
	END = 'END';
  CONST = 'CONST'; 
  TYPE = 'TYPE'; 
  VAR = 'VAR';
  ARRAY = 'ARRAY';
  RECORD = 'RECORD';
  PROCEDURE = 'PROCEDURE';
  WHILE = 'WHILE'; 
  IF = 'IF';
  THEN = 'THEN';
  ELSIF = 'ELSIF';
  ELSE = 'ELSE';
  EQUALS = '=';
  NOT_EQUALS = '#';
  GT = '>';
  GTE = '>=';
  LT = '<';
  LTE = '<=';
  PLUS = '+';
  MINUS = '-';
  OR = 'OR';
  NOT = '~';
  MULT = '*';
  DIV = 'DIV';
  MOD = 'MOD';
  AND = '&';
  CONSTANTS;
  VARIABLES;
  TYPES;
  PROCEDURES;
  MODULEBODY;
  PROCEDUREBODY;
  IDENTIFIERLIST;
  FORMALPARAMETER;
  FORMALPARAMETERS;
  ASSIGN;
  ACTUALPARAMETERS;
  CALL;
  RECORDSELECTOR;
  ARRAYSELECTOR;
  IDENT;
  EXPRESSION;
  LITERAL;
  DECLARATIONS;
  STATEMENTS;
  IFSTATEMENT;
}
@header {
  package com.douwekasemier.oberon0.core; 
}
@lexer::header {
  package com.douwekasemier.oberon0.core;
}

module
  : MODULE identifier ';' moduleBody  '.' EOF
  -> ^(MODULE moduleBody)
  ;
  
moduleBody
  : declarations (BEGIN statementSequence)? END identifier
  -> ^(DECLARATIONS declarations?) statementSequence?
  ;

identifier
  : IDENTIFIER
  ;
  
integer
  : INTEGER
  ;
  
literal
  : integer
  ;
  
subselector
  : '.' identifier
  -> ^(RECORDSELECTOR identifier)
  | '[' expression ']'
	-> ^(ARRAYSELECTOR expression)
  ;
  
selector
  : (subselector)*
  ; 

factor 
  : identifier selector
  -> identifier selector?
  | literal
  -> literal
  | '(' expression ')'
  -> expression
  | NOT factor
  -> ^(NOT factor)
  ;
  
strongops
  : MULT
  | DIV
  | MOD
  | AND
  ;
  
term
  : factor (strongops^ factor)*
  ;

unary
  : PLUS | MINUS
  -> MINUS?
  ;

weakops
  : PLUS
  | MINUS
  | OR
  ;
  
simpleExpression
  : unary^? term (weakops^ term)*
  ;
  
comparer
  : EQUALS | NOT_EQUALS | LT | LTE | GT | GTE
  ;
  
expression
  : simpleExpression comparer simpleExpression
  -> ^(comparer simpleExpression simpleExpression)
  | simpleExpression 
  -> simpleExpression
  ;
  
assignment
  : identifier selector ':=' expression
  -> ^(ASSIGN identifier selector? expression)
  ;
 
actualParameters
  : '(' (expression (',' expression)*)? ')'
  //-> ^(ACTUALPARAMETERS expression+)
  -> expression+
  ;  

procedureCall
  : identifier actualParameters?
  -> ^(CALL identifier actualParameters?)
  ;

ifpart
  : IF expression THEN statementSequence
  -> ^(IF expression statementSequence)
  ;
  
elsifpart
  : ELSIF expression THEN statementSequence
  -> ^(ELSIF expression statementSequence)
  ;

elsepart
  : ELSE statementSequence
  -> ^(ELSE statementSequence)
  ;

ifStatement
  : ifpart
    elsifpart*
    elsepart?
    END
  -> ^(IFSTATEMENT ifpart elsifpart* elsepart? END)
  ;

whileStatement
  : WHILE expression 'DO' statementSequence END
  -> ^(WHILE expression statementSequence)
  ;
  
statement
  : assignment
  | procedureCall
  | ifStatement
  | whileStatement
  ;
  
statementSequence
  : statement (';' statement)*
  -> ^(STATEMENTS (statement)+)
  ;
  
identifierList
  : identifier (',' identifier)*
  -> identifier+
  ;
  
arrayType
  : ARRAY expression 'OF' type
  -> ^(ARRAY type expression)
  ;

field
  : (identifierList ':' type)?
  -> type identifierList
  ; 
  
recordType
  : RECORD field (';' field)* 'END'
  -> ^(RECORD field+)
  ;

type
  : identifier
  | arrayType
  | recordType
  ;  
  
fpSection
  : 'VAR'? identifierList ':' type
  -> ^(FORMALPARAMETER 'VAR'? type ^(IDENTIFIERLIST identifierList) )
  ;
  
formalParameters
  : '(' (fpSection (';' fpSection)*)? ')'
//  -> ^(FORMALPARAMETERS fpSection+)
  -> fpSection+
  ;

procedureHeading
  :  PROCEDURE identifier formalParameters? 
  -> identifier formalParameters?
  ;
    
procedureBody
  :   declarations ('BEGIN' statementSequence)? 'END' identifier
  ->  ^(DECLARATIONS declarations) statementSequence?
  ; 
    
procedureDeclarations
  : procedureHeading ';' procedureBody
  -> ^(PROCEDURE procedureHeading procedureBody)
  ;
  
constantDeclarations
  : CONST (identifier '=' expression ';')*
  -> ^(CONST identifier expression)*
  ;
  
typeDeclarations
  : TYPE (identifier '=' type ';')*
  -> ^(TYPE identifier type)*
  ;
  
varDeclarations
  : VAR (identifierList ':' type ';')*
  -> ^(VAR type identifierList)*
  ;
  
declarations
  : constantDeclarations?
    typeDeclarations?
    varDeclarations? 
    (procedureDeclarations ';')*
 -> constantDeclarations?
    typeDeclarations?
    varDeclarations?
    (procedureDeclarations*)?
  ;
  
 // Reguliere tokens   
INTEGER: ('0'..'9')+;
IDENTIFIER: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;  
WHITESPACE: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};