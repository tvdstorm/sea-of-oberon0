package com.kootsjur.oberon.parser;

import java.util.List;

public class FieldList
{
   private List<String> names;
   private TypeDefinition typeDefinition;
   
   public void setNames(List<String> names)
   {
      this.names = names;
   }
   public List<String> getNames()
   {
      return names;
   }
   
   public void setTypeDefinition(TypeDefinition typeDefinition)
   {
      this.typeDefinition = typeDefinition;
   }
   public TypeDefinition getTypeDefinition()
   {
      return typeDefinition;
   }
}
