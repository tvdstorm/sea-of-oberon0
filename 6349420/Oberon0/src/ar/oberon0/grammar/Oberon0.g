grammar Oberon0;

options {
  language = Java;
}

@header {
  package ar.oberon0.parser;
  import ar.oberon0.interpreter.*;
  import ar.oberon0.interpreter.ControlFlow.*;
  import ar.oberon0.interpreter.DataTypes.*;
  import ar.oberon0.interpreter.Lists.*;
  import ar.oberon0.interpreter.Operators.*;
  import ar.oberon0.interpreter.Memory.*;
  import ar.oberon0.interpreter.Procedure.*; 
}

@lexer::header {
  package ar.oberon0.parser;
}

	
selector [Selector selector] returns [Selector result]
@init															{Selector tempSelector = $selector;}
	:
		(	'.' IDENT 											{tempSelector.setNextNode(new IdentSelector($IDENT.getText())); tempSelector = tempSelector.getNextNode();}
		| 	'[' expression ']' 									{tempSelector.setNextNode(new ArrayItemSelector($expression.result)); tempSelector = tempSelector.getNextNode();}
		)*
																{$result = selector;}
	; 

factor returns [Interpretable result]
	:	IDENT 													{IdentSelector sel = new IdentSelector($IDENT.getText());}
		selector[sel]											{$result = sel;}
	| 	INTEGER 												{$result = new IntegerNode(Integer.parseInt($INTEGER.getText()));}
	| 	'(' expression ')' 										{$result = $expression.result;} 
	| 	'~' factor												{$result = null;}
	; 
	


term returns [Interpretable result]
	:	left=factor												{$result = $left.result;} 
		(
			(	'*' 	right=factor							{$result = new MultNode($result, $right.result);}
			| 	'DIV' right=factor								{$result = new DivNode($result, $right.result);}
			| 	'MOD' right=factor 								{$result = new ModNode($result, $right.result);}
			| 	'&' 	right=factor							{$result = new AndNode($result, $right.result);}
			)*
		)		
	; 

simpleExpression returns [Interpretable result]  
	:															{ boolean positive = true; }	
		(	'+'
		|	'-' 												{positive = !positive;}
		)? 
		left=term 												{$result = $left.result;}
		(	'+' right=term										{$result = new AddNode($result, $right.result);}
		|	'-' right=term										{$result = new MinNode($result, $right.result);}
		| 	'OR' right=term										{$result = new OrNode($result, $right.result);}
		)*
																{if(!positive) { $result = new NegationNode($result);}}
	; 

expression returns [Interpretable result] 
	:	leftExpression=simpleExpression 						{ $result = $leftExpression.result; } 
		(	'=' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.EQUAL); }
		| 	'#' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.NOT_EQUAL); }
		| 	'<' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.SMALLER); }
		| 	'<=' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.SMALLER_OR_EQUAL); }
		| 	'>' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.GREATER); }
		| 	'>=' rightExpression=simpleExpression 				{ $result = new CompareNode($result, $rightExpression.result, CompareOperator.GREATER_OR_EQUAL); } 
		)?
	; 

assignment returns [Interpretable result]
	:	IDENT 
																{IdentSelector sel = new IdentSelector($IDENT.getText());} 
		selector[sel] ':=' expression 							{$result = new AssignmentNode(sel,$expression.result);}
	; 

actualParameters returns [List<Interpretable> result]
	:															{$result = new ArrayList<Interpretable>();}	
		'(' 
		(	firstParameter=expression							{$result.add($firstParameter.result);} 
			(	',' 
				otherParameter=expression						{$result.add($otherParameter.result);}
			)*
		)? 
		')' 
	; 

procedureCall returns [Interpretable result]
	:	IDENT (actualParameters)? 								{$result = new ProcedureCallNode($IDENT.getText(),$actualParameters.result); }
	;
	
ifStatement returns [Interpretable result]
	:	'IF' ifExpression=expression 
		'THEN' ifStatementSequence=statementSequence			{IfNode ifNode = new IfNode($ifExpression.result,$ifStatementSequence.result);} 
		(	'ELSIF' elseIfExpression=expression 
			'THEN' elseIfStatementSequence=statementSequence	{ifNode.addElseIf($elseIfExpression.result,$elseIfStatementSequence.result);}
		)* 
		(	'ELSE' elseStatementSequence=statementSequence		{ifNode.setElse($elseStatementSequence.result);}
		)? 
		'END'													{$result = ifNode;}
	;

whileStatement returns [Interpretable result]
	:	'WHILE' expression 										
		'DO' statementSequence 									{$result = new WhileNode($expression.result, $statementSequence.result);}
		'END'
	;

statement returns [Interpretable result]
	:	(assignment												{$result = $assignment.result;} 
		| procedureCall 										{$result = $procedureCall.result;}
		| ifStatement 											{$result = $ifStatement.result;}
		| whileStatement										{$result = $whileStatement.result;}
		| write													{$result = $write.result;}
		| read													{$result = $read.result;}
		)? 
	;

statementSequence returns [Interpretable result]
	:	firstStatement=statement								{StatementSequence statementSequence = new StatementSequence($firstStatement.result);} 
		(	';' 
			otherStatement=statement							{statementSequence.addStatement($otherStatement.result);}
		)* 														{$result = statementSequence;}
	;

identList returns [IdentList result]
	:															{$result = new IdentList();}
		firstIdent=IDENT 										{$result.AddIdent($firstIdent.getText());}
		(	',' 
			otherIdent=IDENT									{$result.AddIdent($otherIdent.getText());}
		)* 
	;

arrayType returns [ArrayType result]
	:	'ARRAY' expression 'OF' type							{$result = new ArrayType($expression.result, $type.result);}
	; 

fieldList returns [FieldList result]
	:															{$result = new FieldList();}
		(	identList 											
			':' 
			type												{$result.setIdentList($identList.result, $type.result);}
		)?
	; 

recordType returns [RecordType result]
	:															{$result = new RecordType();}
		'RECORD' firstFieldList=fieldList						{$result.addFieldList($firstFieldList.result);}
		(	';' otherFieldList=fieldList						{$result.addFieldList($otherFieldList.result);}
		)* 
		'END'
	; 

type returns [CreatableType result]
	:	IDENT 													{$result = new SimpleType($IDENT.getText());}
	| 	arrayType 												{$result = $arrayType.result;}
	| 	recordType												{$result = $recordType.result;}
	; 


fPSection returns [IdentList identList, CreatableType type, FormalParameter.Direction direction]
	:															{$direction = FormalParameter.Direction.IN;}
		(	'VAR'												{$direction = FormalParameter.Direction.IN_OUT;}
		)?														 
		identList ':' type 										{$identList = $identList.result; $type = $type.result;}
	;

formalParameters returns [FormalParameterList result]
	:	'(' 													{$result = new FormalParameterList();}
			(	firstFPSection=fPSection 						{$result.AddParameters($firstFPSection.identList, $firstFPSection.type, $firstFPSection.direction);}
				(	';' otherFPSection=fPSection				{$result.AddParameters($otherFPSection.identList, $otherFPSection.type, $otherFPSection.direction);}
				)* 
			)? 
		')'
	; 

procedureHeading returns [FormalParameterList result, String procedureName]
	:	'PROCEDURE' IDENT 										{$procedureName = $IDENT.getText();}
		(	formalParameters									{$result = $formalParameters.result;}
		)?
	; 

procedureBody returns [ConstantList constants, TypeIdentifierList types, DataFieldList vars, ProcedureList childProcedures, StatementSequence statementSequence]  
	:	declarations 											{$constants = $declarations.constants; $types = $declarations.types; $vars = $declarations.vars;$childProcedures = $declarations.procedures;}
		(	'BEGIN' firstStatementSequence=statementSequence	{$statementSequence = (StatementSequence)$firstStatementSequence.result;}
		)? 
		'END' 
	;


procedureDeclaration returns [ProcedureDeclaration result, String procedureName]
	:	procedureHeading ';' procedureBody IDENT				{$procedureName = $IDENT.getText();}
																{$result = new ProcedureDeclaration($procedureHeading.procedureName);}
																{$result.setFormalParameters($procedureHeading.result);}
																{$result.setConstants($procedureBody.constants);}
																{$result.setTypes($procedureBody.types);}
																{$result.setVars($procedureBody.vars);}
																{$result.setChildProcedures($procedureBody.childProcedures);}
																{$result.setStatementSequence($procedureBody.statementSequence);}
	;	
	
declarations returns [ConstantList constants, TypeIdentifierList types, DataFieldList vars, ProcedureList procedures]
	:	(	'CONST' 											{$constants = new ConstantList();}
			(constIDENT=IDENT '=' expression ';'				{$constants.AddItem($constIDENT.getText(),new DataField(new SimpleType("INTEGER"),(DataType)$expression.result));}
			)*
		)?
		(	'TYPE' 												{$types = new TypeIdentifierList();}
			(	typeIDENT=IDENT '=' typeType=type ';' 			{$types.AddItem($typeIDENT.getText(),$typeType.result);}
			)*
		)?
		(	'VAR' 												{$vars = new DataFieldList();}
			(	identList ':' varType=type ';'					{$vars.AddVariables($identList.result, $varType.result);}
			)*
		)?														{$procedures = new ProcedureList();}
		(	procedureDeclaration ';'							{$procedures.AddItem( $procedureDeclaration.procedureName, $procedureDeclaration.result);}
		)*
	;
	
module	returns [ModuleNode result] 
	:	'MODULE' name=IDENT ';' declarations					{$result = new ModuleNode($name.getText());} 
																{$result.setConstants($declarations.constants);}
																{$result.setTypeIdentifiers($declarations.types);}
																{$result.setVars($declarations.vars);}
																{$result.setChildProcedures($declarations.procedures);}
																
		(	'BEGIN' statementSequence							{$result.setStatements((StatementSequence)$statementSequence.result);}
		)? 
		'END'! IDENT
	;




write returns [Interpretable result]
	:	
		('Write' 
			(	'(' expression ')'									{$result = new WriteNode($expression.result);}
			|														{WriteNode writeNode = new WriteNode();}
				'("'(	IDENT										{writeNode.AddToMessage($IDENT.getText() + " ");}
				)*'")'												{$result = writeNode;}
			)
		)
	|	('WriteLn')													{$result = new WriteNode(); ((WriteNode)$result).AddToMessage("\n");}	
	;	
	
read returns [Interpretable result]
	:	'Read''(' IDENT  										{IdentSelector sel = new IdentSelector($IDENT.getText());}
		selector[sel] ')'										{$result = new ReadNode(sel);}
	;



fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
 
