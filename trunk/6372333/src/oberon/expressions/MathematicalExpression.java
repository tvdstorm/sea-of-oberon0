package oberon.expressions;

import oberon.IExpression;
import oberon.exceptions.UnsupportedException;

/**
 * The Class MathematicalExpression, class for all mathematical oriented expressions.
 */
public class MathematicalExpression extends AbstractLeftAndRightExpression {
	
	/** The expression type. */
	private final MathematicalExpressionType expressionType;

	/**
	 * Instantiates a new mathematical expression.
	 *
	 * @param lefthandSide the lefthand side of the expression
	 * @param righthandSide the righthand side of the expression
	 * @param type the type of the expression
	 */
	public MathematicalExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final MathematicalExpressionType type) {
		super(lefthandSide, righthandSide);
		expressionType = type;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt() throws UnsupportedException {
		int result = 0;
		final int left = getLefthandSide().evalAsInt();
		final int right = getRighthandSide().evalAsInt();
		
		switch (expressionType) {
		case Add:
			result = left + right;
			break;
		case Div: 
			result = left / right;
			break;
		case Mod:
			result = left % right;
			break;
		case Mul:
			result = left * right;
			break;
		case Sub: 
			result = left - right;
			break;
		default:
			throw new UnsupportedException("Unsupported comparison: "+ expressionType.toString());
		}
		
		return result;
	}

}
