package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.BooleanValue;

public class OrExpression extends BinaryExpression {

	public OrExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override
	@SuppressWarnings("unchecked")
	public BooleanValue evaluate(Environment env) {
		BooleanValue leftOpVal = operandLeft.evaluate(env);
		BooleanValue rightOpVal = operandRight.evaluate(env);
		return new BooleanValue(leftOpVal.getBoolValue() || rightOpVal.getBoolValue());
	}
}
