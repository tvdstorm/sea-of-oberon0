package edu.uva.sc.oberon0.Evaluators.Numerical;

import org.antlr.runtime.Token;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class Integ implements IEvaluator {
	private int arg1;
	@Override
	public Integer evaluate(IScope scope) {
		return arg1;
	}
	public Integ(Token arg1) {
		super();
		this.arg1 = Integer.parseInt(arg1.getText());
	}
	public String toString(IScope scope){
		return evaluate(scope).toString();
	}
}
