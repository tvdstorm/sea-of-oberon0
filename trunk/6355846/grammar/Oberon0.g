grammar Oberon0;

tokens {
	PLUS 	= '+'  ;
	MINUS	= '-'  ;
	MULT	= '*'  ;
	DIV		= 'DIV';
	MOD		= 'MOD';
	EQUALS	= '='  ;
	NOT_EQ  = '#'  ;
	OR		= 'OR' ;
	AND		= '&'  ;
	LT		= '<'  ;
	LT_EQ   = '<=' ;
	GT		= '>'  ;
	GT_EQ   = '>=' ; 
}

@header {
package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;
import nl.bve.uva.oberon.env.*;
}

@lexer::header {
package nl.bve.uva.oberon.parser;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

module returns [IInterpretableNode result]
	:	'MODULE' i1=IDENT ';' declarations 
			('BEGIN' statementSequence							{$result = $statementSequence.result; }
			)? 'END' i2=IDENT '.'								{$result = new ModuleNode($i1.text, $i2.text, $declarations.result, $result); }
	;

declarations returns [IInterpretableNode result]
	:	c=constantDeclarations 
		t=typeDeclarations 
		v=varDeclarations 
		p=procedureDeclarations									{$result = new DeclarationsNode($c.result, $t.result, $v.result, $p.result); }
	;
																
constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]	
	:	('CONST' 
			(IDENT '=' expression ';'							{$result.add(new ConstantDeclarationNode($IDENT.text, $expression.result)); }
			)*
		)?
	;

typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	('TYPE' 
			(IDENT '=' type ';'									{$result.add(new TypeDeclarationNode($IDENT.text, $type.result)); }
			)*
		)?
	;

varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	('VAR'
			(identList ':' type ';'								{$result.add(new VarDeclarationNode($identList.result, $type.result)); }
			)* 
		)?;

procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	(
			'PROCEDURE' i1=IDENT
				(fp=formalParameters							
				)? ';' pb=procedureBody 'END' i2=IDENT ';'		{$result.add(new ProcedureDeclarationNode($i1.text, $i2.text, $fp.result, $pb.result)); }
		)*
	;

procedureBody returns [IInterpretableNode result]
	:	d=declarations 
			('BEGIN' ss=statementSequence						{$result = $ss.result; }
			)? 													{$result = new ProcedureBodyNode($d.result, $result); }
	;
			
formalParameters returns [List<TypedParameterList> result = new ArrayList<TypedParameterList>()]
	:	'(' (fp1=fPSection 										{$result.add($fp1.result); }
				(';' fp2=fPSection								{$result.add($fp2.result); }
				)*
			)? ')'
	;

fPSection returns [TypedParameterList result]
	:	('VAR' i1=identList ':' t1=type							{$result = new TypedReferenceParameterList($i1.result, $t1.result); }
		|i2=identList ':' t2=type								{$result = new TypedValueParameterList($i2.result, $t2.result); }
		)
	;

type returns [IInterpretableNode result]
	: IDENT 													{$result = new UserTypeNode($IDENT.text); }
	| arrayType													{$result = $arrayType.result; }
	| recordType												{$result = $recordType.result; }
	;

recordType returns [IInterpretableNode result]
	:	'RECORD' fieldLists 'END'								{$result = new RecordTypeNode($fieldLists.result); }
	;

fieldLists returns [List<TypedFieldListNode> result = new ArrayList<TypedFieldListNode>()]
	:	(i1=identList ':' t1=type)? 							{$result.add(new TypedFieldListNode($i1.result, $t1.result)); }
			(';' i2=identList ':' t2=type						{$result.add(new TypedFieldListNode($i2.result, $t2.result)); }
	 		)*
	;

arrayType returns [IInterpretableNode result]
	:	'ARRAY' expression 'OF' type							{$result = new ArrayTypeNode($expression.result, $type.result); }
	;

identList returns [List<String> result = new ArrayList<String>()]
	:	i1=IDENT												{$result.add($i1.text); } 
			(',' i2=IDENT										{$result.add($i2.text); }
			)*
	;

statementSequence returns [IInterpretableNode result]
	:	statementList											{$result = new StatementSequenceNode($statementList.result); };

statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	s1=statement 											{$result.add($s1.result); }
			(';' s2=statement									{$result.add($s2.result); }
			)*
	;

statement returns [IInterpretableNode result]
	:	( assignment											{$result = $assignment.result; }
		| procedureCall											{$result = $procedureCall.result; }
		| ifStatement											{$result = $ifStatement.result; }
		| whileStatement										{$result = $whileStatement.result; }
		)?
	;

assignment returns [IInterpretableNode result]
	:	IDENT selector 											{$result = new IdentSelectorNode($IDENT.text, $selector.result); }
			':=' expression										{$result = new AssignmentNode($result, $expression.result); }
	;

procedureCall returns [IInterpretableNode result]
	:	IDENT (actualParameters)?								{$result = new ProcedureCallNode($IDENT.text, $actualParameters.result); }
	;


actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	'(' (e1=expression 										{$result.add($e1.result); }
				(',' e2=expression								{$result.add($e2.result); }
				)*
			)? 
		')'
	;

ifStatement returns [IInterpretableNode result]
	:	'IF' e1=expression 'THEN' ss1=statementSequence	
			(elseStatements)? 'END'								{$result = new IfNode($e1.result, $ss1.result, $elseStatements.result); }
	;

elseStatements returns [IInterpretableNode result]
	:	 'ELSIF' e=expression 'THEN' ss1=statementSequence		{$result = new ElseIfNode($e.result, $ss1.result, null); }
			(
				es=elseStatements								{$result = new ElseIfNode($e.result, $ss1.result, $es.result); }
			)?
		|'ELSE' ss2=statementSequence							{$result = new ElseNode($ss2.result); }
	;

whileStatement returns [IInterpretableNode result]
	:	'WHILE' expression 'DO' statementSequence 'END'			{$result = new WhileNode($expression.result, $statementSequence.result); }
	;

expression returns [IInterpretableNode result]
	:	s1=simpleExpression 									{$result = $s1.result; }
			( EQUALS s2=simpleExpression						{$result = new EqualsExprNode($s1.result, $s2.result); }
			| NOT_EQ s2=simpleExpression						{$result = new NotEqualsExprNode($s1.result, $s2.result); }
			| LT s2=simpleExpression							{$result = new LTExprNode($result, $s2.result); }
			| LT_EQ s2=simpleExpression							{$result = new LTEqualsExprNode($result, $s2.result); }
			| GT s2=simpleExpression							{$result = new GTExprNode($result, $s2.result); }
			| GT_EQ s2=simpleExpression							{$result = new GTEqualsExprNode($result, $s2.result); }
			)?
	;

simpleExpression returns [IInterpretableNode result]
	:	  PLUS t1=term 											{$result = $t1.result; }
		| MINUS	t1=term											{$result = new NegativeNumberNode($t1.result); }
		| t1=term 												{$result = $t1.result; }
		( PLUS t2=term											{$result = new PlusExprNode($result, $t2.result); }
		| MINUS t2=term											{$result = new MinusExprNode($result, $t2.result); }
		| OR t2=term											{$result = new OrExprNode($result, $t2.result); }
		)*
	;

/*
	Er moet steeds een Expr-object gemaakt worden met als eerste argument $result omdat 
	voor een expressie als 8 * DIV 4 * 3 een herhaling binnen de haken plaats heeft. 
	Als het eerste argument $f1.result zou zijn, zou als eerste arument van iedere navolgende 
	node weer '8' genomen worden. 
*/
term returns [IInterpretableNode result]
	: f1=factor													{$result = $f1.result; }
		(	( MULT f2=factor									{$result = new MultExprNode($result, $f2.result); }
			| DIV f2=factor										{$result = new DivExprNode($result, $f2.result); }
			| MOD f2=factor										{$result = new ModExprNode($result, $f2.result); }
			| AND f2=factor										{$result = new AndExprNode($result, $f2.result); }
			)
		)*
	;

factor returns [IInterpretableNode result]
	: 	IDENT selector											{$result = new IdentSelectorNode($IDENT.text, $selector.result); } 
			| NUMBER 											{$result = new NumberNode(Integer.parseInt($NUMBER.text)); }
			| '(' expression ')' 								{$result = $expression.result; }
/*			| '~' factor */
	;

selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	: 	('.' IDENT 												{$result.add(new DotSelectorNode($IDENT.text)); }
	  	| '[' expression ']'									{$result.add(new ElementSelectorNode($expression.result)); }
	  	)*
	;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: INTEGER;
IDENT	: LETTER (LETTER | DIGIT)*;

fragment INTEGER: (DIGIT)+ ;
fragment LETTER	: ('a'..'z'|'A'..'Z')+;
fragment DIGIT	:'0'..'9';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; };