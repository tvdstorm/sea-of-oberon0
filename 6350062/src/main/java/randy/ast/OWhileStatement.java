package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OWhileStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	
	public OWhileStatement(OExpression _expression, OBlock _body)
	{
		expression = _expression;
		body = _body;
	}
	@Override
	public void print(String indent)
	{
		System.out.println("WHILE");
		expression.print(indent + "\t");
		body.print(indent + "\t");
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		while (true)
		{
			OValue expr = expression.run(vars);
			if (!expr.getType().isBool())
				throw new Oberon0Exception("Expression in while must be boolean...");
			OBoolean b = (OBoolean)expr;
			if (!b.getBoolValue())
				break;
			body.run(vars);
		}
		return null;
	}
	public static OWhileStatement buildWhileStatement(Tree tree) throws Oberon0Exception
	{
		randy.main.Main.printTree(tree, "");
		OExpression expression = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OBlock statement = OBlock.buildBlock(tree.getChild(1));
		return new OWhileStatement(expression, statement);
	}
}
