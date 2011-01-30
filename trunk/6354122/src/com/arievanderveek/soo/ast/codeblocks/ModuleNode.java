/**
 * 
 */
package com.arievanderveek.soo.ast.codeblocks;

import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 * 
 */
public class ModuleNode extends CodeBlockNode {

	/**
	 * Constructor to create object with all required fields
	 * 
	 * @param startName
	 * @param endName
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @param statementSequence
	 */
	public ModuleNode(String startName, String endName,
			Map<String, ASTNode> constants, Map<String, ASTNode> types,
			Map<String, ASTNode> variables, Map<String, ASTNode> procedures,
			List<ASTNode> statementSequence) {
		super(startName, endName, constants, types, variables, procedures,
				statementSequence);
	}
	
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// Create a new Scope
		Scope localScope = new Scope(constants, types, variables, procedures);
		// loop over statements and call interpret method with the Scope Variable
		for (ASTNode statementNode : statementSequence){
			statementNode.interpret(localScope);
		}
		System.out.println(localScope.toString());
		return null;
	}
	
	public String toTreeString(String ident) throws SeaOfOberonException {
		return super.toTreeString(ident);
	}
}