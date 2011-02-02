grammar Oberon0;

options {
	output = AST;
	/* ASTLabelType = OberonRootNode; */
}

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
	GT_EQ   = '>=';
	
}

@header {
package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.OberonRootNode;
import nl.bve.uva.oberon.ast.*;
}

@lexer::header {
package nl.bve.uva.oberon.parser;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog returns [IInterpretableNode prog]
	: expression;

expression returns [IInterpretableNode expr]
	:	s1=simpleExpression 			{$expr = $s1.sexpr; }
		( EQUALS s2=simpleExpression	{$expr = new EqualsExprNode($s1.sexpr, $s2.sexpr); }
		/* | '#' s2=simpleExpression	{} */
		| LT s2=simpleExpression		{$expr = new LTExprNode($s1.sexpr, $s2.sexpr); }
		| LT_EQ s2=simpleExpression		{$expr = new LTEqualsExprNode($s1.sexpr, $s2.sexpr); }
		| GT s2=simpleExpression		{$expr = new GTExprNode($s1.sexpr, $s2.sexpr); }
		| GT_EQ s2=simpleExpression		{$expr = new GTEqualsExprNode($s1.sexpr, $s2.sexpr); }
		)?;

simpleExpression returns [IInterpretableNode sexpr]
	:	  PLUS t1=term 					{$sexpr = $t1.term; }
		| MINUS	t1=term					{$sexpr = new NegativeNode($t1.term); }
		| t1=term 						{$sexpr = $t1.term; }
		( PLUS t2=term					{$sexpr = new PlusExprNode($sexpr, $t2.term); }
		| MINUS t2=term					{$sexpr = new MinusExprNode($sexpr, $t2.term); }
		| OR t2=term					{$sexpr = new OrExprNode($sexpr, $t2.term); }
		)*;

term returns [IInterpretableNode term]
	: f1=factor							{$term = $f1.fact; }
	(	( MULT f2=factor				{$term = new MultExprNode($f1.fact, $f2.fact); }
		| DIV f2=factor					{$term = new DivExprNode($f1.fact, $f2.fact); }
		| MOD f2=factor					{$term = new ModExprNode($f1.fact, $f2.fact); }
		| AND f2=factor					{$term = new AndExprNode($f1.fact, $f2.fact); }
		)
	)*;

factor returns [IInterpretableNode fact]
	: IDENT selector					{$fact = new IdentNode($IDENT.text, $selector.select); } 
	| number 							{$fact = $number.nr; }
	| '(' expression ')' 				{$fact = $expression.expr; }
/*	| '~' factor */
	;				

selector returns [IInterpretableNode select]
	: ('.' IDENT 						{$select = new DotSelectorNode($IDENT.text); }
	  | '[' expression ']'				{$select = new ElementSelectorNode($expression.expr); }
	  )*;

number returns [IInterpretableNode nr]
	: INTEGER							{$nr = new NumberNode(Integer.parseInt($INTEGER.text)); };

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/


IDENT	: LETTER (LETTER | DIGIT)*;
INTEGER	: (DIGIT)+ ;

fragment LETTER	: ('a'..'z'|'A'..'Z')+;
fragment DIGIT	:'0'..'9';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;