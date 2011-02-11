package com.kootsjur.oberon.type;

import com.kootsjur.oberon.value.Bool;

public class BoolType extends TypeDefinition
{
   public BoolType()
   {
      super(DataType.BOOL);
   }

   @Override
   public Bool initValue()
   {
      Bool initValue = new Bool(false);
      return initValue;
   }
}
