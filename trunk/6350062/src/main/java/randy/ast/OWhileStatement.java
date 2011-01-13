package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
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
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		while (true)
		{
			OValue expr = expression.run(vars);
			if (!expr.getType().isBool())
				throw new Oberon0TypeMismatchException(expr.getType(), Type.BOOL);
			OBoolean b = (OBoolean)expr;
			if (!b.getBoolValue())
				break;
			body.run(vars);
		}
		return null;
	}
	public static OWhileStatement buildWhileStatement(Tree tree) throws Oberon0Exception
	{
		OExpression expression = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OBlock statement = OBlock.buildBlock(tree.getChild(1));
		return new OWhileStatement(expression, statement);
	}
}
