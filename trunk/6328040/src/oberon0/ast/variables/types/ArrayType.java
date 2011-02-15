package oberon0.ast.variables.types;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.ArrayValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class ArrayType implements IType {
	private final IEvaluable _sizeExpression;
	private final IType _type;

	public ArrayType(IEvaluable size, IType type) {
		_sizeExpression = size;
		_type = type;
	}	

	@Override
	public TypeNames getTypeName(Context context) {
		return TypeNames.ARRAY;
	}

	@Override
	public IValue getDefaultValue(Context context) {
		int size = ((IntegerValue)_sizeExpression.eval(context)).getValue();
		return ArrayValue.getDefaultValue(_type.getDefaultValue(context), size);
	}

}
