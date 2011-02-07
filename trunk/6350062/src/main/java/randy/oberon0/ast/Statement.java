package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public abstract class Statement extends ASTNode
{
	public abstract void run(RuntimeEnvironment environment) throws RuntimeException;
	public abstract void typeCheck(RuntimeEnvironment environment) throws RuntimeException;
}