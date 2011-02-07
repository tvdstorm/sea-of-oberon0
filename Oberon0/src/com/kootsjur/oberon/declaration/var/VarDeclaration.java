package com.kootsjur.oberon.declaration.var;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.DeclarationType;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.type.TypeDefinition;

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
   public void setNames(List<String> names){this.names = names;}
   public List<String> getNames(){return names;}
   
   public void setType(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getType(){return typeDefinition;}
   
   @Override
   public void declare(Environment environment)
   {
      // TODO Auto-generated method stub
      
   }
}
