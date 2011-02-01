package oberon.data;

import oberon.Expression;

public class ExpressionType extends DataType {

	private Expression _expression;

	public ExpressionType(String name, Expression expression) {
		super(name);
		_expression = expression;
	}

	@Override
	public int getValue() {
		return _expression.EvalAsInt();
	}

	@Override
	public DataType DeepCopy() {
		return new ExpressionType(getName(), _expression);
	}

}
