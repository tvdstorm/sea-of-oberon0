package com.kootsjur.oberon.type;

import com.kootsjur.oberon.value.Int;

public class IntegerType extends TypeDefinition
{

   public IntegerType()
   {
      super(DataType.INTEGER);
   }

   @Override
   public Int initValue()
   {
      Int initValue = new Int(0);
      return initValue;
   }

}
