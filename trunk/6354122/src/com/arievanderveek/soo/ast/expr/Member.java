package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.MemoryAddress;
import com.arievanderveek.soo.runtime.Scope;

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
	public MemoryAddress select(MemoryAddress adress, Scope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getName() {
		return name;
	}

}
