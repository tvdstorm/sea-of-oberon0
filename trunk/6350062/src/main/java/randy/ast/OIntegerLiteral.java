package randy.ast;

import randy.value.*;
import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;

public class OIntegerLiteral extends OExpression
{
	private OInteger value;
	
	public OIntegerLiteral(OInteger _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
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
