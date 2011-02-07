package oberon.expressions;

import oberon.IExpression;
import oberon.Scope;

/**
 * The Class MathematicalExpression, class for all mathematical oriented expressions.
 */
public class MathematicalExpression extends AbstractLeftAndRightExpression {
	
	/** The expression type. */
	private final IMathematicalOperator operatorImplementation;

	/**
	 * Instantiates a new mathematical expression.
	 *
	 * @param lefthandSide the lefthand side of the expression
	 * @param righthandSide the righthand side of the expression
	 * @param type the type of the expression
	 */
	public MathematicalExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final IMathematicalOperator operator) {
		super(lefthandSide, righthandSide);
		operatorImplementation = operator;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(Scope currentScope) {
		final int left = getLefthandSide().evalAsInt(currentScope);
		final int right = getRighthandSide().evalAsInt(currentScope);
		
		return operatorImplementation.eval(left, right);
	}

}
