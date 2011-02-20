package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Bool;

public class AndEvaluator extends TermEvaluator
{

   
   public AndEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }
   
   @Override
   public Bool evaluate(Environment environment)
   {
      assert(environment != null):"Error in AndEvaluator method evaluate. Parameter environment is null!";
      
      Bool left = (Bool) leftEvaluator.evaluate(environment);
      Bool right = (Bool) rightEvaluator.evaluate(environment);
      Boolean expressionValue = left.getValue() && right.getValue();
      Bool toReturn = new Bool(expressionValue);
      return toReturn;
   }

}
