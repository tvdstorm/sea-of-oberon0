package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.value.Value;

public class ArraySelectorEvaluator implements Evaluator
{
   private Evaluator array;
   private Evaluator bracketSelector;

   public ArraySelectorEvaluator(Evaluator array, Evaluator bracketSelector)
   {
      this.array = array;
      this.bracketSelector = bracketSelector;
      
   }
   @Override
   public Value evaluate()
   {
      // TODO Auto-generated method stub
      return null;
   }

}
