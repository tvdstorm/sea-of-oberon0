package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class IfStmNode extends IfThenElseStmNode{

	private StatementSequenceNode statementSequence;
	private IfThenElseStmNode elseNode;
	private ExpressionNode condition;

	public IfStmNode(ExpressionNode condition, StatementSequenceNode statementSequence) {
		this.condition = condition;
		this.statementSequence = statementSequence;
	}

	public IfThenElseStmNode getElseNode() {
		return elseNode;
	}

	public void setElseNode(IfThenElseStmNode elseNode) {
		this.elseNode = elseNode;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	public ExpressionNode getCondition() {
		return condition;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
