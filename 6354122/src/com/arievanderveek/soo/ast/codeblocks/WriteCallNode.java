/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.ast.variables.FormalParameterNode;
import com.arievanderveek.soo.ast.variables.IdentifierTypeNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class WriteCallNode extends ProcedureNode {

	private final static String METHODNAME = "Write";
	private final static String OUTPUT_PARAM = "writeOutputParam";

	public WriteCallNode() {
		super(METHODNAME, METHODNAME, buildParameters(), Collections.<ConstantNode> emptyList(),
				Collections.<FieldNode> emptyList(), Collections.<FieldNode> emptyList(),
				Collections.<ProcedureNode> emptyList(), Collections.<StatementNode> emptyList());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret(com.arievanderveek.soo.
	 * symboltable.Scope)
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.OUTPUT_TEXT);
		sb.append(scope.getValue(new IdentifierNode(OUTPUT_PARAM)));
		System.out.print(sb.toString() + Constants.INDENT);
	}

	private static List<FormalParameterNode> buildParameters() {
		FormalParameterNode param = new FormalParameterNode(OUTPUT_PARAM, new IdentifierTypeNode(
				OUTPUT_PARAM), true);
		List<FormalParameterNode> block = new LinkedList<FormalParameterNode>();
		block.add(param);
		return block;
	}
}