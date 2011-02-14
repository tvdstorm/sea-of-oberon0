package org.elcid.oberon0.ast.env;

import java.util.List;
import org.elcid.oberon0.ast.DeclarationSequenceNode;
import org.elcid.oberon0.ast.StatementSequenceNode;

/**
 *
 * @author Pieter Brandwijk
 */
public class Procedure {

	private List<FormalParameter> formalParams;
	private DeclarationSequenceNode declarationSequence;
	private StatementSequenceNode statementSequence;

	public Procedure(List<FormalParameter> formalParams, DeclarationSequenceNode declarationSequence, StatementSequenceNode statementSequence) {
		this.formalParams = formalParams;
		this.declarationSequence = declarationSequence;
		this.statementSequence = statementSequence;
	}

	public DeclarationSequenceNode getDeclarationSequence() {
		return declarationSequence;
	}

	public List<FormalParameter> getFormalParams() {
		return formalParams;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}
	
}
