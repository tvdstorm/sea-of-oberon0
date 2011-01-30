/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a procedure
 * 
 * @author arieveek
 * 
 */
public class ProcedureNode extends CodeBlockNode {

	private final List<ASTNode> parameterBlocks;
	
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
	public ProcedureNode(String startName, String endName, List<ASTNode> parameterBlocks,
			Map<String, ASTNode> constants, Map<String, ASTNode> types,
			Map<String, ASTNode> variables, Map<String, ASTNode> procedures,
			List<ASTNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures,
				statementSequence);
		this.parameterBlocks = parameterBlocks;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// Create a new Scope and encapsulate current scope in it.
		Scope localScope = new Scope(scope, constants, types, variables, procedures);
		// loop over statements and call interpret method with the Scope Variable
		for (ASTNode statementNode : statementSequence){
			statementNode.interpret(localScope);
		}
		return 0;
	}

	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Parameters");
		sb.append(Constants.LINE_SEPARATOR);
		for (ASTNode node : parameterBlocks){
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END Parameters");
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(super.toTreeString(ident));
		return sb.toString();
	}

}