package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class NumberEvaluator implements Evaluator
{
   private int value;
   
   public NumberEvaluator(int value)
   {
      this.value = value;
   }

   @Override
   public Int evaluate(Environment environment)
   {
      Int result = new Int(value);
      return result;
   }


}
