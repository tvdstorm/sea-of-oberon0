package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Value;

public class BooleanLiteral extends Expression
{
	private final Boolean value;
	
	public BooleanLiteral(Boolean _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the boolean value
		return value;
	}
}
