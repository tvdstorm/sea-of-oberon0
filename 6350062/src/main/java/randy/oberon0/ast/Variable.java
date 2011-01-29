package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class Variable extends Expression
{
	private String name;
	
	public Variable(String _name)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		name = _name;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Resolve the variable with the variable stack
		return environment.getVariable(name);
	}
}
