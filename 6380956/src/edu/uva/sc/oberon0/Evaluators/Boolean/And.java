package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class And implements IBool {
	private IBool arg1;
	private IBool arg2;
	@Override
	public Boolean evaluate(IScope scope) {
		return arg1.evaluate(scope) && arg2.evaluate(scope);
	}
	public And(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = (IBool)arg1;
		this.arg2 = (IBool)arg2;
	}
	public String toString(IScope scope){
		return evaluate(scope).toString();
	}
}
