package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Reference;
import com.kootsjur.oberon.value.Value;

public class IdentEvaluator extends FactorEvaluator implements LookUpEvaluator
{
   private final String identName;
   
   public IdentEvaluator(String identValue)
   {
      this.identName = identValue;
   }

   @Override
   public Value evaluate(Environment environment)
   {
      Value valueToReturn = environment.lookUpValue(identName);
      return valueToReturn;
   }

   @SuppressWarnings("rawtypes")
   @Override
   public Reference lvalueOf(Environment environment)
   {
      Reference reference = environment.lookUpReference(identName);
      return reference;
   }
   

}
