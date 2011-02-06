tree grammar Oberon0Interpreter;

options {
  language = Java;
  tokenVocab = Oberon0;
  ASTLabelType = CommonTree;
}

@header {
package oberon0;
  
import oberon0.interpreter.declaration.*;
import oberon0.interpreter.expression.*;
import oberon0.interpreter.statement.*;
import oberon0.interpreter.module.*;
import oberon0.interpreter.program.*;
import oberon0.interpreter.procedure.*;
import oberon0.interpreter.type.*;
import oberon0.interpreter.identifier.*;
}

@members {

}


/////////////////////////////////////////////////////////////////
//PROGRAM
/////////////////////////////////////////////////////////////////
program returns [Program program]
  : mod=module EOF
    {$program = new Program(mod);}
  ;

/////////////////////////////////////////////////////////////////
//MODULE
/////////////////////////////////////////////////////////////////
module returns [Module module]
  : ^('MODULE' IDENT
    {$module = new Module($IDENT.text);}
      //DECLARATIONS
      (constants=constantBlock      {$module.addConstants(constants);}   )? 
      (types=typeBlock              {$module.addTypeDeclarations(types);}           )? 
      (variables=variableBlock      {$module.addVariables(variables);}   )?
      //PROCEDURE DECLARATIONS (0 OR MANY)
      (proc=procedure               {$module.addProcedure(proc);} )*
      //STATEMENTS
      (statements=statementBlock    {$module.addStatements(statements);} )?
    )
  ;
 
/////////////////////////////////////////////////////////////////
//PROCEDURE
///////////////////////////////////////////////////////////////// 
fragment procedure returns [Procedure procedure]
  : ^('PROCEDURE' IDENT   
      {$procedure = new Procedure($IDENT.text);}
      //PARAMETERS
      (params=parametersDeclaration {$procedure.addParameters(params);}     )
      //DECLARATIONS
      (constants=constantBlock      {$procedure.addConstants(constants);}   )? 
      (types=typeBlock              {$procedure.addTypeDeclarations(types);}           )? 
      (variables=variableBlock      {$procedure.addVariables(variables);}   )?
      //PROCEDURE DECLARATIONS (0 OR MANY)
      (proc=procedure               {$procedure.addProcedure(proc);} )*
      //STATEMENTS
      (statements=statementBlock    {$procedure.addStatements(statements);})?
   )
  ; 
  
fragment parametersDeclaration returns [ArrayList<Parameter> parameters]
  : {$parameters = new ArrayList<Parameter>();}
    ^(PARAMS 
      (
        refParams=referencedParameters
        {$parameters.addAll(refParams);} 
        | 
        params=parameters
        {$parameters.addAll(params);}
      )*
    )
  ;  

fragment referencedParameters returns [ArrayList<Parameter> parameters]
  : {$parameters = new ArrayList<Parameter>();}
    ^('VAR' 
      params=parameters
      //Gather parameters and make new Referenced parameters.
      { for (Parameter param : params) {
          String identifier = param.getIdentifier();
          Type type = param.getType();
          //Add a new referenced parameter.
          $parameters.add(new Parameter(identifier,type,true));
        }
      }
    )
  ;  
  
fragment parameters returns [ArrayList<Parameter> parameters]
  : {$parameters = new ArrayList<Parameter>();}
    ^(':' ids=identifierList typ=type
      //Add 0 or more variables of this type. 
      { for (String identifier : ids) { 
          $parameters.add(new Parameter(identifier, typ.getNew(), false));
        }
      }
    )
  ;

//CONSTANT BLOCK  
fragment constantBlock returns [ArrayList<Constant> constants]
  : {$constants = new ArrayList<Constant>();} 
  ^('CONST' 
    (con=constantDecleration 
      {$constants.add(con);}
    )*
  )
  ;

fragment constantDecleration returns [Constant constant]
  : ^(IDENT expr=expression
      { $constant = new Constant($IDENT.text, expr);}
    )
  ;

//TYPE BLOCK
fragment typeBlock returns [ArrayList<TypeDeclaration> typeDecls]
  : {$typeDecls = new ArrayList<TypeDeclaration>();} 
  ^('TYPE' 
    (declType=typeDecleration 
      {$typeDecls.add(declType);}
    )*
  )
  ;

fragment typeDecleration returns [TypeDeclaration declaredType]
  : ^(IDENT typ=type
      {$declaredType = new TypeDeclaration($IDENT.text, typ);}
    ) 
  ;

fragment type returns [Type typeName]
  : 'INTEGER' {$typeName = new IntegerType();}
  |
    ^('ARRAY' expr=expression typ=type
      {$typeName = new ArrayType(expr, typ);}
    ) 
  ;

//VARIABLE BLOCK
fragment variableBlock returns [ArrayList<Variable> variables]
  : {$variables = new ArrayList<Variable>();} 
  ^('VAR' 
    (variablesOfType=variableDecleration 
      {$variables.addAll(0,variablesOfType);}
    )*
  )
  ;
  
fragment variableDecleration returns [ArrayList<Variable> variables]
  : { $variables = new ArrayList<Variable>();}
  ^(':' ids=identifierList typ=type
      //Add 0 or more variables of this type.
      { for (String identifier : ids) { 
          $variables.add(new Variable(identifier, typ.getNew()));
        }
      }
    )
  ;
fragment identifierList returns [ArrayList<String>identifiers]
  : { $identifiers = new ArrayList<String>();}
    (IDENT {$identifiers.add($IDENT.text);})*
  ;  

//STATMENTS BLOCK
fragment statementBlock returns [ArrayList<Statement> statements]
  : {$statements = new ArrayList<Statement>();} 
  ^(STATEMENTS 
    (stat=statement 
      {$statements.add(stat);}
    )*
  )
  ;


/////////////////////////////////////////////////////////////////
//STATEMENTS
/////////////////////////////////////////////////////////////////
statement returns [Statement statement]
  //IF Statement
  :^('IF' ifExp=expression ifStateSeq=thenStatementSequence     
    {
      $statement = new IfStatement(ifExp,ifStateSeq);
    }
	  (elsifStatement=elsifBlock
	    {((IfStatement)$statement).addFollowIfStatement(elsifStatement);}
	  )*
	  (elseStatment=elseBlock
      {((IfStatement)$statement).addFollowIfStatement(elseStatment);}
	  )?  
  )
  |
  ////////////////////////////////////////////////////
  //WHILE Statement
  ////////////////////////////////////////////////////
  ^('WHILE' exp=expression statSeq=doStatementSequence
    {$statement = new WhileStatement(exp,statSeq);}
  )
  |
  //Procedure call
  ^(IDENT actParams=actualParameters)
    {$statement = new ProcedureCallStatement($IDENT.text,actParams);}
  |
  //Assigment with selector.
  ^(':=' ident=identifier expr=expression    
    { $statement = new AssigmentStatement(ident,expr);}
  )
  ; 
 
fragment elsifBlock returns [IfStatement elsifStament]
  :^('ELSIF' elIfExpr=expression elIfStatSeq=thenStatementSequence 
    {$elsifStament = new IfStatement(elIfExpr,elIfStatSeq);}
    ) 
  ;

fragment elseBlock returns [IfStatement elseStament]
  :^('ELSE' elseStatSeq=statementSequence 
    {$elseStament = new IfStatement(new AlwaysTrueExpression(),elseStatSeq);}
    ) 
  ;  

fragment thenStatementSequence returns [ArrayList<Statement> result]
  : ^('THEN' statSeq=statementSequence)
    {$result = new ArrayList();
     $result.addAll(statSeq);
    }
  ;

fragment doStatementSequence returns [ArrayList<Statement> result]
  : ^('DO' statSeq=statementSequence)
    {$result = new ArrayList();
     $result.addAll(statSeq);
    }
  ;


statementSequence returns [ArrayList<Statement> statements] 
  :{$statements = new ArrayList<Statement>();}
  (stat=statement {statements.add(stat);} 
    (otherStat=statement {statements.add(otherStat);})*
  )? 
  ;
  
selector returns [Selector selector]  
  : 
  ^(VAR_SEL ident=IDENT
    {$selector = new VariableSelector($IDENT.text);}
  ) 
  |
  ^(ARR_SEL expr=expression 
    {$selector = new ArrayIndexSelector(expr);}
  )  
  ;

actualParameters returns [ArrayList<Expression> result]
  : {ArrayList<Expression> expressions = new ArrayList<Expression>();}  
  (exp=expression {expressions.add(exp);} (otherExpr=expression {expressions.add(otherExpr);})*)?
  {$result = expressions;}
  ;
  
declarations returns [Boolean result]
  : ^(VAR (tempTypeDecleration)*) 
  ;
  
fragment tempTypeDecleration returns [Boolean result]
  : ^('INTEGER' identifiers=identList) {$result = false;}
  ;  
  
fragment identList returns [ArrayList<String>result]
  : {ArrayList<String>identifiers = new ArrayList<String>();}
    (IDENT {identifiers.add($IDENT.text);})?
    {$result = identifiers;}
  ;


/////////////////////////////////////////////////////////////////  
//EXPRESSIONS
/////////////////////////////////////////////////////////////////

expression returns [Expression expression]
  : ^('='  exp1=expression exp2=expression)     {$expression = new EqualExpression(exp1,exp2);}
  | ^('#'  exp1=expression exp2=expression)     {$expression = new NotEqualExpression(exp1,exp2);}     
  | ^('<'  exp1=expression exp2=expression)     {$expression = new SmallerExpression(exp1,exp2);}
  | ^('<=' exp1=expression exp2=expression)     {$expression = new SmallerOrEqualExpression(exp1,exp2);}
  | ^('>'  exp1=expression exp2=expression)     {$expression = new GreaterExpression(exp1,exp2);}
  | ^('>=' exp1=expression exp2=expression)     {$expression = new GreaterOrEqualExpression(exp1,exp2);}
  | ^('+'  exp1=expression exp2=expression)     {$expression = new PlusExpression(exp1,exp2);}
  | ^('*'  exp1=expression exp2=expression)     {$expression = new TimesExpression(exp1,exp2);}
  | ^('-'  exp1=expression exp2=expression)     {$expression = new MinusExpression(exp1,exp2);}
  | ^('DIV' exp1=expression exp2=expression)    {$expression = new DevideExpression(exp1,exp2);}
  | ^('MOD' exp1=expression exp2=expression)    {$expression = new ModuloExpression(exp1,exp2);}
  | ^('&' exp1=expression exp2=expression)      {$expression = new AndExpression(exp1,exp2);}
  | ^(NEGATION exp=expression)                  {$expression = new NegationExpression(exp);}
  | ident=identifier                            {$expression = new IdentifierExpression(ident);} 
  | INTEGER                                     {$expression = new IntegerExpression(new IntegerType($INTEGER.text));}
  ;  
  
fragment identifier returns [Identifier identifier]
  :(IDENT { $identifier = new Identifier($IDENT.text);} 
      (sel=selector {$identifier.addSelector(sel);})?
   )
  ;
  
  
  
  
  
  
  
  
  