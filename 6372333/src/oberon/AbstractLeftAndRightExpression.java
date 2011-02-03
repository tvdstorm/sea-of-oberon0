package oberon;

public abstract class AbstractLeftAndRightExpression extends AbstractExpression {
	private AbstractExpression righthandSide;
	private AbstractExpression lefthandSide;

	public AbstractLeftAndRightExpression(final AbstractExpression lefthandSide, 
			final AbstractExpression righthandSide) {
		setLefthandSide(lefthandSide);
		setRighthandSide(righthandSide);
	}

	private void setRighthandSide(final AbstractExpression rightSide) {
		righthandSide = rightSide;
	}

	protected AbstractExpression getRighthandSide() {
		return righthandSide;
	}

	private void setLefthandSide(final AbstractExpression leftSide) {
		lefthandSide = leftSide;
	}

	protected AbstractExpression getLefthandSide() {
		return lefthandSide;
	}
}
