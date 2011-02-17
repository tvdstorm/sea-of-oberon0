package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.ArraySymbol;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

/**
 * Represents a subscript selector, example output[i]
 * 
 * @author Arie van der Veek
 *
 */
public class Subscript extends Selector {

	private final ExpressionNode expression;

	public Subscript(ExpressionNode expression) {
		this.expression = expression;
	}

	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(" [ ");
		sb.append(expression.toTreeString(ident));
		sb.append(" ] ");
		return sb.toString();
	}

	@Override
	public Symbol select(Symbol originalSymbol, Scope scope) throws SeaOfOberonException {
		Integer position = expression.interpret(scope);
		if (originalSymbol instanceof ArraySymbol) {
			return ((ArraySymbol) originalSymbol).getSymbol(position);
		} else {
			throw new SeaOfOberonException("Subscript identifier [" + position
					+ "] points to a non Array symbol. It was a "
					+ originalSymbol.getClass().getSimpleName());
		}
	}
}
