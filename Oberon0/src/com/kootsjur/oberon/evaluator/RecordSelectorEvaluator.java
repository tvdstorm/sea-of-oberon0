package com.kootsjur.oberon.evaluator;

import java.util.List;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Reference;
import com.kootsjur.oberon.value.Field;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class RecordSelectorEvaluator implements LookUpEvaluator {
	private Evaluator recordEvaluator;
	private List<Evaluator> dotSelectors;

	public RecordSelectorEvaluator(Evaluator recordEvaluator,
			List<Evaluator> dotSelectors) {
		this.recordEvaluator = recordEvaluator;
		this.dotSelectors = dotSelectors;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Value evaluate(Environment environment) {
		Reference reference = null;
		Value record = recordEvaluator.evaluate(environment);

		for (Evaluator dotSelector : dotSelectors) {
			Field selector = (Field) dotSelector.evaluate(environment);
			reference = ((Record) record).get(selector);
		}

		return reference.getValue();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Reference lvalueOf(Environment environment) {
		Reference reference = null;
		Value record = recordEvaluator.evaluate(environment);

		for (Evaluator dotSelector : dotSelectors) {
			Field selector = (Field) dotSelector.evaluate(environment);
			reference = ((Record) record).get(selector);
		}

		return reference;
	}

}
