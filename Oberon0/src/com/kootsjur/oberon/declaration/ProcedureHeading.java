package com.kootsjur.oberon.declaration;

import com.kootsjur.oberon.FormalParameters;

public class ProcedureHeading
{
   
   public ProcedureHeading(String name)
   {
      this.name = name;
   }
   
   private String name;
   public void setName(String name)
   {
      this.name = name;
   }
   public String getName()
   {
      return name;
   }
   
   private FormalParameters formalParameters;
   public void setFormalParameters(FormalParameters formalParameters)
   {
      this.formalParameters = formalParameters;
   }
   public FormalParameters getFormalParameters()
   {
      return formalParameters;
   }
}
