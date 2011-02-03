package oberon;

public class ParenthesesExpression extends AbstractExpression {
	private final AbstractExpression _expression;

	public ParenthesesExpression(final AbstractExpression expression) {
		_expression = expression;
	}
	
	@Override
	public int evalAsInt() {
		return _expression.evalAsInt();
	}

}
