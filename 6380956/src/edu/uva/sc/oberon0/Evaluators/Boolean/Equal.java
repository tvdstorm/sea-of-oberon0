package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Numerical.Integ;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class Equal implements IBool {
	private IEvaluator arg1;
	private IEvaluator arg2;
	@Override
	public Boolean evaluate(IScope scope) {
		return (Integer)arg1.evaluate(scope) == (Integer)arg2.evaluate(scope);
	}
	public Equal(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public String toString(IScope scope){
		return evaluate(scope).toString();
	}
}
