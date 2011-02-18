package randy.oberon0.interpreter.runtime.environment;

import java.util.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.value.Value;

public class RuntimeEnvironment
{
	private final Map<String, IBindable> bindings;
	private final TypeRegistry typeRegistry;
	private final RuntimeEnvironment parentScope;
	
	public RuntimeEnvironment()
	{
		bindings = new HashMap<String, IBindable>();
		typeRegistry = new TypeRegistry(null);
		parentScope = null;
	}
	public RuntimeEnvironment(RuntimeEnvironment baseEnvironment)
	{
		// Create a new environment on top of the base environment
		bindings = new HashMap<String, IBindable>();
		typeRegistry = new TypeRegistry(baseEnvironment.typeRegistry);
		parentScope = baseEnvironment;
	}
	public IBindable lookup(String name) throws RuntimeException
	{
		assert(name != null);
		assert(name.length() > 0);
		// Check if the bindable is in the current scope
		if (bindings.containsKey(name))
		{
			return bindings.get(name);
		}
		// Check if we have a parent scope and check it for the bindable
		else if (parentScope != null)
		{
			return parentScope.lookup(name);
		}
		// The bindable isn't defined in this scope and we don't have a parent scope, return an exception
		else
		{
			throw new UndefinedBindableException(name);
		}
	}
	/**************************************************************************
	 * Variable functions                                                     *
	 **************************************************************************/
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
		if (bindings.containsKey(variableName))
		{
			throw new DuplicateVariableException(variableName);
		}
		// Add the variable to the current scope
		bindings.put(variableName, reference);
	}
	public void registerConstant(String constantName, Value value) throws DuplicateVariableException
	{
		// Package the value as a constant and add it as a variable
		registerVariableByReference(constantName, new Constant(value));
	}
	/**************************************************************************
	 * Function functions                                                     *
	 **************************************************************************/
	public void registerFunction(String functionName, IInvokableFunction functionPointer) throws DuplicateFunctionException
	{
		assert(functionName != null);
		assert(functionName.length() > 0);
		assert(functionPointer != null);
		// Check if the function has already been declared in the current scope
		if (bindings.containsKey(functionName))
		{
			throw new DuplicateFunctionException(functionName);
		}
		bindings.put(functionName, new Closure(functionPointer, this));
	}
	/**************************************************************************
	 * Type functions                                                         *
	 **************************************************************************/
	public void registerType(String typeName, IInstantiateableVariable typeCreator) throws DuplicateTypeException
	{
		typeRegistry.registerType(typeName, typeCreator);
	}
	public IInstantiateableVariable resolveType(String typeName) throws UnknownTypeException
	{
		return typeRegistry.resolveType(typeName);
	}
}
