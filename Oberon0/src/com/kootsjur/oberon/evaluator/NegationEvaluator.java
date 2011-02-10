package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class NegationEvaluator implements Evaluator
{
   private final Evaluator evaluator;
   
   public NegationEvaluator(Evaluator evaluator)
   {
      this.evaluator =  evaluator;
   }

   @Override
   public Value evaluate(Environment environment)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
