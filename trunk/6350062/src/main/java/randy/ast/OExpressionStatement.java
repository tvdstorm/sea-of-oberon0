package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OExpressionStatement extends OStatement
{
	private OExpression expression;
	
	public OExpressionStatement(OExpression _expression)
	{
		assert(_expression != null);
		expression = _expression;
	}
	public static OExpressionStatement buildExpressionStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.EXPRESSION);
		assert(tree.getChildCount() == 1);
		return new OExpressionStatement(OExpression.buildExpression(tree.getChild(0)));
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		// Run the expression and return null since statements don't return values (expressions do)
		expression.run(vars);
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		expression.accept(visitor);
		visitor.visitAfter(this);
	}
}
