grammar Oberon;

options {
  language = Java;
}

@header {
  package com.kootsjur.oberon;
  import com.kootsjur.oberon.statement.*;
  import com.kootsjur.oberon.value.*;
  import com.kootsjur.oberon.evaluator.*;
  import com.kootsjur.oberon.declaration.*; 
  import com.kootsjur.oberon.type.*;
  import java.util.List;
  import java.util.ArrayList;
}

@lexer::header {
  package com.kootsjur.oberon;
}

@members{
	private Module module;
}
 
module	:	'MODULE' ident1=ident';'{module = new Module($ident1.text);} 
				 declarations {module.setDeclarations($declarations.ld);} 
				(procedure';' {module.addProcedure($procedure.p);})*
				('BEGIN' statementSequence {module.setStatementSequence($statementSequence.s);})? 'END' ident '.';	

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
	   ('BEGIN' statementSequence {$pb.setStatementSequence(new StatementSequence());})? 'END' ident;	

procedureHeading returns [ProcedureHeading ph]
	:	'PROCEDURE'ident {$ph = new ProcedureHeading($ident.text);}(formalParameters) {$ph.setFormalParameters($formalParameters.fp);};
	
formalParameters returns [FormalParameters fp] 
	:	{$fp = new FormalParameters();}'('(fPSection1=fPSection {$fp.add($fPSection1.fps);} (';'fPSection2=fPSection {$fp.add($fPSection2.fps);})*)?')';	
	 
fPSection returns [FPSection fps]
	: {String paramDirection = "IN";}	
	('VAR' {paramDirection = "INOUT";})? identList':'type {$fps = new FPSection($identList.i, $type.t, ParameterDirection.valueOf(paramDirection));};
	
type returns [TypeDefinition t]	:	ident {$t = new TypeDefinition($ident.text);}
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
	:	(ident ((actualParameters) {$s = new ProcedureCall($ident.text, $actualParameters.a);}
							| (bracketSelector)? ':=' expression {$s = new Assignment($ident.text, $bracketSelector.b, $expression.e);})
		|ifStatement {$s = $ifStatement.i;}
		|whileStatement {$s = $whileStatement.w;})?;
	//(ident (selector)?((actualParameters)?|':='expression)
	//(ident ((dotSelector)?(actualParameters)|(bracketSelector)?':='expression)
whileStatement returns [WhileStatement w]
	:	'WHILE' expression 'DO' statementSequence 'END';	
	
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
		
expression returns [ExpressionEvaluator e]
	:	simpleExpression1=simpleExpression {$e = (ExpressionEvaluator) $simpleExpression1.s;} (
						('='	{$e = new IsEqualToEvaluator($e, $simpleExpression2.s);}
						|'#'	{$e = new IsEqualToEvaluator($e, $simpleExpression2.s);}
						|'<' 	{$e = new IsLesserThenEvaluator($e, $simpleExpression2.s);}
						|'<=' 	{$e = new IsEqualOrLesserThenEvaluator($e, $simpleExpression2.s);}
						|'>'	{$e = new IsGreaterThenEvaluator($e, $simpleExpression2.s);}
						|'>='	{$e = new IsEqualOrGreaterThenEvaluator($e, $simpleExpression2.s);}
						)
		simpleExpression2=simpleExpression )?;
	
simpleExpression returns[Evaluator s] 
	:('+'|'-')?term
		(('+'  	
		|'-'  	
		|'OR' 	
		)term)*;
	

term returns [Evaluator t]	:	factor1=factor {$t = $factor1.f;}
					(('*'	{$t = new MultEvaluator($t, $factor2.f);}
					|'DIV'	 {$t = new DivEvaluator($t, $factor2.f);}
					|'MOD'	{$t = new ModEvaluator($t, $factor2.f);}
					|'&'	 {$t = new AndEvaluator($t, $factor2.f);}
					)factor2=factor)*;	
 
factor returns [Evaluator f]:	ident1=ident {$f = new IdentEvaluator($ident1.text);}
							|ident2=ident {$f = new IdentEvaluator($ident2.text);}(bracketSelector {$f = new ArraySelectorEvaluator($f, $bracketSelector.b);})+
							|number {$f = $number.n;}
							|'('expression')' {$f = $expression.e;};
			
arraySelector: ident(bracketSelector)+;		


number returns [Evaluator n]	:	integer {new NumberEvaluator(Integer.parseInt($integer.text));};

selector returns [Evaluator s]:	dotSelector{$s = $dotSelector.d;}|bracketSelector {$s = $bracketSelector.b;};

dotSelector returns [Evaluator d]: '.'ident;

bracketSelector returns [Evaluator b]: '['expression']' {$b = $expression.e;};


integer	:	DIGIT (DIGIT)*;			 									

ident	:	LETTER (LETTER|DIGIT)*;
					
LETTER	:	('a'..'z'|'A'..'Z')+;
DIGIT	:	'0'..'9'+ ;
WS : (' '|'\t'| '\n'|'\r'|'\f')+ {$channel = HIDDEN;};