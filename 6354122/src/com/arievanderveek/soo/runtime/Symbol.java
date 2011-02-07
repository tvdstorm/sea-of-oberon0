/**
 * 
 */
package com.arievanderveek.soo.runtime;

/**
 * Interface for a Symbol
 * 
 * @author arieveek
 * 
 */
public abstract class Symbol {

	private final SymbolTypesEnum type;
	// Symbols are always created as copies, and this parameter should be set
	// explicity when doing a call by reference.
	private boolean referencedSymbol;

	private final boolean mutable;

	public Symbol(SymbolTypesEnum type, boolean mutable) {
		this.type = type;
		this.referencedSymbol = false;
		this.mutable = mutable;
	}

	public SymbolTypesEnum getType() {
		return this.type;
	}

	public boolean isReferencedSymbol() {
		return this.referencedSymbol;
	}

	public void setReferencedSymbol(boolean referencedSymbol) {
		this.referencedSymbol = referencedSymbol;
	}

	public boolean isMutable() {
		return this.mutable;
	}
}