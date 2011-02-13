package com.kootsjur.oberon.evaluator;

public abstract class TermEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public TermEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }
}
