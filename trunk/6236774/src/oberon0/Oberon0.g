grammar Oberon0;

options {
  language = Java;
}
@header {
  package oberon0;
}
@lexer::header {
  package oberon0;
}

module
  : 'MODULE' identifier ';' declarations
    ('BEGIN' statementSequence)? 'END' identifier '.'
  ;
    
identifier
  : IDENTIFIER
  ;
  
integer
  : INTEGER
  ;
  
selector
  : ('.' identifier | '[' expression ']')*
  | identifier
  ; 

factor 
  : identifier selector
  | integer
  | '(' expression ')'
  | '~' factor
  ;
  
term
  : factor (('*' | 'DIV' | 'MOD' | '&' ) factor)*
  ;
  
simpleExpression
  : ('+'|'-')? term (('+' | '-' | 'OR' ) term)*
  ;
  
expression
  : simpleExpression (('=' | '#' | '<' | '<=' | '>=' | '>') simpleExpression)?
  ;
  
assignment
  : identifier selector ':=' expression
  ;

actualParameters
  : '(' (expression (',' expression)*)? ')'
  ;  

procedureCall
  : identifier actualParameters?
  ;
  
ifStatement
  : 'IF' expression 'THEN' statementSequence
    ( 'ELSIF' expression 'THEN' statementSequence)*
    ( 'ELSE' statementSequence )?
    'END' 
  ;

whileStatement
  : 'WHILE' expression 'DO' statementSequence 'END'
  ;
  
statement
  : assignment
  | procedureCall
  | ifStatement
  | whileStatement
  ;
  
statementSequence
  : statement (';' statement)*
  ;
  
identifierList
  : identifier (',' identifier)*
  ;
  
arrayType
  : 'ARRAY' expression 'OF' type
  ;

fieldList
  : (identifierList ':' type)?
  ;
  
recordType
  : 'RECORD' fieldList (';' fieldList)* 'END'
  ;

type
  : identifier
  | arrayType
  | recordType
  ;  
  
fpSection
  : 'VAR'? identifierList ':' type
  ;
  
formalParameters
  : '(' (fpSection (';' fpSection)*)? ')'
  ;

procedureHeading
  :  'PROCEDURE' identifier formalParameters? 
  ;
    
procedureBody
  :   declarations ('BEGIN' statementSequence)? 'END'
  ; 
    
procedureDeclarations
  : procedureHeading ';' procedureBody
  ;
  
declarations
  : ('CONST' (identifier '=' expression ';')*)?
    ('TYPE' (identifier '=' type ';')*)?
    ('VAR' (identifierList ':' type ';')*)?
    (procedureDeclarations ';')*
  ;
  
 /* Tokens */   
INTEGER: ('0'..'9')+;
IDENTIFIER : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;  
WHITESPACE: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
  