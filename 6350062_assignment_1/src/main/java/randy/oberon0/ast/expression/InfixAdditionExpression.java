package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class InfixAdditionExpression extends InfixExpression
{
	public InfixAdditionExpression(Expression _leftHandExpression, Expression _rightHandExpression)
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
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			return new ByValue(new Integer(valLh.castToInteger().getIntValue() + valRh.castToInteger().getIntValue()));
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("+", valLh.getType().toString(), valRh.getType().toString());
		}
	}
}
