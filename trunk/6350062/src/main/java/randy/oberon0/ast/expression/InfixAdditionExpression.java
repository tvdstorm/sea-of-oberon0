package randy.oberon0.ast.expression;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
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
			return new ByValue(new Integer(((Integer)valLh).getIntValue() + ((Integer)valRh).getIntValue()));
		}
		else
		{
			throw new UnreachableRuntimeException();
		}
	}
	@Override
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final ITypeCheckType valRh = rightHandExpression.typeCheck(environment).getValue();
		final ITypeCheckType valLh = leftHandExpression.typeCheck(environment).getValue();
		// Check if we support the operator
		if (valLh.equals(TypeCheckType.INTEGER) && valRh.equals(TypeCheckType.INTEGER))
		{
			return new TypeCheckByValue(TypeCheckType.INTEGER);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("+", valLh.toString(), valRh.toString());
		}
	}
}
