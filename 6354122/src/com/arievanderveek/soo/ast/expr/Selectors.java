package com.arievanderveek.soo.ast.expr;

import java.util.Collections;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

public class Selectors implements ASTNode {
	
	private final List<Selector> selectors;

	public Selectors(List<Selector> selectors) {
		this.selectors = selectors;
	}
	
	public Selectors() {
		this.selectors = Collections.<Selector>emptyList();
	}	

	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		for (Selector selector : selectors){
			sb.append(selector.toTreeString(ident));
		}
		return sb.toString();

	}

	public List<Selector> getSelectors() {
		return selectors;
	}

}
