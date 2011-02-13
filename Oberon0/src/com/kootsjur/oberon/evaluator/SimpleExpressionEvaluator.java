package com.kootsjur.oberon.evaluator;

public abstract class SimpleExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public SimpleExpressionEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }
}
