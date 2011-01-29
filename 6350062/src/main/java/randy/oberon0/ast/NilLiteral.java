package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class NilLiteral extends Expression
{
	public NilLiteral()
	{
		
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		return new NilValue();
	}
}
