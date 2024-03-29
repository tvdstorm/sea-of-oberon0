package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents an Equals Binary Expression (x = y).
 * 
 * @author Chiel Labee
 */
public class Equal extends BinaryExpression {

	public Equal(Expression left, Expression right) {
		super(new BooleanType(), left, right);
		
		assert left.getType().getClass() == right.getType().getClass();
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) == getRight().eval(scope) ? 1 : 0;
	}

}
