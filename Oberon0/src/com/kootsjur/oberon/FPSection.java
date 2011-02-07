package com.kootsjur.oberon;

import java.util.List;

import com.kootsjur.oberon.type.TypeDefinition;

public class FPSection
{
   private List<String> names;
   private TypeDefinition typeDefinition;
   private ParameterDirection parameterDirection;
   
   public FPSection(List<String> names, TypeDefinition typeDefinition, ParameterDirection parameterDirection)
   {
      this.names = names;
      this.typeDefinition = typeDefinition;
      this.parameterDirection = parameterDirection;
   }
   
   /**
    * Set the names to the specified value.
    *
    * @param names The names to set.
    */
   public void setNames(List<String> names)
   {
      this.names = names;
   }
   /**
    * Get the names.
    *
    * @return Returns the names as a List<String>.
    */
   public List<String> getNames()
   {
      return names;
   }
   
   /**
    * Set the typeDefinition to the specified value.
    *
    * @param typeDefinition The typeDefinition to set.
    */
   public void setType(TypeDefinition typeDefinition)
   {
      this.typeDefinition = typeDefinition;
   }
   /**
    * Get the typeDefinition.
    *
    * @return Returns the typeDefinition as a TypeDefinition.
    */
   public TypeDefinition getType()
   {
      return typeDefinition;
   }
   
   public void setParameterDirection(ParameterDirection parameterDirection)
   {
      this.parameterDirection = parameterDirection;
   }
   public ParameterDirection getParameterDirection()
   {
      return parameterDirection;
   }
}
