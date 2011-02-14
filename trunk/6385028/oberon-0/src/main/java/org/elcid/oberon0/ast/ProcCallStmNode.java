package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ProcCallStmNode extends StatementNode {

	private String identifier;
	private List<ExpressionNode> actualParameters;

	public ProcCallStmNode(String identifier) {
		this.identifier = identifier;
	}

	public List<ExpressionNode> getActualParameters() {
		return actualParameters;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setActualParameters(List<ExpressionNode> actualParameters) {
		this.actualParameters = actualParameters;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
