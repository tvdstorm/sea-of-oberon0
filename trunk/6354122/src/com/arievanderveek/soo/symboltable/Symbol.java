/**
 * 
 */
package com.arievanderveek.soo.symboltable;

/**
 * Interface for a Symbol
 * 
 * @author arieveek
 *
 */
public abstract class Symbol {
	
	protected SymbolTypesEnum type;
	// Symbols are always created as copies, and this parameter should be set explicity
	// when doing a call by reference.
	protected boolean referencedSymbol = false;
	
	public abstract String getName();
	public abstract boolean isMutable();
	
	public SymbolTypesEnum getType(){
		return this.type;
	}
	public boolean isReferencedSymbol(){
		return this.referencedSymbol;
	}
	public void setReferncedSymbol(boolean referencedSymbol ){
		this.referencedSymbol = referencedSymbol;
	}
}