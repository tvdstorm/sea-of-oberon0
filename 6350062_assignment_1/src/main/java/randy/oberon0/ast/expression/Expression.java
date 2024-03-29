package randy.oberon0.ast.expression;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public abstract class Expression extends ASTNode
{
	public abstract IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException;
}
