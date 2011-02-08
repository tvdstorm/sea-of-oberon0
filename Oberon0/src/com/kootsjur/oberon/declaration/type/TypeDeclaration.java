package com.kootsjur.oberon.declaration.type;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.DeclarationType;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.type.TypeDefinition;

public class TypeDeclaration implements Declaration
{
   private String name;
   private TypeDefinition typeDefinition;
  
   public TypeDeclaration(String name, TypeDefinition typeDefinition)
   {
      this.name = name;
      this.typeDefinition = typeDefinition;
      
   }
   public void setName(String name){this.name = name;}
   public String getName(){return name;}
   
   public void setTypeDefinition(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getTypeDefinition(){return typeDefinition;}
   
   @Override
   public void declare(Environment environment)
   {
      // TODO Auto-generated method stub
      
   }
}
