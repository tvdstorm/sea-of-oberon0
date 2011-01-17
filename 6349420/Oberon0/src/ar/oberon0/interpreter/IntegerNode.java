package ar.oberon0.interpreter;

public class IntegerNode implements Interpretable {

	private String _value;

	@Override
	public Object Interpret() 
	{
		return Integer.parseInt(_value);
	}
	
	public IntegerNode(String value)
	{
		_value = value;
	}
	
	@Override
	public int hashCode() {
		return _value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return _value.equals(((IntegerNode)obj)._value);
	}
	
	
}
