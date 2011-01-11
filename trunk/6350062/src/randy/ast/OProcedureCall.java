package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OProcedureCall extends OExpression
{
	private String name;
	private List<OExpression> parameters;
	static private int cur = 10; // TODO: tijdelijk, Read functie moet worden geimplementeerd onder run()
	
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
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		if (name.equals("Write") && parameters.size() == 1)
		{
			OValue param = parameters.get(0).run(vars);
			System.out.println(param.toString());
		}
		else if (name.equals("Read") && parameters.size() == 1)
		{
			OValue param = parameters.get(0).run(vars);
			System.out.println("--> Reading " + cur + "...");
			param.setValue(new OInteger(cur));
			cur++;
		}
		else if (name.equals("WriteLn"))
		{
			System.out.println("");
		}
		else if (name.equals("pv")) // TODO: verwijderen uit real versie, debug functie
		{
			System.out.println("++++");
			System.out.println(vars.toString());
			System.out.println("++++");
		}
		else
			throw new Oberon0Exception("Unknown function '" + name + "'");
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
