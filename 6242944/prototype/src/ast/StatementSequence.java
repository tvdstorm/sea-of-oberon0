package ast;

import java.util.List;

public class StatementSequence extends Node {
	private List<Statement> _statements;
	
	public StatementSequence(List<Statement> statements) {
		this._statements = statements;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public List<Statement> getStatements() {
		return _statements;
	}
}
