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
	DECLARATIONS;
	BODY;
	FORMALPARAMETERS;
	ACTUALPARAMETERS;
	CONDITION;
	IFBLOCK;
	IDENTLIST;
	NONREFVAR;
	PROCEDURECALL;
	OBERONPROGRAM;
}

@header {package generated; 
import oberon0.ast.expressions.*;
import oberon0.ast.expressions.variables.*;
import oberon0.ast.declarations.*;
import oberon0.ast.routines.*;
import oberon0.ast.statements.*;
}

@lexer::header {package generated;
}

/*oberonprogram
	:	module 
			-> ^(OBERONPROGRAM module);*/
			
module	returns [ ModuleNode node ]:	
	MODULE name = IDENT SEMICOLON decl = declarations mbody = body IDENT DOT EOF		{$node = new ModuleNode($name.text, $decl.node, $mbody.node);}
	;

body	returns [ IExecutable node ]
	: BEGIN 			{ArrayList<IExecutable> list = 
						new ArrayList<IExecutable>();	}
	stat1 = statement 		{list.add($stat1.node);			}
	(SEMICOLON 
	statx = statement		{list.add($statx.node);			}
	)*
	END				{node = new BodyNode(list);		}
	;
	
declarations returns [ IDeclarable node ]
	: 				{ArrayList<IDeclarable> list = 
						 new ArrayList<IDeclarable>();	}
	(constdecl = constDeclarations	{list.add($constdecl.node);		}
	)? 
	//typeDeclaration? 
	(vardecl = varDeclarations  	{list.add($vardecl.node);		}
	)?
	//(procedureDeclaration SEMICOLON)*
					{node = new DeclarationsNode(list);	}
	;
				
constDeclarations returns [ IDeclarable node]
	: 				{ArrayList<IDeclarable> list = 
						 new ArrayList<IDeclarable>();				}
	CONST 			
	(name = IDENT 
	 EQUALS 
	 exp = expression 				
	 SEMICOLON 			{list.add(new ConstDeclarationNode($name.text, $exp.node));	}
	)*				{node = new DeclarationsNode(list);				}
	;

/*typeDeclaration
	:	(TYPEDECL (IDENT EQUALS type SEMICOLON)*)
			-> ^(TYPEDECL (IDENT type)*);		
*/

varDeclarations returns [ IDeclarable node ]
	: 				{ArrayList<IDeclarable> list = 
						 new ArrayList<IDeclarable>();				}
	VAR (names = identList 
	COLON typ = type 		{list.add(new VarDeclarationNode($names.list, $typ.node));	}
	SEMICOLON			{node = new DeclarationsNode(list);				}
	)*			
	;
/*		
procedureDeclaration
	:	PROCEDURE IDENT (formalParameters)? SEMICOLON declarations (procedureBody)? IDENT 
			-> ^(PROCEDURE IDENT (formalParameters)? declarations (procedureBody)?);		

			*/

identList returns [ ArrayList<String> list]
	:				{list =	 new ArrayList<String>();	}
	ident1 = IDENT 			{list.add($ident1.text);		}
	(COMMA ident2 =IDENT		{list.add($ident2.text);		}
	)*;
/*
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
*/
statement returns [ IExecutable node ]
	:(ass = assignment 		{$node = $ass.node;	} 
//	| procedureCall 
//	| ifStatement 
//	| whileStatement
	)?;
	
assignment returns [ IExecutable node ]
	:ident=IDENT selec=selector 
	ASSIGNMENT 
	exp = expression		{$node = new AssignmentNode($ident.text, $selec.node, $exp.node);}
	;

	
type	returns [ IEvaluable node ]
	: ident = IDENT 			{$node = new TypeNode($ident.text);			}
	|ARRAY exp = expression 
		OF typ = type			{$node = new ArrayTypeNode($exp.node, $typ.node);	}
//	| recordType
	;
/*
fieldList
	:	(identList COLON type)?;
recordType 
	:	RECORD fieldList (SEMICOLON fieldList)* END
			-> ^(RECORD fieldList+);
	
fpSection
	:	identList COLON type
			-> ^(NONREFVAR identList type)
		|VAR identList COLON type
			-> ^(VAR identList type);
formalParameters 
	:	RNDOPEN (fpSection (SEMICOLON fpSection)*)? RNDCLOSE 
			-> ^(FORMALPARAMETERS (fpSection+)?);*/
		

expression returns [ IEvaluable node ]
	: lhsExp = simpleExpression 			{$node = $lhsExp.node; 					} 
	( EQUALS 	rhsExp = simpleExpression	{$node = new EqualsNode($node, $rhsExp.node);		}
	| HASH		rhsExp = simpleExpression	{$node = new EqualsNotNode($node, $rhsExp.node);	}
	| SMALLERTHEN	rhsExp = simpleExpression	{$node = new SmallerThenNode($node, $rhsExp.node);	}
	| SMALLEREQUAL	rhsExp = simpleExpression	{$node = new SmallerEqualNode($node, $rhsExp.node);	}
	| GREATERTHEN	rhsExp = simpleExpression	{$node = new GreaterThenNode($node, $rhsExp.node);	}
	| GREATEREQUAL	rhsExp = simpleExpression	{$node = new GreaterEqualNode($node, $rhsExp.node);	}
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
	:					
	lhsFactor = factor			{$node = $lhsFactor.node;				} 
	( MULTIPLY 	rhsFactor = factor	{$node = new MultiplyNode($node, $rhsFactor.node);	}
	| DIVIDE 	rhsFactor = factor	{$node = new DivideNode($node, $rhsFactor.node);	}
	| MOD 		rhsFactor = factor	{$node = new ModuloNode($node, $rhsFactor.node);	}
	| AMPERSAND 	rhsFactor = factor	{$node = new ConjunctionNode($node, $rhsFactor.node);	}
	)*;

factor 	returns [ IEvaluable node ]
	: ident=IDENT selec=selector 		{ $node = new VariableNode($ident.text, $selec.node);	}
	| num=number 				{ $node = $num.node;			 		}
	| RNDOPEN exp=expression RNDCLOSE 	{ $node = $exp.node;		 	 		}
	| TILDE nFactor=factor			{ $node = new NegationNode($nFactor.node);		}
	;

number	returns [ IntegerNode node ]
	: INTEGER			{ $node = new IntegerNode( Integer.parseInt( $INTEGER.text ) ); }
	;

booleann returns [ IEvaluable node ]
	: FALSE 			{ $node = new BooleanNode ( false); }
	| TRUE				{ $node = new BooleanNode ( true); }
	;

selector returns [ IEvaluable node ]
	: 
	(DOT IDENT 			{ new SelectorRecordNode ( $IDENT.text );	}
	| SQROPEN expression SQRCLOSE	{ new SelectorArrayNode  ( $expression.node );	}
	)*;
	
IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;
WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
