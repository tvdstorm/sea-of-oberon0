/**
 * 
 */
package com.arievanderveek.soo.symboltable;

/**
 * This class represents and address in the memory stack.
 * 
 * @author arieveek
 * 
 */
public class MemoryAddress {

	// Memory adresses are implemented by using integers as adres
	private final Integer address;

	public MemoryAddress(Integer adress) {
		this.address = adress;
	}

	public int hashCode() {
		return address.intValue();
	}

	public String toString() {
		return address.toString();
	}

}
