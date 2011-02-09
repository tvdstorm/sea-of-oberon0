package randy.oberon0.interpreter.typecheck.environment;

import randy.oberon0.exception.ConstAssignmentException;

public class TypeCheckConstant extends TypeCheckReference
{
	public TypeCheckConstant(ITypeCheckType _type)
	{
		super(_type);
	}
	@Override
	public void setValue(ITypeCheckType _type) throws ConstAssignmentException
	{
		throw new ConstAssignmentException();
	}
}
