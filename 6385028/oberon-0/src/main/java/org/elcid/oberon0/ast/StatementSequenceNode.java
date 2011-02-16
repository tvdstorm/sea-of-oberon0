package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.visitors.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class StatementSequenceNode extends StatementNode {

	private List<StatementNode> statements;

	public StatementSequenceNode() {
		statements = new ArrayList<StatementNode>();
	}

	public List<StatementNode> getStatements() {
		return statements;
	}

	public void addStatement(StatementNode statement) {
		statements.add(statement);
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

	public Boolean isEmpty() {
		return statements.isEmpty();
	}


}
