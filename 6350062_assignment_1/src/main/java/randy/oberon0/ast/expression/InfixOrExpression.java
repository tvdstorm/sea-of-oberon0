package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.Value;
import randy.oberon0.value.Boolean;

public class InfixOrExpression extends InfixExpression
{
	public InfixOrExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		super(_leftHandExpression, _rightHandExpression);
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final Value valRh = getRightHandExpression().evaluate(environment).getValue();
		final Value valLh = getLeftHandExpression().evaluate(environment).getValue();
		// Check if we support the operator
		if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new ByValue(new Boolean(valLh.castToBoolean().getBoolValue() || valRh.castToBoolean().getBoolValue()));
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("OR", valLh.getType().toString(), valRh.getType().toString());
		}
	}
}
