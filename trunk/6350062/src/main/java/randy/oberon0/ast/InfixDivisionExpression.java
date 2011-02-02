package randy.oberon0.ast;

import randy.oberon0.exception.DivideByZeroException;
import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class InfixDivisionExpression extends InfixExpression
{
	public InfixDivisionExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		super(_leftHandExpression, _rightHandExpression);
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left and right hand side expressions
		final Value valRh = rightHandExpression.run(environment).dereference();
		final Value valLh = leftHandExpression.run(environment).dereference();
		// Check if we support the operator
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			int iRh = valRh.castToInteger().getIntValue();
			if (iRh == 0)
				throw new DivideByZeroException();
			return new Integer(valLh.castToInteger().getIntValue() / iRh);
		}
		else
		{
			// No, throw an exception
			throw new OperatorTypeUndefinedException("DIV", valLh.getType().toString(), valRh.getType().toString());
		}
	}
}
