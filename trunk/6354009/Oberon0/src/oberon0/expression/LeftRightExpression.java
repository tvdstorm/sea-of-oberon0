package oberon0.expression;

import oberon0.module.Module;

public class LeftRightExpression{
	
	public static String TYPE = "ALWAYS_TRUE_EXPRESSION";
	
	protected Expression operatorLeft;
	protected Expression operatorRight;
	
	public LeftRightExpression(Expression operatorLeft, Expression operatorRight) {
		this.operatorLeft = operatorLeft;
		this.operatorRight = operatorRight;
	}	
	
	protected int getLeftValue(Module module) {
		Expression evalExpLeft =  operatorLeft.evaluate(module);
		assert(evalExpLeft.getType() == IntegerExpression.TYPE);
		return ((IntegerExpression) evalExpLeft).getIntegerTypeValue();
	}

	protected int getRightValue(Module module) {
		Expression evalExpRight =  operatorRight.evaluate(module);
		assert(evalExpRight.getType() == IntegerExpression.TYPE);
		return ((IntegerExpression) evalExpRight).getIntegerTypeValue();
	}
}
