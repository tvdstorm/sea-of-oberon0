/**
 * 
 */
package com.arievanderveek.soo.runtime;

import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a Record Symbol
 * 
 * @author arieveek
 * 
 */
public class RecordSymbol extends Symbol {

	private Map<String, Symbol> memberMap;

	public RecordSymbol(boolean mutable, Map<String, Symbol> memberMap) {
		super(mutable);
		this.memberMap = memberMap;
	}

	public RecordSymbol(RecordSymbol symbol) {
		super( symbol.isMutable());
		this.memberMap = symbol.getMembers();
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

	@Override
	public void regenerateMemoryAddress(Scope scope, MemoryManager currentMap)
			throws SeaOfOberonException {
		for (String key : memberMap.keySet()) {
			memberMap.get(key).regenerateMemoryAddress(scope, currentMap);
		}
	}

	public RecordSymbol clone() {
		return new RecordSymbol(this);
	}
}
