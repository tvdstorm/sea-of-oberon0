package randy.oberon0.ast.expression;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class PrefixMinExpression extends PrefixExpression
{
	public PrefixMinExpression(Expression _rhs)
	{
		super(_rhs);
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final Value valRh = getRightHandExpression().evaluate(environment).getValue();
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
