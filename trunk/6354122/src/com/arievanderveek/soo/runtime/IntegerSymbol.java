/**
 * 
 */
package com.arievanderveek.soo.runtime;

import com.arievanderveek.soo.util.Constants;

/**
 * Abstract class representing the base of a Symbol
 * 
 * @author arieveek
 * 
 */
public class IntegerSymbol extends Symbol {

	private MemoryAddress memoryAdress;

	/**
	 * Constructor for a Symbol
	 * 
	 * @param name
	 * @param memoryAdress
	 */
	public IntegerSymbol(boolean mutable, MemoryAddress memoryAdress) {
		super(SymbolTypesEnum.INTEGER, mutable);
		this.memoryAdress = memoryAdress;
	}

	/**
	 * Getter for memoryAdress
	 * 
	 * @return the memoryAdress
	 */
	public MemoryAddress getMemoryAdress() {
		return memoryAdress;
	}

	public void updateMemoryAddress(MemoryAddress memoryAdress) {
		this.memoryAdress = memoryAdress;

	}

	@Override
	public boolean isMutable() {
		return super.isMutable();
	}

	@Override
	public boolean isReferencedSymbol() {
		return super.isReferencedSymbol();
	}

	@Override
	public void setReferencedSymbol(boolean referencedSymbol) {
		super.setReferencedSymbol(referencedSymbol);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsMutable: " + super.isMutable());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsReference: " + super.isReferencedSymbol());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("memoryAdress: " + memoryAdress.toString());
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();
	}

}