/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.CallByRefParameterNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.ast.variables.MethodCallParamNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * Special codeblock node that supports the
 * 
 * @author arieveek
 * 
 */
public class ReadLineCallNode extends ProcedureNode {

	protected final static String METHODNAME = "Read";
	private final static String INPUT_PARAM = "readInputParam";

	/**
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public ReadLineCallNode() {
		super(METHODNAME, METHODNAME, buildParameters(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(), new LinkedList<ASTNode>());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		try {
			System.out.println("Enter a number and press enter");
			int consoleInput = 0;
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			consoleInput = Integer.parseInt(in.readLine());
			scope.updateValue(new IdentifierNode(INPUT_PARAM), consoleInput);
			return null;
		} catch (Exception e) {
			throw new SeaOfOberonException(
					"Exception while reading from console", e);
		}

	}

	private static List<ASTNode> buildParameters() {
		List<ASTNode> singleParameter = new LinkedList<ASTNode>();
		singleParameter.add(new MethodCallParamNode(INPUT_PARAM,
				new IdentifierNode(INPUT_PARAM)));
		List<ASTNode> block = new LinkedList<ASTNode>();
		block.add(new CallByRefParameterNode(singleParameter));
		return block;
	}
}
