package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public abstract class Value
{
	public abstract void setValue(Value _val) throws RuntimeException;
	public abstract Type getType();
	public abstract Value clone();
	public abstract boolean equalsToValue(Value _value);
}
