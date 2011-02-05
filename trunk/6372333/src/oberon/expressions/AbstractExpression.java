package oberon.expressions;

import oberon.IDataType;
import oberon.IExpression;
import oberon.data.VariableDataType;
import oberon.exceptions.UnsupportedException;

/**
 * The Class AbstractExpression, super class for all expressions.
 */
public abstract class AbstractExpression implements IExpression {
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsInt()
	 */
	@Override
	public abstract int evalAsInt() throws UnsupportedException;
	
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsBoolean()
	 */
	@Override
	public Boolean evalAsBoolean() throws UnsupportedException {
		return evalAsInt() == 1;
	}
	
	/**
	 * Returns the value of a boolean as a int.
	 *
	 * @param input the boolean input
	 * @return the int value of the input bool
	 */
	protected int booleanAsInt(final Boolean input) {
		int result = 0;
		if (input) {
			result = 1;
		}
		return result;
	}
	
	/* (non-Javadoc)
	 * @see oberon.IExpression#copy(java.lang.String)
	 */
	@Override
	public IDataType copy(String newName) throws UnsupportedException
	{
		assert(this instanceof MathematicalExpression ||
				this instanceof AbstractIntegerExpression ||
				this instanceof IdentifierExpression);		
		
		IDataType resultType = null;
		if (	this instanceof MathematicalExpression ||
				this instanceof AbstractIntegerExpression){
			resultType = new VariableDataType(newName, this.evalAsInt(), false);
		}
		else if (this instanceof IdentifierExpression){
			final IdentifierExpression selectorExpression = ((IdentifierExpression)this);
			resultType = selectorExpression.copy(newName);
		}
	
		return resultType;
	}

}
