grammar Oberon0;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

/////////////////////////////////////////////////////////////////
//CONTEXT-FREE SYNTAX
/////////////////////////////////////////////////////////////////
@header {
  package oberon0;
}

@lexer::header {
  package oberon0;
}

/////////////////////////////////////////////////////////////////
//PROGRAM
/////////////////////////////////////////////////////////////////
program                                 returns [Program program]
  : mod=module                          { $program = new Program(mod);}
  ;


/////////////////////////////////////////////////////////////////
//MODULE
/////////////////////////////////////////////////////////////////
module                                  returns [Module module]
  : 'MODULE' id1=IDENT ';'              { $module = new Module(id1.text);} 
     decls=declarations                 { $module.addDeclarations(decls);}
     (  'BEGIN' stats=statementSequence { $module.addStatements(stats);}
     )?
    'END' id2=IDENT '.'                 { $module.setCloseIdentifier(id2.text);}
  ;
 
 
/////////////////////////////////////////////////////////////////
//DECLERATIONS
/////////////////////////////////////////////////////////////////
declarations                            returns [ArrayList<Declaration> declarations]
  :                                     { $declarations = new ArrayList<Declaration>();}
    ( 'CONST' 
      (con=constantDecleration          { $declarations.add(con);}
      )*
    )? 
    ( 'TYPE' 
      (typ=typeDecleration              { $declarations.add(typ);}
      )*
    )? 
    ( 'VAR' 
      (vars=variableDecleration         { $declarations.addAll(vars);}
      )*
    )? 
    ( proc=procedureDeclaration         { $declarations.add(proc);} 
    )*
  ;

constantDecleration                     returns [ConstantDeclaration constant]
  : IDENT '=' exp=expression ';'        { $constant = new ConstantDeclaration($IDENT.text, exp.evaluate(null));}
  ;

typeDecleration                         returns [TypeDeclaration type]
  : IDENT '=' typ=type ';'              { $type = new TypeDeclaration($IDENT.text, typ);}
  ;

variableDecleration                     returns [List<VariableDeclaration> variables]
  :                                     { $variables = new ArrayList<VariableDeclaration>();} 
    idents=identList ':' typ=type ';'   { for (String identifier : idents) {
																		        $variables.add(new VariableDeclaration(identifier,typ));
																		      }    
																		    }
  ;

procedureDeclaration                    returns [ProcedureDeclaration procedure]
  : 'PROCEDURE' id1=IDENT               { $procedure = new ProcedureDeclaration(id1.text);}
    ( formPars=formalParameters         { $procedure.addFormalParameters(formPars);}
    )? 
    decls=declarations                  { $procedure.addDeclarations(decls);}
    ( 'BEGIN' stats=statementSequence   { $procedure.addStatements(stats);}
    )?                                     
    'END' id2=IDENT ';'                 { $procedure.setCloseIdentifier(id2.text);}
  ;


  
fragment formalParameters               returns [List<FormalParametersDeclaration> formalParams]
  :                                     { $formalParams = new ArrayList<FormalParameters>();}
    '(' 
      ( paramSec1=fpSection             { $formalParams.addAll(paramSec1);}          
        ( ';' paramSec2=fpSection       { $formalParams.addAll(paramSec2);}
        )* 
      )? 
    ')'
  ;
  
fragment fpSection                      returns [List<FormalParametersDeclaration> formalParams]
  :                                     { boolean isByReference = false;
                                          $formalParams = new ArrayList<FormalParametersDeclaration>();
                                        }
    ( 'VAR'                             { isByReference = true;}
    )? 
    ids=identList ':' typ=type          { for (String id : ids) {
                                            $formalParams.add(new FormalParameterDeclaration(id,type,isByReference);
                                          }
                                        }
  ;

identList                               returns [List<String>identifiers]
  :                                     { $identifiers = new ArrayList<String>();}
    id1=IDENT                           { $identifiers.add(id1.text);}
    ( ',' id2=IDENT                     { $identifiers.add(id2.text);}
    )*
  ;

/////////////////////////////////////////////////////////////////
//EXPRESSIONS
/////////////////////////////////////////////////////////////////
expression                              returns [Expression expression]
  :                                     { Expression expLeft, expRight = null;
                                          Operator operator = null;
                                        }
    expl=simpleExpression               { expLeft = expl;}
    ( 
      ( '='                             { operator = Operator.EqualsToOperator;}
      | '#'                             { operator = Operator.NotEqualsToOperator;}      
      | '<'                             { operator = Operator.GreaterThenOperator;}
      | '<='                            { operator = Operator.GreaterOrEqualsToOperator;}
      | '>'                             { operator = Operator.SmallerThenOperator;}
      | '>='                            { operator = Operator.SmallerOrEqualsToOperator;}
      ) 
      expr=simpleExpression             { expRight = expr;}     
    )?
                                        { ExpressionFactory expFactory = ExpressionFactory.getExpressionFactory;
                                          $expression = expFacory.getExpression(operator,expLeft,expRight);
                                        }
  ;
 
fragment simpleExpression               returns [Expression expression]
  :                                     { Expression expLeft, expRight = null; 
                                          Operator operator = null;
                                          ExpressionFactory expFactory = ExpressionFactory.getExpressionFactory;
                                        }
    ( '-'                               { operator = Operator.NegationOperator;}
      |
      '+'                               { operator = null;}
    )? 
    term1=term                             { if (operator != null) {
                                            expLeft = expFacory.getExpression(operator,term1,null);
                                          }
                                          else {
                                            expLeft = t1;
                                          }
                                          operator = null;
                                        }
    ( ( '+'                             { operator = Operator.AdditionOperator;}
      | '-'                             { operator = Operator.AdditionOperator;}
      | 'OR'                            { operator = Operator.LogicalOrOperator;}
      ) 
      term2=term                        { expRight = term2;} 
    )*
                                        { $expression = expFacory.getExpression(operator,expLeft,expRight);}
  ;
  
fragment term                           returns [Expression expression] 
  :                                     { Expression expLeft, expRight = null; 
                                          Operator operator = null;
                                        }
    fact1=factor                        { expLeft = fact1;}
	   ( 
	     ( '*'                            { operator = Operator.MultiplicationOperator;}      
	     | 'DIV'                          { operator = Operator.DivisionOperator;}
	     | 'MOD'                          { operator = Operator.ModulusOperator;}
	     | '&'                            { operator = Operator.LogicalAndOperator;}
	     ) 
	     fact2=factor                     { expRight = fac2;}
	   )*
                                        { ExpressionFactory expFactory = ExpressionFactory.getExpressionFactory;
                                          $expression = expFacory.getExpression(operator,expLeft,expRight);
                                        }
  ;
fragment factor                         returns [Expression expression]
  : ( id=IDENT sel=selector             { $expression = new IdentifierExpression(id.text, sel);} 
    | i=INTEGER                         { $expression = new IntegerExpression(Integer.parseInt(i.text));}
    | '(' exp=expression ')'            { $expression = exp;}
    | '~' fact=factor                   { $expression = new LogicalNotExpression(fact);}
    )
  ;

fragment selector                       returns [Selector selector]
  :                                     { $selector = null; }
    ( 
      '.' id=IDENT                      { dotSel = new DotSelector(id.text);
                                          if ($selector == null) {
                                            $selector = dotSel;
                                          }
                                          else {
                                            $selector.addSelector(dotSel);
                                          }
                                        } 
    | 
      '[' expression ']'                { brakSel = new BracketSelector();
                                          if ($selector == null) {
                                            $selector = brakSel;
                                          }
                                          else {
                                            $selector.addSelector(brakSel);
                                          }
                                        }
    )*
  ;


/////////////////////////////////////////////////////////////////
//STATEMENTS
/////////////////////////////////////////////////////////////////
statement                               returns [Statment statement]
  : ( ass=assignment                    { $statement = ass;}   
    | procedureCall
    | ifStatement
    | whileStatement
    )?
  ;  

assignment                               returns [AssignmentStatement statement]
  : id=IDENT sel=selector 
    ':=' 
    exp=expression 
                                        { $statement = new AssignmentStatement(id.text, sel, exp);}
  ;

procedureCall                           returns [ProcedureCallStatement statement]
  : id=IDENT                            { ProcedureCallStatement procCall = new ProcedureCallStatement(id.text);}
    ( actParams=actualParameters        { procCall.addActualParams(actParams); }
    )?
                                        { $statement = procCall; }
  ;

fragment actualParameters               returns [List<Expression>actualParams]
  :                                     {actualParams = new ArrayList<Expression>();}
    '(' ( exp1=expression               {actualParam.add(exp1);}
        ( ',' exp2=expression           {actualParam.add(exp2);}
        )*
      )? 
    ')'
  ;

ifStatement                             returns [Statement statement]
  : 'IF' expression 'THEN'              { IfStatment ifStat = new IfStatment(expression);} 
        stats1=statementSequence          { ifStat.addStatments(stats1);}
    ( 
    'ELSIF' expression 'THEN'           { ElsifStatement elsifStat = new ElsifStatement(expression);}
        stats2=statementSequence        { elsifStat.addStatements(stats2);
                                          ifStat.addElsifStatement(elsifStat);
                                        }
    )*  
    ( 
    'ELSE'                              { ElseStatement elseStat = new ElseStatement();}
        stats3=statementSequence        { elseStat.addStatements(stats3);
                                          ifStat.addElseStatement(elseStat);
                                        }
    )? 
    'END'                               {$statement = ifStat;}
  ;
 
whileStatement                          returns [Statement statement]
  : 'WHILE' expression 'DO'             { WhileStatment whileStat = new WhileStatement(expression);} 
      stats=statementSequence           { whileStat.addStatements(stats);}
    'END'                               { $statement = whileStat;}
  ; 


fragment statementSequence              returns [List<Statement>statements]
  :                                     { $statements = new ArrayList<Statement>();}
    stat1=statement                     { $statements.add(stat1);}                           
      ( ';' stat2=statement             { $statements.add(stat2);}                 
      )*
  ;


/////////////////////////////////////////////////////////////////
//TYPES
/////////////////////////////////////////////////////////////////
type                                    returns [Type type]
  : decTyp=declaredType                 { $type = decTyp;}
  | arrTyp=arrayType                    { $type = arrTyp;}
  | recTyp=recordType                   { $type = recTyp;}
  | intTyp=integerType                  { $type = intTyp;}
  ;

declaredType                            returns [DeclaredType type]
  : id=IDENT                            { $type = new DeclaredType(id.text);}
  ;
 
  
arrayType                               returns [ArrayType type]
  : 'ARRAY' exp=expression 
    'OF'    typ=type                    { $type = new ArrayType(exp,typ);}
  ;

recordType                              returns [RecordType type]
  : 'RECORD'                            { RecordType record = new RecordType();}   
      fields1=fieldList                 { record.addFields(fields1);}
      ( ';' fields2=fieldList           { record.addFields(fields2);}
      )* 
    'END'                               { $type = record;}
  ;
  
integerType                             returns [IntegerType type]
  : 'INTEGER'                           { $type = new IntegerType();}
  ;

fragment fieldList                      returns [List<RecordField> fields]
  :                                     { $fields = new ArrayList<RecordFields>();}
    ( id=identList ':' typ=type         { $fields.add(new RecordField(id.text,typ);}
    )?
  ;

  
/////////////////////////////////////////////////////////////////
//LEXICAL SYNTAX
/////////////////////////////////////////////////////////////////

WS  
  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
  ;

IDENT 
  :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INTEGER
  : '0' 
  | '1'..'9' DIGITS*
  ;
  
fragment DIGITS
  : ('0'..'9')+
  ;

