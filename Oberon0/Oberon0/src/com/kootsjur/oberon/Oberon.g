grammar Oberon;

options {
  language = Java;
}

@header {
  package com.kootsjur.oberon;
  import java.util.List
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
				('BEGIN' statementSequence {module.setStatementSequence(new StatementSequence());})? 'END' ident '.';	

declarations returns [List<Declaration> ld]
	:	{$ld = new ArrayList<Declaration>();}
		(constantDeclaration {$ld.add($constantDeclaration.lcd);})*
		(typeDeclaration {$ld.add($typeDeclaration.ltd);})*	
		(varDeclaration {$ld.add($varDeclaration.lvd);})* 
		;
 		
constantDeclaration returns [List<ConstantDeclaration> lcd]
	:'CONST' {$lcd = new ArrayList<ConstantDeclaration>();} (ident '=' expression ';' {$lcd.add(new ConstantDeclaration($ident.text, $expression.e));})+ ;
	
typeDeclaration  returns [List<TypeDeclaration> ltd]
	:	'TYPE' {$ltd = new ArrayList<TypeDeclaration>();} (ident '=' type ';' {$ltd.add(new TypeDeclaration($ident.text, $type.t));})+;
	
varDeclaration returns [List<VarDeclaration> lvd]
	: 'VAR' {$lvd = new ArrayList<VarDeclaration>();} (identList ':' type ';' {lvd.add(new VarDeclaration($identList.l, $type.t)})+;	
	
identList returns [List<String> l] 
	:  {$l = new ArrayList<String>();}	ident1=ident {$l.add($ident1.text);}(','ident2=ident {$l.add($ident2.text);})*;				
		
procedure returns [Procedure p] 
	:	procedureHeading ';' procedureBody {$p = new Procedure($procedureHeading.ph, $procedureBody.pb));};
	
procedureBody returns [ProcedureBody pb]
	: {$pb = new ProcedureBody();}	
	   declarations {$pb.setDeclarations($declarations.ld);} 
	   (procedure';' {$pb.addProcedure($procedure.p);})*
	   ('BEGIN' statementSequence {$pb.setStatementSequence(new StatementSequence());})? 'END' ident;	

procedureHeading returns [ProcedureHeading ph]
	:	'PROCEDURE'ident {$ph = new ProcedureHeading($ident.text);}(formalParameters) {$ph.setParameters($formalParameters.fp);};
	
formalParameters returns [FormalParamater fp]
	:	{$fp = new FormalParameter();}'('(fPSection {$fp.addFPSection($fpSection.fps);} (';'fPSection {$fp.addFPSection($fpSection.fps);})*)?')';	
	 
fPSection returns [FPSection fps]
	:	('VAR')? identList':'type;
	
type returns [TypeDefinition t]	:	ident|arrayType|recordType;

recordType
	:	'RECORD' fieldList (';'fieldList)* 'END';
	
fieldList
	:	(identList':'type)?;
	
arrayType
	:	'ARRAY' expression 'OF' type;
	

	
statementSequence
	:	statement(';'statement)*;
	
statement
	:	(ident (selector)?((actualParameters)
							|':='expression)
		|ifStatement
		|whileStatement)?;
	//(ident (selector)?((actualParameters)?|':='expression)
	//(ident ((dotSelector)?(actualParameters)|(bracketSelector)?':='expression)
whileStatement
	:	'WHILE' expression 'DO' statementSequence 'END';	
	
ifStatement
	:	'IF' expression 'THEN' statementSequence ('ELSEIF' expression 'THEN' statementSequence)*
		 ('ELSE' statementSequence)? 'END';
		 
procedureCall
	:	ident (selector)?(actualParameters); 
	
assignment
	:	ident (selector)?':='expression;
		
actualParameters
	:	'('(expression(','expression)*)?')';
		
expression returns [Expression e]
	:	simpleExpression (
						('='
						|'#'
						|'<'
						|'<='
						|'>'
						|'>=')
		simpleExpression)?;
	
simpleExpression
	:	('+'
		|'-')?
		term(
			('+'
			|'-'
			|'OR')
		term)*;
	

term 	:	factor(
					('*'
					|'DIV'
					|'MOD'
					|'&')
			factor)*;	
 
factor	:	ident
			|arraySelector
			|number
			|'('expression')';
			
arraySelector: ident(bracketSelector)+;		


number	:	integer;

selector:	dotSelector|bracketSelector;

dotSelector: '.'ident;

bracketSelector: '['expression']';


integer	:	DIGIT (DIGIT)*;			 									

ident	:	LETTER (LETTER|DIGIT)*;
					
LETTER	:	('a'..'z'|'A'..'Z')+;
DIGIT	:	'0'..'9'+ ;
WS : (' '|'\t'| '\n'|'\r'|'\f')+ {$channel = HIDDEN;};