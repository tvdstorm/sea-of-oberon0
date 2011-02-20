package edu.uva.sc.oberon0.Evaluators.Structural;

import org.antlr.runtime.Token;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class VariableRef implements IEvaluator {
	String name;
	ISelector selector;
	public VariableRef(String name, ISelector selector)
	{
		this.name = name;
		this.selector = selector;
	}
	@Override
	public Object evaluate(IScope scope) {
		return scope.GetVarValue(this.name);
	}

}
