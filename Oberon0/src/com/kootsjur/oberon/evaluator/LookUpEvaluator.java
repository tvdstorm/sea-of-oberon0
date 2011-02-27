package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Reference;

public interface LookUpEvaluator extends Evaluator {
	@SuppressWarnings("rawtypes")
	public Reference lvalueOf(Environment environment);
}
