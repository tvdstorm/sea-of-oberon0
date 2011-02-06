package oberon0.interpreter.expression;

import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.IntegerType;


public class DevideExpression extends LeftRightExpression implements Expression {

	public static String TYPE = "DEVIDE_EXPRESSION";
	
	//Constructor
	public DevideExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override 
	public Expression evaluate(Module module) {
		int valLeft = getLeftValue(module);
		int valRight = getRightValue(module);
		
		IntegerType intType = new IntegerType(valLeft / valRight);
		return new IntegerExpression(intType);
	}

	
	public String getType() {
		return TYPE;
	}
}
