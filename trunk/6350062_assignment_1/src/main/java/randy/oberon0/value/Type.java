package randy.oberon0.value;

import java.util.*;

public enum Type
{
	INTEGER("INTEGER"),
	ARRAY("ARRAY"),
	RECORD("RECORD");
	
	private static final Map<String, Type> lookup = new HashMap<String, Type>();
	
	static
	{
		for (Type s : EnumSet.allOf(Type.class))
		{
			lookup.put(s.getTypeText(), s);
		}
	}
	private String typeText;
	private Type(String _typeText)
	{
		typeText = _typeText;
	}
	public String getTypeText()
	{
		return typeText;
	}
}
