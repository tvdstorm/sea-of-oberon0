grammar Oberon0;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  NEGATION;
  STATEMENTS;
  PARAMS;
  ARR_SEL; 
  VAR_SEL;
}

/////////////////////////////////////////////////////////////////
//CONTEXT-FREE SYNTAX
/////////////////////////////////////////////////////////////////
@header {
  package oberon0;
  import oberon0.exception.*;
}

@lexer::header {
  package oberon0;
}

/////////////////////////////////////////////////////////////////
//PROGRAM
/////////////////////////////////////////////////////////////////
program
  : module
  ;


/////////////////////////////////////////////////////////////////
//MODULE
/////////////////////////////////////////////////////////////////
module
  : 'MODULE'^ id1=IDENT ';'! 
     declarations 
     (beginBlock)? 
    'END'! id2=IDENT! '.'!
    { 
      if (!$id1.text.equals($id2.text)) {
        throw new MissingModuleClosureStatementException();
      }
       
    }
  ;
  catch [MissingModuleClosureStatementException e] {}

fragment beginBlock:begin^ statementSequence;
fragment begin:'BEGIN'->STATEMENTS;
 
 
/////////////////////////////////////////////////////////////////
//DECLERATIONS
/////////////////////////////////////////////////////////////////
declarations
  : (constantBlock)? 
    (typeBlock)? 
    (variableBlock)? 
    (procedureDeclaration ';'!)*
  ;

fragment constantBlock:'CONST'^ constantDecleration*;  
fragment typeBlock:'TYPE'^ typeDecleration*;
fragment variableBlock:'VAR'^ variableDecleration*;
  

//CONSTANT DECLERATION
constantDecleration
  : IDENT^ '='! expression ';'!
  ;

//TYPE DECLERATION
typeDecleration
  : IDENT^ '='! type ';'!
  ;


//VARIABLE DECLERATION
variableDecleration
  : identList ':'^ type ';'!
  ;


//PROCEDURE DECLERATION
procedureDeclaration
  : ident1=procedureHeading^ ';'! procedureBody IDENT!
   { if (ident1.equals($IDENT.text)) {
        throw new MissingProcedureClosureStatementException();
      }
    }
  ;
  catch [MissingProcedureClosureStatementException e] { 
    System.err.println("Missing closure statement for procedure " + ident1 + ";");
  }

fragment procedureHeading returns [String ident]: 'PROCEDURE'^ IDENT (formalParameters)? {$ident = $IDENT.text;};
fragment procedureBody: declarations (beginBlock)? 'END'!;

fragment fpSection: ('VAR'^)? typedIdentList;
fragment typedIdentList:  identList ':'^ type;
  
fragment formalParameters: formalParametersStart^ (fpSection (';'! fpSection)* )? ')'!;
fragment formalParametersStart: '('->PARAMS;


/////////////////////////////////////////////////////////////////
//EXPRESSIONS
/////////////////////////////////////////////////////////////////
expression
  : simpleExpression (('='^|'#'^|'<'^|'<='^|'>'^|'>='^) simpleExpression)?
  ;
 
fragment simpleExpression: (negation^|'+'!)? term (('+'^|'-'^|'OR'^) term)*;
fragment negation: '-' -> NEGATION;
fragment term: factor (('*'^|'DIV'^|'MOD'^|'&'^) factor)*;
fragment factor: (IDENT selector | INTEGER  | '('! expression ')'! | '~'^ factor);

fragment selector: (attrSelector^ IDENT | arrSelector^ expression ']'!)*;

fragment arrSelector: '['->ARR_SEL;
fragment attrSelector: '.'->VAR_SEL;

//STATEMENTS
statement
  : (assignment
    |procedureCall
    |ifStatement
    |whileStatement
    )?
  ;  

//ASSIGNMENT
assignment 
  : IDENT selector ':='^ expression
  ;

//PROCEDURE CALL
procedureCall
  : IDENT^ (actualParameters)?
  ;

fragment actualParameters: '('! (expression (','! expression)*)? ')'!;

//IF STATEMENT
ifStatement
  : 'IF'^ expression thenStatments elsifStatement* elseStatement? 'END'!
  ;
  
fragment thenStatments: 'THEN'^ statementSequence;
fragment elsifStatement: 'ELSIF'^ expression thenStatments;
fragment elseStatement: 'ELSE'^ statementSequence; 
 
//WHILE STATEMENT
whileStatement
  : 'WHILE'^ expression doStatements 'END'!
  ;

fragment doStatements:'DO'^ statementSequence; 


fragment statementSequence: statement (';'! statement)*;


/////////////////////////////////////////////////////////////////
//TYPES
/////////////////////////////////////////////////////////////////
type
  : IDENT 
  | arrayType 
  | recordType
  | 'INTEGER'^
  ;


//NAMED TYPE
identList
  : IDENT (','! IDENT)*
  ;
 
//ARRAY TYPE  
arrayType
  : 'ARRAY'^ expression 'OF'! type
  ;

   
//RECORD TYPE
recordType
  : 'RECORD'^ fieldList (';'! fieldList)* 'END'!
  ;

fragment fieldList: (identList ':'! type)?;
  
  
/////////////////////////////////////////////////////////////////
//LEXICAL SYNTAX
/////////////////////////////////////////////////////////////////

WS  
  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
  ;

IDENT 
  :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INTEGER
  : '0' 
  | '1'..'9' DIGITS*
  ;
  
fragment DIGITS
  : ('0'..'9')+
  ;

