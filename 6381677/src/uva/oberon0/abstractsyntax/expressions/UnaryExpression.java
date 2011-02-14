package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.BaseType;

/**
 * @author Chiel Labee
 * This class represents a Unary Expression.
 * This class is abstract.
*/
public abstract class UnaryExpression extends Expression {

	protected UnaryExpression(BaseType type, Expression argument)
	{
		super(type);
		
		assert argument != null : "No Argument is available for this Unary Expression!";
		
		_argument = argument;
	}
	
	private BaseNode _argument = null;
	/**
	 * Gets the Argument part of the Unary Expression.
	 */
	public BaseNode getArgument()
	{
		return _argument;
	}
}
