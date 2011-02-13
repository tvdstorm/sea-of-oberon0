package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;

public class IntegerExpressionNode extends ExpressionNode {

	private final Integer value;
	
	public IntegerExpressionNode(Integer value) {
		this.value = value;
	}

	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
			return value;
	}

	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return value.toString();
	}
}
