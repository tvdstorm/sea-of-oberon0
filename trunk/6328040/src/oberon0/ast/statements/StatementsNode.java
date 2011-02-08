package oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.Context;

public class StatementsNode implements IExecutable {
	private final List<IExecutable> _statementSequence;

	public StatementsNode(ArrayList<IExecutable> statements) {
		if (statements != null) {
			_statementSequence = statements;
		} else {
			_statementSequence = new ArrayList<IExecutable>();
		}
	}

	@Override
	public void execute(Context context) {
		for (IExecutable statement : _statementSequence) {
			if (statement != null) {
				statement.execute(context);
			}
		}
	}

}
