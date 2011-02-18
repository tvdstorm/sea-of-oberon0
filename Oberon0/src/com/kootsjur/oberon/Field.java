package com.kootsjur.oberon;

import com.kootsjur.oberon.type.TypeDefinition;

public class Field
{
   private String name;
   private TypeDefinition type;

   public void setName(String name){this.name = name;}
   public String getName(){return name;}

   public void setType(TypeDefinition type){this.type = type;}
   public TypeDefinition getType(){return type;}
   
   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof Field)) {
         return false;
      }
      return name.equals(((Field)obj).name);
   }
}
