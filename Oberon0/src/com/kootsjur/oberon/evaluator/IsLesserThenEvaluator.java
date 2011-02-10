package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Expression;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Value;

public class IsLesserThenEvaluator extends ConditionalEvaluator
{
   
   public IsLesserThenEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
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

   @Override
   public Value evaluate(Environment environment)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
