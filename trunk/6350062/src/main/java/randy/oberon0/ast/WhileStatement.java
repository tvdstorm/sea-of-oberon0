package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class WhileStatement extends Statement
{
	private final Expression condition;
	private final Block body;
	
	public WhileStatement(Expression _condition, Block _body)
	{
		assert(_condition != null);
		assert(_body != null);
		condition = _condition;
		body = _body;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Run while the condition evaluates to true
		while (condition.evaluate(environment).castToBoolean().getBoolValue())
		{
			// Run the body
			body.run(environment);
		}
	}
	@Override
	public void typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Run while the condition evaluates to true
		condition.typeCheck(environment).castToBoolean();
		// Run the body
		body.typeCheck(environment);
	}
}
