package randy.oberon0.interpreter.runtime.environment;

import java.util.*;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.value.Value;

public class RuntimeEnvironment
{
	private final Map<String, IBindable> bindings;
	private final Map<String, IInstantiateableVariable> types;
	private final RuntimeEnvironment parentScope;
	
	public RuntimeEnvironment()
	{
		bindings = new HashMap<String, IBindable>();
		types = new HashMap<String, IInstantiateableVariable>();
		parentScope = null;
	}
	public RuntimeEnvironment(RuntimeEnvironment baseEnvironment)
	{
		// Create a new environment on top of the base environment
		bindings = new HashMap<String, IBindable>();
		types = new HashMap<String, IInstantiateableVariable>();
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
			throw new UnreachableRuntimeException();
		}
	}
	/**************************************************************************
	 * Variables                                                              *
	 **************************************************************************/
	public void registerVariableByValue(String variableName, Value value) throws RuntimeException
	{
		registerVariableByReference(variableName, new Reference(value));
	}
	public void registerVariableByReference(String variableName, Reference reference) throws RuntimeException
	{
		assert(variableName != null);
		assert(variableName.length() > 0);
		assert(reference != null);
		// Check if the variable has already been declared in the current scope
		if (bindings.containsKey(variableName))
		{
			throw new UnreachableRuntimeException();
		}
		// Add the variable to the current scope
		bindings.put(variableName, reference);
	}
	public void registerConstant(String constantName, Value value) throws RuntimeException
	{
		// Package the value as a constant and add it as a variable
		registerVariableByReference(constantName, new Constant(value));
	}
	/**************************************************************************
	 * Procedures                                                             *
	 **************************************************************************/
	public void registerProcedure(String procedureName, IInvokableProcedure procedurePointer) throws RuntimeException
	{
		assert(procedureName != null);
		assert(procedureName.length() > 0);
		assert(procedurePointer != null);
		// Check if the procedure has already been declared in the current scope
		if (bindings.containsKey(procedureName))
		{
			throw new UnreachableRuntimeException();
		}
		bindings.put(procedureName, new Closure(procedurePointer, this));
	}
	/**************************************************************************
	 * Types                                                                  *
	 **************************************************************************/
	public void registerType(String typeName, IInstantiateableVariable typeCreator) throws RuntimeException
	{
		assert(typeName != null);
		assert(typeName.length() > 0);
		assert(typeCreator != null);
		// Check if we already have a type with the same name registered
		if (types.get(typeName) != null)
		{
			throw new UnreachableRuntimeException();
		}
		// No, register the type
		types.put(typeName, typeCreator);
	}
	public IInstantiateableVariable resolveType(String name) throws RuntimeException
	{
		// Check if we have the type registered in this scope
		if (types.get(name) != null)
		{
			return types.get(name);
		}
		// Check if we have a parent scope and check it for the type
		else if (parentScope != null)
		{
			return parentScope.resolveType(name);
		}
		// We don't know the type and don't have a parent scope, return an exception
		else
		{
			throw new UnreachableRuntimeException();
		}
	}
}
