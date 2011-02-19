package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.BooleanValue;
import oberon0.value.IntegerValue;

public class LogicalNotExpression extends UnaryExpression {

	public LogicalNotExpression(Expression operand) {
		super(operand);
	}

	@Override
	@SuppressWarnings("unchecked")
	public BooleanValue evaluate(Environment env) {
		IntegerValue opVal = operand.evaluate(env);
		return new BooleanValue(!opVal.getBoolValue());
	}

}
