package oberon0.type;

import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.value.ArrayValue;
import oberon0.value.IntegerValue;
import oberon0.value.Value;

public class ArrayType implements Type {
	
	private Expression sizeExpression;
	private Type itemsType;
	
	public ArrayType(Expression sizeExpression, Type itemsType) {
		this.sizeExpression = sizeExpression;
		this.itemsType = itemsType;
	}

	@Override
	public ArrayValue createTypeValue(Environment env) {
		IntegerValue size = sizeExpression.evaluate(env);
		Value<?>[] array = new Value[size.getTrueValue()];
		for (int i = 0;i < array.length; i++) {
			 array[i] = itemsType.createTypeValue(env);
		}
		return new ArrayValue(array,this);
	}

}
