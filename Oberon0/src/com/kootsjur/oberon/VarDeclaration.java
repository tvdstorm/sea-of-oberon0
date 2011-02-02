package com.kootsjur.oberon;

import java.util.List;

public class VarDeclaration extends Declaration
{
   private List<String> names;
   private TypeDefinition typeDefinition;
   
   public VarDeclaration(List<String> names, TypeDefinition typeDefinition)
   {
      super(DeclarationType.VAR);
      this.names = names;
      this.typeDefinition = typeDefinition;
   }
   public void setNames(List<String> names)
   {
      this.names = names;
   }
   public List<String> getNames()
   {
      return names;
   }
   
   public void setType(TypeDefinition typeDefinition)
   {
      this.typeDefinition = typeDefinition;
   }
   public TypeDefinition getType()
   {
      return typeDefinition;
   }
}