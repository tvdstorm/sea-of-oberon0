package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

/**
 * Abstract selector class defining behaviour for a selector
 * @author Arie van der Veek
 *
 */
public abstract class Selector implements ASTNode {

	/**
	 * Selects the symbol indicated by the selector from the original symbol
	 * 
	 * @param originalSymbol The original symbol
	 * @param scope The scope
	 * @return The selected symbol
	 * @throws SeaOfOberonException
	 */
	public abstract Symbol select(Symbol originalSymbol, Scope scope) throws SeaOfOberonException;

	public abstract String toTreeString(String ident) throws SeaOfOberonException;

}
