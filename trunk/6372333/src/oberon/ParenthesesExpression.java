package oberon;

public class ParenthesesExpression extends AbstractExpression {
	private final IExpression _expression;

	public ParenthesesExpression(final IExpression expression) {
		_expression = expression;
	}
	
	@Override
	public int evalAsInt() {
		return _expression.evalAsInt();
	}

}
