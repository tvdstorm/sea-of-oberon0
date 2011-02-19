package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.visitors.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class WithStmNode extends StatementNode {

	private ExpressionNode expression;
	private StatementSequenceNode statementSequence;

	public WithStmNode(ExpressionNode expression, StatementSequenceNode statementSequence) {
		this.expression = expression;
		this.statementSequence = statementSequence;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
