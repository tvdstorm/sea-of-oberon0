package oberon;

import java.io.IOException;
import java.util.List;

public class StatementSequence{
	private final List<AbstractStatement> body;

	public StatementSequence(final List<AbstractStatement> statementList) {
		body = statementList;
	}

	public void eval() throws IOException {
		if (body != null) {
			for(AbstractStatement statement : body) {
				statement.eval();
			}
		}
	}
}
