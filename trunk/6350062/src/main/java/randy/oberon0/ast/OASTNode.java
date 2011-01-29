package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public abstract class OASTNode
{
	public abstract OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
	public abstract void accept(OASTNodeVisitor visitor) throws Oberon0Exception;
}
