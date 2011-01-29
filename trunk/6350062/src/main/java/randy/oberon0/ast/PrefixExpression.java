package randy.oberon0.ast;

import randy.oberon0.ast.enums.Operator;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Boolean;

public class PrefixExpression extends Expression
{
	private Expression rhs;
	private Operator operator;
	
	public PrefixExpression(Operator _operator, Expression _rhs)
	{
		assert(_operator != null);
		assert(_rhs != null);
		operator = _operator;
		rhs = _rhs;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		Value rhsVal = rhs.run(environment).dereference();
		assert(rhsVal != null);
		if (rhsVal instanceof Integer)
			return processIntegerExpression((Integer)rhsVal);
		else if (rhsVal instanceof Boolean)
			return processBooleanExpression((Boolean)rhsVal);
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), rhsVal.getType());
	}
	private Value processIntegerExpression(Integer rhs) throws RuntimeException
	{
		if (operator == Operator.PLUS)
			return new Integer(rhs);
		else if (operator == Operator.MINUS)
			return new Integer(-rhs.getIntValue());
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), rhs.getType());
	}
	private Value processBooleanExpression(Boolean rhs) throws RuntimeException
	{
		if (operator == Operator.NOT)
			return new Boolean(!rhs.getBoolValue());
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), rhs.getType());
	}
}
