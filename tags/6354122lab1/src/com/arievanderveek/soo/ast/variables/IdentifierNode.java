/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * AST Node representing an Identifier with optional selectors.
 * 
 * @author arieveek
 * 
 */
public class IdentifierNode implements ASTNode {

	private final String name;
	// TODO: Re-think selector setup. Might remove the node and just add the
	// queue here.
	private final List<ASTNode> selectors;

	public IdentifierNode(String name) {
		assert name != null;
		this.name = name;
		// Create a list of 0 selectors
		this.selectors = new LinkedList<ASTNode>();
	}

	public IdentifierNode(String name, List<ASTNode> selectors) {
		assert name != null;
		assert selectors != null;
		this.name = name;
		this.selectors = selectors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		return scope.getValue(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ident);
		if (selectors != null) {
			for (ASTNode node : selectors) {
				sb.append(node.toTreeString(ident));
			}
		}
		return sb.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the selectors
	 */
	public List<ASTNode> getSelectors() {
		return selectors;
	}
}
