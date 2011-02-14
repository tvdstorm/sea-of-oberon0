package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Not Equals Binary Expression (x != y).
 * @author Chiel Labee
 */
public class NotEqual extends BinaryExpression {

	public NotEqual(Expression left, Expression right) {
		super(new BooleanType(), left, right);
		
		assert left.getType().getClass() == right.getType().getClass();
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) != getRight().eval(scope) ? 1 : 0;
	}

}
