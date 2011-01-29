package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public class OAssignmentStatement extends OStatement
{
	private OSelector lhs;
	private OExpression rhs;
	
	public OAssignmentStatement(OSelector _lhs, OExpression _rhs)
	{
		assert(_lhs != null);
		assert(_rhs != null);
		lhs = _lhs;
		rhs = _rhs;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the left hand side and right hand side and assign the value of the right hand side to the left hand side
		OValue var = lhs.run(vars, typeRegistry);
		assert(var != null);
		var.setValue(rhs.run(vars, typeRegistry));
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		rhs.accept(visitor);
		visitor.visitAfter(this);
	}
}