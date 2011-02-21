/**
 * 
 */
package com.arievanderveek.soo.runtime;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents an Integer Symbol
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
		super(mutable);
		this.memoryAdress = memoryAdress;
	}

	public IntegerSymbol(IntegerSymbol symbol) {
		super(symbol.isMutable());
		this.memoryAdress = symbol.getMemoryAdress();
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
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(this.getClass().getSimpleName());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsMutable: " + super.isMutable());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsReference: " + super.isReferencedSymbol());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("memoryAdress: " + memoryAdress.toString());
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();
	}

	@Override
	public void regenerateMemoryAddress(Scope scope, MemoryManager currentMap)
			throws SeaOfOberonException {
		Integer oldValue = scope.lookupMemoryManagerForAdress(memoryAdress).getValue(memoryAdress);
		MemoryAddress newAddress = currentMap.addValue(oldValue);
		this.memoryAdress = newAddress;
	}

	public IntegerSymbol clone() {
		return new IntegerSymbol(this);
	}

}