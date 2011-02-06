package oberon0.interpreter.expression;

import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.IntegerType;


public class SmallerExpression extends LeftRightExpression implements Expression {

	public static String TYPE = "SMALLER_EXPRESSION";
	
	public SmallerExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override
	public Expression evaluate(Module module) {
		int valLeft = getLeftValue(module);
		int valRight = getRightValue(module);
		
		// Is op1 smaller than op2?
		if (valLeft < valRight) {
			return new IntegerExpression(new IntegerType(1));
		}
		else {
			//No so return False as 0.
			return new IntegerExpression(new IntegerType(0));
		}
	}

	public String getType() {
		return TYPE;
	}
}
