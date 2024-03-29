package oberon0.ast.routines.parameters;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class ActualParamNode implements IReferable {
	private final IEvaluable _actualParamNode;

	public ActualParamNode(IEvaluable actualParam) {
		_actualParamNode = actualParam;
	}

	@Override
	public IValue eval(Context context) {
		return _actualParamNode.eval(context);
	}

	@Override
	public Reference deref(Context context, Reference firstref) {
		return ((IReferable) _actualParamNode).deref(context, firstref);
	}

}
