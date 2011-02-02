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
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		Value valRh = rhs.run(environment);
		if (valRh instanceof Boolean)
		{
			return new Boolean(!valRh.castToBoolean().getBoolValue());
		}
		else
		{
			throw new OperatorTypeUndefinedException("~", valRh.getType().toString());
		}
	}
}
