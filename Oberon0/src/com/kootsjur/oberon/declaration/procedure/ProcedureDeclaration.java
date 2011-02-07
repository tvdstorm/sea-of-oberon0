package com.kootsjur.oberon.declaration.procedure;

public class ProcedureDeclaration
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
}
