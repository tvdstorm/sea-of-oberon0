package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public abstract class BodyDeclaration extends ASTNode
{
	public abstract void register(RuntimeEnvironment newEnvironment) throws RuntimeException;
	public abstract void typeCheckRegister(RuntimeEnvironment newEnvironment) throws RuntimeException;
}
