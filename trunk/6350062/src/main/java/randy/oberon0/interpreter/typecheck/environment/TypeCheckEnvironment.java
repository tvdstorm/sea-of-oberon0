package randy.oberon0.interpreter.typecheck.environment;

import java.util.HashMap;
import java.util.Map;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.exception.DuplicateProcedureException;
import randy.oberon0.exception.DuplicateTypeException;
import randy.oberon0.exception.DuplicateVariableException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.UndefinedBindableException;
import randy.oberon0.exception.UnknownTypeException;

public class TypeCheckEnvironment
{
	private final Map<String, ITypeCheckBindable> bindings;
	private final Map<String, ITypeCheckType> types;
	private final Map<String, String> typeAliases;
	private final TypeCheckEnvironment parentScope;
	
	public TypeCheckEnvironment()
	{
		bindings = new HashMap<String, ITypeCheckBindable>();
		types = new HashMap<String, ITypeCheckType>();
		typeAliases = new HashMap<String, String>();
		parentScope = null;
	}
	public TypeCheckEnvironment(TypeCheckEnvironment baseEnvironment)
	{
		// Create a new environment on top of the base environment
		bindings = new HashMap<String, ITypeCheckBindable>();
		types = new HashMap<String, ITypeCheckType>();
		typeAliases = new HashMap<String, String>();
		parentScope = baseEnvironment;
	}
	public ITypeCheckBindable lookup(String name) throws RuntimeException
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
	 * Variables                                                              *
	 **************************************************************************/
	public void registerVariableByValue(String variableName, ITypeCheckType valueType) throws DuplicateVariableException
	{
		registerVariableByReference(variableName, new TypeCheckReference(valueType));
	}
	public void registerVariableByReference(String variableName, TypeCheckReference reference) throws DuplicateVariableException
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
	public void registerConstant(String constantName) throws DuplicateVariableException
	{
		// Package the value as a constant and add it as a variable
		registerVariableByReference(constantName, new TypeCheckConstant(TypeCheckType.INTEGER));
	}
	/**************************************************************************
	 * Procedures                                                             *
	 **************************************************************************/
	public void registerProcedure(String procedureName, IInvokableProcedure procedurePointer) throws DuplicateProcedureException
	{
		assert(procedureName != null);
		assert(procedureName.length() > 0);
		assert(procedurePointer != null);
		// Check if the procedure has already been declared in the current scope
		if (bindings.containsKey(procedureName))
		{
			throw new DuplicateProcedureException(procedureName);
		}
		bindings.put(procedureName, new TypeCheckClosure(procedurePointer, this));
	}
	/**************************************************************************
	 * Types                                                                  *
	 **************************************************************************/
	public void registerType(String typeName, ITypeCheckType resolvesTo) throws DuplicateTypeException
	{
		assert(typeName != null);
		assert(typeName.length() > 0);
		assert(resolvesTo != null);
		// Check if we already have a type with the same name registered
		if (types.get(typeName) != null || typeAliases.get(typeName) != null)
		{
			throw new DuplicateTypeException(typeName);
		}
		// No, register the type
		types.put(typeName, resolvesTo);
	}
	public void registerTypeAlias(String typeName, String aliasName) throws DuplicateTypeException
	{
		assert(typeName != null);
		assert(typeName.length() > 0);
		assert(aliasName != null);
		assert(aliasName.length() > 0);
		// Check if we already have a type with the same name registered
		if (types.get(typeName) != null || typeAliases.get(typeName) != null)
		{
			throw new DuplicateTypeException(typeName);
		}
		// No, register the type
		typeAliases.put(typeName, aliasName);
	}
	public ITypeCheckType resolveType(String name) throws UnknownTypeException
	{
		assert(name != null);
		assert(name.length() > 0);
		String currentName = name;
		while (true)
		{
			if (typeAliases.get(currentName) != null)
			{
				currentName = typeAliases.get(currentName);
				continue;
			}
			if (types.get(currentName) != null)
			{
				return types.get(currentName);
			}
			break;
		}
		// Check if we have a parent scope and check it for the type
		if (parentScope != null)
		{
			return parentScope.resolveType(name);
		}
		// We don't know the type and don't have a parent scope, return an exception
		else
		{
			throw new UnknownTypeException(name);
		}
	}
}
