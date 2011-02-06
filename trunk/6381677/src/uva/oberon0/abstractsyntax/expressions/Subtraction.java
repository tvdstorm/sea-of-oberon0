package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Subtraction Binary Expression (x - y).
 * @author Chiel Labee
 */
public class Subtraction extends BinaryExpression {

	public Subtraction(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) - getRight().eval(scope);
	}

}
