package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.*;

public class VariableStack
{
	private VariableStack parentScope;
	private Map<String, IBindable> variables;
	
	public VariableStack(VariableStack _parentScope)
	{
		parentScope = _parentScope;
		variables = new HashMap<String, IBindable>();
	}
	public void registerVariableByValue(String variableName, Value value) throws DuplicateVariableException
	{
		registerVariableByReference(variableName, new Reference(value));
	}
	public void registerVariableByReference(String variableName, Reference reference) throws DuplicateVariableException
	{
		assert(variableName != null);
		assert(variableName.length() > 0);
		assert(reference != null);
		// Check if the variable has already been declared in the current scope
		if (variables.containsKey(variableName))
		{
			throw new DuplicateVariableException(variableName);
		}
		// Add the variable to the current scope
		variables.put(variableName, reference);
	}
	public void registerConstant(String constantName, Value value) throws DuplicateVariableException
	{
		// Package the value as a constant and add it as a variable
		registerVariableByReference(constantName, new Constant(value));
	}
	public IBindable lookup(String variableName) throws UndefinedVariableException
	{
		assert(variableName != null);
		assert(variableName.length() > 0);
		// Check if the variable is in the current scope
		if (variables.containsKey(variableName))
		{
			return variables.get(variableName);
		}
		// Check if we have a parent scope and check it for the variable
		else if (parentScope != null)
		{
			return parentScope.lookup(variableName);
		}
		// The variable isn't defined in this scope and we don't have a parent scope, return an exception
		else
		{
			throw new UndefinedVariableException(variableName);
		}
	}
}
