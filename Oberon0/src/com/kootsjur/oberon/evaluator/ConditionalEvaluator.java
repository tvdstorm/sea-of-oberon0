package com.kootsjur.oberon.evaluator;

public abstract class ConditionalEvaluator extends ExpressionEvaluator implements Evaluator
{   
   public ConditionalEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }
}
