package jdm.oberon0.ast.statements;

import java.util.List;

public class StatementSequence extends Statement {
	private List<Statement> _statements;
	
	public StatementSequence(List<Statement> statements) {
		this._statements = statements;
	}
	
	public List<Statement> getStatements() {
		return _statements;
	}

	@Override
	public void accept(StatementVisitor visitor) {
		visitor.visitStatementSequence(this);
	}
}
