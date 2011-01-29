package randy.oberon0.value;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class Record extends Value
{
	private Map<String, Value> members;
	
	public Record(Map<String, IInstantiateableVariable> _members, RuntimeEnvironment environment) throws RuntimeException
	{
		members = new HashMap<String, Value>();
		for (String name : _members.keySet())
		{
			members.put(name, _members.get(name).instantiate(environment));
		}
	}
	public Record(Record _value) throws RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public Value getMemberValue(String name)
	{
		assert(name != null);
		assert(members.get(name) != null);
		return members.get(name);
	}
	public Value dereference()
	{
		return this;
	}
	@Override
	public void setValue(Value _val) throws RuntimeException
	{
		// Resolve CONST
		Record v = _val.dereference().castToRecord();
		members = new HashMap<String, Value>();
		for (String key : v.members.keySet())
		{
			members.put(key, v.members.get(key)); // TODO: copy van maken
		}
	}
	@Override
	public Type getType()
	{
		return Type.RECORD;
	}
	@Override
	public String toString()
	{
		// TODO: implement
		return "";
	}
}
