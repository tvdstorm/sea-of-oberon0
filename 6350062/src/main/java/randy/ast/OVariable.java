package randy.ast;

import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

public class OVariable extends OExpression
{
	private String name;
	
	public OVariable(String _name)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		name = _name;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Resolve the variable with the variable stack
		return vars.getVariable(name);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
