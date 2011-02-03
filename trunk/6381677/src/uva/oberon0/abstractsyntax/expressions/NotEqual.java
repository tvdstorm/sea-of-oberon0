package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Not Equals Binary Expression (x != y).
 * @author Chiel Labee
 */
public class NotEqual extends BaseExpressionBinary {

	public NotEqual(BaseExpression left, BaseExpression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) != getRight().eval(scope) ? 1 : 0;
	}

}
