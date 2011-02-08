package oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;

public class IfNode implements IExecutable {
	private final IEvaluable _ifCondition;
	private final IExecutable _ifBody;
	private final List<IEvaluable> _ifelsConditions;
	private final List<IExecutable> _ifelsBodies;
	private final IExecutable _elseBody;

	public IfNode(IEvaluable ifcondition, IExecutable ifbody,
			ArrayList<IEvaluable> condlist, ArrayList<IExecutable> ifelsbody,
			IExecutable elsebody) {
		_ifCondition = ifcondition;
		_ifBody = ifbody;
		if (condlist != null) {
			_ifelsConditions = condlist;
		} else {
			_ifelsConditions = new ArrayList<IEvaluable>();
		}
		if (ifelsbody != null) {
			_ifelsBodies = ifelsbody;
		} else {
			_ifelsBodies = new ArrayList<IExecutable>();
		}
		_elseBody = elsebody;
	}

	@Override
	public void execute(Context context) {
		boolean ifcondition = ((BooleanValue) _ifCondition.eval(context))
				.getValue();
		if (ifcondition) {
			_ifBody.execute(context);
			return;
		} else {
			for (int index = 0; index < _ifelsConditions.size(); index++) {
				IEvaluable currentExpression = _ifelsConditions.get(index);
				boolean currentCondition = ((BooleanValue) currentExpression
						.eval(context)).getValue();
				if (currentCondition) {
					_ifelsBodies.get(index).execute(context);
					return;
				}
			}
		}
		if (_elseBody != null) {
			_elseBody.execute(context);
		}
	}

}
