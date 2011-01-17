package randy.value;

import randy.exception.Oberon0Exception;
import randy.exception.Oberon0UnknownTypeException;

public class Type
{
	public enum TYPES
	{
		INTEGER,
		ARRAY,
		BOOL
	};
	static final public Type INTEGER = new Type(TYPES.INTEGER);
	static final private String STRINTEGER = "INTEGER";
	static final public Type ARRAY = new Type(TYPES.ARRAY);
	static final private String STRARRAY = "ARRAY";
	static final public Type BOOL = new Type(TYPES.BOOL);
	static final private String STRBOOL = "BOOL";
	
	private TYPES type;
	
	public Type(String _type) throws Oberon0Exception
	{
		if (_type.equals(STRINTEGER))
			type = TYPES.INTEGER;
		else if (_type.equals(STRARRAY))
			type = TYPES.ARRAY;
		else if (_type.equals(STRBOOL))
			type = TYPES.BOOL;
		else
			throw new Oberon0UnknownTypeException(_type);
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
				return STRINTEGER;
			case ARRAY:
				return STRARRAY;
			case BOOL:
				return STRBOOL;
			default:
				return "UNKNOWN TYPE";
		}
	}
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Type)
		{
			Type t = (Type)obj;
			return t.type == type;
		}
		else
			return false;
	}
}
