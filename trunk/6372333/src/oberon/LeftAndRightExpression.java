package oberon;

public abstract class LeftAndRightExpression extends Expression {
	private Expression _righthandSide;
	private Expression _lefthandSide;

	public LeftAndRightExpression(Expression lefthandSide, Expression righthandSide) {
		set_lefthandSide(lefthandSide);
		set_righthandSide(righthandSide);
	}

	private void set_righthandSide(Expression _righthandSide) {
		this._righthandSide = _righthandSide;
	}

	protected Expression get_righthandSide() {
		return _righthandSide;
	}

	private void set_lefthandSide(Expression _lefthandSide) {
		this._lefthandSide = _lefthandSide;
	}

	protected Expression get_lefthandSide() {
		return _lefthandSide;
	}
}
