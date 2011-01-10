package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.main.Main;
import randy.value.OValue;

public class OVarDeclaration extends OBodyDeclaration
{
	protected Type type;
	protected List<String> names;
	
	public OVarDeclaration(Type _type, List<String> _names)
	{
		type = _type;
		names = _names;
	}
	@Override
	public void print(String indent)
	{
		for (String name : names)
		{
			System.out.println(indent + type + " " + name);
		}
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		for (String name : names)
		{
			vars.addVariable(name, OValue.makeNew(type));
		}
		return null;
	}
	public static OVarDeclaration buildVarDeclaration(Tree tree) throws Oberon0Exception
	{
		Type type = new Type(tree.getChild(0).getText());
		List<String> names = new Vector<String>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			names.add(tree.getChild(i).getText());
		}
		if (type.isArray())
		{
			type = new Type(tree.getChild(0).getChild(0).getChild(0).getText());
			OExpression arrayLength = OExpression.buildExpression(tree.getChild(0).getChild(1).getChild(0));
			return new OArrayVarDeclaration(type, names, arrayLength);
		}
		else
			return new OVarDeclaration(type, names);
	}
}
