package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

public class RecordInstantiation implements IInstantiateableVariable
{
	private Map<String, String> recordMembers; // <variableName, variableType>
	
	public RecordInstantiation(Map<String, String> _recordMembers)
	{
		recordMembers = _recordMembers;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		HashMap<String, IInstantiateableVariable> vars = new HashMap<String, IInstantiateableVariable>();
		for (String name : recordMembers.keySet())
		{
			vars.put(name, environment.resolveType(recordMembers.get(name)));
		}
		return new Record(vars, environment);
	}
}
