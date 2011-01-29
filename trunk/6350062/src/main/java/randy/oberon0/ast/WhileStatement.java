package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Value;

public class WhileStatement extends Statement
{
	private Expression expression;
	private Block body;
	
	public WhileStatement(Expression _expression, Block _body)
	{
		assert(_expression != null);
		assert(_body != null);
		expression = _expression;
		body = _body;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		while (true)
		{
			// Evaluate the expression and convert it to a boolean
			Boolean bExpression = expression.run(environment).castToBoolean();
			// If the expression is false, skip the body
			if (!bExpression.getBoolValue())
				return null;
			// Evaluate the body
			body.run(environment);
		}
	}
}
