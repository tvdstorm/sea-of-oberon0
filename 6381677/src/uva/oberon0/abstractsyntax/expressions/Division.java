package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Division Binary Expression (x / y).
 * @author Chiel Labee
 */
public class Division extends BaseExpressionBinary {

	public Division(BaseExpression left, BaseExpression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) / getRight().eval(scope);
	}

}
