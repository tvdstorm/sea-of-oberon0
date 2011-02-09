package randy.oberon0.ast.declaration;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public abstract class BodyDeclaration extends ASTNode
{
	public abstract void register(RuntimeEnvironment newEnvironment) throws RuntimeException;
	public abstract void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws RuntimeException;
}
