package oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.Context;

public class BodyNode implements IExecutable {
	private final List<IExecutable> _statements;

	public BodyNode(List<IExecutable> statements) {
		if (statements != null) {
			_statements = statements;
		} else {
			_statements = new ArrayList<IExecutable>();
		}
	}

	@Override
	public void execute(Context context) {
		for (IExecutable statement : _statements) {
			if (statement != null) {
				statement.execute(context);
			}
		}
	}

}
