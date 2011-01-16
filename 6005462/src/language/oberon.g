grammar oberon;

options {
  language = Java;
  output = AST;
  //ASTLabelType = CommonTree;
}

tokens {
    DECLARATIONS;
    FORMALPARAMS;
    STATEMENTSEQ;
    FPSECTION;
    RECFIELDS;
    FIELDLIST;
    IDENTLIST;
    PROCDECL;
    PROCHEAD;
    PROCBODY;
    VARS;
    TYPE;
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

//LEESTEKENS
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
    :   MODULE IDENT SEMI declarations (BEGIN statementSequence)? END IDENT DOT ->
        ^(MODULE IDENT declarations (BEGIN statementSequence)? IDENT)
    ; 

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
    :   statement (SEMI statement)* 
    ->  ^(STATEMENTSEQ ^(statement)+);
    
identList
    :   IDENT (COMMA IDENT)* 
    ->  ^(IDENTLIST ^(IDENT)+); 
    
fieldList
    :   (identList SEMI type)? 
    ->  ^(FIELDLIST identList type)?;

type
    :   IDENT -> ^(TYPE IDENT)
    |   arrayType -> ^(TYPE arrayType) 
    |   recordType -> ^(TYPE recordType) ;
    
fpSection
    :   VAR? identList COLON type 
    ->  ^(FPSECTION identList type);
    
formalParameters
    :   LP (fpSection (SEMI fpSection)* )? RP 
    ->  ^(FORMALPARAMS fpSection*);

procedureHeading
    :   PROCEDURE IDENT (formalParameters)? 
    ->  ^(PROCHEAD IDENT formalParameters?) ;
    
procedureBody
    :   declarations (BEGIN statementSequence)? END IDENT 
    ->  ^(PROCBODY declarations statementSequence? IDENT) ;
    
procedureDeclaration
    :   procedureHeading SEMI procedureBody 
    -> ^(PROCDECL procedureHeading procedureBody) ;

declarations
    :   constDecls? typeDecls? varDecls? (procedureDeclaration SEMI)* 
    -> ^(DECLARATIONS constDecls? typeDecls? varDecls? (procedureDeclaration)*); 

constDecls
    :   CONST (IDENT EQ expression SEMI)* 
    ->  ^(CONST ^(IDENT expression)*);

typeDecls
    :   TYPE (IDENT EQ type SEMI)* 
    ->  ^(TYPE ^(IDENT type)*);
 
varDecls
    :   VAR (identList COLON type SEMI)* 
    ->  ^(VARS ^(VAR identList type)*);   

recordType
    :   RECORD fieldList (SEMI fieldList)* END
    ->  ^(RECORD fieldList ^(RECFIELDS fieldList)*);
     
arrayType
    :   ARRAY expression OF type 
    ->  ^(ARRAY expression type);
    
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
    