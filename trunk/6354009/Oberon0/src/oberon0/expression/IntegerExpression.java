package oberon0.expression;

import oberon0.module.Module;
import oberon0.type.IntegerType;


public class IntegerExpression implements Expression {
	
	public static String TYPE = "INTEGER_EXPRESSION";
	
	private IntegerType integerType;
	
	//Constructor	
	public IntegerExpression(IntegerType integerType) {
		this.integerType = integerType;
	}
	
	public IntegerType getIntegerType()
	{
		return integerType;
	}
	
	//Easy int value access method.
	public int getIntegerTypeValue()
	{
		return integerType.getValue();
	}
	
	public String getType() {
		return TYPE;
	}
	
	@Override 
	public Expression evaluate(Module module) {
		//Just return yourself (This is a primitive type expression).
		return this;
	}
}
