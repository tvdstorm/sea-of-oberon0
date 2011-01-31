/**
 * 
 */
package com.arievanderveek.soo.symboltable;

import com.arievanderveek.soo.util.Constants;


/**
 * Abstract class representing the base of a Symbol
 * 
 * @author arieveek
 *
 */
public class IntegerSymbol extends Symbol {
	
	private boolean mutable;
	private String name;
	private MemoryAddress memoryAdress;
	
	/**
	 * Constructor for a Symbol
	 * 
	 * @param name
	 * @param memoryAdress
	 */
	public IntegerSymbol(String name, boolean mutable, MemoryAddress memoryAdress) {
		super.type = SymbolTypesEnum.INTEGER;
		this.name = name;
		this.mutable = mutable;
		this.memoryAdress = memoryAdress;
	}

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for memoryAdress
	 * 
	 * @return the memoryAdress
	 */
	public MemoryAddress getMemoryAdress() {
		return memoryAdress;
	}
	
	public void updateMemoryAddress(MemoryAddress memoryAdress){
		this.memoryAdress = memoryAdress;
		
	}
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.symboltable.Symbol#isMutable()
	 */
	@Override
	public boolean isMutable() {
		return mutable;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Name: " + name);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsMutable: " + mutable);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsReference: " + referencedSymbol);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("memoryAdress: " + memoryAdress.toString());
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();
	}

}