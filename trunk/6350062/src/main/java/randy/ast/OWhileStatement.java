package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OWhileStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	
	public OWhileStatement(OExpression _expression, OBlock _body)
	{
		assert(_expression != null);
		assert(_body != null);
		expression = _expression;
		body = _body;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		while (true)
		{
			// Evaluate the expression and convert it to a boolean
			OValue expr = expression.run(vars);
			if (expr.getType() != Type.BOOL)
				throw new Oberon0TypeMismatchException(expr.getType(), Type.BOOL);
			OBoolean b = (OBoolean)expr;
			// If the expression is false, skip the body
			if (!b.getBoolValue())
				return null;
			// Evaluate the body
			body.run(vars);
		}
	}
	public static OWhileStatement buildWhileStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.WHILE);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.EXPRESSION);
		OExpression expression = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OBlock statement = OBlock.buildBlock(tree.getChild(1));
		return new OWhileStatement(expression, statement);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		expression.accept(visitor);
		body.accept(visitor);
		visitor.visitAfter(this);
	}
}
