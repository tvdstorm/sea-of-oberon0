package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OInfixExpression extends OExpression
{
	enum Operator
	{
		PLUS("+"),
		MINUS("-"),
		DIV("DIV"),
		TIMES("*"),
		SMALLERTHAN("<"),
		GREATERTHAN(">"),
		SMALLEREQUALS("<="),
		GREATEREQUALS(">="),
		EQUALS("="),
		AND("&"),
		OR("OR");
		
		private static final Map<String, Operator> lookup = new HashMap<String, Operator>();
		
		static
		{
			for (Operator s : EnumSet.allOf(Operator.class))
				lookup.put(s.getOperatorText(), s);
		}
		private String operatorText;
		private Operator(String _operatorText)
		{
			operatorText = _operatorText;
		}
		public String getOperatorText()
		{
			return operatorText;
		}
		public static Operator get(String operatorText)
		{
			return lookup.get(operatorText);
		}
	};
	private OExpression lhs;
	private OExpression rhs;
	private Operator operator;
	
	public OInfixExpression(OExpression _lhs, Operator _operator, OExpression _rhs)
	{
		lhs = _lhs;
		operator = _operator;
		rhs = _rhs;
	}
	public static OInfixExpression buildInfixExpression(Tree tree) throws Oberon0Exception
	{
		OExpression left = OExpression.buildExpression(tree.getChild(0));
		OExpression right = OExpression.buildExpression(tree.getChild(1));
		Operator operator = Operator.get(tree.getText());
		if (operator == null)
			throw new Oberon0UnknownOperatorException(tree.getText());
		return new OInfixExpression(left, operator, right);
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
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhsVal.getType(), rhsVal.getType());
	}
	private OValue processIntegerExpression(OInteger lhs, OInteger rhs) throws Oberon0OperatorTypeUndefinedException
	{
		if (operator == Operator.PLUS)
			return new OInteger(lhs.getIntValue() + rhs.getIntValue());
		else if (operator == Operator.MINUS)
			return new OInteger(lhs.getIntValue() - rhs.getIntValue());
		else if (operator == Operator.DIV)
			return new OInteger(lhs.getIntValue() / rhs.getIntValue()); // TODO: handle divide by zero exceptions
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
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), lhs.getType(), rhs.getType());
	}
	private OValue processBooleanExpression(OBoolean lhs, OBoolean rhs) throws Oberon0OperatorTypeUndefinedException
	{
		if (operator == Operator.AND)
			return new OBoolean(lhs.getBoolValue() && rhs.getBoolValue());
		else if (operator == Operator.OR)
			return new OBoolean(lhs.getBoolValue() || rhs.getBoolValue());
		else if (operator == Operator.EQUALS)
			return new OBoolean(lhs.getBoolValue() == rhs.getBoolValue());
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
