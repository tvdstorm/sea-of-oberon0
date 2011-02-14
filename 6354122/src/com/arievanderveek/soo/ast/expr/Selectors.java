package com.arievanderveek.soo.ast.expr;

import java.util.Collections;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.IntegerSymbol;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

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
	
	public Symbol resolveSelectors(Symbol originalSymbol, Scope scope)throws SeaOfOberonException{
		Symbol resolvedSymbol = originalSymbol;
		StringBuilder sb = new StringBuilder();
		sb.append("Found subscript selector: ");
		for( Selector selector : selectors ){
			sb.append(selector.toTreeString(" "));
			resolvedSymbol = selector.select(resolvedSymbol, scope);
		}
		//System.out.println(sb.toString());
		return resolvedSymbol;
	}

}
