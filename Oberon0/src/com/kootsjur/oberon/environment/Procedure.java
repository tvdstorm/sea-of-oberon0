package com.kootsjur.oberon.environment;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.formalparameter.FPSection;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.declaration.procedure.ProcedureDeclaration;
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
   }
   
   public void declare()
   {
      declareDeclarations(declarations, this);
      declareProcedures(procedureDeclarations, this);
      declareParameters(formalParameters, this);
   }

   private void declareParameters(FormalParameters formalParameters, Environment environment)
   {
      for(FPSection formalParameter : formalParameters)
      {
         formalParameter.declare(environment);
      }
      
   }

   private void declareProcedures(List<ProcedureDeclaration> procedureDeclarations, Environment environment)
   {
      for(ProcedureDeclaration procedureDeclaration : procedureDeclarations )
      {
         procedureDeclaration.declare(environment);
      }
   }

   private void declareDeclarations(List<Declaration> declarations,Environment environment)
   {
      for(Declaration declaration : declarations)
      {
         declaration.declare(environment);
      }
   } 
}
