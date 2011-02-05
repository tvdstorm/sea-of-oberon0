package oberon;

public abstract class AbstractLeftAndRightExpression extends AbstractExpression {
	private IExpression righthandSide;
	private IExpression lefthandSide;

	public AbstractLeftAndRightExpression(final IExpression lefthandSide, 
			final IExpression righthandSide) {
		setLefthandSide(lefthandSide);
		setRighthandSide(righthandSide);
	}

	private void setRighthandSide(final IExpression rightSide) {
		righthandSide = rightSide;
	}

	protected IExpression getRighthandSide() {
		return righthandSide;
	}

	private void setLefthandSide(final IExpression leftSide) {
		lefthandSide = leftSide;
	}

	protected IExpression getLefthandSide() {
		return lefthandSide;
	}
}
