package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.ast.enums.Operator;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

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
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);// Evaluate the left hand side and right hand side and see if they are both integers of booleans
		OValue lhsVal = lhs.run(environment);
		assert(lhsVal != null);
		if (lhsVal instanceof OPointerToValue)
			return processPointerToExpression((OPointerToValue)lhsVal, environment);
		else
		{
			lhsVal = lhsVal.dereference();
			if (lhsVal instanceof OInteger)
				return processIntegerExpression(((OInteger)lhsVal).getIntValue(), environment);
			else if (lhsVal instanceof OBoolean)
				return processBooleanExpression(((OBoolean)lhsVal).getBoolValue(), environment);
			else
				throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhsVal.getType());
		}
	}
	private OValue processPointerToExpression(OPointerToValue valLhs, RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Process the infix pointer to expression
		OValue valRhs = rhs.run(environment).dereference();
		if (operator == Operator.EQUALS)
		{
			if (valLhs.isNill() && valRhs instanceof ONilValue)
				return new OBoolean(true);
			// TODO: uitbreiden
			return new OBoolean(false);
		}
		else if (operator == Operator.NOTEQUALS)
		{
			boolean l = valLhs.isNill();
			boolean r = valRhs instanceof ONilValue;
			if (l != r)
				return new OBoolean(true);
			// TODO: uitbreiden
			return new OBoolean(false);
		}
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), Type.POINTERTO);
	}
	private OValue processIntegerExpression(int valLhs, RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Process the infix integer expression
		// Operators that can have a lazy right hand side
		
		// Operators that don't have a lazy right hand side
		int valRhs = rhs.run(environment).dereference().castToInteger().getIntValue();
		if (operator == Operator.PLUS)
			return new OInteger(valLhs + valRhs);
		else if (operator == Operator.MINUS)
			return new OInteger(valLhs - valRhs);
		else if (operator == Operator.DIV)
		{
			if (valRhs == 0)
				throw new Oberon0DivideByZeroException();
			return new OInteger(valLhs / valRhs);
		}
		else if (operator == Operator.TIMES)
			return new OInteger(valLhs * valRhs);
		else if (operator == Operator.SMALLERTHAN)
			return new OBoolean(valLhs < valRhs);
		else if (operator == Operator.GREATERTHAN)
			return new OBoolean(valLhs > valRhs);
		else if (operator == Operator.SMALLEREQUALS)
			return new OBoolean(valLhs <= valRhs);
		else if (operator == Operator.GREATEREQUALS)
			return new OBoolean(valLhs >= valRhs);
		else if (operator == Operator.EQUALS)
			return new OBoolean(valLhs == valRhs);
		else if (operator == Operator.NOTEQUALS)
			return new OBoolean(valLhs != valRhs);
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), Type.INTEGER);
	}
	private OValue processBooleanExpression(boolean valLhs, RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Process the boolean infix expression
		// Operators that can have a lazy right hand side
		if (operator == Operator.AND)
		{
			if (!valLhs)
				return new OBoolean(false);
			else
				return new OBoolean(rhs.run(environment).dereference().castToBoolean().getBoolValue());
		}
		else if (operator == Operator.OR)
		{
			if (valLhs)
				return new OBoolean(true);
			else
				return new OBoolean(rhs.run(environment).dereference().castToBoolean().getBoolValue());
		}
		// Operators that don't have a lazy right hand side
		boolean valRhs = rhs.run(environment).dereference().castToBoolean().getBoolValue();
		if (operator == Operator.EQUALS)
			return new OBoolean(valLhs == valRhs);
		else if (operator == Operator.NOTEQUALS)
			return new OBoolean(valLhs != valRhs);
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), Type.BOOLEAN);
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
