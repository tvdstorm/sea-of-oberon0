package oberon0.ast.routines.parameters;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class ActualParamNode implements IReferable {
	private IEvaluable _actualParamNode;

	public ActualParamNode(IEvaluable exp1) {
		_actualParamNode = exp1;
	}

	@Override
	public IValue eval(Context context) {
		return _actualParamNode.eval(context);
	}

	@Override
	public Reference getRef(Context context, Reference firstref) {
		return ((IReferable) _actualParamNode).getRef(context, firstref);
	}

}
