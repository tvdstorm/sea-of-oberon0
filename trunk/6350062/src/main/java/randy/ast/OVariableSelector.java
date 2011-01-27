package randy.ast;

import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

public class OVariableSelector extends OSelector
{
	private String name;
	
	public OVariableSelector(String _name)
	{
		assert(_name != null);
		name = _name;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Retrieve the value of the variable and return it
		return vars.getVariable(name);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
