package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


public class NegationExpression implements Expression {

	public static String TYPE = "NEGATION_EXPRESSION";
	
	private Expression operator;
	
	//Constructor
	public NegationExpression(Expression operator) {
		this.operator= operator;
	}

	@Override 
	public Expression evaluate(Module module) {
		Expression opExpr =  operator.evaluate(module);
		
		//Operator must be integertype expressions.
		assert(opExpr.getType() == IntegerExpression.TYPE);
		
		IntegerExpression intExpr = (IntegerExpression) opExpr;
		int value = intExpr.getIntegerTypeValue();
		
		IntegerType intType = new IntegerType(-value);
		return new IntegerExpression(intType);
	}

	public String getType() {
		return TYPE;
	}
}
