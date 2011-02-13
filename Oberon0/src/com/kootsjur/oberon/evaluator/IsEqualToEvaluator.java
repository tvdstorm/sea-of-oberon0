package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Int;

public class IsEqualToEvaluator extends ConditionalEvaluator
{
   
   public IsEqualToEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }

   @Override
   public Bool evaluate(Environment environment)
   {
      Int left = (Int) leftEvaluator.evaluate(environment);
      Int right = (Int) rightEvaluator.evaluate(environment);
      Boolean expressionResult = left.getValue() == right.getValue();
      Bool result = new Bool(expressionResult);
      return result;
   }

}
