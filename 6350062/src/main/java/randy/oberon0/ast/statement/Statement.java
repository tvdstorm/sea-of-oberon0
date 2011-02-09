package randy.oberon0.ast.statement;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.typecheck.TypeCheckEnvironment;

public abstract class Statement extends ASTNode
{
	public abstract void run(RuntimeEnvironment environment) throws RuntimeException;
	public abstract void typeCheck(TypeCheckEnvironment environment) throws RuntimeException;
}