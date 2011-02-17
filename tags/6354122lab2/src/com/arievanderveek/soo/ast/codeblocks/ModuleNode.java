/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents a module node
 * 
 * @author arieveek
 * 
 */
public class ModuleNode extends CodeBlockNode {

	/**
	 * Constructor to create object with all required fields
	 * 
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public ModuleNode(String startName, String endName, List<ConstantNode> constants,
			List<FieldNode> types, List<FieldNode> variables, List<ProcedureNode> procedures,
			List<StatementNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures, statementSequence);
		// add the system procedures to this node
		this.procedures.add(new ReadLineCallNode());
		this.procedures.add(new WriteLnCallNode());
		this.procedures.add(new WriteCallNode());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		// Create a new Scope
		Scope localScope = new Scope(constants, types, variables, procedures);
		// System.out.println(localScope.toString());
		// loop over statements and call interpret method with the Scope
		// Variable
		for (StatementNode statementNode : statementSequence) {
			statementNode.interpret(localScope);
		}
	}

	public String toTreeString(String ident) throws SeaOfOberonException {
		return super.toTreeString(ident);
	}
}