package randy.oberon0.ast;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class InfixSmallerEqualsExpression extends InfixExpression
{
	public InfixSmallerEqualsExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		super(_leftHandExpression, _rightHandExpression);
	}
	@Override
	public Value evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final Value valRh = rightHandExpression.evaluate(environment).dereference();
		final Value valLh = leftHandExpression.evaluate(environment).dereference();
		// Check if we support the operator
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			return new Integer(valLh.castToInteger().getIntValue() <= valRh.castToInteger().getIntValue());
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("<=", valLh.getType().toString(), valRh.getType().toString());
		}
	}
}