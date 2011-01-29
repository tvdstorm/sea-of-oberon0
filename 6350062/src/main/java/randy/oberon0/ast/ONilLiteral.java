package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class ONilLiteral extends OExpression
{
	public ONilLiteral()
	{
		
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		return new ONilValue();
	}
}
