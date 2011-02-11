package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;

public class NegationEvaluator implements Evaluator
{
   private final Evaluator evaluator;
   
   public NegationEvaluator(final Evaluator evaluator)
   {
      this.evaluator =  evaluator;
   }

   @Override
   public Int evaluate(final Environment environment)
   {
      final Int value = (Int) evaluator.evaluate(environment);
      final int valueResult = -1 * value.getValue();
      final Int result = new Int(valueResult);
      
      return result;
   }

}
