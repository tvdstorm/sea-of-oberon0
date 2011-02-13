package com.kootsjur.oberon.parser;

import java.util.List;

public class FPSection
{
   private List<String> names;
   private TypeDefinition typeDefinition;
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
}
