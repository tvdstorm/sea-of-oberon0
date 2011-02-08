package com.kootsjur.oberon.type;

import com.kootsjur.oberon.value.Value;

public class UserType extends TypeDefinition
{
   private String typeName;

   public UserType(String name)
   {
      super(DataType.USER);
      this.typeName = name;
   }

   @Override
   public Value initValue()
   {
      // TODO Auto-generated method stub
      return null;
   }

}
