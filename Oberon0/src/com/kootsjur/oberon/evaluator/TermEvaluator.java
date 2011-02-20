package com.kootsjur.oberon.evaluator;

public abstract class TermEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public TermEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      assert(leftEvaluator != null):"Error!Parameter leftEvaluator in TermEvaluator is not initialized";
      assert(rightEvaluator != null):"Error!Parameter rightEvaluator in TermEvaluator is not initialized";
      
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }
}
