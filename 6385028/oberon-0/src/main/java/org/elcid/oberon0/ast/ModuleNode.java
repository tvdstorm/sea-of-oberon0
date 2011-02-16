package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.env.builtins.*;
import org.elcid.oberon0.visitors.DeclarationVisitor;
import org.elcid.oberon0.visitors.StatementVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ModuleNode extends Node {

	private String moduleName;
	private DeclarationSequenceNode declarationSequence;
	private StatementSequenceNode statementSequence;

	public ModuleNode(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setDeclarationSequence(DeclarationSequenceNode declarationSequence) {
		this.declarationSequence = declarationSequence;
	}

	public DeclarationSequenceNode getDeclarationSequence() {
		return declarationSequence;
	}

	public void setStatementSequence(StatementSequenceNode statementSequence) {
		this.statementSequence = statementSequence;
	}

	public StatementSequenceNode getStatementSequence() {
		return statementSequence;
	}

	public void run() {
		Environment env = new Environment();
		env.declareProcedure("Read", new ReadBuiltinProcedure());
		env.declareProcedure("Write", new WriteBuiltinProcedure());
		env.declareProcedure("WriteLn", new WriteLnBuiltinProcedure());
		declarationSequence.run(new DeclarationVisitor(), env);
		statementSequence.run(new StatementVisitor(), env);
	}

}
