/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Collections;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.ast.variables.FormalParameterNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Special codeblock node that supports the WriteLn statement
 * 
 * @author arieveek
 * 
 */
public class WriteLnCallNode extends ProcedureNode {

	private final static String METHODNAME = "WriteLn";

	/**
	 * Construtor that creates an write line call node with method name WriteLn
	 */
	public WriteLnCallNode() {
		super(METHODNAME, METHODNAME, Collections.<FormalParameterNode> emptyList(), Collections
				.<ConstantNode> emptyList(), Collections.<FieldNode> emptyList(), Collections
				.<FieldNode> emptyList(), Collections.<ProcedureNode> emptyList(), Collections
				.<StatementNode> emptyList());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		System.out.println();
	}

}
