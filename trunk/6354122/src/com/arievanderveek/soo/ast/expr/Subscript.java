package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.MemoryAddress;
import com.arievanderveek.soo.runtime.Scope;

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
	public MemoryAddress select(MemoryAddress adress, Scope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
