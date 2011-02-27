package com.kootsjur.oberon.evaluator;

import java.util.List;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Reference;
import com.kootsjur.oberon.value.Array;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class ArraySelectorEvaluator implements LookUpEvaluator
{
   private Evaluator arrayEvaluator;
   private List<Evaluator> bracketSelectors;

   public ArraySelectorEvaluator(Evaluator arrayEvaluator, List<Evaluator> bracketSelectors)
   {
      this.arrayEvaluator = arrayEvaluator;
      this.bracketSelectors = bracketSelectors;
   }
   
   @SuppressWarnings("rawtypes")
   @Override
   public Value evaluate(Environment environment)
   {
	  Reference reference = null;
      Value array = (Array) arrayEvaluator.evaluate(environment);
      
      for(Evaluator bracketSelector : bracketSelectors)
      {
    	  Int selector = (Int) bracketSelector.evaluate(environment);
    	  reference = ((Array) array).get(selector.getValue());
      }
      
      return reference.getValue();
   }

   @SuppressWarnings("rawtypes")
   @Override
   public Reference lvalueOf(Environment environment)
   {
	   Reference reference = null;
	   Value array = arrayEvaluator.evaluate(environment);
	      
	   for(Evaluator bracketSelector : bracketSelectors)
	   {
		   Int selector = (Int) bracketSelector.evaluate(environment);
	       reference = ((Array) array).get(selector.getValue());
	    }
	      
	    return reference;
   }

}
