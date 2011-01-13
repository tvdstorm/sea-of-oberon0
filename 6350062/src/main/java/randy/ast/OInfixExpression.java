package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OInfixExpression extends OExpression
{
	private OExpression lhs;
	private OExpression rhs;
	private String operator; // TODO: ander type van maken
	
	public OInfixExpression(OExpression _lhs, String _operator, OExpression _rhs)
	{
		lhs = _lhs;
		operator = _operator;
		rhs = _rhs;
	}
	public static OInfixExpression buildInfixExpression(Tree tree) throws Oberon0Exception
	{
		String operand = tree.getText();
		OExpression left = OExpression.buildExpression(tree.getChild(0));
		OExpression right = OExpression.buildExpression(tree.getChild(1));
		return new OInfixExpression(left, operand, right);
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		OValue lhsVal = lhs.run(vars).dereference();
		OValue rhsVal = rhs.run(vars).dereference();
		if (lhsVal instanceof OInteger && rhsVal instanceof OInteger)
			return processIntegerExpression((OInteger)lhsVal, (OInteger)rhsVal);
		else if (lhsVal instanceof OBoolean && rhsVal instanceof OBoolean)
			return processBooleanExpression((OBoolean)lhsVal, (OBoolean)rhsVal);
		else
			throw new Oberon0OperatorTypeUndefinedException(operator, lhsVal.getType(), rhsVal.getType());
	}
	private OValue processIntegerExpression(OInteger lhs, OInteger rhs) throws Oberon0OperatorTypeUndefinedException
	{
		if (operator.equals("+"))
			return new OInteger(lhs.getIntValue() + rhs.getIntValue());
		else if (operator.equals("-"))
			return new OInteger(lhs.getIntValue() - rhs.getIntValue());
		else if (operator.equals("DIV"))
			return new OInteger(lhs.getIntValue() / rhs.getIntValue());
		else if (operator.equals("*"))
			return new OInteger(lhs.getIntValue() * rhs.getIntValue());
		else if (operator.equals("<"))
			return new OBoolean(lhs.getIntValue() < rhs.getIntValue());
		else if (operator.equals(">"))
			return new OBoolean(lhs.getIntValue() > rhs.getIntValue());
		else if (operator.equals("<="))
			return new OBoolean(lhs.getIntValue() <= rhs.getIntValue());
		else if (operator.equals(">="))
			return new OBoolean(lhs.getIntValue() >= rhs.getIntValue());
		else if (operator.equals("="))
			return new OBoolean(lhs.getIntValue() == rhs.getIntValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator, lhs.getType(), rhs.getType());
	}
	private OValue processBooleanExpression(OBoolean lhs, OBoolean rhs) throws Oberon0OperatorTypeUndefinedException
	{
		if (operator.equals("&"))
			return new OBoolean(lhs.getBoolValue() && rhs.getBoolValue());
		else if (operator.equals("OR"))
			return new OBoolean(lhs.getBoolValue() || rhs.getBoolValue());
		else if (operator.equals("="))
			return new OBoolean(lhs.getBoolValue() == rhs.getBoolValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator, lhs.getType(), rhs.getType());
	}
}
