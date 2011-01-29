package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class VariableSelector extends Selector
{
	private String name;
	
	public VariableSelector(String _name)
	{
		assert(_name != null);
		name = _name;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Retrieve the value of the variable and return it
		return environment.getVariable(name);
	}
}
