package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.ast.OInstantiateableVariable;
import randy.oberon0.exception.Oberon0UnknownTypeException;

public class TypeRegistry
{
	private Map<String, OInstantiateableVariable> types;
	private TypeRegistry parent;
	
	public TypeRegistry(TypeRegistry _parent)
	{
		types = new HashMap<String, OInstantiateableVariable>();
		parent = _parent;
	}
	public void addType(String name, OInstantiateableVariable creator)
	{
		assert(types.get(name) == null);
		//System.out.println("Registered " + name);
		types.put(name, creator);
	}
	public OInstantiateableVariable resolve(String name) throws Oberon0UnknownTypeException
	{
		if (types.get(name) != null)
			return types.get(name);
		else if (parent != null)
			return parent.resolve(name);
		else
			throw new Oberon0UnknownTypeException(name);
	}
}
