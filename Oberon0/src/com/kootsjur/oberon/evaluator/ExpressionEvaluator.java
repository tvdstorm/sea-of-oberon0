package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.value.Value;

public abstract class ExpressionEvaluator implements Evaluator
{
   protected Evaluator leftEvaluator;
   protected Evaluator rightEvaluator;
   
   public ExpressionEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      this.leftEvaluator = leftEvaluator;
      this.rightEvaluator = rightEvaluator;
   }

   public abstract Value evaluate();

}
