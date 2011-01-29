package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public class OConstDeclaration extends OBodyDeclaration
{
	private String name;
	private OExpression value;
	
	public OConstDeclaration(String _name, OExpression _value)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		assert(_value != null);
		name = _name;
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Add the constant to the variable scope
		vars.addConstant(name, value.run(vars, typeRegistry));
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		value.accept(visitor);
		visitor.visitAfter(this);
	}
}