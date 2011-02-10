grammar Oberon0;

options {
	language = Java;
}

tokens
{
	/* Key words */
	MODULE_KW		= 	'MODULE'		;
	BEGIN_KW		=	'BEGIN'			;
	END_KW			=	'END'			;
	CONST_KW		=	'CONST'			;
	TYPE_KW			=	'TYPE'			;
	VAR_KW			=	'VAR'			;
	PROCEDURE_KW	=	'PROCEDURE'		;
	ARRAY_KW		=	'ARRAY'			;
	OF_KW			=	'OF'			;
	RECORD_KW		=	'RECORD'		;
	WHILE_KW		=	'WHILE'			;
	DO_KW			=	'DO'			;
	IF_KW			=	'IF'			;
	THEN_KW			=	'THEN'			;
	ELSIF_KW		=	'ELSIF'			;
	ELSE_KW			=	'ELSE'			;

	/* Symbols */
	SEMI_COLON			=	';'			;
	COLON				=	':'			;
	DOT					=	'.'			;
	COMMA				=	','			;
	TILDE				=	'~'			;
	RND_OPEN			=	'('			;
	RND_CLOSE			=	')'			;
	SQR_OPEN			=	'['			;
	SQR_CLOSE			=	']'			;

	/* Operators */
	EQUALS_OP			=	'='			;
	HASH_OP				=	'#'			;
	LESSER_OP			=	'<'			;
	LESSER_OR_EQUAL_OP	=	'<='		;
	GREATER_OP			=	'>'			;
	GREATER_OR_EQUAL_OP	=	'>='		;
	ASSIGN_OP			=	':='		;
	PLUS_OP				=	'+'			;
	MINUS_OP			=	'-'			;
	MULTIPLY_OP			=	'*'			;
	DIVIDE_OP			=	'DIV'		;
	MODULO_OP			=	'MOD'		;
	AND_OP				=	'&'			;
	OR_OP				=	'OR'		;

}

@header {
package org.elcid.oberon0.parser;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.values.*;
import org.elcid.oberon0.ast.visitor.*;
}

@lexer::header {
package org.elcid.oberon0.parser;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

module
	:	MODULE_KW identifier SEMI_COLON declarations (BEGIN_KW statementSequence)? END_KW identifier DOT EOF
	;

declarations
	: 	constDecl? typeDecl? varDecl? (procedureDecl SEMI_COLON)*
	;

constDecl
	:	CONST_KW (identifier EQUALS_OP expression SEMI_COLON)*
	;

typeDecl
	:	TYPE_KW (identifier EQUALS_OP type SEMI_COLON)*
	;

varDecl
	:	VAR_KW (identList COLON type SEMI_COLON)*
	;

procedureDecl
	: 	PROCEDURE_KW identifier (formalParams)? SEMI_COLON procedureBody
	;

procedureBody
	:	declarations (BEGIN_KW statementSequence)? END_KW identifier
	;

formalParams
	:	RND_OPEN (fPSection (SEMI_COLON fPSection)*)? RND_CLOSE
	;

fPSection
	: 	VAR_KW identList COLON type
	|	identList COLON type
	;

type
	:	identifier
	|	arrayType
	|	recordType
	;

identList
	:	identifier (COMMA identifier)*
	;

arrayType
	:	ARRAY_KW expression OF_KW type
	;

fieldList
	:	(identList COLON type)?
	;

recordType
	:	RECORD_KW fieldList (SEMI_COLON fieldList)* END_KW
	;

statementSequence returns [StatementSequenceNode result]
	:													{ $result = new StatementSequenceNode(); }
		s1=statement									{ $result.addStatement($s1.result); }
		(SEMI_COLON	s2=statement						{ $result.addStatement($s2.result); }
		)*
	;

statement returns [StatementNode result]
	:	((identSelector ASSIGN_OP) => a=assignment)		{ $result = $a.result; }
	|	procedureCall
	|	i=ifStatement									{ $result = $i.result; }
	|	whileStatement
	;

assignment returns [StatementNode result]
	:	is=identSelector ASSIGN_OP e=expression			{ $result = new AssignmentNode($is.result, $e.result); }
	;

procedureCall
	:	identSelector (actualParameters)?
	;

whileStatement
	:	WHILE_KW expression DO_KW statementSequence END_KW
	;

ifStatement returns [IfThenElseStmNode result]
	:	IF_KW e=expression THEN_KW ss=statementSequence	{ $result = new IfStmNode($e.result, $ss.result); }
			(ec=elseCondition)?							{ $result.setElseNode($ec.result); }
		END_KW
	;

elseCondition returns [IfThenElseStmNode result]
	:	es=elsifStatement								{ $result = $es.result; }
			(ec=elseCondition)?							{ $result.setElseNode($ec.result); }
	|	es=elseStatement								{ $result = $es.result; }
	;

elsifStatement returns [IfThenElseStmNode result]
	:	ELSIF_KW e=expression
		THEN_KW ss=statementSequence					{ $result = new IfStmNode($e.result, $ss.result); }
	;

elseStatement returns [IfThenElseStmNode result]
	:	ELSE_KW ss=statementSequence					{ $result = new ElseStmNode($ss.result); }
	;

actualParameters
	: 	RND_OPEN RND_CLOSE
	|	RND_OPEN expression (COMMA expression)* RND_CLOSE
	;

expression returns [ExpressionNode result]
	:	s1=simpleExpression								{ $result = $s1.result; }
			( EQUALS_OP s2=simpleExpression				{ $result = new EqualsExpNode($result, $s2.result); }
			| HASH_OP s2=simpleExpression				{ $result = new NotEqualsExpNode($result, $s2.result); }
			| LESSER_OP s2=simpleExpression				{ $result = new LesserExpNode($result, $s2.result); }
			| LESSER_OR_EQUAL_OP s2=simpleExpression	{ $result = new LesserOrEqualsExpNode($result, $s2.result); }
			| GREATER_OP s2=simpleExpression			{ $result = new GreaterExpNode($result, $s2.result); }
			| GREATER_OR_EQUAL_OP s2=simpleExpression	{ $result = new GreaterOrEqualsExpNode($result, $s2.result); }
			)?
	;

simpleExpression returns [ExpressionNode result]
	:	PLUS_OP? te=termsExpression						{ $result = $te.result; }
	|	MINUS_OP te=termsExpression						{ $result = new NegativeExpNode($te.result); }
	;

termsExpression returns [ExpressionNode result]
	:	t1=term										{ $result = $t1.result; }
			( PLUS_OP t2=term							{ $result = new PlusExpNode($result, $t2.result); }
			| MINUS_OP t2=term							{ $result = new MinusExpNode($result, $t2.result); }
			| OR_OP t2=term								{ $result = new OrExpNode($result, $t2.result); }
			)*
	;

term returns [ExpressionNode result]
	:	f1=factor										{ $result = $f1.result; }
			( MULTIPLY_OP f2=factor						{ $result = new MultiplyExpNode($result, $f2.result); }
			| DIVIDE_OP f2=factor						{ $result = new DivideExpNode($result, $f2.result); }
			| MODULO_OP f2=factor						{ $result = new ModuloExpNode($result, $f2.result); }
			| AND_OP f2=factor							{ $result = new AndExpNode($result, $f2.result); }
			)*
	;

factor returns [ExpressionNode result]
	:	is=identSelector								{ $result = $is.result; }
	|	i=integer										{ $result = new IntExpNode(new Int(Integer.parseInt($i.text))); }
	|	RND_OPEN e=expression RND_CLOSE					{ $result = $e.result; }
	|	TILDE f=factor									{ $result = new NotExpNode($f.result); }
	;

identSelector returns [IdentSelectorNode result]
	:	i=identifier									{ $result = new IdentSelectorNode($i.text); }
			( s=selector								{ $result.addSelector($s.result); }
			)*
	;

selector returns [SelectorNode result]
	:	DOT i=identifier								{ $result = new MemberSelectorNode($i.text); }
	|	SQR_OPEN e=expression SQR_CLOSE					{ $result = new IndexSelectorNode($e.result); }
	;

identifier
	:	IDENT
	;

integer
	:	INT
	;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

INT
	:	DIGIT+
	;

IDENT
	:	LETTER (LETTER | DIGIT)*
	;

WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; }
	;

fragment DIGIT	
	:	'0'..'9'
	;

fragment LETTER	
	:	('a'..'z' | 'A'..'Z')
	;