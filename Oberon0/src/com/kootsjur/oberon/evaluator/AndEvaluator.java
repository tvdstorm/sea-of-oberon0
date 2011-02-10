package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Factor;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Value;

public class AndEvaluator extends TermEvaluator
{

   
   public AndEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
   {
      super(leftEvaluator, rightEvaluator);
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
      Bool left = (Bool) leftEvaluator.evaluate(environment);
      Bool right = (Bool) rightEvaluator.evaluate(environment);
      Boolean expressionValue = left.getValue() && right.getValue();
      Bool toReturn = new Bool(expressionValue);
      return toReturn;
   }

}
