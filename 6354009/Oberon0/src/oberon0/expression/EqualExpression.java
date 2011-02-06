package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


public class EqualExpression extends LeftRightExpression implements Expression {

	public static String TYPE = "EQUAL_TRUE_EXPRESSION";
	
	public EqualExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}
	
	@Override
	public Expression evaluate(Module module) {
		int valLeft = getLeftValue(module);
		int valRight = getRightValue(module);
	
		// Does op1 equal op2?
		if (valLeft == valRight) {
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
