package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


public class GreaterOrEqualExpression extends LeftRightExpression implements Expression {

	public static String TYPE = "GREATER_OR_EQUAL_EXPRESSION";
	
	public GreaterOrEqualExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override
	public Expression evaluate(Module module) {
		int valLeft = getLeftValue(module);
		int valRight = getRightValue(module);
		
		// Is op1 greater or equal than op2?
		if (valLeft >= valRight) {
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
