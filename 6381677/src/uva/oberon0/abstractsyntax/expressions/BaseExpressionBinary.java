package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Binary Expression.
 * This class is abstract.
*/
public abstract class BaseExpressionBinary extends BaseExpression {

	public BaseExpressionBinary(BaseNode left, BaseNode right) 
	{
		assert left!= null 	: "No Left Expression is available for the current Binary Expression!";
		assert right!= null : "No Right Expression is available for the current Binary Expressio!";
		
		_left = left;
		_right = right;
	}
	
	private BaseNode _left = null;
	/**
	 * Gets the Left part of the Expression.
	 */
	public BaseNode getLeft()
	{
		return _left;
	}
	
	private BaseNode _right = null;
	/**
	 * Gets the Right part of the Expression.
	 */
	public BaseNode getRight()
	{
		return _right;
	}
}
