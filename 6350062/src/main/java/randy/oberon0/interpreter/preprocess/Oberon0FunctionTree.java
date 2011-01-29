package randy.oberon0.interpreter.preprocess;

import java.util.*;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;

public class Oberon0FunctionTree
{
	private Map<String, Oberon0FunctionTree> functions;
	private OInvokableFunction declaration;
	
	public Oberon0FunctionTree(OInvokableFunction _declaration)
	{
		functions = new HashMap<String, Oberon0FunctionTree>();
		declaration = _declaration;
	}
	public void addBranch(String _name, Oberon0FunctionTree _function) throws Oberon0Exception
	{
		if (functions.containsKey(_name))
			throw new Oberon0DuplicateFunctionException(_name);
		functions.put(_name, _function);
	}
	public Oberon0FunctionTree getFunction(String _name)
	{
		return functions.get(_name);
	}
	public OInvokableFunction getDeclaration()
	{
		return declaration;
	}
}
