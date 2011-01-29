grammar Oberon0;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

// Virtual Tokens
tokens {
	NEGATION;
}

@header {
  package com.arievanderveek.soo.parser.antlrimpl.generated;
  import com.arievanderveek.soo.ast.*;
  import com.arievanderveek.soo.ast.statements.*;
  import com.arievanderveek.soo.ast.variables.*;
  import com.arievanderveek.soo.ast.unaryoperators.*;
  import com.arievanderveek.soo.ast.binaryoperators.*;
  import com.arievanderveek.soo.ast.codeblocks.*;
  import java.util.Map;
  import java.util.Queue;
  import java.util.Hashtable;
  import java.util.LinkedList;
}

@lexer::header {
  package com.arievanderveek.soo.parser.antlrimpl.generated;
}

selectorPart
	: '.'	IDENT { $selector::selectors.add(new IdentifierNode($IDENT.text)); }
	|	'['	e=expression	']' { $selector::selectors.add($e.node); }
	;

selector returns[SelectorNode return_selectors] // done
scope{
	Queue<ASTNode> selectors;
}
@init{
	$selector::selectors = new LinkedList();
}
	:	selectorPart*
	{ $return_selectors = new SelectorNode($selector::selectors); }
	;

identSelector returns[ASTNode node] // done
	: IDENT selector {$node = new IdentifierNode($IDENT.text , $selector.return_selectors );}
	;

factor returns[ASTNode node] //done
	:	identSelector { $node = $identSelector.node;}
	| INTEGER {$node = new IntegerNode(new Integer($INTEGER.text)) ;}
	| '(' expression ')' {$node = $expression.node; }
	| '~'^ f=factor {$node = new NotOperatorNode($f.node); } // Stands for not P
	;

term returns[ASTNode node] //done
	: lhs=factor 
	((times='*'
	| div='DIV'
	| mod='MOD'
	| and='&'
	) rhs=factor)?
	{ 
		// if there is a right hand factor, its a binary operator thus create one	
		if ($rhs.node!=null){
			if ($times!=null){
				$node = new MultiplicationOperatorNode($lhs.node,$rhs.node);
			}
			if ($div!=null){
				$node = new DivisionOperatorNode($lhs.node,$rhs.node);
			}
			if ($mod!=null){
				$node = new ModulusOperatorNode($lhs.node,$rhs.node);
			}
			if ($and!=null){
				$node = new AndOperatorNode($lhs.node,$rhs.node);
			}
		}else{
			// there is no right hand factor, so return the factor.
			$node = $lhs.node;
		}
	}
	;

termList returns[ASTNode node] //done
	: lhs=term 
	((plus='+'
	|min='-'
	|or='OR'
	) rhs=term)?
	{ 
		// if there is a right hand term, its a binary operator thus create one	
		if ($rhs.node!=null){
			if ($plus!=null){
				$node = new AdditionOperatorNode($lhs.node,$rhs.node);
			}
			if ($min!=null){
				$node = new SubtractionOperatorNode($lhs.node,$rhs.node);
			}
			if ($or!=null){
				$node = new OrOperatorNode($lhs.node,$rhs.node);
			}
		}else{
			// there is no right hand factor, so return the term.
			$node = $lhs.node;
		}
	}
	;

negation returns[ASTNode node] //done
	:	'-' -> NEGATION
	;

simpleExpression returns[ASTNode node] //done
@init{
	boolean isNegation = false;
}
	: ('+'|
	negation {isNegation = true;}
	)? termList
	{ 
		// if there is a right hand term, its a binary operator thus create one	
		if (isNegation){
			$node = new NegationOperatorNode($termList.node);
		}else{
			// there is no right hand factor, so return the term.
			$node = $termList.node;
		}
	}		
	;

expression returns[ASTNode node] //done
  :	lhs=simpleExpression ((
	equal='='
	|notequal='#'
	|smaller='<'
	|smallereq='<='
	|greater='>'
	|greatereq='>='
	) rhs=simpleExpression)?
	{ 
		// if there is a right hand term, its a binary operator thus create one	
		if ($rhs.node!=null){
			if ($equal!=null){
				$node = new EqualOperatorNode($lhs.node,$rhs.node);
			}
			if ($notequal!=null){
				$node = new NotEqualOperatorNode($lhs.node,$rhs.node);
			}
			if ($smaller!=null){
				$node = new SmallerThenOperatorNode($lhs.node,$rhs.node);
			}
			if ($smallereq!=null){
				$node = new SmallerEqualThenOperatorNode($lhs.node,$rhs.node);
			}
			if ($greater!=null){
				$node = new GreaterThenOperatorNode($lhs.node,$rhs.node);
			}
			if ($greatereq!=null){
				$node = new GreaterEqualThenOperatorNode($lhs.node,$rhs.node);
			}
		}else{
			// there is no right hand factor, so return the term.
			$node = $lhs.node;
		}
	}
	;
	
assignment returns[ASTNode node] //done
	: identSelector ':=' expression
	{ $node = new AssignmentNode($identSelector.node, $expression.node);} 
	;

actualParametersFollowUp //done
	: ',' expression
	{$actualParameters::parameters.add($expression.node);}
	;

actualParameters returns[List<ASTNode> return_expression] //done
scope{
	List<ASTNode> parameters;
}
@init{
	$actualParameters::parameters = new LinkedList();
}
		: '('
		expression {$actualParameters::parameters.add($expression.node);} 
		actualParametersFollowUp*
		')'
		{ $return_expression = $actualParameters::parameters;}
		;
		
procedureCall returns[ASTNode node] // done
	:	 IDENT actualParameters?
	{
		// actualParameters returns an
		if ($actualParameters!=null){
			if ($actualParameters.return_expression!=null){
				$node = new ProcedureCallNode(new IdentifierNode($IDENT.text) , $actualParameters.return_expression );
			} else{
				$node = new ProcedureCallNode(new IdentifierNode($IDENT.text));
			}
		} else 
		{
			$node = new ProcedureCallNode(new IdentifierNode($IDENT.text));
		}
	}
	;

elsIfPart
	: 'ELSIF' expression 'THEN' statementSequence
	{
		$ifStatement::root.insertNode($expression.node, $statementSequence.return_statements); 
	}
	;

elsePart
	: 'ELSE' statementSequence
	{
		$ifStatement::root.addFinalElseStatementNode($statementSequence.return_statements);
	}
	;

ifStatement returns[ASTNode node]
scope{
	IfStatementNode root;
}
	:	'IF' expression 'THEN' statementSequence
	{
	$ifStatement::root = new IfStatementNode($expression.node, $statementSequence.return_statements );
	}
	elsIfPart*
	elsePart?
	'END'
	{$node = $ifStatement::root;}
	;
		
whileStatement returns[ASTNode node] // done
	:	'WHILE' expression 'DO' statementSequence 'END'
	{ $node = new WhileLoopNode($expression.node, $statementSequence.return_statements); }
	;

statement returns[ASTNode node] // done
	:	(
	  assignment {$node=$assignment.node;}
	| procedureCall {$node=$procedureCall.node;}
	| ifStatement {$node=$ifStatement.node;}
	| whileStatement {$node=$whileStatement.node;}
	)?
	;

statementSequenceFollowUp //done
	:	';' statement 
	{
		$statementSequence::statements.add($statement.node);
	}
	;

statementSequence returns[List<ASTNode> return_statements] //done
scope{
	List<ASTNode> statements
}
@init{
	$statementSequence::statements = new LinkedList();
}
	:	
	statement {$statementSequence::statements.add($statement.node); }
	statementSequenceFollowUp*
	 {$return_statements = $statementSequence::statements;}
	;

identList returns[List idents] //done
	:	ids+=IDENT (',' ids+=IDENT)*
		{$idents=$ids;}
	;
	
arrayType returns[ASTNode node] // done
	:	'ARRAY'	expression 'OF' type
	{ $node = new ArrayTypeNode($expression.node,$type.node);}
	;
	
fieldList returns[Map<String,ASTNode> return_fieldlist]
scope{
	Map<String,ASTNode> fields
}
@init{
	$fieldList::fields = new Hashtable();
}
	:	(identList ':' type)?
	{
			for (Object token : $identList.idents)
			{
				$fieldList::fields.put( ((CommonToken) token).getText(), $type.node);
			}
			$return_fieldlist = $fieldList::fields; 
	}
	;

recordTypeFollowUp
	: ';' fieldList
	{ $recordType::fields.putAll($fieldList.return_fieldlist);}
	;

recordType returns[ASTNode node]
scope{
	Map<String,ASTNode> fields
}
@init{
	$recordType::fields = new Hashtable();	
}
	:	
	'RECORD'
	fieldList { $recordType::fields.putAll($fieldList.return_fieldlist);}
	recordTypeFollowUp*
	'END'
	{$node = new RecordTypeNode($recordType::fields);}
	;

type returns[ASTNode node]
	:	IDENT { $node = new IdentifierNode($IDENT.text);} 
	| arrayType { $node = $arrayType.node;} 
	| recordType { $node = $recordType.node;}
	;
	
fpSection returns[ASTNode node]
	:	(var='VAR')? fieldList
		{ 
			if (var!=null){
				$node = new CallByRefParameterNode($fieldList.return_fieldlist);
			} else{
				$node = new CallByValParameterNode($fieldList.return_fieldlist);
			}
		}
	;

formalParametersFollowUp
	: ';' fpSection
	{ $formalParameters::fields.add($fpSection.node);}
	;

formalParameters returns[List<ASTNode> formalParams]
scope{
	List<ASTNode> fields
}
@init{
	$formalParameters::fields = new LinkedList();	
}
	:
	'(' 
	fpSection { $formalParameters::fields.add($fpSection.node);}
	formalParametersFollowUp* 
	')'
	{ $formalParams = $formalParameters::fields;}
	;
	
procedureBody returns[Map<String, ASTNode> return_constants, Map<String, ASTNode> return_types,
											Map<String, ASTNode> return_variables, Map<String, ASTNode> return_procs,
											List<ASTNode> return_stats]
	:	declarations ('BEGIN' statementSequence)? 'END'
	{
		$return_constants = $declarations.return_constants;
		$return_types = $declarations.return_types;
		$return_variables = $declarations.return_variables;
		$return_procs = $declarations.return_procs;
		if ($statementSequence!=null) {
			if ($statementSequence.return_statements!=null) {
				$return_stats = $statementSequence.return_statements;
			} else {
				$return_stats = new LinkedList();
			}
		} else { 
			$return_stats = new LinkedList();
		}
	}
	;
	
procedureDeclaration
	:	'PROCEDURE' start=IDENT formalParameters? ';' procedureBody end=IDENT
	{
	if ($formalParameters.formalParams!=null){
	$declarations::procedures.put($start.text, new ProcedureNode($start.text, $end.text,
				$formalParameters.formalParams, $procedureBody.return_constants, 
				$procedureBody.return_types, $procedureBody.return_variables, 
				$procedureBody.return_procs, $procedureBody.return_stats));
	} else {
	$declarations::procedures.put($start.text, new ProcedureNode($start.text, $end.text,
				$procedureBody.return_constants, $procedureBody.return_types,
				$procedureBody.return_variables, $procedureBody.return_procs, 
				$procedureBody.return_stats));
	}
	}
	;

constDecl
	: (IDENT '=' expression ';')
		{
			$declarations::constants.put($IDENT.text , new ConstantDeclarationNode($expression.node));
		}
	;
	
typeDecl
	: ( IDENT '=' type ';')
		{
			$declarations::types.put($IDENT.text , new TypeDeclarationNode($type.node));
		}
	;	

varDecl
	: (identList ':' type ';')
		{
			for (Object token : $identList.idents){
				$declarations::variables.put( ((CommonToken) token).getText(), new VariableDeclarationNode($type.node));
			}
		}
	;
	
constsDecl
	: 'CONST' constDecl*
	;
	 
typesDecl
	: 'TYPE' typeDecl*
	;
varsDecl
	: 'VAR' varDecl*
	;
	
declarations returns[Map<String, ASTNode> return_constants, Map<String, ASTNode> return_types, 
										 Map<String, ASTNode> return_variables, Map<String, ASTNode> return_procs]
scope{
					Map<String, ASTNode> constants;
					Map<String, ASTNode> types;
					Map<String, ASTNode> variables;
					Map<String, ASTNode> procedures;
}
@init{
					$declarations::constants = new Hashtable() ;
					$declarations::types = new Hashtable();
					$declarations::variables = new Hashtable();
					$declarations::procedures = new Hashtable();
}

	:	constsDecl? typesDecl? varsDecl? (procedureDeclaration ';')* 
	{
		// Assign values to the output
		$return_constants = $declarations::constants;
		$return_types = $declarations::types;
		$return_variables = $declarations::variables;
		$return_procs = $declarations::procedures;
	}
	;
	
module returns[ASTNode node]
scope{
	ModuleNode moduleNode;
	List<ASTNode> statementsSeq;
}
	:	'MODULE' start=IDENT ';' declarations	('BEGIN' statementSequence)? 'END' end=IDENT '.'
	{
		// Create an empty statement sequence list if there is no statement sequence list
		if ($statementSequence!=null){
				if ($statementSequence.return_statements != null){
					$module::statementsSeq = $statementSequence.return_statements;
				} else{
					$module::statementsSeq = new LinkedList();
				}
		} else {
			$module::statementsSeq = new LinkedList();
		}
		// Create the modulenode with all required fields
		$module::moduleNode = new ModuleNode(	$start.text, $end.text,	$declarations.return_constants,
						$declarations.return_types,	$declarations.return_variables,
						$declarations.return_procs,	$module::statementsSeq );
		// return the created node
		$node=$module::moduleNode;
	}
	;

// Define fragments for the tokens
fragment DIGIT : '0'..'9';
fragment LETTER : ('a'..'z' | 'A'..'Z') ;
// Tokens
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
// Put Whitespaces on a hidden channel, so they dont end up in the tree
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;} ;