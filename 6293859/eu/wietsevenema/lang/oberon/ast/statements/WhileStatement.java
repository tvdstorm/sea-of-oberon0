package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.List;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class WhileStatement extends Statement {

	private Expression condition;
	private List<Statement> statements;

	public WhileStatement(Node condition, List<Statement> statements) {
		this.condition = this.transformExpression(condition);
		this.statements = statements;
	}

	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getStatements() {
		return statements;
	}

}
