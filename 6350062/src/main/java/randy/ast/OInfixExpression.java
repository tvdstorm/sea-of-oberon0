package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OInfixExpression extends OExpression
{
	private OExpression lhs;
	private OExpression rhs;
	private String operand; // TODO: ander type van maken
	
	public OInfixExpression(OExpression _lhs, String _operand, OExpression _rhs)
	{
		lhs = _lhs;
		operand = _operand;
		rhs = _rhs;
	}
	public static OInfixExpression buildInfixExpression(Tree tree) throws Oberon0Exception
	{
		String operand = tree.getText();
		OExpression left = OExpression.buildExpression(tree.getChild(0));
		OExpression right = OExpression.buildExpression(tree.getChild(1));
		return new OInfixExpression(left, operand, right);
	}
	@Override // TODO: nodig?
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue lhsVal = lhs.run(vars).dereference();
		OValue rhsVal = rhs.run(vars).dereference();
		OValue result;
		if (lhsVal instanceof OInteger && rhsVal instanceof OInteger)
		{
			OInteger l = new OInteger((OInteger)lhsVal);
			OInteger r = ((OInteger)rhsVal);
			if (operand.equals("+"))
				result = new OInteger(l.getIntValue() + r.getIntValue());
			else if (operand.equals("-"))
				result = new OInteger(l.getIntValue() - r.getIntValue());
			else if (operand.equals("DIV"))
				result = new OInteger(l.getIntValue() / r.getIntValue());
			else if (operand.equals("*"))
				result = new OInteger(l.getIntValue() * r.getIntValue());
			else if (operand.equals("<"))
				result = new OBoolean(l.getIntValue() < r.getIntValue());
			else if (operand.equals(">"))
				result = new OBoolean(l.getIntValue() > r.getIntValue());
			else if (operand.equals("<="))
				result = new OBoolean(l.getIntValue() <= r.getIntValue());
			else if (operand.equals(">="))
				result = new OBoolean(l.getIntValue() >= r.getIntValue());
			else if (operand.equals("="))
				result = new OBoolean(l.getIntValue() == r.getIntValue());
			else
				throw new Oberon0Exception("Unknown integer operand: " + operand);
		}
		else if (lhsVal instanceof OBoolean && rhsVal instanceof OBoolean)
		{
			OBoolean l = new OBoolean((OBoolean)lhsVal);
			OBoolean r = new OBoolean((OBoolean)rhsVal);
			if (operand.equals("&"))
				result = new OBoolean(l.getBoolValue() && r.getBoolValue());
			else if (operand.equals("OR"))
				result = new OBoolean(l.getBoolValue() || r.getBoolValue());
			else
				throw new Oberon0Exception("Unknown boolean operand: " + operand);
		}
		else
			throw new Oberon0Exception("InfixExpression not defined for " + lhsVal.getClass().toString() + " and " + rhsVal.getClass().toString());
		return result;
	}
	public void print(String indent)
	{
		System.out.println(indent + operand);
		lhs.print(indent + "\t");
		rhs.print(indent + "\t");
	}
}
