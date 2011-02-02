package randy.oberon0.ast;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Record;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Boolean;

public class InfixEqualsExpression extends InfixExpression
{
	public InfixEqualsExpression(Expression _lhs, Expression _rhs)
	{
		super(_lhs, _rhs);
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		Value valRh = rhs.run(environment).dereference();
		Value valLh = lhs.run(environment).dereference();
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			return new Boolean(valLh.castToInteger().getIntValue() == valRh.castToInteger().getIntValue());
		}
		else if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new Boolean(valLh.castToBoolean().getBoolValue() == valRh.castToBoolean().getBoolValue());
		}
		else if (valLh instanceof Record && valRh instanceof Record)
		{
			// TODO: implement
			return null;
		}
		else
		{
			throw new OperatorTypeUndefinedException("=", valLh.getType(), valRh.getType());
		}
	}
}
