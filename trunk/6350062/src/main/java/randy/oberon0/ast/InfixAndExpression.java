package randy.oberon0.ast;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;
import randy.oberon0.value.Boolean;

public class InfixAndExpression extends InfixExpression
{
	public InfixAndExpression(Expression _lhs, Expression _rhs)
	{
		super(_lhs, _rhs);
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		Value valRh = rhs.run(environment).dereference();
		Value valLh = lhs.run(environment).dereference();
		if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new Boolean(valLh.castToBoolean().getBoolValue() && valRh.castToBoolean().getBoolValue());
		}
		else
		{
			throw new OperatorTypeUndefinedException("AND", valLh.getType(), valRh.getType());
		}
	}
}
