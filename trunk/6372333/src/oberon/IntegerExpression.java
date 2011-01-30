package oberon;

public class IntegerExpression extends Expression {
	private int _value;

	public IntegerExpression(int value)
	{
		_value = value;
	}
	
	@Override
	public int EvalAsInt() {
		return _value;
	}

}
