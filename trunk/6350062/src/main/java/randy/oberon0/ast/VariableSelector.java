package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class VariableSelector extends Selector
{
	private final String variableName;
	
	public VariableSelector(String _variableName)
	{
		assert(_variableName != null);
		variableName = _variableName;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Retrieve the value of the variable and return it
		return environment.getVariable(variableName);
	}
}
