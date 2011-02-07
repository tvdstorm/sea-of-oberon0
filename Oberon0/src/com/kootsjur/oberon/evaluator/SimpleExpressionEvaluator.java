package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.SimpleExpression;
import com.kootsjur.oberon.value.Value;

public abstract class SimpleExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public SimpleExpressionEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }
   
   abstract Value evaluate (SimpleExpression leftSimpleExpression, SimpleExpression rightSimpleExpression);
}
