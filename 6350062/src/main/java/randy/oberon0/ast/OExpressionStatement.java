package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public class OExpressionStatement extends OStatement
{
	private OExpression expression;
	
	public OExpressionStatement(OExpression _expression)
	{
		assert(_expression != null);
		expression = _expression;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Run the expression and return null since statements don't return values (expressions do)
		expression.run(vars, typeRegistry);
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
