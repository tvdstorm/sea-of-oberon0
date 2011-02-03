package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Multiplication Unary Expression (-x).
 * @author Chiel Labee
 */
public class Negative extends BaseExpressionUnary {

	public Negative(BaseExpression argument) {
		super(argument);
	}

	@Override
	public int eval(Scope scope) {
		return -getArgument().eval(scope);
	}

}
