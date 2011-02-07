grammar Oberon;
@header
{
package uva.oberon0.parser;

import uva.oberon0.abstractsyntax.*;
import uva.oberon0.abstractsyntax.declarations.*;
import uva.oberon0.abstractsyntax.expressions.*;
import uva.oberon0.abstractsyntax.statements.*;
import uva.oberon0.abstractsyntax.types.*;
}
@lexer::header
{
package uva.oberon0.parser;
}

MODULE	:	'MODULE';
PROCEDURE 
	:	'PROCEDURE';
CONST	:	'CONST';
VAR	:	'VAR';
TYPE	:	'TYPE';

IF	:	'IF';
THEN	:	'THEN';
ELSE	:	'ELSE';
ELSIF   :   	'ELSIF';
WHILE	:	'WHILE';

BEGIN	:	'BEGIN';
END	:	'END';
DO	:	'DO';

EQUAL	:	'=';
UNEQUAL	:	'#';
LESS	:	'<';
LESS_EQUAL
	:	'<=';
GREAT	:	'>';
GREAT_EQUAL
	:	'>=';

MIN	:	'-';
PLUS	:	'+';
MUL	:	'*';
DIV	:	'DIV';
MOD	:	'MOD';

AND	:	'&';
OR	:	'OR';
NOT	:	'~';

DECLARATIONS
	:	'DECLARATIONS';
INPUTVARS
	:	'INPUTVARS';
CALL	:	'CALL';
CALL_READ
	:	'Read';
CALL_WRITE
	:	'Write';
CALL_WRITELN
	:	'WriteLn';

ASSIGN	:	':=';

INTEGER	:	'INTEGER';
ARRAY	:	'ARRAY';
RECORD	:	'RECORD';
OF	:	'OF';

module  returns [Module node]
	:	MODULE node_id=id ';'
		node_declarations=declarations
		BEGIN
		node_statements=statements
		END id '.'									{$node = new Module($node_id.node, $node_declarations.node, $node_statements.node);};

declarations	returns [DeclarationList node]	:						{$node = new DeclarationList();}
		(constDeclaration[node]|varDeclaration[node]|typeDeclaration[node]|procedureDeclaration[node])*
		;

constDeclaration[DeclarationList list]	
	:	CONST node_id=id '=' node_exp=expression ';'					{$list.add(new Constant($node_id.node, $node_exp.node));};

varDeclaration[DeclarationList list]
	:	VAR (node_ids=idList ':' node_type=type ';' 					{for (ID id : $idList.node){ $list.add(new Variable(id, $node_type.node));}})*;

typeDeclaration[DeclarationList list]
	:	TYPE node_id=id '=' node_type=type ';'						{$list.add(new CustomType($node_id.node, $node_type.node));};

procedureDeclaration[DeclarationList list]	
	:	PROCEDURE node_id=id ('(' node_params=procedureParams ')')? ';'
		node_declarations=declarations
		BEGIN
		node_statements=statements
		END id ';'									{$list.add(new Procedure($node_id.node, $node_params.node, $node_declarations.node, $node_statements.node));};

procedureParams returns [VariableList node]	:						{$node = new VariableList();}
		node_declaration = procedureParam[node] (';' node_declaration = procedureParam[node])*
		;
			
procedureParam[VariableList list]
	:	({boolean byRef=false;} (VAR {byRef=true;})? node_ids=idList ':' node_type=type {for (ID id : $idList.node){ $list.add(new Variable(id, $node_type.node, byRef));}})*;

procedureCall	returns [Call node]
    	:   	(
    			CALL_READ	(call_vars=procedureActualParams)?			{$node = new CallRead($call_vars.node);}
    		|	CALL_WRITE	(call_vars=procedureActualParams)?			{$node = new CallWrite($call_vars.node);}
    		|	CALL_WRITELN	(call_vars=procedureActualParams)?			{$node = new CallWriteLn($call_vars.node);}
    		|	ID		(call_vars=procedureActualParams)?			{$node = new CallProcedure($call_vars.node, new ID($ID.text));}
    		);

procedureActualParams returns [ExpressionList node]
	:'(' (node_exp=expression 								{$node=new ExpressionList(); $node.add($node_exp.node);}
	 (',' node_exp=expression 								{$node.add($node_exp.node);})* 
	 )? ')'
	;

type	returns [BaseType node]	
	:	node_array=arrayType								{$node = $node_array.node;}
	|	node_record=recordType								{$node = $node_record.node;}
	|	INTEGER										{$node = new IntType();}
	|	ID										{$node = new IDType($ID.text);}
	;

arrayType returns [ArrayType node]
	:	ARRAY node_exp=expression OF node_type=type					{$node = new ArrayType($node_exp.node, $node_type.node);};


recordType returns [RecordType node]	:							{RecordFieldList fields = new RecordFieldList();}
		RECORD
		recordField[fields] (';' recordField[fields])*
		END 										{$node = new RecordType(fields);}
	;
		
recordField[RecordFieldList list]
	:	(node_ids=idList ':' node_type=type						{for (ID id : $idList.node){ $list.add(new RecordField(id, $node_type.node));}});


factor 	returns [Expression node]
	:   	ID 										{ID node_id = new ID($ID.text); $node = new Reference(node_id);} 
		idSelector[node_id]  		
	| 	INT 										{$node = new IntegerValue($INT.text);}
	| 	('(' expression ')' 								{$node=$expression.node;})
	| 	(NOT unary=factor								{$node=new Not($unary.node);})
	;

term    returns [Expression node]
	:   	left=factor 									{$node=$left.node;}
	(
		MUL right=factor								{$node=new Multiplication($node, $right.node);}
	|	DIV right=factor								{$node=new Division($node, $right.node);}
	|	MOD right=factor								{$node=new Modulo($node, $right.node);}
	|	AND right=factor								{$node=new And($node, $right.node);}
	)* ;

base 	returns [Expression node]
    	:   	(
    		MIN left=term									{$node=new Negative($left.node);}
    	|	PLUS left=term									{$node=new Positive($left.node);}
    	|	left=term									{$node=$left.node;}
    		)
    	 	(
    		MIN right=term									{$node=new Subtraction($node, $right.node);}
    	|	PLUS right=term									{$node=new Addition($node, $right.node);}
    	|	OR right=term									{$node=new Or($node, $right.node);}
    	 	)* ;

expression returns [Expression node]
    	:  	left=base 									{$node=$left.node;}
    	(
    		EQUAL right=base								{$node=new Equal($node, $right.node);}
    	|	UNEQUAL right=base								{$node=new NotEqual($node, $right.node);}
    	|	LESS right=base									{$node=new LessThan($node, $right.node);}
    	|	LESS_EQUAL right=base								{$node=new LessThanOrEqualTo($node, $right.node);}
    	|	GREAT right=base								{$node=new GreatherThan($node, $right.node);}
    	|	GREAT_EQUAL right=base								{$node=new GreatherThanOrEqualTo($node, $right.node);}
    	)?;
    
statements	returns [StatementList node]	:						{$node = new StatementList();}
		node_statement=statement 							{$node.add($node_statement.node);}
		(';' node_statement=statement 							{$node.add($node_statement.node);}
		)*;

statement	returns [Statement node]
   	:	(
   		assignment 									{$node = $assignment.node;}
   	| 	procedureCall 									{$node = $procedureCall.node;}
   	| 	ifStatement 									{$node = $ifStatement.node;}
   	| 	whileStatement 									{$node = $whileStatement.node;}
   	)? ;
        
assignment  	returns [Assign node]
	:	ID 										{ID node_id = new ID($ID.text);} 
		idSelector[node_id] ASSIGN node_expression=expression 				{$node = new Assign(node_id, $node_expression.node);};

ifStatement	returns [If node]
    	:   	IF node_expression=expression 
    		THEN node_statements=statements 
    		(node_elsifs=ifElsIfList) 
    		(ELSE node_else=statements)? END
    												{$node = new If($node_expression.node, $node_statements.node, $node_elsifs.node, $node_else.node);};

ifElsIfList	returns [ElsIfList node]	:						{$node = new ElsIfList();}
		(
		ELSIF node_expression=expression THEN node_statements=statements 		{$node.add(new ElsIf($node_expression.node, $node_statements.node));}
		)*
	;
		
whileStatement  returns [While node]
	:	WHILE node_expression=expression 
		DO node_statements=statements 
		END										{$node = new While($node_expression.node, $node_statements.node);};

id 	returns [ID node]
	:	ID										{$node = new ID($ID.text);};
	
idList	returns [IDList node]	:								{$node = new IDList();}
		node_id1=id 									{$node.add($node_id1.node);}
		(',' node_id2=id 								{$node.add($node_id2.node);}
		)*;

idSelector [ID node_parent]
@init												{ID node_current = $node_parent;}
    	:   	(('.' ID									{node_current=(ID)node_current.setSelector(new ID($ID.text));})
    	| 	('[' node_expression=expression ']'						{node_current.setSelector($node_expression.node);})
    		)*;

ID  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INT  	:	('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+;
WHITESPACE
       :       ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;
