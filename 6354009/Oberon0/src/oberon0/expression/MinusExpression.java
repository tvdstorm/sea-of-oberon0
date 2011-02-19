package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public class MinusExpression extends BinaryExpression {
	
	public MinusExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public IntegerValue evaluate(Environment env) {
		IntegerValue leftOpVal = operandLeft.evaluate(env);
		IntegerValue rightOpVal = operandRight.evaluate(env);
		return new IntegerValue(leftOpVal.getTrueValue() - rightOpVal.getTrueValue());
	}
}
