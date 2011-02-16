package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.visitors.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ElseStmNode extends IfThenElseStmNode {
	private StatementSequenceNode statementSequence;

	public ElseStmNode(StatementSequenceNode statements) {
		this.statementSequence = statements;
	}
	
	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

	@Override
	public void setElseNode(IfThenElseStmNode elseNode) {
		throw new UnsupportedOperationException("Can't attach an else node to final else.");
	}

}
