package randy.oberon0.value;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.interpreter.runtime.environment.Reference;

public class Record extends Value
{
	private Map<String, Reference> members;
	
	public Record(Map<String, IInstantiateableVariable> _members, RuntimeEnvironment environment) throws RuntimeException
	{
		members = new HashMap<String, Reference>();
		for (String name : _members.keySet())
		{
			members.put(name, new Reference(_members.get(name).instantiate(environment)));
		}
	}
	private Record()
	{
		members = new HashMap<String, Reference>();
	}
	public Set<String> getMemberNames()
	{
		return members.keySet();
	}
	public Reference getMemberValue(String name)
	{
		assert(name != null);
		assert(members.get(name) != null);
		return members.get(name);
	}
	@Override
	public void setValue(Value _val) throws RuntimeException
	{
		Record v = _val.castToRecord();
		if (v != this)
		{
			members = new HashMap<String, Reference>();
			for (String key : v.members.keySet())
			{
				members.put(key, new Reference(v.members.get(key).getValue().clone()));
			}
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
		StringBuilder ret = new StringBuilder("[");
		for (String name : members.keySet())
		{
			ret.append(name + "=" + members.get(name).toString() + ",");
		}
		ret.append("]");
		return ret.toString();
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		if (!(_value instanceof Record))
		{
			return false;
		}
		Record other = (Record)_value;
		if (members.size() != other.members.size())
		{
			return false;
		}
		for (String name : members.keySet())
		{
			Reference otherValue = other.members.get(name);
			if (otherValue == null)
			{
				return false;
			}
			if (!members.get(name).getValue().equalsToValue(otherValue.getValue()))
			{
				return false;
			}
		}
		return true;
	}
	@Override
	public Value clone()
	{
		Record record = new Record();
		for (String name : members.keySet())
		{
			record.members.put(name, new Reference(members.get(name).getValue().clone()));
		}
		return record;
	}
}
