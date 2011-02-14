package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.ArraySymbol;
import com.arievanderveek.soo.runtime.RecordSymbol;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

public class Member extends Selector {

	private final String name; 

	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		sb.append(name);
		return sb.toString();
	}

	@Override
	public Symbol select(Symbol originalSymbol, Scope scope) throws SeaOfOberonException {
		if (originalSymbol instanceof RecordSymbol){
			return ((RecordSymbol)originalSymbol).getMember(name);
		}else{
			throw new SeaOfOberonException("Member identifier ."+name+" points to a non Record symbol. It was a " + originalSymbol.getClass().getSimpleName());
		}
	}
	
	public String getName() {
		return name;
	}

}
