package edu.uva.sc.oberon0.Evaluators.Numerical;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class MultEvaluator implements IEvaluator {
	private int arg1;
	private int arg2;
	@Override
	public Integer evaluate() {
		return arg1*arg2;
	}
	public MultEvaluator(Object arg1, Object arg2) {
		super();
		this.arg1 = (Integer)arg1;
		this.arg2 = (Integer)arg2;
	}
	public String toString(){
		return evaluate().toString();
	}
}
