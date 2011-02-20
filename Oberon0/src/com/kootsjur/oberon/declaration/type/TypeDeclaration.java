package com.kootsjur.oberon.declaration.type;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Type;
import com.kootsjur.oberon.type.TypeDefinition;

public class TypeDeclaration implements Declaration
{
   private String name;
   private TypeDefinition typeDefinition;
  
   public TypeDeclaration(String name, TypeDefinition typeDefinition)
   {
      //pre-condition
      assert(name != null):"Error in Constructor TypeDeclaration!  parameter name is null!";
      assert(typeDefinition != null):"Error in Constructor TypeDeclaration!  parameter typeDefinition is null!";
      
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
      //pre-Condition
      assert(environment != null):"Error in TypeDeclaration method declare! Environment is null!";
      
      Type type = new Type(typeDefinition);
      environment.declareType(name, type);
      
      //post-condition
      assert(environment.getDeclaredTypes().containsKey(name)):"Error in TypeDeclaration method declare! Type is not declared!";
      assert(environment.getDeclaredTypes().get(name).equals(type)):"Error in TypeDeclaration method declare! type is not equal!";
   }
}
