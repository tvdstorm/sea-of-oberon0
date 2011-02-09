package randy.oberon0.interpreter.typecheck;

import randy.oberon0.exception.TypeMismatchException;

public interface ITypeCheckType extends ITypeCheckBindable
{
	public abstract boolean equals(Object obj);
	public abstract ITypeCheckType referenceType();
	public abstract ITypeCheckType byValueType();
	public abstract void mustBe(ITypeCheckType other) throws TypeMismatchException;
	public abstract String toString();
}
