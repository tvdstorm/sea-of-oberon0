package randy.oberon0.interpreter.typecheck;

import randy.oberon0.exception.ConstAssignmentException;
import randy.oberon0.exception.TypeMismatchException;

public class TypeCheckReference implements ITypeCheckBindableValue
{
	private ITypeCheckType type;
	
	public TypeCheckReference(ITypeCheckType _type)
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
	public void setValue(ITypeCheckType _type) throws ConstAssignmentException
	{
		assert(_type != null);
		type = _type;
	}
}
