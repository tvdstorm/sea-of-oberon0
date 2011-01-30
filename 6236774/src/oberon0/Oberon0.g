grammar Oberon0;

options {
  language = Java;
  backtrack = true;
}
@header {
  package oberon0;
}
@lexer::header {
  package oberon0;
}
  
identifier
  : LETTER ( LETTER | DIGIT )*
  ;  
  
integer
  : DIGIT*
  ;
  
selector
  : ('.' identifier | '[' expression ']')*
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
  : simpleExpression (('=' | '#' | '<' | '<=' | '>=' | '>') actualParameters)?
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
  : 'PROCEDURE' identifier formalParameters?
  ;
  
procedureBody
  : 'PROCEDURE' declarations ('BEGIN' statementSequence)? 'END'
  ;
  
procedureDeclarations
  : procedureHeading ';' procedureBody identifier
  ;
  
declarations
  : ('CONST' (identifier '=' expression ';')*)?
    ('TYPE' (identifier '=' type ';')*)?
    ('VAR' (identifierList ':' type ';')*)?
    (procedureDeclarations ';')*
  ;

module
  : 'MODULE' identifier ';' declarations
    ('BEGIN' statementSequence)? 'END' identifier '.'
  ;
    
 /* Tokens */   
DIGIT: '0'..'9';  

LETTER: ('a'..'z' | 'A'..'Z');

WHITESPACE: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};