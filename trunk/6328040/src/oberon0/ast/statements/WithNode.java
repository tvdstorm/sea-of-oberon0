package oberon0.ast.statements;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;

public class WithNode implements IExecutable {
	IEvaluable _record;
	IExecutable _body;
	
	public WithNode(IEvaluable record, IExecutable body) {
		_record = record;
		_body = body;
	}

	@Override
	public void execute(Context context) {
		//TODO
	}

}
