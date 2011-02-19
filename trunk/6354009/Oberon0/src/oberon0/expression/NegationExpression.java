package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public class NegationExpression extends UnaryExpression {

	public NegationExpression(Expression operator) {
		super(operator);
	}

	@Override
	@SuppressWarnings("unchecked")
	public IntegerValue evaluate(Environment env) {
		IntegerValue opVal = operand.evaluate(env); 
		return new IntegerValue(-(opVal.getTrueValue()));
	}
}
