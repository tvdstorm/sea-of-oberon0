package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OModule extends OASTNode
{
	private String name;
	private OASTNode body;
	private List<OBodyDeclaration> bodyDeclarations;
	
	public OModule(String _name, List<OBodyDeclaration> _bodyDeclarations, OASTNode _body)
	{
		name = _name;
		body = _body;
		bodyDeclarations = _bodyDeclarations;
	}
	public static OModule buildModule(Tree tree) throws Oberon0Exception
	{
		String name = tree.getChild(0).getText();
		OASTNode body = null;
		List<OBodyDeclaration> bodyDeclarations = new Vector<OBodyDeclaration>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.BODY:
					// TODO: body moet null zijn
					body = OBlock.buildBlock(child);
					break;
				case Oberon0Parser.VAR:
				case Oberon0Parser.CONST:
					bodyDeclarations.add(OBodyDeclaration.buildBodyDeclaration(child));
					break;
				case Oberon0Parser.PROCEDURE:
					// TODO: procedure afwerken
					break;
				default:
					throw new Oberon0Exception("Unknown child type '" + child.getType() + "' in module.");
			}
		}
		return new OModule(name, bodyDeclarations, body);
	}
	public void print(String indent)
	{
		System.out.println(indent + "MODULE " + name);
		// TODO: bodyDeclarations
		if (body != null)
		{
			System.out.println(indent + "\tBODY");
			body.print(indent + "\t\t");
		}
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.run(vars);
		}
		return body.run(vars);
	}
}
