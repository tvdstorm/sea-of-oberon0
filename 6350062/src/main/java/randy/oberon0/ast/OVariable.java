package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public class OVariable extends OExpression
{
	private String name;
	
	public OVariable(String _name)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		name = _name;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Resolve the variable with the variable stack
		return environment.getVariable(name);
	}
}
