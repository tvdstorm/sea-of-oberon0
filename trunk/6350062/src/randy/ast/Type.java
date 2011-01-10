package randy.ast;

import randy.exception.Oberon0Exception;

public class Type
{
	public enum TYPES
	{
		INTEGER,
		ARRAY,
		BOOL
	};
	static final public Type INTEGER = new Type(TYPES.INTEGER);
	static final public Type ARRAY = new Type(TYPES.ARRAY);
	static final public Type BOOL = new Type(TYPES.BOOL);
	
	private TYPES type;
	
	public Type(String _type) throws Oberon0Exception
	{
		if (_type.equals("INTEGER"))
			type = TYPES.INTEGER;
		else if (_type.equals("ARRAY"))
			type = TYPES.ARRAY;
		else if (_type.equals("BOOL"))
			type = TYPES.BOOL;
		else
			throw new Oberon0Exception("Unknown type '" + _type + "'");
	}
	public Type(TYPES _type)
	{
		type = _type;
	}
	public TYPES getType()
	{
		return type;
	}
	public boolean isInteger()
	{
		return type == TYPES.INTEGER;
	}
	public boolean isArray()
	{
		return type == TYPES.ARRAY;
	}
	public boolean isBool()
	{
		return type == TYPES.BOOL;
	}
	@Override
	public String toString()
	{
		// TODO: mooier maken i.c.m. constructor
		switch (type)
		{
			case INTEGER:
				return "INTEGER";
			case ARRAY:
				return "ARRAY";
			case BOOL:
				return "BOOL";
			default:
				return "UNKNOWN TYPE";
		}
	}
}
