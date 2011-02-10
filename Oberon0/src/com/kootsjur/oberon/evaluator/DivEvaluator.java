package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Factor;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class DivEvaluator extends TermEvaluator
{

   public DivEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator,rightEvaluator);
   }
   
   @Override
   public Value evaluate(Factor leftFactor, Factor rightFactor)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Value evaluate(Environment environment)
   {
      Int left = (Int) leftEvaluator.evaluate(environment);
      Int right = (Int) rightEvaluator.evaluate(environment);
      Integer expressionValue = left.getValue()/right.getValue();
      Int result = new Int(expressionValue);
      return result;
   }

}
