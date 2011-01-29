package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class ConstDeclaration extends BodyDeclaration
{
	private String name;
	private Expression value;
	
	public ConstDeclaration(String _name, Expression _value)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		assert(_value != null);
		name = _name;
		value = _value;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Add the constant to the variable scope
		environment.addConstant(name, value.run(environment));
		return null;
	}
}
