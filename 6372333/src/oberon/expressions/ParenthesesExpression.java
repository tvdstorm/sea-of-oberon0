package oberon.expressions;

import oberon.IExpression;
import oberon.Scope;

/**
 * The Class ParenthesesExpression, expression between parentheses.
 */
public class ParenthesesExpression extends AbstractExpression {
	
	/** The expression. */
	private final IExpression expression;

	/**
	 * Instantiates a new parentheses expression.
	 *
	 * @param expression the expression between the parentheses
	 */
	public ParenthesesExpression(final IExpression expression) {
		this.expression = expression;
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(Scope currentScope) {
		return expression.evalAsInt(currentScope);
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#getText()
	 */
	@Override
	public String getText() {
		return "(" + expression.getText() + ")";
	}

}
