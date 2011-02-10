package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class ArraySelectorEvaluator implements Evaluator
{
   private String arrayName;
   private Evaluator bracketSelector;

   public ArraySelectorEvaluator(String arrayName, Evaluator bracketSelector)
   {
      this.arrayName = arrayName;
      this.bracketSelector = bracketSelector;
      
   }
   @Override
   public Value evaluate(Environment environment)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
