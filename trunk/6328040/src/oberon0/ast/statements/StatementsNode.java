package oberon0.ast.statements;

import java.util.ArrayList;

import oberon0.environment.Context;

public class StatementsNode implements IExecutable {
	private ArrayList<IExecutable> _statementSequence;

	public StatementsNode(ArrayList<IExecutable> statements) {
		_statementSequence = statements;
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
