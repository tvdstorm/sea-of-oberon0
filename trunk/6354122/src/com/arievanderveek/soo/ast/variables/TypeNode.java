package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

public abstract class TypeNode implements ASTNode{
	
	public abstract void registerType(String identifier, Scope scope) throws SeaOfOberonException ;

}
