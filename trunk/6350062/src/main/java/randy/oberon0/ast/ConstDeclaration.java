package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class ConstDeclaration extends BodyDeclaration
{
	private final String constantName;
	private final Expression value;
	
	public ConstDeclaration(String _constantName, Expression _value)
	{
		assert(_constantName != null);
		assert(_constantName.length() >= 1);
		assert(_value != null);
		constantName = _constantName;
		value = _value;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Add the constant to the variable scope
		environment.addConstant(constantName, value.run(environment));
		return null;
	}
}
