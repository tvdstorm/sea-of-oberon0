/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Collections;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.statements.AbstractParameterNode;
import com.arievanderveek.soo.ast.statements.StatementNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * @author arieveek
 * 
 */
public class WriteLnCallNode extends ProcedureNode {

	private final static String METHODNAME = "WriteLn";

	/**
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public WriteLnCallNode() {
		super(METHODNAME, METHODNAME,
				 Collections.<AbstractParameterNode>emptyList(),
				 Collections.<ConstantNode>emptyList(),
				 Collections.<FieldNode>emptyList(),
				 Collections.<FieldNode>emptyList(),
				 Collections.<ProcedureNode>emptyList(),
				 Collections.<StatementNode>emptyList());
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
