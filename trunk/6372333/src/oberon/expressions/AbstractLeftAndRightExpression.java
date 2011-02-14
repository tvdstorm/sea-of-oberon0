package oberon.expressions;

import oberon.IExpression;

/**
 * The Class AbstractLeftAndRightExpression, super class for expressions with a left and right side.
 */
public abstract class AbstractLeftAndRightExpression extends AbstractExpression {
	
	/** The righthand side. */
	private IExpression righthandSide;
	
	/** The lefthand side. */
	private IExpression lefthandSide;

	/**
	 * Instantiates a new abstract left and right expression.
	 *
	 * @param lefthandSide the lefthand side of the expression
	 * @param righthandSide the righthand side of the expression
	 */
	public AbstractLeftAndRightExpression(final IExpression lefthandSide, 
			final IExpression righthandSide) {
		setLefthandSide(lefthandSide);
		setRighthandSide(righthandSide);
	}

	/**
	 * Sets the righthand side of the expresssion;
	 *
	 * @param rightSide the new righthand side of the expression;
	 */
	private void setRighthandSide(final IExpression rightSide) {
		righthandSide = rightSide;
	}

	/**
	 * Gets the righthand side of the expression.
	 *
	 * @return the righthand side of the expression
	 */
	public IExpression getRighthandSide() {
		return righthandSide;
	}

	/**
	 * Sets the lefthand side of the expression.
	 *
	 * @param leftSide the new lefthand side of the expression
	 */
	private void setLefthandSide(final IExpression leftSide) {
		lefthandSide = leftSide;
	}

	/**
	 * Gets the lefthand side of the expression.
	 *
	 * @return the lefthand side of the expression
	 */
	public IExpression getLefthandSide() {
		return lefthandSide;
	}
}
