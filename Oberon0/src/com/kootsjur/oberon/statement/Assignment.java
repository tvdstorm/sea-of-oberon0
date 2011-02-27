package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.BracketSelectorEvaluator;
import com.kootsjur.oberon.evaluator.DotSelectorEvaluator;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.evaluator.SelectorEvaluator;
import com.kootsjur.oberon.value.Field;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Value;

public class Assignment extends Statement {
	private String name;
	private SelectorEvaluator selector;
	private Evaluator expression;

	public Assignment(String name, Evaluator expression) {
		assert (name != null) : "Error!Parameter in name in Assignment Constructor is null!";
		assert (expression != null) : "Error!Parameter expression in Assignment Constructor is null!";

		this.name = name;
		this.expression = expression;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSelector(Evaluator selector) {
		this.selector = (SelectorEvaluator) selector;
	}

	public SelectorEvaluator getSelector() {
		return selector;
	}

	public void setExpression(ExpressionEvaluator expression) {
		this.expression = expression;
	}

	public Evaluator getExpression() {
		return expression;
	}

	@Override
	public void evaluate(Environment environment) {
		assert (environment != null) : "Error in Assignment method evaluate. Parameter environment is null";

		Value value = expression.evaluate(environment);
		if (selector == null) {
			assignValueWithoutSelector(value, environment);
		} else {
			assignValueWithSelector(value, environment);
		}
	}

	private void assignValueWithoutSelector(Value value, Environment environment) {
		environment.assignValue(name, value);
	}

	private void assignValueWithSelector(Value value, Environment environment) {
		if (selector instanceof BracketSelectorEvaluator) {
			assignValueWithBracketSelector(value, environment);

		} else if (selector instanceof DotSelectorEvaluator) {
			assignValueWithDotSelector(value, environment);
		}
	}

	private void assignValueWithDotSelector(Value value, Environment environment) {
		Field recordSelector = ((DotSelectorEvaluator) selector)
				.evaluate(environment);
		environment.assignRecordFieldValue(name, recordSelector, value);
	}

	private void assignValueWithBracketSelector(Value value,
			Environment environment) {
		Int arraySelector = ((BracketSelectorEvaluator) selector)
				.evaluate(environment);
		environment.assignArrayValue(name, arraySelector, value);
	}
}
