grammar Oberon0;

options {
  language = Java;
}

@header {
  package ar.oberon0.parser;
  import ar.oberon0.ast.*;
  import ar.oberon0.ast.dataTypes.*;
  import ar.oberon0.ast.declarations.*;
  import ar.oberon0.ast.expression.*;
  import ar.oberon0.ast.statements.*;
  import ar.oberon0.lists.*;
  import ar.oberon0.runtime.*;
  import ar.oberon0.shared.*;
  import ar.oberon0.values.*;
} 
 
@lexer::header {
  package ar.oberon0.parser;
}

	
selector [SelectorNode selectorIn] returns [SelectorNode selector]
@init															{SelectorNode tempSelector = $selectorIn;}
	:
		(	'.' IDENT 											{tempSelector.setNextNode(new RecordSelectorNode($IDENT.getText())); tempSelector = tempSelector.getNextNode();}
		| 	'[' expression ']' 									{tempSelector.setNextNode(new ArrayItemSelectorNode($expression.expression)); tempSelector = tempSelector.getNextNode();}
		)*
																{$selector = selectorIn;}
	; 

factor returns [Interpretable factor]
	:	IDENT 													{VarSelectorNode selector = new VarSelectorNode($IDENT.getText());}
		selector[selector]											{$factor = selector;}
	| 	INTEGER 												{$factor = new IntegerValue(Integer.parseInt($INTEGER.getText()));}
	| 	'(' expression ')' 										{$factor = $expression.expression;} 
	| 	'~' negatedFactor=factor								{$factor = new NegationNode($negatedFactor.factor);}
	; 
	


term returns [Interpretable term]
	:	left=factor												{$term = $left.factor;} 
		(
			(	'*' 	right=factor							{$term = new MultNode($term, $right.factor);}
			| 	'DIV' right=factor								{$term = new DivNode($term, $right.factor);}
			| 	'MOD' right=factor 								{$term = new ModNode($term, $right.factor);}
			| 	'&' 	right=factor							{$term = new AndNode($term, $right.factor);}
			)*
		)		
	; 

simpleExpression returns [Interpretable simpleExpression]  
	:															{ boolean positive = true; }	
		(	'+'
		|	'-' 												{positive = !positive;}
		)? 
		left=term 												{$simpleExpression = $left.term;}
		(	'+' right=term										{$simpleExpression = new AddNode($simpleExpression, $right.term);}
		|	'-' right=term										{$simpleExpression = new MinNode($simpleExpression, $right.term);}
		| 	'OR' right=term			 							{$simpleExpression = new OrNode($simpleExpression, $right.term);}
		)*
																{if(!positive) { $simpleExpression = new NegationNode($simpleExpression);}}
	; 

expression returns [Interpretable expression] 
	:	leftExpression=simpleExpression 						{ $expression = $leftExpression.simpleExpression; } 
		(	'=' rightExpression=simpleExpression 				{ $expression = new EqualNode($expression, $rightExpression.simpleExpression); }
		| 	'#' rightExpression=simpleExpression 				{ $expression = new NotEqualNode($expression, $rightExpression.simpleExpression); }
		| 	'<' rightExpression=simpleExpression 				{ $expression = new SmallerNode($expression, $rightExpression.simpleExpression); }
		| 	'<=' rightExpression=simpleExpression 				{ $expression = new SmallerOrEqualNode($expression, $rightExpression.simpleExpression); }
		| 	'>' rightExpression=simpleExpression 				{ $expression = new GreaterNode($expression, $rightExpression.simpleExpression); }
		| 	'>=' rightExpression=simpleExpression 				{ $expression = new GreaterOrEqualNode($expression, $rightExpression.simpleExpression); } 
		)?
	; 

assignment returns [Interpretable assignment]
	:	IDENT 
																{VarSelectorNode sel = new VarSelectorNode($IDENT.getText());} 
		selector[sel] ':=' expression 							{$assignment = new AssignmentNode(sel,$expression.expression);}
	; 

actualParameters returns [List<Interpretable> actualParameters]
	:															{$actualParameters = new ArrayList<Interpretable>();}	
		'(' 
		(	firstParameter=expression							{$actualParameters.add($firstParameter.expression);} 
			(	',' 
				otherParameter=expression						{$actualParameters.add($otherParameter.expression);}
			)*
		)? 
		')' 
	; 

procedureCall returns [Interpretable procedureCall]
	:	IDENT (actualParameters)? 								{$procedureCall = new ProcedureCallNode($IDENT.getText(),$actualParameters.actualParameters); }
	;
	
ifStatement returns [Interpretable ifStatement]
	:	'IF' ifExpression=expression 
		'THEN' ifStatementSequence=statementSequence			{IfNode ifNode = new IfNode($ifExpression.expression,$ifStatementSequence.statementSequence);} 
		(	'ELSIF' elseIfExpression=expression 
			'THEN' elseIfStatementSequence=statementSequence	{ifNode.addElseIf($elseIfExpression.expression,$elseIfStatementSequence.statementSequence);}
		)* 
		(	'ELSE' elseStatementSequence=statementSequence		{ifNode.setElse($elseStatementSequence.statementSequence);}
		)? 
		'END'													{$ifStatement = ifNode;}
	;

whileStatement returns [Interpretable whileStatement]
	:	'WHILE' expression 										
		'DO' statementSequence 									{$whileStatement = new WhileNode($expression.expression, $statementSequence.statementSequence);}
		'END'
	;

statement returns [Interpretable statement]
	:	(assignment												{$statement = $assignment.assignment;} 
		| procedureCall 										{$statement = $procedureCall.procedureCall;}
		| ifStatement 											{$statement = $ifStatement.ifStatement;}
		| whileStatement										{$statement = $whileStatement.whileStatement;}
		| write													{$statement = $write.write;}
		| read													{$statement = $read.read;}
		)? 
	;

statementSequence returns [Interpretable statementSequence]
	:	firstStatement=statement								{StatementSequence statementSequence = new StatementSequence($firstStatement.statement);} 
		(	';' 
			otherStatement=statement							{statementSequence.addStatement($otherStatement.statement);}
		)* 														{$statementSequence = statementSequence;}
	;

identList returns [IdentList identList]
	:															{$identList = new IdentList();}
		firstIdent=IDENT 										{$identList.addIdent($firstIdent.getText());}
		(	',' 
			otherIdent=IDENT									{$identList.addIdent($otherIdent.getText());}
		)* 
	;

arrayType returns [ArrayType arrayType]
	:	'ARRAY' expression 'OF' type							{$arrayType = new ArrayType($expression.expression, $type.type);}
	; 

fieldList returns [FieldList fieldList]
	:	(	identList 											
			':' 
			type												{$fieldList = new FieldList($identList.identList, $type.type);}
		)?
	; 

recordType returns [RecordType recordType]
	:															{$recordType = new RecordType();}
		'RECORD' firstFieldList=fieldList						{$recordType.addFieldList($firstFieldList.fieldList);}
		(	';' otherFieldList=fieldList						{$recordType.addFieldList($otherFieldList.fieldList);}
		)* 
		'END'
	; 

type returns [CreatableType type]
	:	IDENT 													{$type = new SimpleTypeFactory().getType($IDENT.getText());}
	| 	arrayType 												{$type = $arrayType.arrayType;}
	| 	recordType												{$type = $recordType.recordType;}
	; 


fPSection returns [IdentList identList, CreatableType type, FormalParameter.Direction direction]
	:															{$direction = FormalParameter.Direction.IN;}
		(	'VAR'												{$direction = FormalParameter.Direction.IN_OUT;}
		)?														 
		identList ':' type 										{$identList = $identList.identList; $type = $type.type;}
	;

formalParameters returns [FormalParameterList formalParameters]
	:	'(' 													{$formalParameters = new FormalParameterList();}
			(	firstFPSection=fPSection 						{$formalParameters.addParameters($firstFPSection.identList, $firstFPSection.type, $firstFPSection.direction);}
				(	';' otherFPSection=fPSection				{$formalParameters.addParameters($otherFPSection.identList, $otherFPSection.type, $otherFPSection.direction);}
				)* 
			)? 
		')'
	; 

procedureHeading returns [FormalParameterList formalParameters, String procedureName]
	:	'PROCEDURE' IDENT 										{$procedureName = $IDENT.getText();}
		(	formalParameters									{$formalParameters = $formalParameters.formalParameters;}
		)?
	; 

procedureBody returns [ConstantList constants, TypeIdentifierList types, DataFieldList vars, ProcedureList childProcedures, StatementSequence statementSequence]  
	:	declarations 											{$constants = $declarations.constants; $types = $declarations.types; $vars = $declarations.vars;$childProcedures = $declarations.procedures;}
		(	'BEGIN' firstStatementSequence=statementSequence	{$statementSequence = (StatementSequence)$firstStatementSequence.statementSequence;}
		)? 
		'END' 
	;


procedureDeclaration returns [ProcedureDeclaration procedureDeclaration, String procedureName]
	:	procedureHeading ';' procedureBody IDENT				{$procedureName = $IDENT.getText();}
																{$procedureDeclaration = new ProcedureDeclaration($procedureHeading.procedureName);}
																{$procedureDeclaration.setFormalParameters($procedureHeading.formalParameters);}
																{$procedureDeclaration.setConstants($procedureBody.constants);}
																{$procedureDeclaration.setTypes($procedureBody.types);}
																{$procedureDeclaration.setVars($procedureBody.vars);}
																{$procedureDeclaration.setChildProcedures($procedureBody.childProcedures);}
																{$procedureDeclaration.setStatementSequence($procedureBody.statementSequence);}
	;	
	
declarations returns [ConstantList constants, TypeIdentifierList types, DataFieldList vars, ProcedureList procedures]
	:	(	'CONST' 											{$constants = new ConstantList();}
			(constIDENT=IDENT '=' expression ';'				{$constants.addItem($constIDENT.getText(),new DataField((Value)$expression.expression));}
			)*
		)?
		(	'TYPE' 												{$types = new TypeIdentifierList();}
			(	typeIDENT=IDENT '=' typeType=type ';' 			{$types.addItem($typeIDENT.getText(),$typeType.type);}
			)*
		)?
		(	'VAR' 												{$vars = new DataFieldList();}
			(	identList ':' varType=type ';'					{$vars.addVariables($identList.identList, $varType.type);}
			)*
		)?														{$procedures = new ProcedureList();}
		(	procedureDeclaration ';'							{$procedures.addItem( $procedureDeclaration.procedureName, $procedureDeclaration.procedureDeclaration);}
		)*
	;
	
module	returns [ModuleNode module] 
	:	'MODULE' name=IDENT ';' declarations					{$module = new ModuleNode($name.getText());} 
																{$module.setConstants($declarations.constants);}
																{$module.setTypeIdentifiers($declarations.types);}
																{$module.setVars($declarations.vars);}
																{$module.setChildProcedures($declarations.procedures);}
																
		(	'BEGIN' statementSequence							{$module.setStatements((StatementSequence)$statementSequence.statementSequence);}
		)? 
		'END'! IDENT
	;




write returns [Interpretable write]
	:	
		('Write' 
			(	'(' expression ')'									{$write = new WriteNode($expression.expression);}
			|														{WriteNode writeNode = new WriteNode();}
				'("'(	IDENT										{writeNode.addToMessage($IDENT.getText() + " ");}
				)*'")'												{$write = writeNode;}
			)
		)
	|	('WriteLn')													{$write = new WriteNode(); ((WriteNode)$write).addToMessage("\n");}	
	;	
	
read returns [Interpretable read]
	:	'Read''(' IDENT  										{VarSelectorNode selector = new VarSelectorNode($IDENT.getText());}
		selector[selector] ')'										{$read = new ReadNode(selector);}
	;



fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
 
