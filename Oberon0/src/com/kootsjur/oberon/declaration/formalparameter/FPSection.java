package com.kootsjur.oberon.declaration.formalparameter;

import java.util.List;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Parameter;
import com.kootsjur.oberon.type.TypeDefinition;

public class FPSection
{
   private List<String> names;
   private TypeDefinition typeDefinition;
   private ParameterDirection parameterDirection;
   
   public FPSection(List<String> names, TypeDefinition typeDefinition, ParameterDirection parameterDirection)
   {
      this.names = names;
      this.setTypeDefinition(typeDefinition);
      this.parameterDirection = parameterDirection;
   }
   
   public void setNames(List<String> names){this.names = names;}
   public List<String> getNames(){return names;}
   
   public void setParameterDirection(ParameterDirection parameterDirection){this.parameterDirection = parameterDirection;}
   public ParameterDirection getParameterDirection(){return parameterDirection;}
   
   public void setTypeDefinition(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getTypeDefinition(){return typeDefinition;}

   public void declare(Environment environment)
   {
      for(String parameterName : names)
      {
         Parameter parameter = new Parameter(typeDefinition,parameterDirection);
         environment.declareParameter(parameterName, parameter);
      }
   }
}
