package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.value.Value;

public interface IValue extends IBindable
{
	public Value getValue();
}
