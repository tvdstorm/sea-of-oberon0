package randy.oberon0.ast;

import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class IntegerLiteral extends Expression
{
	private Integer value;
	
	public IntegerLiteral(Integer _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return value;
	}
}
