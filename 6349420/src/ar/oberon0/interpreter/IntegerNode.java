package ar.oberon0.interpreter;

public class IntegerNode implements Interpretable {

	private Object _value;

	@Override
	public Object Interpret() 
	{
		return _value;
	}
	
	public IntegerNode(int value)
	{
		_value = value;
	}

}
