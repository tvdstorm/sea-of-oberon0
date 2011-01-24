package randy.ast;

import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public abstract class OASTNode
{
	public abstract OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException;
	public abstract void accept(OASTNodeVisitor visitor) throws Oberon0Exception;
}
