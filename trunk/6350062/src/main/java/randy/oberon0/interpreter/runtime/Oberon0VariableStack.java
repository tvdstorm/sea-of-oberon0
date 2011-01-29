package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.value.*;

public class Oberon0VariableStack
{
	private Oberon0VariableStack parentScope;
	private Map<String, OValue> variables;
	
	public Oberon0VariableStack(Oberon0VariableStack _parentScope)
	{
		parentScope = _parentScope;
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
		else if (parentScope != null)
			return parentScope.getVariable(name);
		else
			throw new Oberon0UndefinedVariableException(name);
	}
	public Oberon0VariableStack getParentScope()
	{
		if (parentScope != null)
			return parentScope;
		else
			return this;
	}
}
