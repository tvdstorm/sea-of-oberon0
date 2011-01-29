package randy.ast;

import java.util.*;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;
import randy.value.*;

public class ORecordInstantiation implements OInstantiateableVariable
{
	private Map<String, String> members;
	
	public ORecordInstantiation(Map<String, String> _members)
	{
		members = _members;
	}
	@Override
	public OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException
	{
		HashMap<String, OInstantiateableVariable> vars = new HashMap<String, OInstantiateableVariable>();
		for (String name : members.keySet())
		{
			vars.put(name, _typeRegistry.resolve(members.get(name)));
		}
		return new ORecord(vars, _typeRegistry);
	}
}
