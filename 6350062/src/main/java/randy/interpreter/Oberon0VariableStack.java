package randy.interpreter;

import java.util.*;
import randy.exception.Oberon0Exception;
import randy.value.*;

public class Oberon0VariableStack
{
	private Oberon0VariableStack globalStack;
	private Map<String, OValue> variables;
	
	public Oberon0VariableStack(Oberon0VariableStack _globalStack)
	{
		globalStack = _globalStack;
		variables = new HashMap<String, OValue>();
	}
	public void addVariable(String name, OValue var) throws Oberon0Exception
	{
		if (variables.containsKey(name))
			throw new Oberon0Exception("Variable '" + name + "' already exists...");
		variables.put(name, var);
	}
	public void addConstant(String name, OValue value) throws Oberon0Exception
	{
		addVariable(name, new OConst(value));
	}
	public OValue getVariable(String name) throws Oberon0Exception
	{
		if (variables.containsKey(name))
			return variables.get(name);
		else if (globalStack != null)
			return globalStack.getVariable(name);
		else
			throw new Oberon0Exception("Unknown variable '" + name + "'...");
	}
	public Oberon0VariableStack getGlobalStack()
	{
		return globalStack;
	}
	@Override
	public String toString()
	{
		String ret = new String();
		for (String var : variables.keySet())
		{
			ret += var + " = " + variables.get(var) + "\r\n";
		}
		return ret;
	}
}
