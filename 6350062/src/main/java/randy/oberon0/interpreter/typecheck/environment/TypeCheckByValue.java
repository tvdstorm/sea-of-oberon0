package randy.oberon0.interpreter.typecheck.environment;

import randy.oberon0.exception.TypeMismatchException;

public class TypeCheckByValue implements ITypeCheckBindableValue
{
	private final ITypeCheckType type;
	
	public TypeCheckByValue(ITypeCheckType _type)
	{
		assert(_type != null);
		type = _type;
	}
	@Override
	public boolean equals(Object obj)
	{
		return type.equals(obj);
	}
	@Override
	public void mustBe(ITypeCheckType other) throws TypeMismatchException
	{
		type.mustBe(other);
	}
	@Override
	public String toString()
	{
		return type.toString();
	}
	public ITypeCheckType getValue()
	{
		return type;
	}
}
