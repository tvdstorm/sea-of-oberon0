package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class OWhileStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	
	public OWhileStatement(OExpression _expression, OBlock _body)
	{
		assert(_expression != null);
		assert(_body != null);
		expression = _expression;
		body = _body;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		while (true)
		{
			// Evaluate the expression and convert it to a boolean
			OBoolean bExpression = expression.run(environment).castToBoolean();
			// If the expression is false, skip the body
			if (!bExpression.getBoolValue())
				return null;
			// Evaluate the body
			body.run(environment);
		}
	}
}
