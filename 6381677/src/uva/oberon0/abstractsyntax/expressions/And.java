package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Logical And Binary Expression (x & y).
 * @author Chiel Labee
 */
public class And extends BinaryExpression {

	public And(Expression left, Expression right) {
		super(new BooleanType(), left, right);
		
		assert left.getType() instanceof BooleanType;
		assert right.getType() instanceof BooleanType;
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) == 1 && getRight().eval(scope) == 1 ? 1 : 0;
	}

}
