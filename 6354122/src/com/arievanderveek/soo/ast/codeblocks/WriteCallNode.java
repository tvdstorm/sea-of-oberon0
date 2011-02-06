/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.CallByRefParameterNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.ast.variables.MethodCallParamNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class WriteCallNode extends ProcedureNode {

	private final static String METHODNAME = "Write";
	private final static String OUTPUT_PARAM = "writeOutputParam";

	public WriteCallNode() {
		super(METHODNAME, METHODNAME, buildParameters(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(), new LinkedList<ASTNode>());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret(com.arievanderveek.soo.
	 * symboltable.Scope)
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.OUTPUT_TEXT);
		sb.append(scope.getValue(new IdentifierNode(OUTPUT_PARAM)));
		System.out.print(sb.toString() + Constants.INDENT);
		return null;
	}

	private static List<ASTNode> buildParameters() {
		List<ASTNode> singleParameter = new LinkedList<ASTNode>();
		singleParameter.add(new MethodCallParamNode(OUTPUT_PARAM,
				new IdentifierNode(OUTPUT_PARAM)));
		List<ASTNode> block = new LinkedList<ASTNode>();
		block.add(new CallByRefParameterNode(singleParameter));
		return block;
	}
}