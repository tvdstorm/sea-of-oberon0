package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
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
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Run the expression and return null since statements don't return values (expressions do)
		expression.run(environment);
		return null;
	}
}
