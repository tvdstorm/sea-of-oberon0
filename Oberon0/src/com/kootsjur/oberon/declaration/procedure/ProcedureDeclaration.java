package com.kootsjur.oberon.declaration.procedure;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Procedure;
import com.kootsjur.oberon.statement.StatementSequence;

public class ProcedureDeclaration implements Declaration
{
   private ProcedureHeading procedureHeading;
   private ProcedureBody procedureBody;
   
   public ProcedureDeclaration(ProcedureHeading procedureHeading, ProcedureBody procedureBody)
   {
      this.procedureHeading = procedureHeading;
      this.procedureBody = procedureBody;
   }
   
   public void setProcedureHeading(ProcedureHeading procedureHeading){this.procedureHeading = procedureHeading;}
   public ProcedureHeading getProcedureHeading(){return procedureHeading;}
   
   public void setProcedureBody(ProcedureBody procedureBody){this.procedureBody = procedureBody;}
   public ProcedureBody getProcedureBody(){return procedureBody;}

   @Override
   public void declare(Environment environment)
   {
      String procedureName = procedureHeading.getName();
      FormalParameters formalParameters = procedureHeading.getFormalParameters();
      List<Declaration> declarations = procedureBody.getDeclarations();
      List<ProcedureDeclaration> procedures = procedureBody.getProcedures();
      StatementSequence statementSequence = procedureBody.getStatementSequence();
      Procedure procedure = new Procedure(formalParameters, declarations, procedures, statementSequence, environment);
      environment.declareProcedure(procedureName, procedure);      
   }
}
