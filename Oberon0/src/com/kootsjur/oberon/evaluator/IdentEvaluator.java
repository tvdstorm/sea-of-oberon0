package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.value.Value;

public class IdentEvaluator extends FactorEvaluator
{
   private final String identValue;
   
   public IdentEvaluator(String identValue)
   {
      this.identValue = identValue;
   }

   @Override
   public Value evaluate()
   {
      // TODO Auto-generated method stub
      return null;
   }
   

}