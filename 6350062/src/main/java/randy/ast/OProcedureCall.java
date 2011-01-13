package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.*;
import randy.value.*;

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
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		if (name.equals("Write") && parameters.size() == 1)
		{
			OValue param = parameters.get(0).run(vars);
			Oberon0Program.getProgram().getBuildinFunctions().write(param.toString());
		}
		else if (name.equals("Read") && parameters.size() == 1)
		{
			OValue param = parameters.get(0).run(vars);
			String input = Oberon0Program.getProgram().getBuildinFunctions().read();
			if (param.getType().isInteger())
				param.setValue(new OInteger(Integer.parseInt(input)));
			// TODO: andere formaten implementeren
		}
		else if (name.equals("WriteLn"))
		{
			Oberon0Program.getProgram().getBuildinFunctions().writeLn();
		}
		else if (name.equals("pv")) // TODO: verwijderen uit real versie, debug functie
		{
			System.out.println("++++");
			System.out.println(vars.toString());
			System.out.println("++++");
		}
		else if (Oberon0Program.getProgram().procedures.containsKey(name))
		{
			Queue<OValue> params = new LinkedList<OValue>();
			for (OExpression p : parameters)
			{
				OValue v = p.run(vars);
				params.add(v);
			}
			return Oberon0Program.getProgram().procedures.get(name).invoke(vars, params);
		}
		else
			throw new Oberon0UndefinedMethodException("Unknown function '" + name + "'");
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
