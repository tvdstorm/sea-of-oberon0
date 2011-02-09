package randy.oberon0.ast.expression;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.*;
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
		final Value valRh = rightHandExpression.evaluate(environment).getValue();
		final Value valLh = leftHandExpression.evaluate(environment).getValue();
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
	@Override
	public ITypeCheckType typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final ITypeCheckType valRh = rightHandExpression.typeCheck(environment);
		final ITypeCheckType valLh = leftHandExpression.typeCheck(environment);
		// Check if we support the operator
		if (valLh.equals(TypeCheckType.INTEGER) && valRh.equals(TypeCheckType.INTEGER))
		{
			return TypeCheckType.INTEGER;
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("+", valLh.toString(), valRh.toString());
		}
	}
}
