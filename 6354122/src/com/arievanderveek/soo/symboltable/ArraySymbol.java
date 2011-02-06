/**
 * 
 */
package com.arievanderveek.soo.symboltable;

import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class ArraySymbol extends Symbol {

	private boolean mutable;
	private String name;
	private MemoryAddress[] addressList;

	public ArraySymbol(String name, boolean mutable, MemoryAddress[] addressList) {
		super.type = SymbolTypesEnum.ARRAY;
		this.name = name;
		this.mutable = mutable;
		this.addressList = addressList;
	}

	public void addOrUpdateAddress(Integer position, MemoryAddress adress) {
		addressList[position] = adress;
	}

	public MemoryAddress getAddress(Integer position) {
		return addressList[position];
	}

	public String getName() {
		return this.name;
	}

	public MemoryAddress[] getAddressList() {
		return this.addressList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.symboltable.Symbol#isMutable()
	 */
	@Override
	public boolean isMutable() {
		return mutable;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Name: " + name);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsMutable: " + mutable);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsReference: " + referencedSymbol);
		for (MemoryAddress address : addressList) {
			sb.append("memoryAdress: " + address.toString());
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();

	}

}
