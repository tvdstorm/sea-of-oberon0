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
      
      //pre-condition
      assert(formalParameters != null):"Error in Constructor Procedure!  parameter formalParameters is null!";
      assert(declarations != null):"Error in Constructor Procedure!  parameter declarations is null!";
      assert(procedureDeclarations != null):"Error in Constructor Procedure!  parameter procedureDeclarations is null!";
      assert(statementSequence != null):"Error in Constructor Procedure!  parameter statementSequence is null!";
      
      this.formalParameters = formalParameters;
      this.declarations = declarations;
      this.procedureDeclarations = procedureDeclarations;
      this.statementSequence = statementSequence;
   }
   
   public FormalParameters getFormalParameters(){return formalParameters;}
   
   public List<Declaration> getDeclarations(){return declarations;}
   
   public List<ProcedureDeclaration> getProcedureDeclarations(){return procedureDeclarations;}
   
   public StatementSequence getStatementSequence(){return statementSequence;}
   
   public void declare()
   {
      declareDeclarations(declarations);
      declareProcedures(procedureDeclarations);
      declareParameters(formalParameters);
   }

   public void run()
   {
      if(statementSequence != null)
      {
         for(Statement statement : statementSequence)
         {
            statement.evaluate(this);
         }
      }
   }

}
