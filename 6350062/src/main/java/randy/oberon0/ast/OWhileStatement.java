package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

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
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		while (true)
		{
			// Evaluate the expression and convert it to a boolean
			OBoolean bExpression = expression.run(vars, typeRegistry).castToBoolean();
			// If the expression is false, skip the body
			if (!bExpression.getBoolValue())
				return null;
			// Evaluate the body
			body.run(vars, typeRegistry);
		}
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