package randy.oberon0.ast;

import randy.oberon0.ast.enums.Operator;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Integer;
import randy.oberon0.value.*;

public class InfixExpression extends Expression
{
	private Expression lhs;
	private Expression rhs;
	private Operator operator;
	
	public InfixExpression(Expression _lhs, Operator _operator, Expression _rhs)
	{
		assert(_lhs != null);
		assert(_operator != null);
		assert(_rhs != null);
		lhs = _lhs;
		operator = _operator;
		rhs = _rhs;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);// Evaluate the left hand side and right hand side and see if they are both integers of booleans
		Value lhsVal = lhs.run(environment);
		assert(lhsVal != null);
		if (lhsVal instanceof PointerToValue)
			return processPointerToExpression((PointerToValue)lhsVal, environment);
		else
		{
			lhsVal = lhsVal.dereference();
			if (lhsVal instanceof Integer)
				return processIntegerExpression(((Integer)lhsVal).getIntValue(), environment);
			else if (lhsVal instanceof Boolean)
				return processBooleanExpression(((Boolean)lhsVal).getBoolValue(), environment);
			else
				throw new OperatorTypeUndefinedException(operator.getOperatorText(), lhsVal.getType());
		}
	}
	private Value processPointerToExpression(PointerToValue valLhs, RuntimeEnvironment environment) throws RuntimeException
	{
		// Process the infix pointer to expression
		Value valRhs = rhs.run(environment).dereference();
		if (operator == Operator.EQUALS)
		{
			if (valLhs.isNill() && valRhs instanceof NilValue)
				return new Boolean(true);
			// TODO: uitbreiden
			return new Boolean(false);
		}
		else if (operator == Operator.NOTEQUALS)
		{
			boolean l = valLhs.isNill();
			boolean r = valRhs instanceof NilValue;
			if (l != r)
				return new Boolean(true);
			// TODO: uitbreiden
			return new Boolean(false);
		}
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), Type.POINTERTO);
	}
	private Value processIntegerExpression(int valLhs, RuntimeEnvironment environment) throws RuntimeException
	{
		// Process the infix integer expression
		// Operators that can have a lazy right hand side
		
		// Operators that don't have a lazy right hand side
		int valRhs = rhs.run(environment).dereference().castToInteger().getIntValue();
		if (operator == Operator.PLUS)
			return new Integer(valLhs + valRhs);
		else if (operator == Operator.MINUS)
			return new Integer(valLhs - valRhs);
		else if (operator == Operator.DIV)
		{
			if (valRhs == 0)
				throw new DivideByZeroException();
			return new Integer(valLhs / valRhs);
		}
		else if (operator == Operator.TIMES)
			return new Integer(valLhs * valRhs);
		else if (operator == Operator.SMALLERTHAN)
			return new Boolean(valLhs < valRhs);
		else if (operator == Operator.GREATERTHAN)
			return new Boolean(valLhs > valRhs);
		else if (operator == Operator.SMALLEREQUALS)
			return new Boolean(valLhs <= valRhs);
		else if (operator == Operator.GREATEREQUALS)
			return new Boolean(valLhs >= valRhs);
		else if (operator == Operator.EQUALS)
			return new Boolean(valLhs == valRhs);
		else if (operator == Operator.NOTEQUALS)
			return new Boolean(valLhs != valRhs);
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), Type.INTEGER);
	}
	private Value processBooleanExpression(boolean valLhs, RuntimeEnvironment environment) throws RuntimeException
	{
		// Process the boolean infix expression
		// Operators that can have a lazy right hand side
		if (operator == Operator.AND)
		{
			if (!valLhs)
				return new Boolean(false);
			else
				return new Boolean(rhs.run(environment).dereference().castToBoolean().getBoolValue());
		}
		else if (operator == Operator.OR)
		{
			if (valLhs)
				return new Boolean(true);
			else
				return new Boolean(rhs.run(environment).dereference().castToBoolean().getBoolValue());
		}
		// Operators that don't have a lazy right hand side
		boolean valRhs = rhs.run(environment).dereference().castToBoolean().getBoolValue();
		if (operator == Operator.EQUALS)
			return new Boolean(valLhs == valRhs);
		else if (operator == Operator.NOTEQUALS)
			return new Boolean(valLhs != valRhs);
		else
			throw new OperatorTypeUndefinedException(operator.getOperatorText(), Type.BOOLEAN);
	}
}
