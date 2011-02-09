package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Value;
import randy.oberon0.value.Boolean;

public class PrefixNotExpression extends PrefixExpression
{
	public PrefixNotExpression(Expression _rhs)
	{
		super(_rhs);
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final Value valRh = rightHandExpression.evaluate(environment).getValue();
		// Check if we support the operator
		if (valRh instanceof Boolean)
		{
			return new ByValue(new Boolean(!valRh.castToBoolean().getBoolValue()));
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("~", valRh.getType().toString());
		}
	}
	@Override
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the right hand side expression
		final ITypeCheckType valRh = rightHandExpression.typeCheck(environment).getValue();
		// Check if we support the operator
		if (valRh.equals(TypeCheckType.BOOLEAN))
		{
			return new TypeCheckByValue(TypeCheckType.BOOLEAN);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("~", valRh.toString());
		}
	}
}
