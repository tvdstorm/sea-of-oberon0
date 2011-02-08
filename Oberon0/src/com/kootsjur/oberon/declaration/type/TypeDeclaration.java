package com.kootsjur.oberon.declaration.type;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.DeclarationType;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.type.TypeDefinition;

public class TypeDeclaration extends Declaration
{
   private String name;
   private TypeDefinition typeDefinition;
  
   public TypeDeclaration(String name, TypeDefinition typeDefinition)
   {
      super(DeclarationType.TYPE);
      this.name = name;
      this.typeDefinition = typeDefinition;
      
   }
   public void setName(String name){this.name = name;}
   public String getName(){return name;}
   
   public void setType(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getType(){return typeDefinition;}
   
   @Override
   public void declare(Environment environment)
   {
      // TODO Auto-generated method stub
      
   }
}