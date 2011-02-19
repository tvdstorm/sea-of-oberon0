package com.kootsjur.oberon.environment;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.declaration.procedure.ProcedureDeclaration;
import com.kootsjur.oberon.statement.Statement;
import com.kootsjur.oberon.statement.StatementSequence;

public class Procedure extends Environment
{
   private FormalParameters formalParameters;
   private List<Declaration> declarations;
   private List<ProcedureDeclaration> procedureDeclarations;
   private StatementSequence statementSequence;
   
   public Procedure(FormalParameters formalParameters, List<Declaration> declarations, List<ProcedureDeclaration> procedureDeclarations,StatementSequence statementSequence, Environment environment)
   {
      super(environment);
      this.formalParameters = formalParameters;
      this.declarations = declarations;
      this.procedureDeclarations = procedureDeclarations;
      this.statementSequence = statementSequence;
      declare();
   }
   
   public FormalParameters getFormalParameters()
   {
      return formalParameters;
   }
   public void declare()
   {
      declareDeclarations(declarations);
      declareProcedures(procedureDeclarations);
      declareParameters(formalParameters);
   }

   public void run()
   {
      for(Statement statement : statementSequence)
      {
         statement.evaluate(this);
      }
   }

}
