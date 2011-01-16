grammar oberon;

options {
  language = Java;
  output = AST;
  //ASTLabelType = CommonTree;
}

tokens {
    DECLARATIONS;
    PROCEDUREDECL;
}

@header {
package language.parser;
}

@lexer::header {
package language.parser;
}


//FRAGMENTS
fragment LETTER  :   ('a'..'z') | ('A'..'Z');
fragment DIGIT   :   ('0'..'9') ;
DOT     :   '.' ;
COMMA   :   ',' ;
LB      :   '[' ;
RB      :   ']' ;
LP      :   '(' ;
RP      :   ')' ;
SEMI    :   ';' ;
COLON   :   ':' ;
QT      :   '"' ;
TILDE   :   '~' ;
MULT    :   '*' ;
AMP     :   '&' ;
EQ      :   '=' ;
PLUS    :   '+' ;
MIN     :   '-' ;
LT      :   '<' ;
GT      :   '>' ;
HASH    :   '#' ;
LTEQ    :   '<=';
GTEQ    :   '>=';
ASSIGN  :   ':=';

// RESERVED KEYWORDS
BEGIN       :   'BEGIN';
END         :   'END';
DIV         :   'DIV';
MOD         :   'MOD';
AND         :   'AND';   // NODIG?
OR          :   'OR';
IF          :   'IF';
THEN        :   'THEN';
ELSE        :   'ELSE';
ELSIF       :   'ELSIF';
WHILE       :   'WHILE';
DO          :   'DO';
ARRAY       :   'ARRAY';
OF          :   'OF';
VAR         :   'VAR';
CONST       :   'CONST';
TYPE        :   'TYPE';
MODULE      :   'MODULE';
RECORD      :   'RECORD';
PROCEDURE   :   'PROCEDURE';

root
    : module EOF!;

module
    :   MODULE^ IDENT SEMI! declarations
        (BEGIN statementSequence)? END IDENT DOT!; 

selector    
    :   ((DOT IDENT) | (LB! expression RB!) )* ;

number      
    :   INTEGER ;

factor      
    :   (IDENT selector) | number | ( LP! expression RP! ) | (TILDE^ factor) ;

term    
    :   factor ((MULT^ | DIV^ | MOD^ | AMP^) factor)* ;

simpleExpression 
    :   (PLUS^ | MIN^)? term ((PLUS^ | MIN^ | OR^)+ term)* ;

expression
    :   simpleExpression ((EQ^ | HASH^ | LT^ | LTEQ^ | GT^ | GTEQ^) simpleExpression)? ;
    
actualParameters
    :   LP! (expression (COMMA! expression)* )? RP! ;

procedureCall
    :   IDENT selector actualParameters? ;

assignment
    :   IDENT selector ASSIGN^ expression ;
    
ifStatement
    :   IF^ expression THEN statementSequence
        (ELSIF expression THEN statementSequence)*
        (ELSE statementSequence)? END ;

whileStatement
    :   WHILE^ expression DO statementSequence END! ; 

statement
    :
        (((IDENT selector ASSIGN expression) => assignment) | procedureCall | ifStatement | whileStatement )? ;
        
statementSequence
    :   statement (SEMI! statement)* ;
    
identList
    :   IDENT (COMMA! IDENT)* ; 
    
arrayType
    :   ARRAY^ expression OF! type ;
    
fieldList
    :   (identList SEMI! type)? ;
    
recordType
    :   RECORD^ fieldList (SEMI! fieldList)* END! ;

type
    :   IDENT | arrayType | recordType ;
    
fpSection
    :   VAR? identList COLON type ;
    
formalParameters
    :   LP! (fpSection (SEMI! fpSection)* )? RP! ;

procedureHeading
    :   PROCEDURE IDENT (formalParameters)? ;
    
procedureBody
    :   declarations (BEGIN statementSequence)? END IDENT ;
    
procedureDeclaration
    :   procedureHeading SEMI procedureBody ->
        PROCEDUREDECL procedureHeading procedureBody ;

declarations
    :   constDecls? 
        typeDecls?
        varDecls?
        (procedureDeclaration SEMI!)* ; 

constDecls
    :   CONST^ (IDENT EQ expression SEMI!)* ;

typeDecls
    :   TYPE^ (IDENT EQ type SEMI!)* ;
 
varDecls
    :   VAR^ (identList COLON! type SEMI!)* ;   
 
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
  
IDENT       
    :   LETTER (LETTER |DIGIT)* ;

INTEGER     
    :   DIGIT+ ; 
    