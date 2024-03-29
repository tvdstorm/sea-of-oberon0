package edu.uva.sc.oberon0.Evaluators.Selectors;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class ArraySelector implements ISelector {
	IEvaluator index;
	ISelector childSelector;
	private static final long serialVersionUID = 1L;

	public ArraySelector(IEvaluator expression)
	{
		index = expression;
	}

	@Override
	public Object evaluate(IScope scope) {
		return this.index.evaluate(scope);
	}

	@Override
	public void SetBottomChildSelector(ISelector sel) {
		if(this.childSelector == null) {
			this.childSelector = sel;
		} else {
			this.childSelector.SetBottomChildSelector(sel);
		}
	}

	@Override
	public ISelector GetChildSelector() {
		return childSelector;
	}
	
	@Override
	public void SetChildSelector(ISelector selector) {
		this.childSelector = selector;
	}
}
