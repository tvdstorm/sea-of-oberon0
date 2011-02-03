package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.DuplicateTypeException;
import randy.oberon0.exception.UnknownTypeException;

public class TypeRegistry
{
	private Map<String, IInstantiateableVariable> types; // <typeName, typeCreator>
	private TypeRegistry parent;
	
	public TypeRegistry(TypeRegistry _parent)
	{
		types = new HashMap<String, IInstantiateableVariable>();
		parent = _parent;
	}
	public void registerType(String typeName, IInstantiateableVariable typeCreator) throws DuplicateTypeException
	{
		assert(typeName != null);
		assert(typeName.length() > 0);
		assert(typeCreator != null);
		// Check if we already have a type with the same name registered
		if (types.get(typeName) != null)
			throw new DuplicateTypeException(typeName);
		// No, register the type
		types.put(typeName, typeCreator);
	}
	public IInstantiateableVariable resolveType(String name) throws UnknownTypeException
	{
		// Check if we have the type registered in this scope
		if (types.get(name) != null)
			return types.get(name);
		// Check if we have a parent scope and check it for the type
		else if (parent != null)
			return parent.resolveType(name);
		// We don't know the type and don't have a parent scope, return an exception
		else
			throw new UnknownTypeException(name);
	}
}
