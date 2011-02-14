package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Logical And Binary Expression (x & y).
 * @author Chiel Labee
 */
public class And extends BinaryExpression implements IBooleanExpression {

	public And(Expression left, Expression right) {
		super(left, right);
		
		assert left instanceof IBooleanExpression;
		assert right instanceof IBooleanExpression;
}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) == 1 && getRight().eval(scope) == 1 ? 1 : 0;
	}

}
