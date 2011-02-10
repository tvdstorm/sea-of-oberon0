package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.Factor;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class ModEvaluator extends TermEvaluator
{
   
   public ModEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator)
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
      // TODO Auto-generated method stub
      return null;
   }

}
