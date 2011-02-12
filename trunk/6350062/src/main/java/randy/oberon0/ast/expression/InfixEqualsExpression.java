package randy.oberon0.ast.expression;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Boolean;

public class InfixEqualsExpression extends InfixExpression
{
	public InfixEqualsExpression(Expression _leftHandExpression, Expression _rightHandExpression)
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
			return new ByValue(new Boolean(valLh.equalsToValue(valRh)));
		}
		else if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new ByValue(new Boolean(valLh.equalsToValue(valRh)));
		}
		else if (valLh instanceof Record && valRh instanceof Record)
		{
			return new ByValue(new Boolean(valLh.equalsToValue(valRh)));
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
		final ITypeCheckType valRh = getRightHandExpression().typeCheck(environment).getValue();
		final ITypeCheckType valLh = getLeftHandExpression().typeCheck(environment).getValue();
		// Check if we support the operator
		if (valLh.equals(valRh))
		{
			return new TypeCheckByValue(TypeCheckType.BOOLEAN);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("=", valLh.toString(), valRh.toString());
		}
	}
}
