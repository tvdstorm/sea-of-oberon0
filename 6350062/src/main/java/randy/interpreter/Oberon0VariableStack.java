package randy.interpreter;

import java.util.*;
import randy.exception.*;
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
	public void addVariable(String name, OValue var) throws Oberon0RuntimeException
	{
		if (variables.containsKey(name))
			throw new Oberon0DuplicateVariableException(name);
		variables.put(name, var);
	}
	public void addConstant(String name, OValue value) throws Oberon0RuntimeException
	{
		addVariable(name, new OConst(value));
	}
	public OValue getVariable(String name) throws Oberon0RuntimeException
	{
		if (variables.containsKey(name))
			return variables.get(name);
		else if (globalStack != null)
			return globalStack.getVariable(name);
		else
			throw new Oberon0UndefinedVariableException(name);
	}
	public Oberon0VariableStack getGlobalStack()
	{
		if (globalStack != null)
			return globalStack;
		else
			return this;
	}
}
