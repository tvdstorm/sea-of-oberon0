/**
 * 
 */
package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;

/**
 * AST Node representing an Identifier with optional selectors.
 * 
 * @author arieveek
 * 
 */
public class IdentifierNode extends ExpressionNode {

	private final String name;
	private final Selectors selectors;

	public IdentifierNode(String name) {
		assert name != null;
		this.name = name;
		this.selectors = new Selectors();

	}

	public IdentifierNode(String name, Selectors selectors) {
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
		sb.append(selectors.toTreeString(ident));
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
	public Selectors getSelectors() {
		return selectors;
	}
	
	/**
	 * Checks if there are selectors
	 * @return True if selectors present, else false
	 */
	public boolean hasSelectors() {
		return !selectors.getSelectors().isEmpty();
	}
}
