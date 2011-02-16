package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class WhileStmNode extends StatementNode{

	private ExpressionNode condition;
	private StatementSequenceNode statementSequence;

	public WhileStmNode(ExpressionNode condition, StatementSequenceNode statementSequence) {
		this.condition = condition;
		this.statementSequence = statementSequence;
	}

	public ExpressionNode getCondition() {
		return condition;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
