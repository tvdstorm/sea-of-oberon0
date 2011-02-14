package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Modulo Binary Expression (x % y).
 * @author Chiel Labee
 */
public class Modulo extends BinaryExpression {

	public Modulo(Expression left, Expression right) {
		super(new IntegerType(), left, right);
		
		assert left.getType() instanceof IntegerType;
		assert right.getType() instanceof IntegerType;
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) % getRight().eval(scope);
	}

}
