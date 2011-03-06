package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.ArrayList;
import java.util.List;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class IfStatement extends Statement {

	private List<Statement> trueStatements;
	private List<ElseIfStatement> elseIfs;
	private List<Statement> falseStatements;
	private Expression condition;

	public IfStatement(Expression cond, List<Statement> trueStatements, List<ElseIfStatement> elseIfs,
			List<Statement> falseStatements) {
		this.condition = cond;
		this.trueStatements = trueStatements;
		this.elseIfs = (elseIfs != null) ? elseIfs : new ArrayList<ElseIfStatement>();
		this.falseStatements = (falseStatements != null) ? falseStatements : new ArrayList<Statement>();
	}

	public List<Statement> getTrueStatements() {
		return trueStatements;
	}

	public List<ElseIfStatement> getElseIfs() {
		return elseIfs;
	}

	public List<Statement> getFalseStatements() {
		return falseStatements;
	}

	public Expression getCondition() {
		return condition;
	}

}
