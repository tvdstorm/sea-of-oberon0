package randy.oberon0.ast;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;
import randy.oberon0.value.Boolean;

public class PrefixNotExpression extends PrefixExpression
{
	public PrefixNotExpression(Expression _rhs)
	{
		super(_rhs);
	}
	@Override
	public Value evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final Value valRh = rightHandExpression.evaluate(environment);
		// Check if we support the operator
		if (valRh instanceof Boolean)
		{
			return new Boolean(!valRh.castToBoolean().getBoolValue());
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("~", valRh.getType().toString());
		}
	}
	@Override
	public Value typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final Value valRh = rightHandExpression.typeCheck(environment);
		// Check if we support the operator
		if (valRh instanceof Boolean)
		{
			return new Boolean(false);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("~", valRh.getType().toString());
		}
	}
}
