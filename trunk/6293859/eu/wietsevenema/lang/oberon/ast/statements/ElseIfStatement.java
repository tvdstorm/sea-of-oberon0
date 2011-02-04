package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.List;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class ElseIfStatement extends Statement {

	private List<Statement> trueStatements;
	private Expression condition;

	public ElseIfStatement(Node condition, List<Statement> trueStatements) {
		this.condition = transformExpression(condition);
		this.trueStatements = trueStatements;
	}

	public List<Statement> getTrueStatements() {
		return trueStatements;
	}

	public Expression getCondition() {
		return condition;
	}

}
