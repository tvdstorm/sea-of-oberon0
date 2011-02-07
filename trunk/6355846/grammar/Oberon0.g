grammar Oberon0;

tokens {
	PLUS 	= '+'  ;
	MINUS	= '-'  ;
	MULT	= '*'  ;
	DIV		= 'DIV';
	MOD		= 'MOD';
	EQUALS	= '='  ;
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
}

@lexer::header {
package nl.bve.uva.oberon.parser;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog returns [IInterpretableNode prog]
	: statement									{$prog = $statement.result; };

statementSequence returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	s1=statement 							{$result.add($s1.result); }
		(
			';' s2=statement					{$result.add($s2.result); }
		)*;

statement returns [IInterpretableNode result]
	:	( callStatement 						{$result = $callStatement.result; }
		| ifStatement							{$result = $ifStatement.result; }
		| whileStatement						{$result = $whileStatement.result; }
		)?;

callStatement returns [IInterpretableNode result]	
	:	IDENT selector							{$result = new IdentChangerNode($IDENT.text, $selector.result); }
			(':=' expression					{$result = new AssignmentNode($result, $expression.result); } 
			| (actualParameters)?				{$result = new ProcedureCallNode($result, $actualParameters.result); }
			);

actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	:	'(' (e1=expression 						{$result.add($e1.result); }
				(
					',' e2=expression			{$result.add($e2.result); }
				)*
			)? 
		')'	;

ifStatement returns [IInterpretableNode result]
	:	'IF' expression 'THEN' statementSequence ('ELSIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END';

whileStatement returns [IInterpretableNode result]
	:	'WHILE' expression 'DO' statementSequence 'END';

assignment returns [IInterpretableNode result]
	:	IDENT selector 							{$result = new IdentChangerNode($IDENT.text, $selector.result); }
		':=' expression							{$result = new AssignmentNode($result, $expression.result); };

expression returns [IInterpretableNode result]
	:	s1=simpleExpression 					{$result = $s1.result; }
		( EQUALS s2=simpleExpression			{$result = new EqualsExprNode($s1.result, $s2.result); }
		/* | '#' s2=simpleExpression			{} */
		| LT s2=simpleExpression				{$result = new LTExprNode($result, $s2.result); }
		| LT_EQ s2=simpleExpression				{$result = new LTEqualsExprNode($result, $s2.result); }
		| GT s2=simpleExpression				{$result = new GTExprNode($result, $s2.result); }
		| GT_EQ s2=simpleExpression				{$result = new GTEqualsExprNode($result, $s2.result); }
		)?;

simpleExpression returns [IInterpretableNode result]
	:	  PLUS t1=term 							{$result = $t1.result; }
		| MINUS	t1=term							{$result = new NegativeNumberNode($t1.result); }
		| t1=term 								{$result = $t1.result; }
		( PLUS t2=term							{$result = new PlusExprNode($result, $t2.result); }
		| MINUS t2=term							{$result = new MinusExprNode($result, $t2.result); }
		| OR t2=term							{$result = new OrExprNode($result, $t2.result); }
		)*;

term returns [IInterpretableNode result]
	: f1=factor									{$result = $f1.result; }
	(	( MULT f2=factor						{$result = new MultExprNode($result, $f2.result); }
		| DIV f2=factor							{$result = new DivExprNode($result, $f2.result); }
		| MOD f2=factor							{$result = new ModExprNode($result, $f2.result); }
		| AND f2=factor							{$result = new AndExprNode($result, $f2.result); }
		)
	)*;

factor returns [IInterpretableNode result]
	: 	IDENT selector							{$result = new IdentReaderNode($IDENT.text, $selector.result); } 
		| NUMBER 								{$result = new NumberNode(Integer.parseInt($NUMBER.text)); }
		| '(' expression ')' 					{$result = $expression.result; }
/*		| '~' factor */
		;

selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()]
	: 	('.' IDENT 								{$result.add(new DotSelectorNode($IDENT.text)); }
	  	| '[' expression ']'					{$result.add(new ElementSelectorNode($expression.result)); }
	  	)*;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: INTEGER;
IDENT	: LETTER (LETTER | DIGIT)*;

fragment INTEGER: (DIGIT)+ ;
fragment LETTER	: ('a'..'z'|'A'..'Z')+;
fragment DIGIT	:'0'..'9';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; };