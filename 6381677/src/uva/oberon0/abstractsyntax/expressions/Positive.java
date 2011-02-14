package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Positive Unary Expression (+x).
 * @author Chiel Labee
 */
public class Positive extends UnaryExpression {

	public Positive(Expression argument) {
		super(new IntegerType(), argument);
		
		assert argument.getType() instanceof IntegerType;
	}

	@Override
	public int eval(Scope scope) {
		return +getArgument().eval(scope);
	}

}
