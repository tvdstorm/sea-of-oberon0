package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public  class ConstantExpression implements Expression {

	private final Integer value;
	
	public ConstantExpression(Integer value) {
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}

	@Override
	@SuppressWarnings("unchecked")
	public IntegerValue evaluate(Environment env) {
		return new IntegerValue(value);
	}
}
