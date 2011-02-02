package oberon0.ast.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.ArrayValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

public class SelectorArrayNode implements ISelector{
	private IEvaluable _selectorExpression;
	
	public SelectorArrayNode(IEvaluable selector){
		_selectorExpression = selector;
	}

	@Override
	public IValue eval(Context context) {
		return _selectorExpression.eval(context);
	}

	@Override
	public Reference refer(Context context, Reference previousRef) {
		IValue selectorValue = eval(context);
		int index = ((IntegerValue) selectorValue).getValue();
		return ((ArrayValue)previousRef.getValue()).getReference(index);
	}
}
