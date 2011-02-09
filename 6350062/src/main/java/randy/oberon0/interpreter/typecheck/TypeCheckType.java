package randy.oberon0.interpreter.typecheck;

import randy.oberon0.exception.TypeMismatchException;
import randy.oberon0.value.Type;

public class TypeCheckType implements ITypeCheckType
{
	public static final TypeCheckType BOOLEAN = new TypeCheckType(Type.BOOLEAN.getTypeText(), false);
	public static final TypeCheckType INTEGER = new TypeCheckType(Type.INTEGER.getTypeText(), false);
	
	private final String type;
	private final boolean bReference;
	
	public TypeCheckType(String _type, boolean _bReference)
	{
		type = _type;
		bReference = _bReference;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof TypeCheckType))
		{
			return false;
		}
		TypeCheckType other = (TypeCheckType)obj;
		return type.equals(other.type); // TODO:  && bReference == other.bReference;
	}
	public ITypeCheckType referenceType()
	{
		return this; // TODO: return new TypeCheckType(type, true);
	}
	public ITypeCheckType byValueType()
	{
		return this; // TODO: return new TypeCheckType(type, false);
	}
	@Override
	public void mustBe(ITypeCheckType other) throws TypeMismatchException
	{
		// TODO: oplossen met references
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
