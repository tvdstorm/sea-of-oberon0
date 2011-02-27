package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Field;

public class DotSelectorEvaluator implements SelectorEvaluator {

	 private String fieldName;
	   
	 public DotSelectorEvaluator(String fieldName )
	 {
		 this.fieldName = fieldName;
	 }
	@Override
	public Field evaluate(Environment environment) {
		
		return new Field(fieldName);
	}

	@Override
	public void assignValue(String name, Evaluator expressionValueToAssign,
			Environment environment) {
		// TODO Auto-generated method stub

	}

}
