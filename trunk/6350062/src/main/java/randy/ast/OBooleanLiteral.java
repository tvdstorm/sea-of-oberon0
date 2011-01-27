package randy.ast;

import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OBooleanLiteral extends OExpression
{
	private OBoolean value;
	
	public OBooleanLiteral(OBoolean _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Return the boolean value
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
