/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public abstract class CodeBlockNode implements ASTNode {

	// The constructor ModuleNode(String, String, List<ConstantNode>,
	// List<FieldNode>, List<FieldNode>, List<ProcedureNode>,
	// List<StatementNode>) is undefined

	protected final String codeBlockName;
	protected final List<ConstantNode> constants;
	protected final List<FieldNode> types;
	protected final List<FieldNode> variables;
	protected final List<ProcedureNode> procedures;
	protected final List<StatementNode> statementSequence;

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
	public CodeBlockNode(String startName, String endName, List<ConstantNode> constants,
			List<FieldNode> types, List<FieldNode> variables, List<ProcedureNode> procedures,
			List<StatementNode> statementSequence) {
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
			throw new RuntimeException("Startname " + startName + " endname" + endName
					+ " are not equal");
		}
		this.codeBlockName = startName;
		this.constants = constants;
		this.types = types;
		this.variables = variables;
		this.procedures = procedures;
		this.statementSequence = statementSequence;
	}

	/**
	 * Interpret the code block
	 * 
	 * @param scope
	 *            The scope
	 */
	public abstract void interpret(Scope scope) throws SeaOfOberonException;

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
		for (ConstantNode node : constants) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("TYPES");
		sb.append(Constants.LINE_SEPARATOR);
		for (FieldNode node : types) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END TYPES");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("VAR");
		sb.append(Constants.LINE_SEPARATOR);
		for (FieldNode node : variables) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END VAR");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("PROCS");
		sb.append(Constants.LINE_SEPARATOR);
		for (ProcedureNode node : procedures) {
			sb.append(node.toTreeString(ident + ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END PROCS");
		sb.append(Constants.LINE_SEPARATOR + Constants.LINE_SEPARATOR);
		sb.append("Statements:");
		sb.append(Constants.LINE_SEPARATOR);
		for (StatementNode node : statementSequence) {
			sb.append(node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("END" + ident + ";");
		return sb.toString();
	}

	public String getCodeBlockName() {
		return codeBlockName;
	}

	public List<ConstantNode> getConstants() {
		return constants;
	}

	public List<FieldNode> getTypes() {
		return types;
	}

	public List<FieldNode> getVariables() {
		return variables;
	}

	public List<ProcedureNode> getProcedures() {
		return procedures;
	}

	public List<StatementNode> getStatementSequence() {
		return statementSequence;
	}

}
