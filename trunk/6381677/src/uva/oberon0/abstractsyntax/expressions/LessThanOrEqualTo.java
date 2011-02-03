package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Less Than or Equal To Binary Expression (x <= y).
 * @author Chiel Labee
 */
public class LessThanOrEqualTo extends BaseExpressionBinary {

	public LessThanOrEqualTo(BaseNode left, BaseNode right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) <= getRight().eval(scope) ? 1 : 0;
	}

}
