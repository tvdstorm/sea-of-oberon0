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
	
	public abstract String getName();
	public abstract boolean isMutable();
	
	public SymbolTypesEnum getType(){
		return this.type;
	}
}