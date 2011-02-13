package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.MemoryAddress;
import com.arievanderveek.soo.runtime.Scope;


public abstract class Selector implements ASTNode{
	
	public abstract MemoryAddress select(MemoryAddress adress, Scope scope);
	public abstract String toTreeString(String ident) throws SeaOfOberonException;

}
