package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.UnknownTypeException;

public class TypeRegistry
{
	private Map<String, IInstantiateableVariable> types;
	private TypeRegistry parent;
	
	public TypeRegistry(TypeRegistry _parent)
	{
		types = new HashMap<String, IInstantiateableVariable>();
		parent = _parent;
	}
	public void addType(String name, IInstantiateableVariable creator)
	{
		assert(types.get(name) == null);
		//System.out.println("Registered " + name);
		types.put(name, creator);
	}
	public IInstantiateableVariable resolve(String name) throws UnknownTypeException
	{
		if (types.get(name) != null)
			return types.get(name);
		else if (parent != null)
			return parent.resolve(name);
		else
			throw new UnknownTypeException(name);
	}
}
