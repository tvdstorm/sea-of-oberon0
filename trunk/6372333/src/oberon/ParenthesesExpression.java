package oberon;

public class ParenthesesExpression extends Expression {
	private Expression _expression;

	public ParenthesesExpression(Expression expression)
	{
		_expression = expression;
	}
	
	@Override
	public int EvalAsInt() {
		return _expression.EvalAsInt();
	}

}
