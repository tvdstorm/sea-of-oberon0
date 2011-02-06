package oberon0.interpreter.expression;

import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.ArrayType;


public class ArrayExpression implements Expression {
	
	public static String TYPE = "ARRAY_EXPRESSION";
	
	private ArrayType arrayType;
	
	//Constructor	
	public ArrayExpression(ArrayType arrayType) {
		this.arrayType = arrayType;
	}
	
	public ArrayType getArrayType()
	{
		return arrayType;
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
