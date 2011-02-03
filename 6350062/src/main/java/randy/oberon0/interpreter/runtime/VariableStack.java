package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.value.*;

public class VariableStack
{
	private VariableStack parentScope;
	private Map<String, Value> variables; // <variableName, currentValue>
	
	public VariableStack(VariableStack _parentScope)
	{
		parentScope = _parentScope;
		variables = new HashMap<String, Value>();
	}
	public void registerVariable(String variableName, Value value) throws DuplicateVariableException
	{
		assert(variableName != null);
		assert(variableName.length() > 0);
		assert(value != null);
		// Check if the variable has already been declared in the current scope
		if (variables.containsKey(variableName))
			throw new DuplicateVariableException(variableName);
		// Add the variable to the current scope
		variables.put(variableName, value);
	}
	public void registerConstant(String constantName, Value value) throws DuplicateVariableException
	{
		// Package the value as a constant and add it as a variable
		registerVariable(constantName, new Const(value));
	}
	public Value getVariableValue(String variableName) throws UndefinedVariableException
	{
		assert(variableName != null);
		assert(variableName.length() > 0);
		// Check if the variable is in the current scope
		if (variables.containsKey(variableName))
			return variables.get(variableName);
		// Check if we have a parent scope and check it for the variable
		else if (parentScope != null)
			return parentScope.getVariableValue(variableName);
		// The variable isn't defined in this scope and we don't have a parent scope, return an exception
		else
			throw new UndefinedVariableException(variableName);
	}
}
