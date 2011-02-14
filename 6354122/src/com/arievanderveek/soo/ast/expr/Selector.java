package com.arievanderveek.soo.ast.expr;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;


public abstract class Selector implements ASTNode{
	
	public abstract Symbol select(Symbol originalSymbol, Scope scope) throws SeaOfOberonException ;
	public abstract String toTreeString(String ident) throws SeaOfOberonException;

}
