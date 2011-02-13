package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Numerical.IntegerEvaluator;

public class BiggerOrEqualEvaluator implements IBoolEvaluator {
	private IntegerEvaluator arg1;
	private IntegerEvaluator arg2;
	@Override
	public Boolean evaluate() {
		return arg1.evaluate() >= arg2.evaluate();
	}
	public BiggerOrEqualEvaluator(IEvaluator arg1, IEvaluator arg2) {
		super();
		this.arg1 = (IntegerEvaluator)arg1;
		this.arg2 = (IntegerEvaluator)arg2;
	}
	public String toString(){
		return evaluate().toString();
	}
}
