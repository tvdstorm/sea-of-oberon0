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
	public DataType DeepCopy(String newName) {
		return new ExpressionType(newName, _expression);
	}

	@Override
	public DataType ShallowCopy(String newName) {
		return new ExpressionType(newName, _expression);
	}

}
