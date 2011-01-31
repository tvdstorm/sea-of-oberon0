package com.kootsjur.oberon;

public class Procedure
{
   private ProcedureHeading procedureHeading;
   private ProcedureBody procedureBody;
   
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
