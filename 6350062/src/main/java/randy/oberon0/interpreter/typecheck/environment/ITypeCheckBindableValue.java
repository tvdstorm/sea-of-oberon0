package randy.oberon0.interpreter.typecheck;

import randy.oberon0.exception.TypeMismatchException;

public interface ITypeCheckBindableValue extends ITypeCheckBindable
{
	public abstract boolean equals(Object obj);
	public abstract void mustBe(ITypeCheckType other) throws TypeMismatchException;
	public abstract String toString();
	public abstract ITypeCheckType getValue();
}
