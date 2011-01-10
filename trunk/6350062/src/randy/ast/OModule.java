package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;

public class OModule extends OASTNode
{
	private String name;
	private OASTNode body;
	public OModule(String _name, OASTNode _body)
	{
		name = _name;
		body = _body;
	}
	public static OModule buildModule(Tree tree) throws Oberon0Exception
	{
		String name = tree.getChild(0).getText();
		OASTNode body = null;
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.BODY:
					// TODO: body moet null zijn
					body = OBlock.buildBlock(child);
					break;
				default:
					throw new Oberon0Exception("Unknown child type '" + child.getType() + "' in module.");
			}
		}
		return new OModule(name, body);
	}
	public void print(String indent)
	{
		System.out.println(indent + "MODULE " + name);
		if (body != null)
		{
			System.out.println(indent + "\tBODY");
			body.print(indent + "\t\t");
		}
	}
}
