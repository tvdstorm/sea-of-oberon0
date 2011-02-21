package com.kootsjur.oberon.evaluator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class DotSelectorEvaluator implements SelectorEvaluator
{

   @Override
   public Value evaluate(Environment environment)
   {
      throw new NotImplementedException();
   }

   @Override
   public void assignValue(String name, Evaluator expressionValueToAssign, Environment environment)
   {
      throw new NotImplementedException();
   }

}
