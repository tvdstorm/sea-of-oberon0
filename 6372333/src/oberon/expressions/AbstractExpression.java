package oberon.expressions;

import oberon.IDataType;
import oberon.IExpression;
import oberon.Scope;
import oberon.data.VariableDataType;

/**
 * The Class AbstractExpression, super class for all expressions.
 */
public abstract class AbstractExpression implements IExpression {
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsInt()
	 */
	@Override
	public abstract int evalAsInt(Scope currentScope);
	
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsBoolean()
	 */
	@Override
	public Boolean evalAsBoolean(Scope currentScope) {
		return evalAsInt(currentScope) == 1;
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
	public IDataType copy(Scope currentScope, String newName, boolean performShallowCopy) {
		assert(this instanceof MathematicalExpression ||
				this instanceof IntegerExpression ||
				this instanceof IdentifierExpression);		
		
		IDataType resultType = null;
		if (	this instanceof MathematicalExpression ||
				this instanceof IntegerExpression){
			resultType = new VariableDataType(newName, this.evalAsInt(currentScope), false);
		}
		else if (this instanceof IdentifierExpression){
			final IdentifierExpression selectorExpression = ((IdentifierExpression)this);
			
			if (performShallowCopy){
				resultType = selectorExpression.performShallowCopy(currentScope, newName);
			}
			else {
				resultType = selectorExpression.performDeepCopy(currentScope, newName);
			}
		}
	
		return resultType;
	}

	/* (non-Javadoc)
	 * @see oberon.IExpression#getText()
	 */
	public abstract String getText();
}
