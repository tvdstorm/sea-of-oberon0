package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ModuleNode extends Node {

	private String moduleName;
	private StatementSequenceNode statementSequence;

	public ModuleNode(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setStatementSequence(StatementSequenceNode statementSequence) {
		this.statementSequence = statementSequence;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	public void run(Environment env) {
		statementSequence.run(new StatementVisitor(), env);
	}

}
