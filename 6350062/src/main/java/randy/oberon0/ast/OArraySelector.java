package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

public class OArraySelector extends OSelector
{
	private OSelector lhs;
	private OExpression arrayIndex;
	
	public OArraySelector(OSelector _lhs, OExpression _arrayIndex)
	{
		assert(_lhs != null);
		assert(_arrayIndex != null);
		lhs = _lhs;
		arrayIndex = _arrayIndex;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the left hand side and convert it to an array
		OValue valLhs = lhs.run(vars, typeRegistry);
		if (valLhs.getType() != Type.ARRAY)
			throw new Oberon0SelectorException("Trying to access the index of a '" + valLhs.getType() + "' variable, which is not an array.");
		OArray array = (OArray)valLhs.dereference();
		
		// Evaluate the array index and convert it to an integer
		OValue valIndex = arrayIndex.run(vars, typeRegistry);
		if (valIndex.getType() != Type.INTEGER)
			throw new Oberon0SelectorException("Cannot cast the index of an array access from " + valIndex.getType() + " to " + Type.INTEGER + ".");
		OInteger index = (OInteger)valIndex;
		
		// Return the requested index of the array
		return array.getIndexValue(index.getIntValue());
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		arrayIndex.accept(visitor);
		visitor.visitAfter(this);
	}
}
