package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Array;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class ArraySelectorEvaluator implements Evaluator
{
   private Evaluator arrayEvaluator;
   private Evaluator bracketSelector;

   public ArraySelectorEvaluator(Evaluator arrayEvaluator, Evaluator bracketSelector)
   {
      this.arrayEvaluator = arrayEvaluator;
      this.bracketSelector = bracketSelector;
      
   }
   
   @SuppressWarnings("rawtypes")
   @Override
   public Value evaluate(Environment environment)
   {
      Array array = (Array) arrayEvaluator.evaluate(environment);
      Int selector = (Int) bracketSelector.evaluate(environment);
      Value valueToReturn =  array.get(selector.getValue());
      return valueToReturn;
   }

}
