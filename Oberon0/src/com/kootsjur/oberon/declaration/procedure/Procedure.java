package com.kootsjur.oberon.declaration.procedure;

import com.kootsjur.oberon.environment.Environment;

public class Procedure
{
   private Environment environment;
   private ProcedureDeclaration procedure;
   
   public Procedure(Environment environment, ProcedureDeclaration procedure)
   {
      this.environment = environment;
      this.procedure = procedure;
   }
   
   public void setEnvironment(Environment environment){this.environment = environment;}
   public Environment getEnvironment(){return environment;}
   
   public void setProcedure(ProcedureDeclaration procedure){this.procedure = procedure;}
   public ProcedureDeclaration getProcedure(){return procedure;}
   
}
