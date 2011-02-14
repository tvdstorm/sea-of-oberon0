package com.kootsjur.oberon.type;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;

public class IntegerType extends TypeDefinition
{

   public IntegerType()
   {
      super(DataType.INTEGER);
   }

   @Override
   public Int initValue(Environment environment)
   {
      Int initValue = new Int(0);
      return initValue;
   }

}
