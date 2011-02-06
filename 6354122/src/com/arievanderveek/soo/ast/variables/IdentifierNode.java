/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.LinkedList;
import java.util.Queue;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * AST Node representing an Identifier
 * 
 * @author arieveek
 * 
 */
public class IdentifierNode implements ASTNode {

	private final String name;
	// TODO: Re-think selector setup. Might remove the node and just add the
	// queue here.
	private final ASTNode selectors;

	public IdentifierNode(String name) {
		assert name != null;
		this.name = name;
		// Create a Queue of 0 selectors
		Queue<ASTNode> emptyQueue = new LinkedList<ASTNode>();
		this.selectors = new SelectorNode(emptyQueue);
	}

	public IdentifierNode(String name, ASTNode selectors) {
		// assert name!=null;
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
			sb.append(selectors.toTreeString(ident));
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
	public ASTNode getSelectors() {
		return selectors;
	}
}
