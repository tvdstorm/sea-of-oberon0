package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

public abstract class TypeNode implements ASTNode {

	public abstract void registerVariable(String identifier, Scope scope)
			throws SeaOfOberonException;

	public abstract Symbol createSymbolFromType(Scope scope) throws SeaOfOberonException;

}