package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Unary Expression.
 * This class is abstract.
*/
public abstract class BaseExpressionUnary extends BaseExpression {

	protected BaseExpressionUnary(BaseExpression argument)
	{
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