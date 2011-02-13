package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class AndEvaluator implements IBoolEvaluator {
	private IBoolEvaluator arg1;
	private IBoolEvaluator arg2;
	@Override
	public Boolean evaluate() {
		return arg1.evaluate() && arg2.evaluate();
	}
	public AndEvaluator(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = (IBoolEvaluator)arg1;
		this.arg2 = (IBoolEvaluator)arg2;
	}
	public String toString(){
		return evaluate().toString();
	}
}
