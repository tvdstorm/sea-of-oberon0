package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Not Unary Expression (!x).
 * @author Chiel Labee
 */
public class Not extends UnaryExpression {

	public Not(Expression argument) {
		super(new BooleanType(), argument);
		
		assert argument.getType() instanceof BooleanType;
	}

	@Override
	public int eval(Scope scope) {
		return getArgument().eval(scope) == 0 ? 1 : 0;
	}

}
