package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


public class ModuloExpression extends LeftRightExpression implements Expression {

	public static String TYPE = "MODULO_EXPRESSION";

	//Constructor
	public ModuloExpression(Expression operatorLeft, Expression operatorRight) {
		super(operatorLeft,operatorRight);
	}

	@Override 
	public Expression evaluate(Module module) {
		int valLeft = getLeftValue(module);
		int valRight = getRightValue(module);
		
		IntegerType intType = new IntegerType(valLeft % valRight);
		return new IntegerExpression(intType);
	}

	public String getType() {
		return TYPE;
	}
}
