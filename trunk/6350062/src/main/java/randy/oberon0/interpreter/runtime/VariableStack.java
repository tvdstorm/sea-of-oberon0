package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

public class VariableStack
{
	private VariableStack parentScope;
	private Map<String, Value> variables;
	
	public VariableStack(VariableStack _parentScope)
	{
		parentScope = _parentScope;
		variables = new HashMap<String, Value>();
	}
	public void addVariable(String name, Value var) throws RuntimeException
	{
		if (variables.containsKey(name))
			throw new DuplicateVariableException(name);
		variables.put(name, var);
	}
	public void addConstant(String name, Value value) throws RuntimeException
	{
		addVariable(name, new Const(value));
	}
	public Value getVariable(String name) throws RuntimeException
	{
		if (variables.containsKey(name))
			return variables.get(name);
		else if (parentScope != null)
			return parentScope.getVariable(name);
		else
			throw new UndefinedVariableException(name);
	}
	public VariableStack getParentScope()
	{
		if (parentScope != null)
			return parentScope;
		else
			return this;
	}
}
