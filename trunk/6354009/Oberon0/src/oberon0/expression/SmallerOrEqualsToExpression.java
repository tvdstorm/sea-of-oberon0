package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.BooleanValue;
import oberon0.value.IntegerValue;

public class SmallerOrEqualsToExpression extends BinaryExpression {
	
	public SmallerOrEqualsToExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override
	@SuppressWarnings("unchecked")
	public BooleanValue evaluate(Environment env) {
		IntegerValue leftOpVal = operandLeft.evaluate(env);
		IntegerValue rightOpVal = operandRight.evaluate(env);
		return new BooleanValue(leftOpVal.getTrueValue() <= rightOpVal.getTrueValue());
	}
}
