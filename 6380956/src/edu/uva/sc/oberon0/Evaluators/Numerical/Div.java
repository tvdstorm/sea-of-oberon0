package edu.uva.sc.oberon0.Evaluators.Numerical;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class Div implements IEvaluator {
	private IEvaluator arg1;
	private IEvaluator arg2;
	@Override
	public Integer evaluate(IScope scope) {
		return (Integer)arg1.evaluate(scope)/(Integer)arg2.evaluate(scope);
	}
	public Div(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public String toString(IScope scope){
		return evaluate(scope).toString();
	}
}
