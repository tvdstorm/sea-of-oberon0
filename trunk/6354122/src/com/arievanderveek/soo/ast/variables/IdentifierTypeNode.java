package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;
import com.arievanderveek.soo.util.Constants;

public class IdentifierTypeNode extends TypeNode{

	private final String name;
	
	public IdentifierTypeNode(String name) {
		this.name = name;
	}

	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return name;
	}

	public String getName() {
		return name;
	}
	
	public static void registerIdentifierType(Scope scope, IdentifierTypeNode identNode){

	}

	@Override
	public void registerVariable(String identifier, Scope scope) throws SeaOfOberonException {
		if (Constants.INTEGER_VAR_KEYWORD.equals(name)){
			// Its an integer declaration. Register it as an integer
			scope.addIntegerSymbolToTable(identifier, new Integer(0), true);
		} else {
			TypeNode resolvedNode = scope.lookupType(name);
			resolvedNode.registerVariable(identifier, scope);
		}
	}
	
	@Override
	public Symbol createSymbolFromType(Scope scope) throws SeaOfOberonException {
		if (Constants.INTEGER_VAR_KEYWORD.equals(name)){
			// Its an integer declaration. Register it as an integer
			return scope.generateIntegerSymbol(new Integer(0), true);
		} else {
			return scope.lookupType(name).createSymbolFromType(scope);
		}
	}
}
