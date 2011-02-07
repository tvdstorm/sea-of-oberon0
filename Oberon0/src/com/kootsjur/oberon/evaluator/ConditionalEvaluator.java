package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Expression;
import com.kootsjur.oberon.value.Bool;

public abstract class ConditionalEvaluator extends ExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public ConditionalEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }
   abstract Bool evaluate(Expression leftExpression, Expression rightExpression);
}
