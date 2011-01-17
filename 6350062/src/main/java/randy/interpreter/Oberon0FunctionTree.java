package randy.interpreter;

import java.util.*;
import randy.ast.OProcedureDeclaration;

public class Oberon0FunctionTree
{
	private Map<String, Oberon0FunctionTree> functions;
	private OProcedureDeclaration declaration;
	
	public Oberon0FunctionTree(OProcedureDeclaration _declaration)
	{
		functions = new HashMap<String, Oberon0FunctionTree>();
		declaration = _declaration;
	}
	public void addBranch(String _name, Oberon0FunctionTree _function)
	{
		assert functions.containsKey(_name) == false;	// TODO: exception van maken
		functions.put(_name, _function);
	}
	public Oberon0FunctionTree getFunction(String _name)
	{
		return functions.get(_name);
	}
	public OProcedureDeclaration getDeclaration()
	{
		return declaration;
	}
	public void print(String indent)
	{
		for (String name : functions.keySet())
		{
			System.out.println(indent + name);
			functions.get(name).print(indent + "\t");
		}
	}
}
