package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public abstract class OASTNode
{
	public abstract OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException;
}
