package randy.ast;

import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.OValue;

public abstract class OASTNode
{
	public abstract OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
	public abstract void accept(OASTNodeVisitor visitor) throws Oberon0Exception;
}
