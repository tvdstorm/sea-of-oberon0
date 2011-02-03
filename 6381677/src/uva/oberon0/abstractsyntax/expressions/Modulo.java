package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Modulo Binary Expression (x % y).
 * @author Chiel Labee
 */
public class Modulo extends BaseExpressionBinary {

	public Modulo(BaseExpression left, BaseExpression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) % getRight().eval(scope);
	}

}
