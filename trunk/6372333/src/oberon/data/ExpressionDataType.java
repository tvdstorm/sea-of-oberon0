package oberon.data;

import oberon.AbstractExpression;

public class ExpressionDataType extends AbstractDataType {
	private final AbstractExpression expression;

	public ExpressionDataType(final String name, final AbstractExpression inputExpression) {
		super(name);
		expression = inputExpression;
	}

	@Override
	public int getValue() {
		return expression.evalAsInt();
	}

	@Override
	public AbstractDataType deepCopy(final String newName) {
		return new ExpressionDataType(newName, expression);
	}

	@Override
	public AbstractDataType shallowCopy(final String newName) {
		return new ExpressionDataType(newName, expression);
	}

}
