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
      //pre-condition
      assert(procedureHeading != null):"Error in Constructor ProcedureDeclaration!  parameter procedureHeading is null!";
      assert(procedureBody != null):"Error in Constructor ProcedureDeclaration!  parameter procedureBody is null!";
      
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
      //pre-Condition
      assert(environment != null):"Error in FPSection method declare! Environment is null!";
      
      String procedureName = procedureHeading.getName();
      FormalParameters formalParameters = procedureHeading.getFormalParameters();
      List<Declaration> declarations = procedureBody.getDeclarations();
      List<ProcedureDeclaration> procedures = procedureBody.getProcedures();
      StatementSequence statementSequence = procedureBody.getStatementSequence();
      Procedure procedure = new Procedure(formalParameters, declarations, procedures, statementSequence, environment);
      environment.declareProcedure(procedureName, procedure);  
      
      //post-condition
      assert(environment.getProcedures().containsKey(procedureName)):"Error in ProcedureDeclaration method declare! Procedure is not declared!";
      assert(environment.getDeclaredConstants().get(procedureName).equals(procedure)):"Error in ProcedureDeclaration method declare! procedure is not equal!";
   }
}
