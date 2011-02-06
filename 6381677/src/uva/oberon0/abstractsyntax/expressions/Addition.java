package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents an Additional Binary Expression (x + y).
 * @author Chiel Labee
 */
public class Addition extends BinaryExpression {

	public Addition(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) + getRight().eval(scope);
	}

}
