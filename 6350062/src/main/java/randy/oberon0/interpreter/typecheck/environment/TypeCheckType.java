package randy.oberon0.interpreter.typecheck.environment;

import randy.oberon0.exception.TypeMismatchException;
import randy.oberon0.value.Type;

public class TypeCheckType implements ITypeCheckType
{
	public static final TypeCheckType BOOLEAN = new TypeCheckType(Type.BOOLEAN.getTypeText());
	public static final TypeCheckType INTEGER = new TypeCheckType(Type.INTEGER.getTypeText());
	
	private final String type;
	
	public TypeCheckType(String _type)
	{
		type = _type;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof TypeCheckType))
		{
			return false;
		}
		TypeCheckType other = (TypeCheckType)obj;
		return type.equals(other.type);
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
		return type;
	}
}
