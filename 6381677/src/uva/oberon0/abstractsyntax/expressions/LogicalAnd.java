package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Logical And Binary Expression (x & y).
 * @author Chiel Labee
 */
public class LogicalAnd extends BaseExpressionBinary {

	public LogicalAnd(BaseNode left, BaseNode right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) == 1 && getRight().eval(scope) == 1 ? 1 : 0;
	}

}
