package randy.oberon0.interpreter.typecheck.environment;

import java.util.*;
import randy.oberon0.exception.*;

public class TypeCheckRecordType implements ITypeCheckType
{
	private final Map<String, String> members; // <variableName, variableType>)
	private final String type;
	
	public TypeCheckRecordType(String _type, Map<String, String> _members)
	{
		assert(_type != null);
		assert(_members != null);
		members = new HashMap<String, String>();
		for (String name : _members.keySet())
		{
			members.put(name, _members.get(name));
		}
		type = _type;
	}
	public boolean equals(Object obj)
	{
		if (!(obj instanceof TypeCheckRecordType))
		{
			return false;
		}
		TypeCheckRecordType other = (TypeCheckRecordType)obj;
		return members.equals(other.members);
	}
	@Override
	public void mustBe(ITypeCheckType other) throws TypeMismatchException
	{
		if (!equals(other))
		{
			throw new TypeMismatchException(toString(), other.toString());
		}
	}
	@Override
	public String toString()
	{
		StringBuilder ret = new StringBuilder();
		ret.append("RECORD " + type + " [");
		boolean bFirst = true;
		for (String memberName : members.keySet())
		{
			if (bFirst)
			{
				bFirst = false;
			}
			else
			{
				ret.append(", ");
			}
			ret.append(memberName);
		}
		ret.append("]");
		return ret.toString();
	}
	public Set<String> getMemberNames()
	{
		return new HashSet<String>(members.keySet());
	}
	public ITypeCheckType getMemberType(String memberName, TypeCheckEnvironment environment) throws UnknownTypeException, UnknownRecordFieldAccess
	{
		assert(memberName != null);
		assert(memberName.length() > 0);
		assert(environment != null);
		String memberType = members.get(memberName);
		if (memberType == null)
		{
			throw new UnknownRecordFieldAccess(memberName);
		}
		ITypeCheckType type = environment.resolveType(memberType);
		if (type == null)
		{
			throw new UnknownTypeException(members.get(memberName));
		}
		return type;
	}
}
