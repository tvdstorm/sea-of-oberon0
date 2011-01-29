package randy.value;

import java.util.*;
import randy.ast.OInstantiateableVariable;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;

public class ORecord extends OValue
{
	private Map<String, OValue> members;
	
	public ORecord(Map<String, OInstantiateableVariable> _members, TypeRegistry _typeRegistry) throws Oberon0RuntimeException
	{
		members = new HashMap<String, OValue>();
		for (String name : _members.keySet())
		{
			members.put(name, _members.get(name).instantiate(_typeRegistry));
		}
	}
	public ORecord(ORecord _value) throws Oberon0RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public OValue getMemberValue(String name)
	{
		assert(name != null);
		assert(members.get(name) != null);
		return members.get(name);
	}
	public OValue dereference()
	{
		return this;
	}
	@Override
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		// Resolve CONST
		ORecord v = _val.dereference().castToRecord();
		members = new HashMap<String, OValue>();
		for (String key : v.members.keySet())
		{
			members.put(key, v.members.get(key));
		}
		// TODO: bij alle setValue's een COPY maken!
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
