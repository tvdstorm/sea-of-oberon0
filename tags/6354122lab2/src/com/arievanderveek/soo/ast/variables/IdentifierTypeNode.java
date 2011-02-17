package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.IntegerSymbol;
import com.arievanderveek.soo.runtime.MemoryAddress;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents an identifier type definition
 * 
 * @author Arie van der Veek
 *
 */
public class IdentifierTypeNode extends TypeNode {

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

	public static void registerIdentifierType(Scope scope, IdentifierTypeNode identNode) {

	}

	@Override
	public void registerVariable(String identifier, Scope scope) throws SeaOfOberonException {
		if (Constants.INTEGER_VAR_KEYWORD.equals(name)) {
			// Its an integer declaration. Register it as an integer
			Symbol intSymbol = generateIntegerSymbol(scope,  new Integer(0), true);
			scope.addSymbolToTable(identifier, intSymbol);
		} else {
			TypeNode resolvedNode = scope.lookupType(name);
			resolvedNode.registerVariable(identifier, scope);
		}
	}

	@Override
	public Symbol createSymbolFromType(Scope scope) throws SeaOfOberonException {
		if (Constants.INTEGER_VAR_KEYWORD.equals(name)) {
			// Its an integer declaration. Register it as an integer
			return generateIntegerSymbol(scope, new Integer(0), true);
		} else {
			return scope.lookupType(name).createSymbolFromType(scope);
		}
	}

	public IntegerSymbol generateIntegerSymbol(Scope scope, Integer value, boolean mutable)
			throws SeaOfOberonException {
		MemoryAddress memoryAdress = scope.createMemoryAdress(value);
		return new IntegerSymbol(mutable, memoryAdress);
	}
}
