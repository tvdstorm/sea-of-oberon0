package oberon0.interpreter.expression;

import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.IntegerType;


public class AlwaysTrueExpression implements Expression {
	
	public static String TYPE = "ALWAYS_TRUE_EXPRESSION";
	
	//Constructor
	public AlwaysTrueExpression() {
	}

	@Override 
	public Expression evaluate(Module module) {
		//Always true!
		return new IntegerExpression(new IntegerType(1));
	}
	
	public String getType() {
		return TYPE;
	}

}
