/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.statements.AbstractParameterNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a procedure
 * 
 * @author arieveek
 * 
 */
public class ProcedureNode extends CodeBlockNode {
	// TODO: Might migrate system procedures to extend from this class
	protected final List<ASTNode> parameterBlocks;

	/**
	 * Constructor with all required fields
	 * 
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public ProcedureNode(String startName, String endName,
			Map<String, ASTNode> constants, Map<String, ASTNode> types,
			Map<String, ASTNode> variables, Map<String, ASTNode> procedures,
			List<ASTNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures,
				statementSequence);
		parameterBlocks = new LinkedList<ASTNode>();
	}

	/**
	 * Constructor with all required fields and optional parameter blocks
	 * 
	 * @param startName
	 * @param endName
	 * @param parameterBlocks
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public ProcedureNode(String startName, String endName,
			List<ASTNode> parameterBlocks, Map<String, ASTNode> constants,
			Map<String, ASTNode> types, Map<String, ASTNode> variables,
			Map<String, ASTNode> procedures, List<ASTNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures,
				statementSequence);
		this.parameterBlocks = parameterBlocks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// loop over statements and call interpret method with the Scope
		// Variable
		for (ASTNode statementNode : statementSequence) {
			statementNode.interpret(scope);
		}
		return null;
	}

	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Parameters");
		sb.append(Constants.LINE_SEPARATOR);
		for (ASTNode node : parameterBlocks) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END Parameters");
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(super.toTreeString(ident));
		return sb.toString();
	}

	/**
	 * @return the parameterBlocks
	 */
	public List<ASTNode> getParameterBlocks() {
		return parameterBlocks;
	}

	public boolean isAmountOfParametersEqual(
			List<ASTNode> procedureCallParameters) {
		// Count all the parameters defined in this class.
		int amountOfDefinedParameters = 0;
		for (ASTNode node : parameterBlocks) {
			amountOfDefinedParameters += ((AbstractParameterNode) node)
					.getFormalParameter().size();
		}
		// Count all the passed parameters
		int amountOfPassedParameters = procedureCallParameters.size();
		if (amountOfDefinedParameters == amountOfPassedParameters) {
			return true;
		} else {
			return false;
		}
	}

}