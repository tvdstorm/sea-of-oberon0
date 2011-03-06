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
  import edu.uva.sc.oberon0.Evaluators.Structural.*;
  import edu.uva.sc.oberon0.Evaluators.Conditional.*;
  import edu.uva.sc.oberon0.Evaluators.Selectors.*;
  import edu.uva.sc.oberon0.Evaluators.Types.*;
  import java.util.List;
  import java.util.LinkedList;
}

@lexer::header {
  package edu.uva.sc.oberon0;
  
}

INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\n' | '\r' | '\f' | '\t') + {$channel = HIDDEN;};

factor returns [IEvaluator e] 
  : IDENT s=selector 
  {$e = new VariableRef($IDENT.text, s);}
  | INTEGER {$e=new Integ($INTEGER);} 
  | '(' exp=expression ')' {$e=exp;} 
  | '~' factor;
  
term returns [IEvaluator e] 
  : 
    arg1=factor {$e=arg1;}
    (
	    '*' arg2=factor {$e=new Mult(arg1, arg2);} 
	    | 'DIV' arg2=factor {$e=new Div(arg1, arg2);} 
	    | 'MOD' arg2=factor {$e=new Mod(arg1, arg2);} 
	    | '&' arg2=factor {$e=new And(arg1, arg2);} 
    )*;
    
simpleExpression returns [IEvaluator e] 
  : (
      '+'
      |'-'
     )? 
     arg1=term {$e=arg1;}
     ('+' arg2=term {$e=new Add(arg1, arg2);} 
     |'-' arg2=term {$e=new Min(arg1, arg2);} 
     |'OR' arg2=term {$e=new Or(arg1, arg2);} 
     )*;
     
expression returns [IEvaluator e] 
  : arg1=simpleExpression  {$e=arg1;}
    (
      '=' arg2=simpleExpression {$e=new Equal(arg1, arg2);} 
	    | '#' arg2=simpleExpression {$e=new NotEqual(arg1, arg2);}
	    | '<' arg2=simpleExpression {$e=new Smaller(arg1, arg2);}
	    | '<=' arg2=simpleExpression {$e=new SmallerOrEqual(arg1, arg2);}
	    | '>' arg2=simpleExpression {$e=new Bigger(arg1, arg2);}
	    | '>=' arg2=simpleExpression {$e=new BiggerOrEqual(arg1, arg2);}
    )?;
    
selector returns [ISelector s] :
  {ISelector result = null;
  } 
  ( 
    '[' exp=expression ']' {
      if(result == null) {
        result = new ArraySelector(exp);
      } else {
        ArraySelector sel = new ArraySelector(exp);
        result.SetBottomChildSelector(sel);
      }
    }
    | '.' IDENT {
      if(result == null) {
        result = new RecordSelector($IDENT.text);
      } else {
        RecordSelector sel = new RecordSelector($IDENT.text);
        result.SetBottomChildSelector(sel);
      }
    }
  )*
  {$s = result;}
  ;
  
  
assignment returns [Assignment a]
  : IDENT sel=selector ':=' exp=expression 
  {$a = new Assignment($IDENT.text, sel, exp);};
  

actualParameters returns [List<IEvaluator> lp] :
{{List<IEvaluator> paramsList = new LinkedList<IEvaluator>();}} 
'(' (
	exp1=expression {paramsList.add(exp1);}
	(',' exp2=expression {paramsList.add(exp2);} )*
)? ')' 
{$lp = paramsList;}
;

procedureCall returns [ProcedureCall pc] : 
IDENT (ap=actualParameters)? 
{$pc=new ProcedureCall($IDENT.text, ap);}
;

ifStatement returns [IfStatement ifs] :
{IfStatement result = new IfStatement();} 
'IF' exp1=expression 'THEN' ss1=statementSequence
{result.SetIfBlock(new SimpleIfStatement(exp1, ss1));}
('ELSIF' exp2=expression 'THEN' ss2=statementSequence
{result.AddElseIf(new SimpleIfStatement(exp2, ss2));}
)*
('ELSE' ss3=statementSequence)? 'END'
{result.SetElseStatements(ss3);
$ifs = result;}
;

whileStatement returns [WhileStatement ws] : 
'WHILE' exp=expression 'DO' ss=statementSequence 'END'
{$ws=new WhileStatement(exp, ss);}
;

withStatement returns [WithStatement ws] :
'WITH' exp=expression 'DO' ss=statementSequence 'END'
{$ws = new WithStatement(exp, ss);}
;

statement returns [IStatement s] : 
( assgn=assignment {$s = assgn;}
| pc=procedureCall {$s = pc;}
| ifs=ifStatement {$s = ifs;}
| wh=whileStatement {$s = wh;}
| with=withStatement {$s = with;}
)?;

statementSequence returns [List<IStatement> ls] :
{List<IStatement> statementsList = new LinkedList<IStatement>();}
s1=statement {statementsList.add(s1);}
(';' s2=statement {if(s2!=null)statementsList.add(s2);})*
{$ls=statementsList;}
;

identList returns [List<String> il] : 
{List<String> idents = new LinkedList<String>();}
i1=IDENT {idents.add(i1.getText());}
(',' i2=IDENT {idents.add(i2.getText());})*
{$il=idents;};

arrayType returns [ArrayType at] : 'ARRAY' exp=expression 'OF' t=type {$at=new ArrayType(exp, t);};

fieldList returns [FieldList fl]  :  
(il=identList ':' t=type)?
{$fl=new FieldList(il, t);}
; 

recordType returns [RecordType rt] : 
{RecordType result = new RecordType();}
'RECORD' 
fl1=fieldList {result.AddFieldList(fl1);}
(';' fl2=fieldList {result.AddFieldList(fl2);} )* 
'END'
{$rt=result;}
;

type returns [IType t] : 
IDENT {$t=new SomeType($IDENT.text);} 
| at=arrayType {$t=at;}
| rt=recordType {$t=rt;}
;

fPSection returns [FormalParametersSection fps]  :  
(byRef='VAR')? il=identList ':' t=type 
{String var = (byRef!=null)?byRef.getText():"NONVAR";
$fps = new FormalParametersSection(il, t, var);
};

formalParameters returns [List<FormalParametersSection> lfps]  :
{List<FormalParametersSection> fpsList = new LinkedList<FormalParametersSection>();}  
'(' (fps1=fPSection { fpsList.add(fps1); }
  (';' fps2=fPSection { fpsList.add(fps2); })*)? 
')'
{$lfps=fpsList;}
; 

procedureHeading returns [ProcedureHeading ph]  :  
'PROCEDURE' IDENT (fp=formalParameters)? {$ph=new ProcedureHeading($IDENT.text, fp);}; 

procedureBody returns [ProcedureBody pb]  :  
d=declarations ('BEGIN' ss=statementSequence)? 'END' 
{ProcedureBody result = new ProcedureBody(d, ss);
  for(IDeclaration decl : d){
    decl.AddToScope(result);
  }
  $pb = result;
}; 

procedureDeclaration returns [ProcedureDeclaration pd]  :  
ph=procedureHeading ';' pb=procedureBody IDENT
{$pd = new ProcedureDeclaration(ph, pb, $IDENT.text);}
; 

declarations returns [List<IDeclaration> dl]  :  
 {List<IDeclaration> declars = new LinkedList<IDeclaration>();}
 ('CONST' (id1=IDENT '=' exp=expression ';' { declars.add(new ConstDeclaration(id1.getText(), exp)); } )*)? 
 ('TYPE' (id2=IDENT '=' t1=type ';' { declars.add(new TypeObjectDeclaration(id2.getText(), t1)); } )*)? 
 ('VAR' (il=identList ':' t2=type ';' { declars.add(new VarDeclaration(il, t2)); } )*)? 
 (pd=procedureDeclaration ';'{ declars.add(pd); })*
 {$dl = declars;}
 ;
 
module returns [Module m]  :  'MODULE' i1=IDENT ';' dl=declarations 
 ('BEGIN' ss=statementSequence)? 'END' i2=IDENT '.'
 {Module result =new Module(i1.getText(), dl, ss);
	 for(IDeclaration decl : dl){
	  decl.AddToScope(result);
	 }
 $m=result;
 }
 ;