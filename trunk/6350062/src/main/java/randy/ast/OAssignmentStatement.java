package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OAssignmentStatement extends OStatement
{
	private OExpression lhs; // TODO: Selector van maken...
	private OExpression rhs;
	
	public OAssignmentStatement(OExpression _lhs, OExpression _rhs)
	{
		lhs = _lhs;
		rhs = _rhs;
	}
	
	@Override
	public void print(String indent)
	{
		System.out.println(indent + ":=");
		lhs.print(indent + "\t");
		rhs.print(indent + "\t");
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue var = lhs.run(vars);
		var.setValue(rhs.run(vars));
		return null;
	}
	public static OAssignmentStatement buildAssignmentStatement(Tree tree) throws Oberon0Exception
	{
		if (tree.getChild(0).getType() != Oberon0Parser.LH || tree.getChild(1).getType() != Oberon0Parser.RH)
			throw new Oberon0Exception("Misformed assignment...");
		OExpression lhs = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OExpression rhs = OExpression.buildExpression(tree.getChild(1).getChild(0));
		return new OAssignmentStatement(lhs, rhs);
	}
}
