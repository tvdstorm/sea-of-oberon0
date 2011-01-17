package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OAssignmentStatement extends OStatement
{
	private OSelector lhs;
	private OExpression rhs;
	
	public OAssignmentStatement(OSelector _lhs, OExpression _rhs)
	{
		lhs = _lhs;
		rhs = _rhs;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		OValue var = lhs.run(vars);
		var.setValue(rhs.run(vars));
		return null;
	}
	public static OAssignmentStatement buildAssignmentStatement(Tree tree) throws Oberon0Exception
	{
		if (tree.getChild(0).getType() != Oberon0Parser.LH || tree.getChild(1).getType() != Oberon0Parser.RH)
			throw new Oberon0ASTTreeBuildException("Missing LH or RH children on assignment.");
		OSelector lhs = OSelector.buildSelector(tree.getChild(0).getChild(0));
		OExpression rhs = OExpression.buildExpression(tree.getChild(1).getChild(0));
		return new OAssignmentStatement(lhs, rhs);
	}
	@Override
	public void accept(OASTNodeVisitor visitor)
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		lhs.accept(visitor);
		rhs.accept(visitor);
		visitor.visitAfter(this);
	}
}
