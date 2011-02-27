package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Int;

public class MultEvaluator extends TermEvaluator {
	public MultEvaluator(Evaluator leftEvaluator, Evaluator rightEvaluator) {
		super(leftEvaluator, rightEvaluator);
	}

	@Override
	public Int evaluate(Environment environment) {
		Int left = (Int) leftEvaluator.evaluate(environment);
		Int right = (Int) rightEvaluator.evaluate(environment);
		Integer expressionValue = left.getValue() * right.getValue();
		Int result = new Int(expressionValue);
		return result;
	}
}
