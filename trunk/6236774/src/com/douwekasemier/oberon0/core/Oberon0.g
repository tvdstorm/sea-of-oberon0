grammar Oberon0;

options {
  language     = Java;
  output       = AST;
  backtrack    = true;
  ASTLabelType = CommonTree;
}

tokens {
  // KEYWORDS
  MODULE     = 'MODULE';
  BEGIN      = 'BEGIN';
  END        = 'END';
  CONST      = 'CONST';
  TYPE       = 'TYPE';
  VAR        = 'VAR';
  ARRAY      = 'ARRAY';
  RECORD     = 'RECORD';
  PROCEDURE  = 'PROCEDURE';
  WHILE      = 'WHILE';
  IF         = 'IF';
  THEN       = 'THEN';
  ELSIF      = 'ELSIF';
  ELSE       = 'ELSE';
  WITH       = 'WITH';
  EQUALS     = '=';
  NOT_EQUALS = '#';
  GT         = '>';
  GTE        = '>=';
  LT         = '<';
  LTE        = '<=';
  PLUS       = '+';
  MINUS      = '-';
  OR         = 'OR';
  NOT        = '~';
  MULT       = '*';
  DIV        = 'DIV';
  MOD        = 'MOD';
  AND        = '&';
  

  // EXTRA AST KEYWORDS
  ACTUALS;
  ARRAYSELECTOR;
  ASSIGN;
  CALL;
  CONSTANTS;
  DECLARATIONS;
  EXPRESSION;
  FIELD;
  FORMALPARAMETER;
  FORMALPARAMETERS;
  IDENT_SELECT;
  IDENTIFIERS;
  IFSTATEMENT;
  LITERAL;
  MODULEBODY;
  PROCEDUREBODY;
  PROCEDURES;
  RECORDSELECTOR;
  SELECTORS;
  STATEMENTS;
  TYPES;
  VARIABLES;
}

@header {
package com.douwekasemier.oberon0.core;
}

@lexer::header {
package com.douwekasemier.oberon0.core;
}


// DECLARATIONS
module
  : MODULE identifier ';' moduleBody '.' EOF
  -> ^(MODULE identifier moduleBody);

moduleBody
  : declarations (BEGIN statementSequence)? END identifier 
  ->  ^(DECLARATIONS declarations?) ^(STATEMENTS statementSequence?);

declarations
  : constantDeclarations? typeDeclarations? varDeclarations? procedureDeclarations?
  -> ^(CONSTANTS constantDeclarations?) ^(TYPES typeDeclarations?) ^(VARIABLES varDeclarations?) ^(PROCEDURES procedureDeclarations?);

constantDeclarations
  : CONST (identifier '=' expression ';')*
  -> ^(CONST identifier expression)*;

typeDeclarations
  : TYPE (identifier '=' type ';')*
  -> ^(TYPE identifier type)*;

procedureDeclarations
  : (procedureHeading ';' procedureBody ';')*
  -> ^(PROCEDURE procedureHeading procedureBody)*;

procedureHeading
  : PROCEDURE identifier formalParameters?
    -> identifier ^(FORMALPARAMETERS formalParameters?);

formalParameters
  : '(' (fpSection (';' fpSection)*)? ')' 
  -> fpSection+;

fpSection
  : 'VAR'? identifierList ':' type 
  -> ^(FORMALPARAMETER 'VAR'? type identifierList) ;

procedureBody
  : declarations ('BEGIN' statementSequence)? 'END' identifier 
  -> ^(DECLARATIONS declarations?) ^(STATEMENTS statementSequence?);

varDeclarations
  : VAR (identifierList ':' type ';')*
  -> ^(VAR type identifierList)*;


// EXPRESSIONS
expression
  : simpleExpression comparer simpleExpression
  -> ^(comparer simpleExpression simpleExpression)
  | simpleExpression
  -> simpleExpression ;

comparer
  : EQUALS
  | NOT_EQUALS
  | LT
  | LTE
  | GT
  | GTE
  ;

simpleExpression
  : unary^? term (weakops^ term)*
  ;

unary
  : (PLUS | MINUS)
  -> MINUS?
  ;

term
  : factor (strongops^ factor)* ;

factor
  : identifier selectors
  -> ^( IDENT_SELECT identifier ^(SELECTORS selectors?) )
  | literal
  -> literal
  | '(' expression ')'
  -> expression
  | NOT factor
  -> ^(NOT factor) ;

strongops
  : MULT
  | DIV
  | MOD
  | AND ;

weakops
  : PLUS
  | MINUS
  | OR ;

identifier
  : IDENTIFIER ;

identifierList:
  identifier (',' identifier)*
  -> ^(IDENTIFIERS identifier+);

integer
  : INTEGER ;

literal
  : integer ;

subselector
  : '.' identifier 
  -> ^(RECORDSELECTOR identifier)
  | '[' expression ']'
  -> ^(ARRAYSELECTOR expression) ;

selectors
  : (subselector)* ;


// STATEMENTS

statement
  : assignment
  | procedureCall
  | ifStatement
  | whileStatement
  | withStatement ;

assignment
  : identifier selectors ':=' expression
  -> ^( ASSIGN expression ^( IDENT_SELECT identifier ^(SELECTORS selectors?) ) );

ifStatement
  : ifpart elsifpart* elsepart? END
  -> ^(IFSTATEMENT ifpart elsifpart* elsepart?);

ifpart
  : IF expression THEN statementSequence
  -> ^(IF expression ^(STATEMENTS statementSequence));

elsifpart
  : ELSIF expression THEN statementSequence
  -> ^(ELSIF expression ^(STATEMENTS statementSequence));

elsepart
  : ELSE statementSequence
  -> ^(ELSE ^(STATEMENTS statementSequence)) ;

procedureCall
  : identifier actualParameters?
  -> ^(CALL identifier ^(ACTUALS actualParameters?));

actualParameters
  : '(' (expression (',' expression)*)? ')'
  -> expression+;

whileStatement
  : WHILE expression 'DO' statementSequence END
  -> ^(WHILE expression ^(STATEMENTS statementSequence));

withStatement
  : WITH identifier selectors 'DO' statementSequence END
  -> ^( WITH ^( IDENT_SELECT identifier ^(SELECTORS selectors?) ) ^(STATEMENTS statementSequence) );

statementSequence
  : statement (';' statement)*
  -> statement+;

// TYPES

type
  : identifier
  | arrayType
  | recordType ;

arrayType
  : ARRAY expression 'OF' type
  -> ^(ARRAY type expression);

recordType
  : RECORD field (';' field)* 'END'
  -> ^(RECORD field+);

field
  : (identifierList ':' type)?
  -> ^(FIELD type identifierList);


// TOKENS

INTEGER
  : ('0'..'9')+ ;

IDENTIFIER
  : ('a'..'z'|'A'..'Z')
    ('a'..'z'|'A'..'Z'|'0'..'9')* ;

WHITESPACE
  : ( ' ' | '\t' | '\n' | '\r' | '\f' )+
    { $channel = HIDDEN; } ;
