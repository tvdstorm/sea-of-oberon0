package com.kootsjur.oberon.declaration.procedure;

import com.kootsjur.oberon.FormalParameters;

public class ProcedureHeading
{
   private String name;
   public ProcedureHeading(String name)
   {
      this.name = name;
   }
   
   
   public void setName(String name){this.name = name;}
   public String getName(){return name;}
   
   private FormalParameters formalParameters;
   public void setFormalParameters(FormalParameters formalParameters){this.formalParameters = formalParameters;}
   public FormalParameters getFormalParameters(){return formalParameters;}
}
