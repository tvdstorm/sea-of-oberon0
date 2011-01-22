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
    ACTUALPARAMS;
    IFSTATEMENT;
    TILDEFACTOR;
    IDENTIFIER;
    STATEMENT;
    FPSECTION;
    RECFIELDS;
    FIELDLIST;
    IDENTLIST;
    PROCCALL;
    PROCDECL;
    PROCHEAD;
    PROCBODY;
    DOTSELECTOR;
    BRACKETSELECTOR;
    NUMBER;
    VARS;
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
    :   MODULE ident SEMI declarations (BEGIN statementSequence)? END ident DOT ->
        ^(MODULE ident declarations (BEGIN statementSequence)? ident) ; 

identSelector    
    :   ident (selectorRightPart)* ;

selectorRightPart
    :   (DOT ident)         ->  ^(DOTSELECTOR ident)
    |   (LB expression RB)  ->  ^(BRACKETSELECTOR expression) ;

number      
    :   INTEGER 
    -> ^(NUMBER INTEGER);

factor      
    :   identSelector      
    |   number                 
    |   ( LP! expression RP! ) 
    |   (TILDE factor)          -> ^(TILDEFACTOR factor) ;

term    
    :   factor ((MULT^ | DIV^ | MOD^ | AMP^) factor)* ;

simpleExpression 
    :   (PLUS^ | MIN^)? term ((PLUS^ | MIN^ | OR^)+ term)* ;
    
expression 
    :   simpleExpression ((EQ^ | HASH^ | LT^ | LTEQ^ | GT^ | GTEQ^) simpleExpression)? ;
    
actualParameters
    :   LP (expression (COMMA expression)* )? RP 
    ->  ^(ACTUALPARAMS expression+) ;

procedureCall
    :   identSelector actualParameters? 
    ->  ^(PROCCALL identSelector actualParameters?) ;

assignment
    :   identSelector ASSIGN expression 
    ->  ^(ASSIGN identSelector expression) ;
   
ifStatement
    :   IF expression THEN statementSequence elsifStatement* elseStatement? END 
    ->  ^(IFSTATEMENT ^(IF expression statementSequence) elsifStatement* elseStatement?) ;

elsifStatement
    :   ELSIF^ expression THEN! statementSequence ;

elseStatement
    :   ELSE^ statementSequence ;

whileStatement
    :   WHILE^ expression DO! statementSequence END! ; 

statement
    :   (((identSelector ASSIGN expression) => assignment -> ^(STATEMENT assignment)) 
        | procedureCall -> ^(STATEMENT procedureCall)
        | ifStatement -> ^(STATEMENT ifStatement)
        | whileStatement -> ^(STATEMENT whileStatement))? ;
        
statementSequence
    :   statement (SEMI statement)* 
    ->  ^(STATEMENTSEQ ^(statement)+) ;
    
identList
    :   ident (COMMA ident)* 
    ->  ^(IDENTLIST ^(ident)+) ; 
    
fieldList
    :   (identList SEMI type)? 
    ->  ^(FIELDLIST identList type)? ;

type
    :   ident -> ^(TYPE ident)
    |   arrayType -> ^(TYPE arrayType) 
    |   recordType -> ^(TYPE recordType) ;
    
fpSection
    :   VAR? identList COLON type 
    ->  ^(FPSECTION identList type) ;
    
formalParameters
    :   LP (fpSection (SEMI fpSection)* )? RP 
    ->  ^(FORMALPARAMS fpSection*) ;

procedureHeading
    :   PROCEDURE ident (formalParameters)? 
    ->  ^(PROCHEAD ident formalParameters?) ;
    
procedureBody
    :   declarations (BEGIN statementSequence)? END ident 
    ->  ^(PROCBODY declarations statementSequence? ident) ;
    
procedureDeclaration
    :   procedureHeading SEMI procedureBody 
    -> ^(PROCDECL procedureHeading procedureBody) ;

declarations
    :   constDecls? typeDecls? varDecls? (procedureDeclaration SEMI)* 
    -> ^(DECLARATIONS constDecls? typeDecls? varDecls? (procedureDeclaration)*) ; 

constDecls
    :   CONST (ident EQ expression SEMI)* 
    ->  ^(CONST ^(ident expression)*) ;

typeDecls
    :   TYPE (ident EQ type SEMI)* 
    ->  ^(TYPE ^(ident type)*) ;
 
varDecls
    :   VAR (identList COLON type SEMI)* 
    ->  ^(VARS ^(VAR identList type)*) ;   

recordType
    :   RECORD fieldList (SEMI fieldList)* END
    ->  ^(RECORD fieldList ^(RECFIELDS fieldList)*) ;
     
arrayType
    :   ARRAY expression OF type 
    ->  ^(ARRAY expression type) ;
    
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
  
ident
    :   IDENT
    ->  ^(IDENTIFIER IDENT);
    
IDENT       
    :   LETTER (LETTER |DIGIT)* ;

INTEGER     
    :   DIGIT+ ; 
    