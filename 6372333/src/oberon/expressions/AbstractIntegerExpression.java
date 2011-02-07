package oberon.expressions;

import oberon.Scope;

/**
 * The Class AbstractIntegerExpression, super class for all integer expressions.
 */
public class AbstractIntegerExpression extends AbstractExpression {
	
	/** The expression value. */
	private final int expressionValue;

	/**
	 * Instantiates a new abstract integer expression.
	 *
	 * @param value the value
	 */
	public AbstractIntegerExpression(final int value) {
		expressionValue = value;
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(Scope currentScope) {
		return expressionValue;
	}

}
