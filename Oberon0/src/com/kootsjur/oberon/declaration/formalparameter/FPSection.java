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
      //pre-condition
      assert(names != null):"Error in Constructor FPSection!  parameter names is null!";
      assert(typeDefinition != null):"Error in Constructor FPSection!  parameter typeDefinition is null!";
      assert(parameterDirection != null):"Error in Constructor FPSection!  parameter parameterDirection is null!";
      assert(names.size() > 0):"Error in Constructor FPSection!  parameter names does not contain any names!";
      
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

   @SuppressWarnings({ "unchecked", "rawtypes" })
   public void declare(Environment environment)
   {
      //pre-Condition
      assert(environment != null):"Error in FPSection method declare! Environment is null!";
      
      for(String parameterName : names)
      {
         Parameter parameter = new Parameter(typeDefinition,parameterDirection);
         environment.declareParameter(parameterName, parameter);
      }
      
    //post-condition
      for(String parameterName:names)
      {
         assert(environment.getDeclaredParameters().containsKey(parameterName)):"Error in ConstantDeclaration method declare! Constant is not declared!";
      }
   }
}
