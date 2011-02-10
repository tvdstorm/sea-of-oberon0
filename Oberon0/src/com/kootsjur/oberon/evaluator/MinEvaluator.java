package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.SimpleExpression;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class MinEvaluator extends SimpleExpressionEvaluator
{
   
   public MinEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
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
   public Int evaluate(Environment environment)
   {
      Int left = (Int) leftEvaluator.evaluate(environment);
      Int right = (Int) rightEvaluator.evaluate(environment);
      Integer expressionValue = left.getValue()-right.getValue();
      Int result = new Int(expressionValue);
      return result;
   }

}
