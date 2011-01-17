package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OArraySelector extends OSelector
{
	private OSelector lhs;
	private OExpression arrayIndex;
	
	public OArraySelector(OSelector _lhs, OExpression _arrayIndex)
	{
		lhs = _lhs;
		arrayIndex = _arrayIndex;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		OValue valArray = lhs.run(vars);
		if (!valArray.getType().isArray())
			throw new Oberon0SelectorException("Trying to access the index of a '" + valArray.getType() + "' variable, which is not an array.");
		OArray array = (OArray)valArray.dereference();
		OValue valIndex = arrayIndex.run(vars);
		if (!valIndex.getType().isInteger())
			throw new Oberon0SelectorException("Cannot cast the index of an array access from " + valIndex.getType() + " to " + Type.INTEGER + ".");
		OInteger index = (OInteger)valIndex;
		return array.getIndexValue(index.getIntValue());
	}
	public static OArraySelector buildArraySelector(Tree tree) throws Oberon0Exception
	{
		OSelector lhs = OSelector.buildSelector(tree.getChild(0));
		OExpression arrayIndex = OExpression.buildExpression(tree.getChild(1));
		return new OArraySelector(lhs, arrayIndex);
	}
	@Override
	public void accept(OASTNodeVisitor visitor)
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		arrayIndex.accept(visitor);
		visitor.visitAfter(this);
	}
}
