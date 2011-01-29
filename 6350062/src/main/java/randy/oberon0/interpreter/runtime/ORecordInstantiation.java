package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.value.*;

public class ORecordInstantiation implements OInstantiateableVariable
{
	private Map<String, String> members;
	
	public ORecordInstantiation(Map<String, String> _members)
	{
		members = _members;
	}
	@Override
	public OValue instantiate(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		HashMap<String, OInstantiateableVariable> vars = new HashMap<String, OInstantiateableVariable>();
		for (String name : members.keySet())
		{
			vars.put(name, environment.resolveType(members.get(name)));
		}
		return new ORecord(vars, environment);
	}
}
