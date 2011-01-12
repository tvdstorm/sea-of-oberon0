package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OIfStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	private List<OExpression> elseifExpressions; // TODO: elseif expressions en bodys bundelen
	private List<OBlock> elseifBodys;
	private OBlock elseBody;
	
	public OIfStatement(OExpression _expression, OBlock _body, List<OExpression> _elseifExpressions, List<OBlock> _elseifBodys, OBlock _elseBody)
	{
		expression = _expression;
		body = _body;
		elseifExpressions = _elseifExpressions;
		elseifBodys = _elseifBodys;
		elseBody = _elseBody;
	}
	@Override
	public void print(String indent)
	{
		System.out.println(indent + "IF");
		expression.print(indent + "\t");
		body.print(indent + "\t");
		for (int i=0;i<elseifExpressions.size();i++)
		{
			System.out.println(indent + "\tELSEIF");
			elseifExpressions.get(i).print(indent + "\t\t");
			elseifBodys.get(i).print(indent + "\t\t");
		}
		if (elseBody != null)
		{
			System.out.println(indent + "\tELSE");
			elseBody.print(indent + "\t\t");
		}
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue expr = expression.run(vars);
		if (!expr.getType().isBool())
			throw new Oberon0Exception("Expression in if must be boolean...");
		OBoolean b = (OBoolean)expr;
		if (b.getBoolValue())
		{
			body.run(vars);
			return null;
		}
		for (int i=0;i<elseifExpressions.size();i++)
		{
			expr = elseifExpressions.get(i).run(vars);
			if (!expr.getType().isBool())
				throw new Oberon0Exception("Expression in if must be boolean...");
			b = (OBoolean)expr;
			if (b.getBoolValue())
			{
				elseifBodys.get(i).run(vars);
				return null;
			}
		}
		if (elseBody != null)
			elseBody.run(vars);
		return null;
	}
	public static OIfStatement buildIfStatement(Tree tree) throws Oberon0Exception
	{
		OExpression expression = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OBlock body = OBlock.buildBlock(tree.getChild(1));
		List<OExpression> elseifExpressions = new Vector<OExpression>();
		List<OBlock> elseifBodys = new Vector<OBlock>();
		OBlock elseBody = null;
		for (int i=2;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.ELSIF:
					elseifExpressions.add(OExpression.buildExpression(child.getChild(0).getChild(0)));
					elseifBodys.add(OBlock.buildBlock(child.getChild(1)));
					break;
				case Oberon0Parser.ELSE:
					elseBody = OBlock.buildBlock(child.getChild(0));
					break;
				default:
					throw new Oberon0Exception("Unknown child type in if statement...");
			}
		}
		return new OIfStatement(expression, body, elseifExpressions, elseifBodys, elseBody);
	}
}
