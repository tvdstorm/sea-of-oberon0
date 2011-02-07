package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.SimpleExpression;
import com.kootsjur.oberon.value.Value;

public class PlusEvaluator extends SimpleExpressionEvaluator
{
   
   public PlusEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
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
   public Value evaluate()
   {
      // TODO Auto-generated method stub
      return null;
   }

}
