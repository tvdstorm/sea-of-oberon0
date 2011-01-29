package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

public class ODotSelector extends OSelector
{
	private OSelector lhs;
	private String member;
	
	public ODotSelector(OSelector _lhs, String _member)
	{
		assert(_lhs != null);
		assert(_member != null);
		lhs = _lhs;
		member = _member;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the left hand side and convert it to a record
		OValue valLhs = lhs.run(vars, typeRegistry).dereference();
		if (valLhs.getType() != Type.RECORD)
			throw new Oberon0SelectorException("Trying to access a member of a '" + valLhs.getType() + "' variable, which is not a record.");
		ORecord record = (ORecord)valLhs.dereference();
		
		// Evaluate the member and return it
		return record.getMemberValue(member);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		visitor.visitAfter(this);
	}
}
