package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.visitors.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ProcedureDeclNode extends DeclarationNode {

	private String name;
	private FormalParamsNode formalParams;
	private DeclarationSequenceNode declarationSequence;
	private StatementSequenceNode statementSequence;

	public ProcedureDeclNode(String name, FormalParamsNode formalParams) {
		this.name = name;
		this.formalParams = formalParams;
	}

	public DeclarationSequenceNode getDeclarationSequence() {
		return declarationSequence;
	}

	public void setDeclarationSequence(DeclarationSequenceNode declarationSequence) {
		this.declarationSequence = declarationSequence;
	}

	public FormalParamsNode getFormalParams() {
		return formalParams;
	}

	public String getName() {
		return name;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	public void setStatementSequence(StatementSequenceNode statementSequence) {
		this.statementSequence = statementSequence;
	}

	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}
	
}
