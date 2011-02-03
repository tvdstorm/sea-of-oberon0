package oberon0.ast.statements;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;

public class IfNode implements IExecutable {
	private IEvaluable _ifcondition;
	private IExecutable _ifbody;
	private ArrayList<IEvaluable> _ifelsconditions; 
	private ArrayList<IExecutable> _ifelsbody;
	private IExecutable _elsebody;
	
	public IfNode(IEvaluable ifcondition, IExecutable ifbody,
			ArrayList<IEvaluable> condlist, ArrayList<IExecutable> ifelsbody, IExecutable elsebody) {
		_ifcondition = ifcondition;
		_ifbody = ifbody;
		_ifelsconditions = condlist;
		_ifelsbody = ifelsbody;
		_elsebody = elsebody;
	}

	@Override
	public void execute(Context context) {
		boolean ifcondition = ((BooleanValue)_ifcondition.eval(context)).getValue();
		if (ifcondition){
			_ifbody.execute(context);
			return;
		}else{
			for(int index = 0; index< _ifelsconditions.size(); index++){
				IEvaluable currentExpression = _ifelsconditions.get(index);
				boolean currentCondition = ((BooleanValue)currentExpression.eval(context)).getValue();
				if (currentCondition){
					_ifelsbody.get(index).execute(context);
					return;
				}
			}
		}
		if (_elsebody!=null){
			_elsebody.execute(context);
		}
	}

}
