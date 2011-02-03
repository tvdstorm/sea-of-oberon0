package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

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
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Add the constant to the variable scope
		newEnvironment.addConstant(constantName, value.evaluate(newEnvironment));
	}
}
