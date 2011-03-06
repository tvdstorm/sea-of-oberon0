package edu.uva.sc.oberon0.Evaluators.Selectors;

import org.antlr.runtime.Token;

import edu.uva.sc.oberon0.Evaluators.Structural.IScope;


public class RecordSelector implements ISelector {
	String fieldName;
	ISelector childSelector;
	private static final long serialVersionUID = 1L;

	public RecordSelector(String fieldName)
	{
		this.fieldName = fieldName;
	}

	@Override
	public Object evaluate(IScope scope) {
		return this.fieldName;
	}

	@Override
	public void SetBottomChildSelector(ISelector sel) {
		if(this.childSelector == null) {
			this.childSelector = sel;
		} else {
			this.childSelector.SetBottomChildSelector(sel);
		}
	}
	public String GetFieldName() {
		return this.fieldName;
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
