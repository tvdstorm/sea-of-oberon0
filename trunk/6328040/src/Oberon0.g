grammar Oberon0;

tokens
{
	//Operators
	MULTIPLY	= 	'*';
	DIVIDE		=	'DIV';
	MOD		=	'MOD';
	AMPERSAND	=	'&';
	ADD		=	'+';
	SUBTRACT	=	'-';
	OR		=	'OR';
	EQUALS		=	'=';
	HASH		=	'#';
	SMALLERTHEN	=	'<';
	SMALLEREQUAL	=	'<=';
	GREATERTHEN	=	'>';
	GREATEREQUAL	=	'>=';
	
	DOT		=	'.';
	COMMA		=	',';
	COLON		=	':';
	RNDOPEN		=	'(';			//round bracket open
	RNDCLOSE	=	')';			//round bracket close
	SQROPEN		=	'[';			//square bracket open
	SQRCLOSE	=	']';			//square bracket close
	
	OF		=	'OF';
	THEN		=	'THEN';
	DO		=	'DO';
	TILDE		=	'~';
	ASSIGNMENT	=	':=';
	SEMICOLON	=	';';
	END		=	'END';
	ELSE		=	'ELSE';
	ELSIF		=	'ELSIF';
	IF		=	'IF';
	WHILE		=	'WHILE';
	ARRAY		=	'ARRAY';
	RECORD		=	'RECORD';
	CONST		=	'CONST';
	TYPEDECL	=	'TYPE';
	VAR		=	'VAR';
	PROCEDURE	=	'PROCEDURE';
	BEGIN		=	'BEGIN';
	MODULE		=	'MODULE';
	TRUE		=	'TRUE';
	FALSE		=	'FALSE';
	}

@header {package generated; 
import oberon0.ast.*;
}

@lexer::header {package generated;
}
/*
oberonprogram
	:	module 
			-> ^(OBERONPROGRAM module);
module	:	MODULE routinename SEMICOLON moduleBody IDENT DOT EOF
			-> ^(MODULE routinename moduleBody);
moduleBody
	:	declarations (BEGIN statementSequence)? END
			-> declarations? ^(BODY statementSequence)?;
declarations
	:		constDeclaration? typeDeclaration? varDeclarations? 
			(procedureDeclaration SEMICOLON)*
				-> ^(DECLARATIONS constDeclaration? typeDeclaration? varDeclarations? 
				(procedureDeclaration)*);			
constDeclaration
	:	(CONST (IDENT EQUALS expression SEMICOLON)*)
			-> ^(CONST (IDENT expression)*);		
typeDeclaration
	:	(TYPEDECL (IDENT EQUALS type SEMICOLON)*)
			-> ^(TYPEDECL (IDENT type)*);		
varDeclarations
	:	(VAR (identList COLON type SEMICOLON)*)
			-> ^(VAR identList type)*;
procedureDeclaration
	:	PROCEDURE routinename (formalParameters)? SEMICOLON declarations (procedureBody)? IDENT 
			-> ^(PROCEDURE routinename (formalParameters)? declarations (procedureBody)?);		
procedureBody
	:	BEGIN statementSequence END
			-> ^(BODY statementSequence);
assignment
	:	variable ASSIGNMENT^ expression;
actualParameters
	:	RNDOPEN (expression (COMMA expression)*)? RNDCLOSE
			-> ^(ACTUALPARAMETERS expression+);
procedureCall
	:	variable (actualParameters)? 
			-> ^(PROCEDURECALL variable (actualParameters)?)  ;

elseStatementPart
	:	ELSE statementSequence 
			-> ^(ELSE ^(BODY statementSequence));
elseifStatementPart
	:	ELSIF expression THEN statementSequence
			-> ^(ELSIF ^(CONDITION expression) 
				^(BODY statementSequence));
ifStatementPart
	:	IF expression THEN statementSequence 
			->^(IF ^(CONDITION expression) 
				^(BODY statementSequence)) ;

ifStatement:		ifStatementPart elseifStatementPart+ 
				elseStatementPart END
			-> ^(IFBLOCK ifStatementPart 
				elseifStatementPart+ 
				elseStatementPart)
			| ifStatementPart elseifStatementPart+ END
				-> ^(IFBLOCK ifStatementPart elseifStatementPart+)
			| ifStatementPart elseStatementPart END
				-> ^(IFBLOCK ifStatementPart elseStatementPart) 
			| ifStatementPart END
				-> ^(IFBLOCK ifStatementPart);

whileStatement:		WHILE expression DO statementSequence END
				-> ^(WHILE ^(CONDITION expression) ^(BODY statementSequence));
statement
	:	(assignment | procedureCall | ifStatement | whileStatement)?;
statementSequence
	:	statement (SEMICOLON statement)*;
identList
	:	IDENT (COLON IDENT)* 
			->^(IDENTLIST IDENT+);
arrayType 
	:	ARRAY expression OF type 
			-> ^(ARRAY expression type);	
fieldList
	:	(identList COLON type)?;
recordType 
	:	RECORD fieldList (SEMICOLON fieldList)* END
			-> ^(RECORD fieldList+);
type	:	(IDENT | arrayType | recordType);	
fpSection
	:	identList COLON type
			-> ^(REFVAR identList type)
		|VAR identList COLON type
			-> ^(VAR identList type);
formalParameters 
	:	RNDOPEN (fpSection (SEMICOLON fpSection)*)? RNDCLOSE 
			-> ^(FORMALPARAMETERS (fpSection+)?);
		
*/
expression returns [ IEvaluable node ]
	: lhsExp = simpleExpression 			{$node = $lhsExp.node; 					} 
	( EQUALS 	rhsExp =simpleExpression	{$node = new EqualsNode($node, $rhsExp.node);		}
	| HASH		rhsExp =simpleExpression	{$node = new EqualsNotNode($node, $rhsExp.node);	}
	| SMALLERTHEN	rhsExp =simpleExpression	{$node = new SmallerThenNode($node, $rhsExp.node);	}
	| SMALLEREQUAL	rhsExp =simpleExpression	{$node = new SmallerEqualNode($node, $rhsExp.node);	}
	| GREATERTHEN	rhsExp =simpleExpression	{$node = new GreaterThenNode($node, $rhsExp.node);	}
	| GREATEREQUAL	rhsExp =simpleExpression	{$node = new GreaterEqualNode($node, $rhsExp.node);	}
	)?;

simpleExpression returns [ IEvaluable node ]
	: 				{ Boolean minus = false; }
	(ADD 
	| SUBTRACT			{ minus = true; }
	)? 		
	lhsTerm = term 			{$node = $lhsTerm.node;					}
	(ADD 		rhsTerm = term 	{$node = new AddNode($node, $rhsTerm.node);		}
	| SUBTRACT 	rhsTerm = term 	{$node = new SubtractNode($node, $rhsTerm.node);	}
	| OR term 	rhsTerm = term 	{$node = new DisjunctionNode($node, $rhsTerm.node);	}
	)*				{if(minus) { $node = new NegativeNode($node);}		}
	;


term 	returns [ IEvaluable node ]
	: lhsFactor = factor			{$node = $lhsFactor.node;				} 
	( MULTIPLY 	rhsFactor = factor	{$node = new MultiplyNode($node, $rhsFactor.node);	}
	| DIVIDE 	rhsFactor = factor	{$node = new DivideNode($node, $rhsFactor.node);	}
	| MOD 		rhsFactor = factor	{$node = new ModuloNode($node, $rhsFactor.node);	}
	| AMPERSAND 	rhsFactor = factor	{$node = new ConjunctionNode($node, $rhsFactor.node);	}
	)*;

factor 	returns [ IEvaluable node ]
	: var=variable 				{ $node = $var.node; 		 	 	}
	| num=number 				{ $node = $num.node;			 	}
	| RNDOPEN exp=expression RNDCLOSE 	{ $node = $exp.node;		 	 	}
	| TILDE nFactor=factor			{ $node = new NegationNode($nFactor.node);	}
	;

number	returns [ IntegerNode node ]
	: INTEGER			{ $node = new IntegerNode( Integer.parseInt( $INTEGER.text ) ); }
	;

booleann returns [ BooleanNode node ]
	: FALSE 			{ $node = new BooleanNode ( false); }
	| TRUE				{ $node = new BooleanNode ( true); }
	;

variable returns [VariableNode node]
	: IDENT selector 		{ $node = new VariableNode ( $IDENT.text, $selector.node); }
	;

selector returns [ IEvaluable node ]
	: 
	(DOT IDENT 			{ new SelectorRecordNode ( $IDENT.text );	}
	| SQROPEN expression SQRCLOSE	{ new SelectorArrayNode  ( $expression.node );	}
	)*;
	

/*routinename
	:	IDENT	-> ^(ROUTINENAME IDENT);*/
	
IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;
WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
