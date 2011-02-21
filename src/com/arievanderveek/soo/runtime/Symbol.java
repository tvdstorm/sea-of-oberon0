/**
 * 
 */
package com.arievanderveek.soo.runtime;

import com.arievanderveek.soo.SeaOfOberonException;

/**
 * Abstract class representing a Symbol. Symbols are datatypes used by the scope to store 
 * runtime data, like integer values.
 *  
 * @author arieveek
 * 
 */
public abstract class Symbol {

	// Symbols are always created as copies, and this parameter should be set
	// explicity when doing a call by reference.
	private boolean referencedSymbol;

	private final boolean mutable;

	public Symbol(boolean mutable) {
		this.referencedSymbol = false;
		this.mutable = mutable;
	}

	public Symbol(Symbol symbol) {
		this.referencedSymbol = false;
		this.mutable = symbol.isMutable();
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
	 * Regenates the memory address. It generates an new address in the current
	 * memory map and assigns this address to the symbol. It also makes sure all its children,
	 * regenerate there addresses.
	 * 
	 * @param scope
	 * @throws SeaOfOberonException
	 */
	public abstract void regenerateMemoryAddress(Scope scope, MemoryManager currentMap)
			throws SeaOfOberonException;

	/**
	 * Returns a clone of the symbol object, whith the memory addresses of its original object.
	 * The regenerateMemoryAddress method can be used to regenerate the memory addresses.
	 */
	public abstract Symbol clone();

}