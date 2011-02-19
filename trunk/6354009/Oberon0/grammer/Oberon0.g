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
  
  import oberon0.declaration.*;
	import oberon0.expression.*;
	import oberon0.program.*;
	import oberon0.selector.*;
	import oberon0.statement.*;
	import oberon0.type.*;
	import oberon0.value.*;
}

@lexer::header {
  package oberon0;
}

/////////////////////////////////////////////////////////////////
//PROGRAM
/////////////////////////////////////////////////////////////////
program                                 returns [Program program]
  : m=module                            { $program = new Program(m.module);}
  ;


/////////////////////////////////////////////////////////////////
//MODULE
/////////////////////////////////////////////////////////////////
module                                  returns [ModuleDeclaration module]
  : 'MODULE' i1=IDENT ';'               { $module = new ModuleDeclaration(i1.getText());} 
     d=declarations                     { $module.addDeclarations(d.declarations);}
     (  'BEGIN' s=statementSequence     { $module.addStatements(s.statements);}
     )?
    'END' i2=IDENT '.'                  {/*TODO check close identifier.*/}
  ;
 
 
/////////////////////////////////////////////////////////////////
//DECLERATIONS
/////////////////////////////////////////////////////////////////
declarations                            returns [ArrayList<Declaration> declarations]
  :                                     { $declarations = new ArrayList<Declaration>();}
    ( 'CONST' 
      (c=constantDecleration            { $declarations.add(c.constant);}
      )*
    )? 
    ( 'TYPE' 
      (t=typeDecleration                { $declarations.add(t.type);}
      )*
    )? 
    ( 'VAR' 
      (v=variableDecleration            { $declarations.addAll(v.variables);}
      )*
    )? 
    ( p=procedureDeclaration            { $declarations.add(p.procedure);} 
    )*
  ;

constantDecleration                     returns [ConstantDeclaration constant]
  : i=IDENT '=' e=expression ';'        { IntegerValue intVal = e.expression.evaluate(null);
                                          $constant = new ConstantDeclaration(i.getText(), intVal);
                                        }
  ;

typeDecleration                         returns [TypeDeclaration type]
  : IDENT '=' t=type ';'                { $type = new TypeDeclaration($IDENT.text, t.type);}
  ;

variableDecleration                     returns [List<VariableDeclaration> variables]
  :                                     { $variables = new ArrayList<VariableDeclaration>();} 
    i=identList ':' t=type ';'          { for (String identifier : i.identifiers) {
																		        $variables.add(new VariableDeclaration(identifier,t.type));
																		      }    
																		    }
  ;

procedureDeclaration                    returns [ProcedureDeclaration procedure]
  : 'PROCEDURE' i1=IDENT                { $procedure = new ProcedureDeclaration(i1.getText());}
    ( f=formalParameters                { $procedure.addFormalParameters(f.formalParams);}
    )? ';'
    d=declarations                      { $procedure.addDeclarations(d.declarations);}
    ( 'BEGIN' s=statementSequence       { $procedure.addStatements(s.statements);}
    )?                                     
    'END' i2=IDENT ';'                  { /*TODO check close identifier*/}
  ;


  
fragment formalParameters               returns [List<FormParamDeclaration> formalParams]
  :                                     { $formalParams = new ArrayList<FormParamDeclaration>();}
    '(' 
      ( fp1=fpSection                   { $formalParams.addAll(fp1.formalParams);}          
        ( ';' fp2=fpSection             { $formalParams.addAll(fp2.formalParams);}
        )* 
      )? 
    ')'
  ;
  
fragment fpSection                      returns [List<FormParamDeclaration> formalParams]
  :                                     { boolean isByReference = false;
                                          $formalParams = new ArrayList<FormParamDeclaration>();
                                        }
    ( 'VAR'                             { isByReference = true;}
    )? 
    i=identList ':' t=type              { for (String id : i.identifiers) {
                                            $formalParams.add(new FormParamDeclaration(id,t.type,isByReference));
                                          }
                                        }
  ;

identList                               returns [List<String>identifiers]
  :                                     { $identifiers = new ArrayList<String>();}
    i1=IDENT                            { $identifiers.add(i1.getText());}
    ( ',' i2=IDENT                      { $identifiers.add(i2.getText());}
    )*
  ;


/////////////////////////////////////////////////////////////////
//STATEMENTS
/////////////////////////////////////////////////////////////////
statement                               returns [Statement statement]
  : ( a=assignment                      { $statement = a.assignmentStatement;}   
    | p=procedureCall                   { $statement = p.procedureStatement;}
    | i=ifStatement                     { $statement = i.ifStatement;}
    | w=whileStatement                  { $statement = w.whileStatement;}
    | t=withStatement                   { $statement = t.withStatement;}
    )?
  ;  

assignment                               returns [AssignmentStatement assignmentStatement]
  : i=IDENT s=selector 
    ':=' 
    e=expression 
                                        { $assignmentStatement = new AssignmentStatement(i.getText(), s.selector, e.expression);}
  ;

procedureCall                           returns [ProcedureCallStatement procedureStatement]
  : i=IDENT                             { $procedureStatement = new ProcedureCallStatement(i.getText());}
    ( a=actualParameters                { $procedureStatement.setActualParameters(a.actualParams); }
    )?
  ;

fragment actualParameters               returns [List<Expression>actualParams]
  :                                     {$actualParams = new ArrayList<Expression>();}
    '(' ( e1=expression                 {$actualParams.add(e1.expression);}
        ( ',' e2=expression             {$actualParams.add(e2.expression);}
        )*
      )? 
    ')'
  ;

ifStatement                             returns [IfStatement ifStatement]
  : 'IF' e=expression 'THEN'            { $ifStatement = new IfStatement(e.expression);} 
        s1=statementSequence            { $ifStatement.addStatements(s1.statements);}
    ( 
    'ELSIF' e2=expression 'THEN'        { ElsifStatement elsifStat = new ElsifStatement(e2.expression);}
        s2=statementSequence            { elsifStat.addStatements(s2.statements);
                                          $ifStatement.addElsifStatement(elsifStat);
                                        }
    )*  
    ( 
    'ELSE'                              { ElseStatement elseStat = new ElseStatement();}
        s3=statementSequence            { elseStat.addStatements(s3.statements);
                                          $ifStatement.addElseStatement(elseStat);
                                        }
    )? 
    'END'                               
  ;
 
whileStatement                          returns [WhileStatement whileStatement]
  : 'WHILE' e=expression 'DO'           { $whileStatement = new WhileStatement(e.expression);} 
      s=statementSequence               { $whileStatement.addStatements(s.statements);}
    'END'                               
  ; 

withStatement                           returns [WithStatement withStatement]
  : 'WITH' e=expression 'DO'            { $withStatement = new WithStatement(e.expression);}
      s=statementSequence               { $withStatement.addStatements(s.statements);}
    'END'
  ;

fragment statementSequence              returns [List<Statement>statements]
  :                                     { $statements = new ArrayList<Statement>();}
    s1=statement                        { //NOTICE: Statements can be null!
                                          if (s1.statement != null) {
                                            $statements.add(s1.statement);
                                          }
                                        }                           
      ( ';' s2=statement                { if (s2.statement != null) {
                                            $statements.add(s2.statement);
                                          }    
                                        }                 
      )*
  ;


/////////////////////////////////////////////////////////////////
//EXPRESSIONS
/////////////////////////////////////////////////////////////////
expression                              returns [Expression expression]
  :                                     { Expression expLeft, expRight = null;
                                          String operation = null;
                                        }
    el=simpleExpression                 { expLeft = el.expression;}
    ( 
      ( '='                             { operation = "=";}
      | '#'                             { operation = "#";}      
      | '<'                             { operation = "<";}
      | '<='                            { operation = "<=";}
      | '>'                             { operation = ">";}
      | '>='                            { operation = ">=";}
      ) 
      er=simpleExpression               { expRight = er.expression;}     
    )?
                                        { $expression = ExpressionFactory.getBinaryExpression(operation,expLeft,expRight);}
  ;
 
fragment simpleExpression               returns [Expression expression]
  :                                     { String operation = null;}
    ( '-'                               { operation = "-";}
      |
      '+'                               { operation = null;}
    )? 
    tl=term                             { if (operation != null) {
                                            $expression = ExpressionFactory.getUnaryExpression(operation,tl.expression);
                                            operation = null;
                                          }
                                          else {
                                            $expression = tl.expression;
                                          }
                                          
                                        }
    ( ( '+'                             { operation = "+";}
      | '-'                             { operation = "-";}
      | 'OR'                            { operation = "OR";}
      ) 
      tr=term                           { $expression = ExpressionFactory.getBinaryExpression(operation,$expression,tr.expression);} 
    )*
  ;
  
fragment term                           returns [Expression expression] 
  :                                     { String operation = null;}
    fl=factor                           { $expression = fl.expression;}
     ( 
       ( '*'                            { operation = "*";}      
       | 'DIV'                          { operation = "DIV";}
       | 'MOD'                          { operation = "MOD";}
       | '&'                            { operation = "&";}
       ) 
       fr=factor                        { $expression = ExpressionFactory.getBinaryExpression(operation,$expression,fr.expression);}
     )*
  ;
fragment factor                         returns [Expression expression]
  : ( id=IDENT s=selector               { $expression = ExpressionFactory.getVariableExpression(id.getText(), s.selector);} 
    | i=INTEGER                         { $expression = ExpressionFactory.getConstantExpression(Integer.parseInt(i.getText()));}
    | '(' e=expression ')'              { $expression = e.expression;}
    | '~' f=factor                      { $expression = ExpressionFactory.getUnaryExpression("~",f.expression);}
    )
  ;

fragment selector                       returns [Selector selector]
  :                                     { $selector = null; }
    ( 
      '.' id=IDENT                      { DotSelector dotSel = new DotSelector(id.getText());
                                          if ($selector == null) {
                                            $selector = dotSel;
                                          }
                                          else {
                                            $selector.addSelector(dotSel);
                                          }
                                        } 
    | 
      '[' e=expression ']'              { BracketSelector brakSel = new BracketSelector(e.expression);
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
//TYPES
/////////////////////////////////////////////////////////////////
type                                    returns [Type type]
  : dt=declaredType                     { $type = dt.declaredType;}
  | at=arrayType                        { $type = at.arrayType;}
  | rt=recordType                       { $type = rt.recordType;}
  | it=integerType                      { $type = it.integerType;}
  ;

declaredType                            returns [DeclaredType declaredType]
  : id=IDENT                            { $declaredType = new DeclaredType(id.getText());}
  ;
 
  
arrayType                               returns [ArrayType arrayType]
  : 'ARRAY' e=expression 
    'OF'    t=type                      { $arrayType = new ArrayType(e.expression,t.type);}
  ;

recordType                              returns [RecordType recordType]
  : 'RECORD'                            { $recordType = new RecordType();}   
      f1=fieldList                      { $recordType.addFields(f1.fields);}
      ( ';' f2=fieldList                { $recordType.addFields(f2.fields);}
      )* 
    'END'                               
  ;
  
fragment fieldList                      returns [List<RecordField> fields]
  :                                     { $fields = new ArrayList<RecordField>();}
    ( i=identList ':' t=type            { for(String ident : i.identifiers) {
                                            $fields.add(new RecordField(ident,t.type));
                                          }
                                        }
    )?
  ;
  
integerType                             returns [IntegerType integerType]
  : 'INTEGER'                           { $integerType = new IntegerType();}
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

