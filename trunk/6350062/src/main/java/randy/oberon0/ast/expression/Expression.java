package randy.oberon0.ast.expression;

import randy.oberon0.ast.ASTNode;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

public abstract class Expression extends ASTNode
{
	public abstract IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException;
	public abstract ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws TypeCheckException;
}
