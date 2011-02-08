/**
 * 
 */
package com.arievanderveek.soo.runtime;

import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class ArraySymbol extends Symbol {

	private MemoryAddress[] addressList;

	public ArraySymbol(boolean mutable, MemoryAddress[] addressList) {
		super(SymbolTypesEnum.ARRAY, mutable);
		this.addressList = addressList;
	}

	public void addOrUpdateAddress(Integer position, MemoryAddress adress) {
		addressList[position] = adress;
	}

	public MemoryAddress getAddress(Integer position) {
		return addressList[position];
	}

	public MemoryAddress[] getAddressList() {
		return this.addressList;
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
		sb.append("IsMutable: " + super.isMutable());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("IsReference: " + super.isReferencedSymbol());
		for (MemoryAddress address : addressList) {
			sb.append("memoryAdress: " + address.toString());
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();

	}

}
