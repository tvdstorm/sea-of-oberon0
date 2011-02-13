package edu.uva.sc.oberon0.Evaluators.Numerical;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class IntegerEvaluator implements IEvaluator {
	private int arg1;
	@Override
	public Integer evaluate() {
		return arg1;
	}
	public IntegerEvaluator(int arg1) {
		super();
		this.arg1 = arg1;
	}
	public String toString(){
		return evaluate().toString();
	}
}
