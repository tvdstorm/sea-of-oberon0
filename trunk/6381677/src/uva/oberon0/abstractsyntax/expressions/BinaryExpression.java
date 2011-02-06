package uva.oberon0.abstractsyntax.expressions;


/**
 * @author Chiel Labee
 * This class represents a Binary Expression.
 * This class is abstract.
*/
public abstract class BinaryExpression extends Expression {

	public BinaryExpression(Expression left, Expression right) 
	{
		assert left!= null 	: "No Left Expression is available for the current Binary Expression!";
		assert right!= null : "No Right Expression is available for the current Binary Expressio!";
		
		_left = left;
		_right = right;
	}
	
	private Expression _left = null;
	/**
	 * Gets the Left part of the Expression.
	 */
	public Expression getLeft()
	{
		return _left;
	}
	
	private Expression _right = null;
	/**
	 * Gets the Right part of the Expression.
	 */
	public Expression getRight()
	{
		return _right;
	}
}
