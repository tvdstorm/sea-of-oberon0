/**
 * 
 */
package com.arievanderveek.soo.runtime;

import java.util.Map;

import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 * 
 */
public class RecordSymbol extends Symbol {

	private Map<String, Symbol> memberMap;

	public RecordSymbol(boolean mutable, Map<String, Symbol> memberMap) {
		super(SymbolTypesEnum.ARRAY, mutable);
		this.memberMap = memberMap;
	}

	public void addOrUpdateAddress(String member, Symbol newSymbol) {
		memberMap.put(member, newSymbol);
	}

	public Symbol getMember(String member) {
		return memberMap.get(member);
	}

	public Map<String, Symbol> getMembers() {
		return this.memberMap;
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
		for (String key : memberMap.keySet()) {
			Symbol address = memberMap.get(key);
			sb.append("memoryAdress: " + address.toString());
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();
	}
}