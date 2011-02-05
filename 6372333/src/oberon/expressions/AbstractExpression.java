package oberon.expressions;

import oberon.IDataType;
import oberon.IExpression;
import oberon.data.IntegerDataType;

public abstract class AbstractExpression implements IExpression {
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsInt()
	 */
	@Override
	public abstract int evalAsInt();
	
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsBoolean()
	 */
	@Override
	public Boolean evalAsBoolean() {
		return evalAsInt() == 1;
	}
	
	protected int booleanAsInt(final Boolean input) {
		int result = 0;
		if (input) {
			result = 1;
		}
		return result;
	}
	
	@Override
	public IDataType copy(String newName)
	{
		if (	this instanceof MathematicalExpression ||
				this instanceof AbstractIntegerExpression){
			return new IntegerDataType(newName, this.evalAsInt(), false);
		}
		else if (this instanceof SelectorExpression){
			final SelectorExpression selectorExpression = ((SelectorExpression)this);
			return selectorExpression.copy(newName);
		}
		
		//TODO: throw;
		return null;
	}

}
