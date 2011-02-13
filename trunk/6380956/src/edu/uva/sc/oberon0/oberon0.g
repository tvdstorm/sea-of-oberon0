grammar oberon0;

options {
  language = Java;
  //output=AST;
  //ASTLabelType=CommonTree;
}
@header {
  package edu.uva.sc.oberon0;
  import edu.uva.sc.oberon0.Evaluators.*;
  import edu.uva.sc.oberon0.Evaluators.Boolean.*;
  import edu.uva.sc.oberon0.Evaluators.Numerical.*;
  import java.util.Map;
  import java.util.HashMap;
}

@lexer::header {
  package edu.uva.sc.oberon0;
  import edu.uva.sc.oberon0.Evaluators.*;
  import edu.uva.sc.oberon0.Evaluators.Boolean.*;
  import edu.uva.sc.oberon0.Evaluators.Numerical.*;
}
@members {
  private Map<String, IEvaluator> variables = new HashMap<String, IEvaluator>();
}

INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\n' | '\r' | '\f' | '\t') + {$channel = HIDDEN;};

factor returns [IEvaluator e] 
  : IDENT s=selector 
  {String sel = (s==null)?"":s;
  $e=variables.get($IDENT.text+sel);}
  
  | INTEGER {$e=new IntegerEvaluator(Integer.parseInt($INTEGER.text));} 
  | '(' exp=expression ')' {$e=exp;} 
  | '~' factor;
term returns [IEvaluator e] 
  : 
    arg1=factor {$e=arg1;}
    (
	    '*' arg2=factor {$e=new MultEvaluator(arg1.evaluate(), arg2.evaluate());} 
	    | 'DIV' arg2=factor {$e=new DivEvaluator(arg1.evaluate(), arg2.evaluate());} 
	    | 'MOD' arg2=factor {$e=new ModEvaluator(arg1.evaluate(), arg2.evaluate());} 
	    | '&' arg2=factor {$e=new AndEvaluator(arg1, arg2);} 
    )*;
simpleExpression returns [IEvaluator e] 
  : (
      '+'
      |'-'
     )? 
     arg1=term {$e=arg1;}
     ('+' arg2=term {$e=new AddEvaluator(arg1.evaluate(), arg2.evaluate());} 
     |'-' arg2=term {$e=new MinEvaluator(arg1.evaluate(), arg2.evaluate());} 
     |'OR' arg2=term {$e=new OrEvaluator(arg1, arg2);} 
     )*;
expression returns [IEvaluator e] 
  : arg1=simpleExpression  {$e=arg1;}
    (
      '=' arg2=simpleExpression {$e=new EqualEvaluator(arg1, arg2);} 
	    | '#' arg2=simpleExpression {$e=new NotEqualEvaluator(arg1, arg2);}
	    | '<' arg2=simpleExpression {$e=new SmallerEvaluator(arg1, arg2);}
	    | '<=' arg2=simpleExpression {$e=new SmallerOrEqualEvaluator(arg1, arg2);}
	    | '>' arg2=simpleExpression {$e=new BiggerEvaluator(arg1, arg2);}
	    | '>=' arg2=simpleExpression {$e=new BiggerOrEqualEvaluator(arg1, arg2);}
    )?;
selector returns [String s] 
  : ( 
    '[' exp=expression ']' {$s='['+exp.toString()+']';}
    | '.' IDENT {$s='.'+$IDENT.text;}
  )*; //TODO: .IDENT does not work
assignment
  : IDENT arg1=selector ':=' arg2=expression 
  {String sel = (arg1==null)?"":arg1;
  variables.put($IDENT.text + sel, arg2);};
   
test returns [IEvaluator e] : a=assignment ';' ex=expression {$e=ex;};

actualParameters returns [IEvaluator e] : '(' (expression (',' expression)*)? ')';
procedureCall returns [IEvaluator e] : IDENT (actualParameters)?;
ifStatement returns [IEvaluator e] : 'IF' expression 'THEN' statementSequence
  ('ELSIF' expression 'THEN' statementSequence)*
  ('ELSE' statementSequence)? 'END';
whileStatement returns [IEvaluator e] : 'WHILE' expression 'DO' statementSequence 'END';
statement returns [IEvaluator e] : (assignment | procedureCall | ifStatement | whileStatement)?;
statementSequence returns [IEvaluator e] : statement (';' statement)*;
identList returns [IEvaluator e] : IDENT (',' IDENT)*;
arrayType returns [IEvaluator e] : 'ARRAY' expression 'OF' type;
fieldList returns [IEvaluator e]  :  (identList ':' type)?; 
recordType returns [IEvaluator e] : 'RECORD' fieldList (';' fieldList)* 'END';
type returns [IEvaluator e] : IDENT | arrayType | recordType;
fPSection returns [IEvaluator e]  :  ('VAR')? identList ':' type;

formalParameters returns [IEvaluator e]  :  '(' (fPSection (';' fPSection)*)? ')'; 
procedureHeading returns [IEvaluator e]  :  'PROCEDURE' IDENT (formalParameters)?; 
procedureBody returns [IEvaluator e]  :  declarations ('BEGIN' statementSequence)? 'END'; 
procedureDeclaration returns [IEvaluator e]  :  procedureHeading ';' procedureBody IDENT; 
declarations returns [IEvaluator e]  :  ('CONST' (IDENT '=' expression ';')*)? 
 ('TYPE' (IDENT '=' type ';')*)? 
 ('VAR' (identList ':' type ';')*)? 
 (procedureDeclaration ';')*;
module returns [IEvaluator e]  :  'MODULE' IDENT ';' declarations 
 ('BEGIN' statementSequence)? 'END' IDENT '.';