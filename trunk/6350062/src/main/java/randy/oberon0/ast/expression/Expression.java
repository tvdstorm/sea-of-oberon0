package randy.oberon0.ast.expression;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.value.Value;

public abstract class Expression extends ASTNode
{
	public abstract IValue evaluate(RuntimeEnvironment environment) throws RuntimeException;
	public abstract Value typeCheck(RuntimeEnvironment environment) throws RuntimeException;
}
