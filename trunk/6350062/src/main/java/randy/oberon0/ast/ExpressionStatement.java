package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class ExpressionStatement extends Statement
{
	private Expression expression;
	
	public ExpressionStatement(Expression _expression)
	{
		assert(_expression != null);
		expression = _expression;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		// Run the expression and return null since statements don't return values (expressions do)
		expression.run(environment);
		return null;
	}
}
