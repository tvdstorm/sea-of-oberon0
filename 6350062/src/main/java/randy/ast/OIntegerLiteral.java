package randy.ast;

import randy.value.*;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;

public class OIntegerLiteral extends OExpression
{
	private OInteger value;
	
	public OIntegerLiteral(OInteger _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Return the integer value
		return value;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
