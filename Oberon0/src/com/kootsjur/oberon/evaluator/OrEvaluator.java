package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.SimpleExpression;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Value;

public class OrEvaluator extends SimpleExpressionEvaluator
{
  
   public OrEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }

   @Override
   public Value evaluate(SimpleExpression leftSimpleExpression, SimpleExpression rightSimpleExpression)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Bool evaluate(Environment environment)
   {
      Bool left = (Bool) leftEvaluator.evaluate(environment);
      Bool right = (Bool) rightEvaluator.evaluate(environment);
      Boolean expressionValue = left.getValue() || right.getValue();
      Bool toReturn = new Bool(expressionValue);
      return toReturn;
   }


}
