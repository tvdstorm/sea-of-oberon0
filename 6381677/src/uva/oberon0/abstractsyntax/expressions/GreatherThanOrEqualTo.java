package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Greather Than or Equal To Binary Expression (x >= y).
 * @author Chiel Labee
 */
public class GreatherThanOrEqualTo extends BaseExpressionBinary {

	public GreatherThanOrEqualTo(BaseNode left, BaseNode right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) >= getRight().eval(scope) ? 1 : 0;
	}

}
