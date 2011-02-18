package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.value.Value;

public interface IBindableValue extends IBindable
{
	public Value getValue();
}