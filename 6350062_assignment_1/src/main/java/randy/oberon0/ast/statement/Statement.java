package randy.oberon0.ast.statement;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public abstract class Statement extends ASTNode
{
	public abstract void run(RuntimeEnvironment environment) throws RuntimeException;
}
