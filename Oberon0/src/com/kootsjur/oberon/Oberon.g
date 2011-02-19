grammar Oberon;

options {
  language = Java;
}

@header {
  package com.kootsjur.oberon.parser;
  import com.kootsjur.oberon.*;
  import com.kootsjur.oberon.statement.*;
  import com.kootsjur.oberon.environment.*;
  import com.kootsjur.oberon.evaluator.*;
  import com.kootsjur.oberon.declaration.*; 
  import com.kootsjur.oberon.declaration.constant.*;
  import com.kootsjur.oberon.declaration.formalparameter.*;
  import com.kootsjur.oberon.declaration.procedure.*;
  import com.kootsjur.oberon.declaration.type.*;
  import com.kootsjur.oberon.declaration.var.*;
  import com.kootsjur.oberon.type.*;
}

@lexer::header {
  package com.kootsjur.oberon.parser;
} 

@members{
	public Module module;
}
 
module returns [Module m]:	'MODULE' ident1=ident';'{$m = new Module($ident1.text);} 
				 declarations {$m.setDeclarations($declarations.ld);} 
				(procedure';' {$m.addProcedure($procedure.p);})*
				('BEGIN' statementSequence {$m.setStatementSequence($statementSequence.s);})? 'END' ident '.';	

declarations returns [List<Declaration> ld]
	:	{$ld = new ArrayList<Declaration>();}
		(constantDeclaration {$ld.addAll($constantDeclaration.lcd);})*
		(typeDeclaration {$ld.addAll($typeDeclaration.ltd);})*	
		(varDeclaration {$ld.addAll($varDeclaration.lvd);})* 
		;
 	 	
constantDeclaration returns [List<ConstantDeclaration> lcd]
	:'CONST' {$lcd = new ArrayList<ConstantDeclaration>();} (ident '=' expression ';' {$lcd.add(new ConstantDeclaration($ident.text, $expression.e));})+ ;
	
typeDeclaration  returns [List<TypeDeclaration> ltd]
	:	'TYPE' {$ltd = new ArrayList<TypeDeclaration>();} (ident '=' type ';' {$ltd.add(new TypeDeclaration($ident.text, $type.t));})+;
	
varDeclaration returns [List<VarDeclaration> lvd]
	: 'VAR' {$lvd = new ArrayList<VarDeclaration>();} (identList ':' type ';' {lvd.add(new VarDeclaration($identList.i, $type.t));})+;	
	
identList returns [IdentList i] 
	:  {$i = new IdentList();}	ident1=ident {$i.add($ident1.text);}(','ident2=ident {$i.add($ident2.text);})*;				
		
procedure returns [ProcedureDeclaration p] 
	:	procedureHeading ';' procedureBody {$p = new ProcedureDeclaration($procedureHeading.ph, $procedureBody.pb);};
	
procedureBody returns [ProcedureBody pb]
	: {$pb = new ProcedureBody();}	
	   declarations {$pb.setDeclarations($declarations.ld);} 
	   (procedure';' {$pb.addProcedure($procedure.p);})*
	   ('BEGIN' statementSequence {$pb.setStatementSequence($statementSequence.s);})? 'END' ident;	

procedureHeading returns [ProcedureHeading ph]
	:	'PROCEDURE'ident {$ph = new ProcedureHeading($ident.text);}(formalParameters) {$ph.setFormalParameters($formalParameters.fp);};
	
formalParameters returns [FormalParameters fp] 
	:	{$fp = new FormalParameters();}'('(fPSection1=fPSection {$fp.add($fPSection1.fps);} (';'fPSection2=fPSection {$fp.add($fPSection2.fps);})*)?')';	
	 
fPSection returns [FPSection fps]
	: {String paramDirection = "IN";}	
	('VAR' {paramDirection = "INOUT";})? identList':'type {$fps = new FPSection($identList.i, $type.t, ParameterDirection.valueOf(paramDirection));};
	
type returns [TypeDefinition t]	:	ident {$t = new UserType($ident.text);}
									|arrayType {$t = $arrayType.a;}
									|recordType {$t = $recordType.r;}
									|integerType {$t = $integerType.i;} 
									|boolType {$t = $boolType.b;}
									;
									
boolType returns [BoolType b] : 'BOOL' {$b = new BoolType();};		  							

integerType returns [IntegerType i] : 'INTEGER' {$i = new IntegerType();};									

recordType returns [RecordType r]
	: {List<FieldList> fl = new ArrayList<FieldList>();}'RECORD' fieldList1=fieldList {fl.add($fieldList1.f);}(';'fieldList2=fieldList{fl.add($fieldList2.f);})* 'END' {$r = new RecordType(fl);};
	
fieldList returns [FieldList f]
	:	(identList':'type {$f = new FieldList($identList.i, $type.t);})?;
	
arrayType returns [ArrayType a]
	:	'ARRAY' expression 'OF' type {$a = new ArrayType($expression.e, $type.t);};
		
statementSequence returns [StatementSequence s]
	: {$s = new StatementSequence();}	statement1=statement{$s.add($statement1.s);}(';'statement2=statement{$s.add($statement2.s);})*;
	
statement returns [Statement s]
	:	{boolean bracket = false;} ((ident ((actualParameters) {$s = new ProcedureCall($ident.text, $actualParameters.a);}
							| {bracket = true;}(bracketSelector)? ':=' expression {$s = new Assignment($ident.text,$expression.e); 
																						if(bracket)((Assignment)$s).setSelector( $bracketSelector.b);
																					}))
		|ifStatement {$s = $ifStatement.i;}
		|whileStatement {$s = $whileStatement.w;})?;
	//(ident (selector)?((actualParameters)?|':='expression)
	//(ident ((dotSelector)?(actualParameters)|(bracketSelector)?':='expression)
whileStatement returns [WhileStatement w]
	:	'WHILE' expression 'DO' statementSequence 'END' {$w = new WhileStatement($expression.e, $statementSequence.s);};	
	
ifStatement returns [IfStatement i]
	:	'IF' expression1=expression 'THEN' statementSequence1=statementSequence {$i = new IfStatement($expression1.e, $statementSequence1.s);}
						('ELSEIF' expression2=expression 'THEN' statementSequence2=statementSequence {$i.addElseIfStatement(new IfStatement($expression2.e, $statementSequence2.s));})*
		 ('ELSE' statementSequence3=statementSequence {$i.setElseStatementSequence($statementSequence3.s);})? 'END';
		 
procedureCall
	:	ident (selector)?(actualParameters); 
	
assignment
	:	ident (selector)?':='expression;  
		
actualParameters returns [ActualParameters a]
	: {$a = new ActualParameters();}	'('(expression1=expression {$a.add(new ActualParameter($expression1.e));}(','expression2=expression {$a.add(new ActualParameter($expression2.e));})*)?')';
		
expression returns [Evaluator e] 
	:	simpleExpression1=simpleExpression {$e = $simpleExpression1.s;} (
						('='  simpleExpression2=simpleExpression 	{$e = new IsEqualToEvaluator($e, $simpleExpression2.s);}
						|'#'  simpleExpression2=simpleExpression 	{$e = new IsEqualToEvaluator($e, $simpleExpression2.s);}
						|'<'  simpleExpression2=simpleExpression 	{$e = new IsLesserThenEvaluator($e, $simpleExpression2.s);}
						|'<=' simpleExpression2=simpleExpression 	{$e = new IsEqualOrLesserThenEvaluator($e, $simpleExpression2.s);}
						|'>'  simpleExpression2=simpleExpression 	{$e = new IsGreaterThenEvaluator($e, $simpleExpression2.s);}
						|'>=' simpleExpression2=simpleExpression 	{$e = new IsEqualOrGreaterThenEvaluator($e, $simpleExpression2.s);}
						)
		)?;
	
simpleExpression returns[Evaluator s] 
	:{boolean positive=true;}
		('+'|'-' {positive=false;})?
		term1=term 	{$s = $term1.t; 
						if(!positive)
							$s = new NegationEvaluator($s);
					}
		(
		('+' term2=term 	{$s = new PlusEvaluator($s,$term2.t);}
		|'-' term2=term 	{$s = new MinEvaluator($s,$term2.t);}
		|'OR' term2=term 	{$s = new OrEvaluator($s,$term2.t);}
		)
		)*;
	

term returns [Evaluator t]	:	factor1=factor {$t = $factor1.f;}
					(('*' factor2=factor	{$t = new MultEvaluator($t, $factor2.f);}
					|'DIV' factor2=factor	 {$t = new DivEvaluator($t, $factor2.f);}
					|'MOD' factor2=factor	{$t = new ModEvaluator($t, $factor2.f);}
					|'&' factor2=factor	 {$t = new AndEvaluator($t, $factor2.f);}
					))*;	
 
factor returns [Evaluator f]:	ident1=ident {$f = new IdentEvaluator($ident1.text);}
							|ident2=ident {$f = new IdentEvaluator($ident2.text);}(bracketSelector {$f = new ArraySelectorEvaluator($f, $bracketSelector.b);})+
							|number {$f = $number.n;}
							|'('expression')' {$f = $expression.e;};
			
arraySelector: ident(bracketSelector)+;		


number returns [Evaluator n]	:	integer {$n = new NumberEvaluator(Integer.parseInt($integer.text));};

selector returns [Evaluator s]:	dotSelector{$s = $dotSelector.d;}|bracketSelector {$s = $bracketSelector.b;};
 
dotSelector returns [Evaluator d]: '.'ident;

bracketSelector returns [Evaluator b]: '['expression']' {$b = new BracketSelectorEvaluator($expression.e);};


integer	:	DIGIT (DIGIT)*;			 									

ident	:	LETTER (LETTER|DIGIT)*;
					
LETTER	:	('a'..'z'|'A'..'Z')+;
DIGIT	:	'0'..'9'+ ;
WS : (' '|'\t'| '\n'|'\r'|'\f')+ {$channel = HIDDEN;};