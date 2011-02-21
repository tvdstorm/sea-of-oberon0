/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

/**
 * Special codeblock node that supports the Read( ) statement
 * 
 * @author arieveek
 * 
 */
public class ReadLineCallNode extends ProcedureNode {

	protected final static String METHODNAME = "Read";
	private final static String INPUT_PARAM = "readInputParam";

	/**
	 * Construtor that creates an readline  call node with method name Read
	 */
	public ReadLineCallNode() {
		super(METHODNAME, METHODNAME, buildParameters(), Collections.<ConstantNode> emptyList(),
				Collections.<FieldNode> emptyList(), Collections.<FieldNode> emptyList(),
				Collections.<ProcedureNode> emptyList(), Collections.<StatementNode> emptyList());
	}

	public void interpret(Scope scope) throws SeaOfOberonException {
		try {
			System.out.println("Enter a number and press enter");
			int consoleInput = 0;
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			consoleInput = Integer.parseInt(in.readLine());
			scope.updateValue(new IdentifierNode(INPUT_PARAM), consoleInput);
		} catch (Exception e) {
			throw new SeaOfOberonException("Exception while reading from console", e);
		}

	}

	private static List<FormalParameterNode> buildParameters() {
		FormalParameterNode param = new FormalParameterNode(INPUT_PARAM, new IdentifierTypeNode(
				INPUT_PARAM), true);
		List<FormalParameterNode> block = new LinkedList<FormalParameterNode>();
		block.add(param);
		return block;
	}
}
