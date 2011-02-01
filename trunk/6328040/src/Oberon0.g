grammar Oberon0;

options { 	
	output=AST; 
}

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
	
	FORMALPARAMETERS;
	ACTUALPARAMETERS;
	REFVAR;
	BODY;
	CONDITION;
	PROCEDURECALL;
	SELECTOR;
	OBERONPROGRAM;
	DECLARATIONS;
	IFBLOCK;
	IDENTLIST;
	ROUTINENAME;
	}

@header {package generated; 
}

@lexer::header {package generated;
}

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
	:	vairable ASSIGNMENT^ expression;
actualParameters
	:	RNDOPEN (expression (COMMA expression)*)? RNDCLOSE
			-> ^(ACTUALPARAMETERS expression+);
procedureCall
	:	vairable (actualParameters)? 
			-> ^(PROCEDURECALL vairable (actualParameters)?)  ;

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
		

expression returns [ ExpressionNode node ]
	: lhsExp = simpleExpression { $expression = $lhsExp.simpleExpression; } 
	(( EQUALS 	) rhsExp =simpleExpression	
	| HASH		
		| SMALLERTHEN
	| SMALLEREQUAL
	| GREATERTHEN
	| GREATEREQUAL
	) rhsExp =simpleExpression
	)?;

simpleExpression 
	:	(ADD | SUBTRACT)? term ((ADD | SUBTRACT | OR)^ term)*;


term 	returns [ TermNode node ]
	: factor ((MULTIPLY | DIVIDE | MOD | AMPERSAND) factor)*;

factor 	returns [ INode node ]
	: vairable 			{ $node = $vairable.node; 		 }
	| number 			{ $node = $number.node;			 }
	| RNDOPEN expression RNDCLOSE 	{ $node = $expression.node;		 }
	| TILDE factor			{ $node = new NegationNode($factor.node);}
	;

number	returns [ IntegerNode node ]
	: INTEGER			{ $node = new IntegerNode( Integer.parseInt( $INTEGER.text ) ); }
	;

vairable returns [VariableNode node]
	: IDENT selector 		{ $node = new VariableNode ( $IDENT.text, $selector.node); }
	;

selector returns [ INode node ]
	: 
	(DOT IDENT 			{ new SelectorRecordNode ( $IDENT.text );	}
	| SQROPEN expression SQRCLOSE	{ new SelectorArrayNode  ( $expression.node );	}
	)*;
	

routinename
	:	IDENT	-> ^(ROUTINENAME IDENT);

BOOLEAN	:	'FALSE' | 'TRUE';				//not directly specified, unimplemented
IDENT  	:	('a'..'z'|'A'..'Z'|'_') 
		('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER :	'0'..'9'+;
WS	: 	(' '|'\t'|'\n'|'\r')+ {skip();};	//mandatory whitespace
OPTWS	:	(' '|'\t'|'\n'|'\r')* {skip();};	//optional whitespace
