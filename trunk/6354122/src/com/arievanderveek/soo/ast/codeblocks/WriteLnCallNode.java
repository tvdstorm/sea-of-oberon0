/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.statements.AbstractCallNode;
import com.arievanderveek.soo.ast.variables.CallByRefParameterNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

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
		super(METHODNAME ,	METHODNAME,
				new Hashtable<String, ASTNode>(), new Hashtable<String, ASTNode>(),
				new Hashtable<String, ASTNode>(), new Hashtable<String, ASTNode>(),
				new LinkedList<ASTNode>());
	}
	
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		System.out.println();
		return null;
	}

}
