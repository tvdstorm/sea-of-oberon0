package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.List;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class WithStatement extends Statement {

	private Expression record;
	private List<Statement> statements;

	public WithStatement(Expression record, List<Statement> stats) {
		this.record = record;
		this.statements = stats;
	}

	public Expression getRecord() {
		return record;
	}

	public List<Statement> getStatements() {
		return statements;
	}

}
