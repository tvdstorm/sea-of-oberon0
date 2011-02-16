/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Collections;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.ast.variables.FormalParameterNode;
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
	protected final List<FormalParameterNode> parameterBlocks;

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
	public ProcedureNode(String startName, String endName, List<ConstantNode> constants,
			List<FieldNode> types, List<FieldNode> variables, List<ProcedureNode> procedures,
			List<StatementNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures, statementSequence);
		parameterBlocks = Collections.<FormalParameterNode> emptyList();
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
			List<FormalParameterNode> parameterBlocks, List<ConstantNode> constants,
			List<FieldNode> types, List<FieldNode> variables, List<ProcedureNode> procedures,
			List<StatementNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures, statementSequence);
		this.parameterBlocks = parameterBlocks;
	}

	public void interpret(Scope scope) throws SeaOfOberonException {
		// loop over statements and call interpret method with the Scope
		// Variable
		for (StatementNode statementNode : statementSequence) {
			statementNode.interpret(scope);
		}
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
	public List<FormalParameterNode> getParameterBlocks() {
		return parameterBlocks;
	}

	/**
	 * Check if the amount of formal parameters is equal to the actual given
	 * parameters
	 * 
	 * @param actualParameters
	 *            the actual parameters
	 * @return True if equal, else false
	 */
	public boolean isAmountOfParametersEqual(List<ExpressionNode> actualParameters) {
		if (parameterBlocks.size() == actualParameters.size()) {
			return true;
		} else {
			return false;
		}
	}

}