package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Numerical.Integ;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class Bigger implements IBool {
	private Integ arg1;
	private Integ arg2;
	@Override
	public Boolean evaluate(IScope scope) {
		return (Integer)arg1.evaluate(scope) > (Integer)arg2.evaluate(scope);
	}
	public Bigger(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = (Integ)arg1;
		this.arg2 = (Integ)arg2;
	}
	public String toString(IScope scope){
		return evaluate(scope).toString();
	}
}
