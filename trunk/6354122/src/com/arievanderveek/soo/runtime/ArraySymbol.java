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

	private Symbol[] symbolList;

	public ArraySymbol(boolean mutable, Symbol[] symbolList) {
		super(SymbolTypesEnum.ARRAY, mutable);
		this.symbolList = symbolList;
	}

	public void addOrUpdateAddress(Integer position, Symbol newSymbol) {
		symbolList[position] = newSymbol;
	}

	public Symbol getSymbol(Integer position) {
		return symbolList[position];
	}

	public Symbol[] getSymbolList() {
		return this.symbolList;
	}

	@Override
	public boolean isMutable() {
		return this.isMutable();
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
		for (Symbol symbol : symbolList) {
			sb.append("   ");
			sb.append("memoryAdress: " + symbol.toString());
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();

	}

}
