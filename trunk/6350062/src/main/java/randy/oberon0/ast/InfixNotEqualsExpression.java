package randy.oberon0.ast;

import randy.oberon0.exception.OperatorTypeUndefinedException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.NilValue;
import randy.oberon0.value.PointerToValue;
import randy.oberon0.value.Record;
import randy.oberon0.value.Value;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Boolean;

public class InfixNotEqualsExpression extends InfixExpression
{
	public InfixNotEqualsExpression(Expression _lhs, Expression _rhs)
	{
		super(_lhs, _rhs);
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		Value valRh = rhs.run(environment);
		Value valLh = lhs.run(environment);
		if ((valLh instanceof PointerToValue || valLh instanceof NilValue || valLh instanceof Record) && (valRh instanceof PointerToValue || valRh instanceof NilValue || valRh instanceof Record))
		{
			boolean bLeftNil = false;
			boolean bRightNil = false;
			if (valLh instanceof NilValue || (valLh instanceof PointerToValue && valLh.castToPointerTo().isNill()))
				bLeftNil = true;
			if (valRh instanceof NilValue || (valRh instanceof PointerToValue && valRh.castToPointerTo().isNill()))
				bRightNil = true;
			if ((!bLeftNil && bRightNil) || (bLeftNil && !bRightNil))
				return new Boolean(true);
			// TODO: uitbreiden
			return new Boolean(false);
		}
		valRh = valRh.dereference();
		valLh = valLh.dereference();
		if (valLh instanceof Integer && valRh instanceof Integer)
		{
			return new Boolean(valLh.castToInteger().getIntValue() != valRh.castToInteger().getIntValue());
		}
		else if (valLh instanceof Boolean && valRh instanceof Boolean)
		{
			return new Boolean(valLh.castToBoolean().getBoolValue() != valRh.castToBoolean().getBoolValue());
		}
		else
		{
			throw new OperatorTypeUndefinedException("#", valLh.getType(), valRh.getType());
		}
	}
}
