package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public class OVariableSelector extends OSelector
{
	private String name;
	
	public OVariableSelector(String _name)
	{
		assert(_name != null);
		name = _name;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Retrieve the value of the variable and return it
		return environment.getVariable(name);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
