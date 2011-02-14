package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Greather Than or Equal To Binary Expression (x >= y).
 * @author Chiel Labee
 */
public class GreatherThanOrEqualTo extends BinaryExpression implements IBooleanExpression {

	public GreatherThanOrEqualTo(Expression left, Expression right) {
		super(left, right);
		
		assert left instanceof INumericExpression;
		assert right instanceof INumericExpression;
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) >= getRight().eval(scope) ? 1 : 0;
	}

}
