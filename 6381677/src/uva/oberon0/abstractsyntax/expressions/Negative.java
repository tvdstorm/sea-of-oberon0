package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

public class Negative extends BaseExpressionUnary {

	public Negative(BaseNode argument) {
		super(argument);
	}

	@Override
	public int eval(Scope scope) {
		return -getArgument().eval(scope);
	}

}
