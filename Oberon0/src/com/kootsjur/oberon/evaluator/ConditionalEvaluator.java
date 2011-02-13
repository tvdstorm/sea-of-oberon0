package com.kootsjur.oberon.evaluator;

public abstract class ConditionalEvaluator extends ExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public ConditionalEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
   }
}
