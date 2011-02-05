package oberon.data;

import oberon.IDataType;
import oberon.IExpression;

public class ExpressionDataType extends AbstractDataType {
	private final IExpression expression;

	public ExpressionDataType(final String name, final IExpression inputExpression) {
		super(name);
		expression = inputExpression;
	}

	@Override
	public int getValue() {
		return expression.evalAsInt();
	}

	@Override
	public IDataType copy(final String newName) {
		return new ExpressionDataType(newName, expression);
	}
}
