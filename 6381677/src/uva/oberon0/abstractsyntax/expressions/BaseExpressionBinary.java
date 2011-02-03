package uva.oberon0.abstractsyntax.expressions;


/**
 * @author Chiel Labee
 * This class represents a Binary Expression.
 * This class is abstract.
*/
public abstract class BaseExpressionBinary extends BaseExpression {

	public BaseExpressionBinary(BaseExpression left, BaseExpression right) 
	{
		assert left!= null 	: "No Left Expression is available for the current Binary Expression!";
		assert right!= null : "No Right Expression is available for the current Binary Expressio!";
		
		_left = left;
		_right = right;
	}
	
	private BaseExpression _left = null;
	/**
	 * Gets the Left part of the Expression.
	 */
	public BaseExpression getLeft()
	{
		return _left;
	}
	
	private BaseExpression _right = null;
	/**
	 * Gets the Right part of the Expression.
	 */
	public BaseExpression getRight()
	{
		return _right;
	}
}
