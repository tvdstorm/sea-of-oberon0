package randy.ast;

import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OInfixExpression extends OExpression
{
	private OExpression lhs;
	private OExpression rhs;
	private Operator operator;
	
	public OInfixExpression(OExpression _lhs, Operator _operator, OExpression _rhs)
	{
		assert(_lhs != null);
		assert(_operator != null);
		assert(_rhs != null);
		lhs = _lhs;
		operator = _operator;
		rhs = _rhs;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// TODO: lazy evaluation and casting
		// Evaluate the left hand side and right hand side and see if they are both integers of booleans
		OValue lhsVal = lhs.run(vars).dereference();
		OValue rhsVal = rhs.run(vars).dereference();
		assert(lhsVal != null);
		assert(rhsVal != null);
		if (lhsVal instanceof OInteger && rhsVal instanceof OInteger)
			return processIntegerExpression((OInteger)lhsVal, (OInteger)rhsVal);
		else if (lhsVal instanceof OBoolean && rhsVal instanceof OBoolean)
			return processBooleanExpression((OBoolean)lhsVal, (OBoolean)rhsVal);
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhsVal.getType(), rhsVal.getType());
	}
	private OValue processIntegerExpression(OInteger lhs, OInteger rhs) throws Oberon0OperatorTypeUndefinedException, Oberon0DivideByZeroException
	{
		// Process the infix integer expression
		if (operator == Operator.PLUS)
			return new OInteger(lhs.getIntValue() + rhs.getIntValue());
		else if (operator == Operator.MINUS)
			return new OInteger(lhs.getIntValue() - rhs.getIntValue());
		else if (operator == Operator.DIV)
		{
			if (rhs.getIntValue() == 0)
				throw new Oberon0DivideByZeroException();
			return new OInteger(lhs.getIntValue() / rhs.getIntValue());
		}
		else if (operator == Operator.TIMES)
			return new OInteger(lhs.getIntValue() * rhs.getIntValue());
		else if (operator == Operator.SMALLERTHAN)
			return new OBoolean(lhs.getIntValue() < rhs.getIntValue());
		else if (operator == Operator.GREATERTHAN)
			return new OBoolean(lhs.getIntValue() > rhs.getIntValue());
		else if (operator == Operator.SMALLEREQUALS)
			return new OBoolean(lhs.getIntValue() <= rhs.getIntValue());
		else if (operator == Operator.GREATEREQUALS)
			return new OBoolean(lhs.getIntValue() >= rhs.getIntValue());
		else if (operator == Operator.EQUALS)
			return new OBoolean(lhs.getIntValue() == rhs.getIntValue());
		else if (operator == Operator.NOTEQUALS)
			return new OBoolean(lhs.getIntValue() != rhs.getIntValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhs.getType(), rhs.getType());
	}
	private OValue processBooleanExpression(OBoolean lhs, OBoolean rhs) throws Oberon0OperatorTypeUndefinedException
	{
		// Process the boolean infix expression
		if (operator == Operator.AND)
			return new OBoolean(lhs.getBoolValue() && rhs.getBoolValue());
		else if (operator == Operator.OR)
			return new OBoolean(lhs.getBoolValue() || rhs.getBoolValue());
		else if (operator == Operator.EQUALS)
			return new OBoolean(lhs.getBoolValue() == rhs.getBoolValue());
		else if (operator == Operator.NOTEQUALS)
			return new OBoolean(lhs.getBoolValue() != rhs.getBoolValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhs.getType(), rhs.getType());
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		rhs.accept(visitor);
		visitor.visitAfter(this);
	}
}
