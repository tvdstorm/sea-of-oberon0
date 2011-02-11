package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;

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
