package randy.value;

import java.util.*;

public enum Type
{
	INTEGER("INTEGER"),
	ARRAY("ARRAY"),
	BOOLEAN("BOOLEAN");
	
	private static final Map<String, Type> lookup = new HashMap<String, Type>();
	
	static
	{
		for (Type s : EnumSet.allOf(Type.class))
			lookup.put(s.getTypeText(), s);
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
	public static Type get(String typeText)
	{
		return lookup.get(typeText);
	}
}