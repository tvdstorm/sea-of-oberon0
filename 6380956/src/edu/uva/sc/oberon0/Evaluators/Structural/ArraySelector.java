package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ArraySelector implements ISelector {
	IEvaluator index;
	private static final long serialVersionUID = 1L;

	public ArraySelector(IEvaluator expression)
	{
		index = expression;
	}

	@Override
	public Object evaluate(IScope scope) {
		return this.index.evaluate(scope);
	}
}
