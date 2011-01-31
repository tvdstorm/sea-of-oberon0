package oberon;

public class VarDeclaration {
	private VarType _type;
	private String _name;

	public VarDeclaration(String name, VarType type)
	{
		_name = name;
		_type = type;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public VarType getType()
	{
		return _type;
	}
	
	public Boolean isArrayType()
	{
		return _type == VarType.Array;
	}

	public Boolean isIdentifierType()
	{
		return _type == VarType.Identifier;
	}
}
