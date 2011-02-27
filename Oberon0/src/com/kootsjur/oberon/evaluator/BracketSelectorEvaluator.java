package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class BracketSelectorEvaluator implements SelectorEvaluator {
	private Evaluator expressionEvaluator;

	public BracketSelectorEvaluator(Evaluator expressionEvaluator) {
		this.expressionEvaluator = expressionEvaluator;
	}

	@Override
	public Int evaluate(Environment environment) {
		Int value = (Int) expressionEvaluator.evaluate(environment);
		return value;
	}

	@Override
	public void assignValue(String name, Evaluator expressionToAssign,
			Environment environment) {
		Int select = (Int) expressionEvaluator.evaluate(environment);
		Value value = expressionToAssign.evaluate(environment);
		environment.assignArrayValue(name, select, value);
	}
}