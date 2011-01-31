/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 *
 */
public abstract class CodeBlockNode implements ASTNode {

	protected final String codeBlockName;
	protected final Map<String, ASTNode> constants;
	protected final Map<String, ASTNode> types;
	protected final Map<String, ASTNode> variables;
	protected final Map<String, ASTNode> procedures;
	protected final List<ASTNode> statementSequence;

	/**
	 * Constructor for {@link ModuleNode} with required fields.
	 * 
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public CodeBlockNode(String startName, String endName,
			Map<String, ASTNode> constants, Map<String, ASTNode> types,
			Map<String, ASTNode> variables, Map<String, ASTNode> procedures,
			List<ASTNode> statementSequence) {
		// Assert all the incoming variables
		assert startName != null;
		assert endName != null;
		assert constants != null;
		assert types != null;
		assert variables != null;
		assert procedures != null;
		// assert statementSequence!=null;
		// See todo in ASTNode interface. Throwing runtime exceptions is not
		// good.
		if (!(startName.equalsIgnoreCase(endName))) {
			throw new RuntimeException("Startname " + startName + " endname"
					+ endName + " are not equal");
		}
		this.codeBlockName = startName;
		this.constants = constants;
		this.types = types;
		this.variables = variables;
		this.procedures = procedures;
		this.statementSequence = statementSequence;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("CODEBLOCK" + ident + codeBlockName + ident + ";");
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("CONST");
		sb.append(Constants.LINE_SEPARATOR);
		for (String nodeKey : constants.keySet()) {
			ASTNode node = constants.get(nodeKey);
			sb.append(nodeKey + ident + " = ");
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("TYPES");
		sb.append(Constants.LINE_SEPARATOR);
		for (String nodeKey : types.keySet()) {
			ASTNode node = types.get(nodeKey);
			sb.append(nodeKey + ident + " = ");
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END TYPES");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("VAR");
		sb.append(Constants.LINE_SEPARATOR);
		for (String nodeKey : variables.keySet()) {
			ASTNode node = variables.get(nodeKey);
			sb.append(nodeKey + ident + " = ");
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END VAR");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("PROCS");
		sb.append(Constants.LINE_SEPARATOR);
		for (String nodeKey : procedures.keySet()) {
			ASTNode node = procedures.get(nodeKey);
			sb.append(node.toTreeString(ident + ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END PROCS");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("Statements:");
		sb.append(Constants.LINE_SEPARATOR);
		for (ASTNode node : statementSequence) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("END" + ident + ";");
		return sb.toString();
	}

	/**
	 * @return the codeBlockName
	 */
	public String getCodeBlockName() {
		return codeBlockName;
	}

	/**
	 * @return the constants
	 */
	public Map<String, ASTNode> getConstants() {
		return constants;
	}

	/**
	 * @return the types
	 */
	public Map<String, ASTNode> getTypes() {
		return types;
	}

	/**
	 * @return the variables
	 */
	public Map<String, ASTNode> getVariables() {
		return variables;
	}

	/**
	 * @return the procedures
	 */
	public Map<String, ASTNode> getProcedures() {
		return procedures;
	}

	/**
	 * @return the statementSequence
	 */
	public List<ASTNode> getStatementSequence() {
		return statementSequence;
	}

}
