package com.kootsjur.oberon.declaration;

public class Procedure
{
   private ProcedureHeading procedureHeading;
   private ProcedureBody procedureBody;
   
   public Procedure(ProcedureHeading procedureHeading, ProcedureBody procedureBody)
   {
      this.procedureHeading = procedureHeading;
      this.procedureBody = procedureBody;
   }
   
   public void setProcedureHeading(ProcedureHeading procedureHeading)
   {
      this.procedureHeading = procedureHeading;
   }
   public ProcedureHeading getProcedureHeading()
   {
      return procedureHeading;
   }
   
   public void setProcedureBody(ProcedureBody procedureBody)
   {
      this.procedureBody = procedureBody;
   }
   public ProcedureBody getProcedureBody()
   {
      return procedureBody;
   }
}
