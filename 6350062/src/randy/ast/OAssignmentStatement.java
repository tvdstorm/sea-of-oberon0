package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OAssignmentStatement extends OStatement
{
	private String name; // TODO: selector van maken
	private OExpression rhs;
	
	public OAssignmentStatement(String _name, OExpression _rhs)
	{
		name = _name;
		rhs = _rhs;
	}
	
	@Override
	public void print(String indent)
	{
		System.out.println(indent + ":=");
		System.out.println(indent + "\t" + name);
		rhs.print(indent + "\t");
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue var = vars.getVariable(name);
		var.setValue(rhs.run(vars));
		return null;
	}
	public static OAssignmentStatement buildAssignmentStatement(Tree tree) throws Oberon0Exception
	{
		if (tree.getChild(0).getType() != Oberon0Parser.LH || tree.getChild(1).getType() != Oberon0Parser.RH)
			throw new Oberon0Exception("Misformed assignment...");
		String name = tree.getChild(0).getChild(0).getText();
		OExpression rhs = OExpression.buildExpression(tree.getChild(1).getChild(0));
		return new OAssignmentStatement(name, rhs);
	}
}
