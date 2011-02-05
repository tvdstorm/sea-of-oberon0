package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;

/**
 * This class represents a Less Than Binary Expression (x < y).
 * @author Chiel Labee
 */
public class LessThan extends BaseExpressionBinary {

	public LessThan(BaseExpression left, BaseExpression right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) < getRight().eval(scope) ? 1 : 0;
	}

}