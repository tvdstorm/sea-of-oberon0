package randy.oberon0.interpreter.typecheck.environment;

import randy.oberon0.exception.TypeMismatchException;

public class TypeCheckArrayType implements ITypeCheckType
{
	private final ITypeCheckType innerType;
	
	public TypeCheckArrayType(ITypeCheckType _innerType)
	{
		assert(_innerType != null);
		innerType = _innerType;
	}
	public boolean equals(Object obj)
	{
		if (!(obj instanceof TypeCheckArrayType))
		{
			return false;
		}
		TypeCheckArrayType other = (TypeCheckArrayType)obj;
		return innerType.equals(other.innerType);
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
		return "ARRAY OF " + innerType.toString();
	}
	public ITypeCheckType getInnerType()
	{
		return innerType;
	}
}
