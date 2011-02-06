package oberon.expressions;

import oberon.IExpression;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class ParenthesesExpression, expression between parentheses.
 */
public class ParenthesesExpression extends AbstractExpression {
	
	/** The _expression. */
	private final IExpression _expression;

	/**
	 * Instantiates a new parentheses expression.
	 *
	 * @param expression the expression between the parentheses
	 */
	public ParenthesesExpression(final IExpression expression) {
		_expression = expression;
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt() throws UnsupportedException, VariableNotFoundInScopeException {
		return _expression.evalAsInt();
	}

}
