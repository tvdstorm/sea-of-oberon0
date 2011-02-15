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

import java.util.ArrayList;
import java.util.List;

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

module returns [ModuleNode result]
	:	MODULE_KW i=identifier							{ $result = new ModuleNode($i.text); }
		SEMI_COLON ds=declarations						{ $result.setDeclarationSequence($ds.result); }
		(BEGIN_KW ss=statementSequence					{ $result.setStatementSequence($ss.result); }
		)?
		END_KW identifier DOT EOF
	;

declarations returns [DeclarationSequenceNode result]
	:													{ $result = new DeclarationSequenceNode(); }
		(c=constDecl									{ $result.addConstDecls($c.result); } )?
		(t=typeDecl										{ $result.addTypeDecls($t.result); } )?
		(v=varDecl										{ $result.addVarDecls($v.result); } )?
		(p=procedureDecls SEMI_COLON					{ $result.addProcDecls($p.result); } )?
	;

constDecl returns [List<ConstDeclNode> result]
	:	CONST_KW										{ $result = new ArrayList<ConstDeclNode>(); }
		(i=identifier EQUALS_OP e=expression SEMI_COLON	{ $result.add(new ConstDeclNode($i.text, $e.result)); }
		)*
	;

typeDecl returns [List<TypeDeclNode> result]
	:	TYPE_KW											{ $result = new ArrayList<TypeDeclNode>(); }
		(i=identifier EQUALS_OP t=type SEMI_COLON		{ $result.add(new TypeDeclNode($i.text, $t.result)); }
		)*
	;

varDecl returns [List<VarDeclNode> result = new ArrayList<VarDeclNode>()]
	:	VAR_KW (il=identList COLON t=type SEMI_COLON	{ $result.add(new VarDeclNode($il.result, $t.result)); }
		)*
	;

procedureDecls returns [List<ProcedureDeclNode> result = new ArrayList<ProcedureDeclNode>()]
	:	(pd=procedureDecl								{ $result.add($pd.result); } )+
	;

procedureDecl returns [ProcedureDeclNode result]
	: 	PROCEDURE_KW i=identifier (fp=formalParams)?	{ $result = new ProcedureDeclNode($i.text, $fp.result); }
		SEMI_COLON d=declarations						{ $result.setDeclarationSequence($d.result); }
		(BEGIN_KW ss=statementSequence)?				{ $result.setStatementSequence($ss.result); }
		END_KW identifier
	;

formalParams returns [FormalParamsNode result = new FormalParamsNode()]
	:	RND_OPEN (fp1=fPSection							{ $result.add($fp1.result); }
		(SEMI_COLON fpx=fPSection						{ $result.add($fpx.result); }
		)*)? RND_CLOSE
	;

fPSection returns [FpSectionNode result]
	: 	VAR_KW i=identList COLON t=type					{ $result = new ReferenceFpSectionNode($i.result, $t.result); }
	|	i=identList COLON t=type						{ $result = new ValueFpSectionNode($i.result, $t.result); }
	;

type returns [TypeNode result]
	:	identifier										{ $result = new IntType(); }
	|	a=arrayType										{ $result = $a.result; }
	|	r=recordType									{ $result = $r.result; }
	;

identList returns [List<String> result = new ArrayList<String>()]
	:	i=identifier									{ $result.add($i.text); }
		(COMMA ix=identifier							{ $result.add($ix.text); }
		)*
	;

arrayType returns [ArrayTypeNode result]
	:	ARRAY_KW e=expression OF_KW t=type				{ $result = new ArrayTypeNode($e.result, $t.result); }
	;

fieldList returns [RecordFieldListNode result]
	:	(il=identList COLON t=type						{ $result = new RecordFieldListNode($il.result, $t.result); }
		)?
	;

recordType returns [RecordType result = new RecordType()]
	:	RECORD_KW f=fieldList							{ $result.add($f.result); }
		(SEMI_COLON fx=fieldList						{ $result.add($fx.result); }
		)* END_KW
	;

statementSequence returns [StatementSequenceNode result]
	:													{ $result = new StatementSequenceNode(); }
		s1=statement									{ $result.addStatement($s1.result); }
		(SEMI_COLON	s2=statement						{ $result.addStatement($s2.result); }
		)*
	;

statement returns [StatementNode result]
	:	a=assignment									{ $result = $a.result; }
	|	p=procedureCall									{ $result = $p.result; }
	|	i=ifStatement									{ $result = $i.result; }
	|	w=whileStatement								{ $result = $w.result;}
	;

assignment returns [StatementNode result]
	:	is=identSelector ASSIGN_OP e=expression			{ $result = new AssignmentNode($is.result, $e.result); }
	;

procedureCall returns [ProcCallStmNode result]
	:	i=identifier									{ $result = new ProcCallStmNode($i.text); }
		(ap=actualParameters							{ $result.setActualParameters($ap.result); } )?
	;

whileStatement returns [StatementNode result]
	:	WHILE_KW e=expression DO_KW
		ss=statementSequence END_KW						{ $result = new WhileStmNode($e.result, $ss.result); }
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

actualParameters returns [List<ExpressionNode> result = new ArrayList<ExpressionNode>()]
	: 	RND_OPEN RND_CLOSE
	|	RND_OPEN e1=expression							{ $result.add($e1.result); }
		(COMMA ex=expression							{ $result.add($ex.result); }
		)* RND_CLOSE
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
	:	t1=term											{ $result = $t1.result; }
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
	|	i=integer										{ $result = new IntExpNode(Integer.parseInt($i.text)); }
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