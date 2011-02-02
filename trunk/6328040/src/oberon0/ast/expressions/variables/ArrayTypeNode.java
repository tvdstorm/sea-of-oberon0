package oberon0.ast.expressions.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.ArrayValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class ArrayTypeNode implements IEvaluable{
	IEvaluable _sizeExpression;
	IEvaluable _typeExpression; 
	
	public ArrayTypeNode(IEvaluable size, IEvaluable type) {
		_sizeExpression = size;
		_typeExpression = type;
	}

	@Override
	public IValue eval(Context context) {
		IntegerValue size = (IntegerValue) _sizeExpression.eval(context);
		IValue protoType = _typeExpression.eval(context); 
		return new ArrayValue(protoType, size.getValue());
	}

}
