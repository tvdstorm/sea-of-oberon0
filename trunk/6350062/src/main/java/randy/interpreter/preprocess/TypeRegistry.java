package randy.interpreter.preprocess;

import java.util.*;
import randy.ast.OInstantiateableVariable;

public class TypeRegistry
{
	private Map<String, OInstantiateableVariable> types;
	
	public TypeRegistry()
	{
		types = new HashMap<String, OInstantiateableVariable>();
	}
	public void addType(String name, OInstantiateableVariable creator)
	{
		assert(types.get(name) == null);
		System.out.println("Registered " + name);
		types.put(name, creator);
	}
	public OInstantiateableVariable resolve(String name)
	{
		assert(types.get(name) != null);
		System.out.println("Resolving " + name + (types.get(name) == null?" NULL":" OK"));
		return types.get(name);
	}
}
