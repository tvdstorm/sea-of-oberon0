package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Constanct Declaration.
*/
public class Const extends BaseDeclaration
{
	private final BaseNode _expression;

	public Const(ID id, BaseNode expression)
	{
		super(id);

		assert expression != null : "No Expression is available for the current Constant Declaration.";

		_expression = expression;
	}

	/**
	 * Get the Expression for the current Constant Declaration.
	 */
	public uva.oberon0.abstractsyntax.BaseNode getExpression()
	{
		return _expression;
	}

	@Override
	public int eval(Scope scope)
	{
		if (_expression instanceof uva.oberon0.abstractsyntax.types.IntValue)
			return ((uva.oberon0.abstractsyntax.types.IntValue)_expression).getValue();
		
		assert false : "Unsupported Const Data Type!";
		return 0;
	}
}
