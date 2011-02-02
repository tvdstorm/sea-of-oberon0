package randy.oberon0.ast;

import randy.oberon0.exception.DivideByZeroException;
import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;

public class InfixDivisionExpression extends InfixExpression
{
	public InfixDivisionExpression(Expression _lhs, Expression _rhs)
	{
		super(_lhs, _rhs);
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		Value valRh = rhs.run(environment).dereference();
		Value valLh = lhs.run(environment).dereference();
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			int iRh = valRh.castToInteger().getIntValue();
			if (iRh == 0)
				throw new DivideByZeroException();
			return new Integer(valLh.castToInteger().getIntValue() / iRh);
		}
		else
		{
			throw new OperatorTypeUndefinedException("DIV", valLh.getType().toString(), valRh.getType().toString());
		}
	}
}
