package oberon.expressions;

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
	public int evalAsInt() {
		return value;
	}

}
