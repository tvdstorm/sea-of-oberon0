package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.ByValue;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class PrefixMinExpression extends PrefixExpression
{
	public PrefixMinExpression(Expression _rhs)
	{
		super(_rhs);
	}
	@Override
	public IValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final Value valRh = rightHandExpression.evaluate(environment).getValue();
		// Check if we support the operator
		if (valRh instanceof Integer)
		{
			return new ByValue(new Integer(-valRh.castToInteger().getIntValue()));
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("-", valRh.getType().toString());
		}
	}
}
