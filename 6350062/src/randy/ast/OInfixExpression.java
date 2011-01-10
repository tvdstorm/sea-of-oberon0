package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.value.*;

public class OInfixExpression extends OExpression
{
	private OExpression left;
	private List<OExpression> right;
	private String operand; // TODO: ander type van maken
	
	public OInfixExpression(OExpression _left, String _operand, List<OExpression> _right)
	{
		left = _left;
		operand = _operand;
		right = _right;
	}
	public static OInfixExpression buildInfixExpression(Tree tree) throws Oberon0Exception
	{
		String operand = tree.getText();
		OExpression left = (OExpression)OExpression.buildExpression(tree.getChild(0));
		List<OExpression> right = new Vector<OExpression>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			right.add(OExpression.buildExpression(tree.getChild(i)));
		}
		return new OInfixExpression(left, operand, right);
	}
	@Override // TODO: nodig?
	public OValue run() throws Oberon0Exception
	{
		OValue result = left.run();
		for (OExpression expr : right)
		{
			OValue val = expr.run();
			if (result instanceof OInteger && val instanceof OInteger)
			{
				OInteger l = (OInteger)result;
				OInteger r = (OInteger)val;
				if (operand.equals("+"))
					l.setValue(l.getValue() + r.getValue());
				else if (operand.equals("-"))
					l.setValue(l.getValue() - r.getValue());
				else if (operand.equals("DIV"))
					l.setValue(l.getValue() / r.getValue());
				else if (operand.equals("*"))
					l.setValue(l.getValue() * r.getValue());
				else
					throw new Oberon0Exception("Unknown operand: " + operand);
			}
		}
		return result;
	}
	public void print(String indent)
	{
		System.out.println(indent + operand);
		left.print(indent + "\t");
		for (OExpression r : right)
		{
			r.print(indent + "\t");
		}
	}
}
