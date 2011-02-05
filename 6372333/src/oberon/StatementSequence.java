package oberon;

import java.io.IOException;
import java.util.List;

public class StatementSequence{
	private final List<IStatement> body;

	public StatementSequence(final List<IStatement> statementList) {
		body = statementList;
	}

	public void eval() throws IOException {
		if (body != null) {
			for(IStatement statement : body) {
				statement.eval();
			}
		}
	}
}
