package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OConstDeclaration extends OBodyDeclaration
{
	private String name;
	private OExpression value;
	
	public OConstDeclaration(String _name, OExpression _value)
	{
		name = _name;
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		vars.addConstant(name, value.run(vars));
		return null;
	}
	public static OConstDeclaration buildConstDeclaration(Tree tree) throws Oberon0Exception
	{
		String name = tree.getChild(0).getText();
		OExpression value = OExpression.buildExpression(tree.getChild(1));
		return new OConstDeclaration(name, value);
	}
}
