package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.value.OValue;

public class OProcedureCall extends OExpression
{
	private String name;
	private List<OExpression> parameters;
	
	public OProcedureCall(String _name, List<OExpression> _parameters)
	{
		name = _name;
		parameters = _parameters;
	}
	public static OProcedureCall buildProcedureCall(Tree tree) throws Oberon0Exception
	{
		String name = tree.getChild(0).getText();
		List<OExpression> parameters = new Vector<OExpression>();
		// TODO: PARAMETERS verwijderen of anders opbouwen
		if (tree.getChildCount() >= 2 && tree.getChild(1).getType() == Oberon0Parser.PARAMETERS)
		{
			for (int i=0;i<tree.getChild(1).getChildCount();i++)
			{
				parameters.add(OExpression.buildExpression(tree.getChild(1).getChild(i)));
			}
		}
		return new OProcedureCall(name, parameters);
	}
	@Override
	public OValue run() throws Oberon0Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	public void print(String indent)
	{
		System.out.println(indent + "PROCEDURECALL " + name);
		for (OExpression param : parameters)
		{
			param.print(indent + "\t");
		}
	}
}
