package randy.oberon0.ast.statement;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.TypeCheckEnvironment;
import randy.oberon0.interpreter.typecheck.TypeCheckType;

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
		while (condition.evaluate(environment).getValue().castToBoolean().getBoolValue())
		{
			// Run the body
			body.run(environment);
		}
	}
	@Override
	public void typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Run while the condition evaluates to true
		condition.typeCheck(environment).mustBe(TypeCheckType.BOOLEAN);
		// Run the body
		body.typeCheck(environment);
	}
}
