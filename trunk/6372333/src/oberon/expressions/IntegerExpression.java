package oberon.expressions;

import oberon.Scope;

/**
 * The Class IntegerExpression, contains a simple int.
 */
public class IntegerExpression extends AbstractExpression {

	/** The value. */
	private int value;

	/**
	 * Instantiates a new integer expression.
	 *
	 * @param inputValue the input value
	 */
	public IntegerExpression (int inputValue){
		value = inputValue;
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(Scope currentScope) {
		return value;
	}

	@Override
	public String getText() {
		return String.valueOf(value);
	}

}
