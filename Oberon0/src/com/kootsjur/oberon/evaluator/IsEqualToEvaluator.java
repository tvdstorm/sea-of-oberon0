package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Expression;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Value;

public class IsEqualToEvaluator extends ConditionalEvaluator
{
   
   public IsEqualToEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }
   
   @Override
   public Bool evaluate(Expression leftExpression, Expression rightExpression)
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
