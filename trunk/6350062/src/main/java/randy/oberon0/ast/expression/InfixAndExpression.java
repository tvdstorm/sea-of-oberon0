package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.*;
import randy.oberon0.value.Value;
import randy.oberon0.value.Boolean;

public class InfixAndExpression extends InfixExpression
{
	public InfixAndExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		super(_leftHandExpression, _rightHandExpression);
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final Value valRh = rightHandExpression.evaluate(environment).getValue();
		final Value valLh = leftHandExpression.evaluate(environment).getValue();
		// Check if we support the operator
		if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new ByValue(new Boolean(valLh.castToBoolean().getBoolValue() && valRh.castToBoolean().getBoolValue()));
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("AND", valLh.getType().toString(), valRh.getType().toString());
		}
	}
	@Override
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final ITypeCheckType valRh = rightHandExpression.typeCheck(environment).getValue();
		final ITypeCheckType valLh = leftHandExpression.typeCheck(environment).getValue();
		// Check if we support the operator
		if (valLh.equals(TypeCheckType.BOOLEAN) && valRh.equals(TypeCheckType.BOOLEAN))
		{
			return new TypeCheckByValue(TypeCheckType.BOOLEAN);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("AND", valLh.toString(), valRh.toString());
		}
	}
}
