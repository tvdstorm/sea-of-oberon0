package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class NegationEvaluator implements Evaluator
{
   private final Evaluator evaluator;
   
   public NegationEvaluator(Evaluator evaluator)
   {
      this.evaluator =  evaluator;
   }

   @Override
   public Int evaluate(Environment environment)
   {
      Int value = (Int) evaluator.evaluate(environment);
      int valueResult = -1 * value.getValue();
      Int result = new Int(valueResult);
      
      return result;
   }

}
