package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public abstract class ASTNode
{
	public abstract Value run(RuntimeEnvironment environment) throws RuntimeException;
}
