package randy.ast;

import randy.exception.*;
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
			OBoolean bExpression = expression.run(vars).castToBoolean();
			// If the expression is false, skip the body
			if (!bExpression.getBoolValue())
				return null;
			// Evaluate the body
			body.run(vars);
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
