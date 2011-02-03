package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.expressions.BaseExpression;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValueBase;
import uva.oberon0.runtime.ScopeValueInt;


/**
 * @author Chiel Labee
 * This class represents a Constanct Declaration.
*/
public class Constant extends BaseDeclaration
{
	private final BaseExpression _expression;

	public Constant(ID id, BaseExpression expression)
	{
		super(id);

		assert expression != null : "No Expression is available for the current Constant Declaration.";

		_expression = expression;
	}

	@Override
	public int eval(Scope scope)
	{
		return _expression.eval(scope);
	}
	
	public ScopeValueBase instantiate(Scope scope) {
		return new ScopeValueInt(scope, _expression.eval(scope));
	}
}
