package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


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
