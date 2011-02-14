package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Less Than Binary Expression (x < y).
 * @author Chiel Labee
 */
public class LessThan extends BinaryExpression {

	public LessThan(Expression left, Expression right) {
		super(new BooleanType(), left, right);
		
		assert left.getType() instanceof IntegerType;
		assert right.getType() instanceof IntegerType;
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) < getRight().eval(scope) ? 1 : 0;
	}

}
