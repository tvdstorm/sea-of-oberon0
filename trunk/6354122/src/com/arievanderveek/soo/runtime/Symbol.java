/**
 * 
 */
package com.arievanderveek.soo.runtime;

import com.arievanderveek.soo.SeaOfOberonException;

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

	public Symbol(Symbol toBeCopiedSymbol) {
		this.type = toBeCopiedSymbol.getType();
		this.referencedSymbol = false;
		this.mutable = toBeCopiedSymbol.isMutable();
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

	/**
	 * Regenates the memory addres. It generates an new adress in the current
	 * memory map and assigns it the old value
	 * 
	 * @param scope
	 * @throws SeaOfOberonException
	 */
	public abstract void regenerateMemoryAddress(Scope scope, MemoryMap currentMap)
			throws SeaOfOberonException;

	/**
	 * Returns a clone of the symbol object
	 */
	public abstract Symbol clone();

}