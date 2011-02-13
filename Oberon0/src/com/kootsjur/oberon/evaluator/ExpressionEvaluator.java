package com.kootsjur.oberon.evaluator;

public abstract class ExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public ExpressionEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }

}
