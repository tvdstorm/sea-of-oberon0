package randy.oberon0.ast.selector;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public abstract class Selector extends ASTNode
{
	public abstract Reference evaluate(RuntimeEnvironment environment) throws RuntimeException;
}
