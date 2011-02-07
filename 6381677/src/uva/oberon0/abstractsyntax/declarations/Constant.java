package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValue;
import uva.oberon0.runtime.ScopeValueInt;

/**
 * @author Chiel Labee This class represents a Constanct Declaration.
 */
public class Constant extends Declaration {
	private final Expression _expression;

	public Constant(ID id, Expression expression) {
		super(id);

		assert expression != null : "No Expression is available for the current Constant Declaration.";

		_expression = expression;
	}

	public ScopeValue instantiate(Scope scope) {
		return new ScopeValueInt(_expression.eval(scope));
	}
}
