package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public class OConstDeclaration extends OBodyDeclaration
{
	private String name;
	private OExpression value;
	
	public OConstDeclaration(String _name, OExpression _value)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		assert(_value != null);
		name = _name;
		value = _value;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Add the constant to the variable scope
		environment.addConstant(name, value.run(environment));
		return null;
	}
}
