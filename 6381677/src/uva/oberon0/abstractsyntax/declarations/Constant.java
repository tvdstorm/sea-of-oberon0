package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.ITypeCheckable;
import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.values.Value;
import uva.oberon0.runtime.values.IntegerValue;

/**
 * @author Chiel Labee This class represents a Constanct Declaration.
 */
public class Constant extends Declaration implements ITypeCheckable {
	private final Expression _expression;

	public Constant(ID id, Expression expression) {
		super(id);

		assert expression != null : "No Expression is available for the current Constant Declaration.";

		_expression = expression;
	}

	public Value instantiate(Scope scope) {
		return new IntegerValue(_expression.eval(scope));
	}

	@Override
	public BaseType getType() {
		return new IntegerType();
	}
}
