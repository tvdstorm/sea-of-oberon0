package com.kootsjur.oberon;

import java.util.List;

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
   
   private List<FormalParameter> parameters;
   public void setParameters(List<FormalParameter> parameters)
   {
      this.parameters = parameters;
   }
   public List<FormalParameter> getParameters()
   {
      return parameters;
   }
}
