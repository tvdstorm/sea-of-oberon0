package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OVariable extends OExpression
{
	private String name;
	
	public OVariable(String _name)
	{
		name = _name;
	}
	@Override
	public void print(String indent)
	{
		System.out.println(indent + name);
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		return vars.getVariable(name);
	}
	public static OVariable buildVariable(Tree tree) throws Oberon0Exception
	{
		String name = tree.getText();
		return new OVariable(name);
	}
}
