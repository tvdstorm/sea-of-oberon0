package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Modulo Binary Expression (x % y).
 * @author Chiel Labee
 */
public class Modulo extends BinaryExpression implements INumericExpression {

	public Modulo(Expression left, Expression right) {
		super(left, right);
		
		assert left instanceof INumericExpression;
		assert right instanceof INumericExpression;
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) % getRight().eval(scope);
	}

}
