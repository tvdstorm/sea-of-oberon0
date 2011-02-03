package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Positive Unary Expression (+x).
 * @author Chiel Labee
 */
public class Positive extends BaseExpressionUnary {

	public Positive(BaseExpression argument) {
		super(argument);
	}

	@Override
	public int eval(Scope scope) {
		return +getArgument().eval(scope);
	}

}
