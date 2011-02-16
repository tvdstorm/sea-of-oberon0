package nl.bve.uva.oberon.shared;

import nl.bve.uva.oberon.env.types.OberonType;

public final class SelectorValue {
	private String stringVal;
	private OberonType oberonVal;

	public SelectorValue(String val) {
		if (val == null) {
			throw new IllegalArgumentException("Cannot instantiate SelectorValue with " + val);
		}
		this.stringVal = val;
	}

	public SelectorValue(OberonType val) {
		if (val == null) {
			throw new IllegalArgumentException("Cannot instantiate SelectorValue with " + val);
		}
		oberonVal = val;
	}

	public String getField() {
		if (stringVal != null) {
			return stringVal;
		}
		throw new RuntimeException("Cannot get a fieldname for this SelectorValue!");
	}

	public OberonType getIndex() {
		if (oberonVal != null) {
			return oberonVal;
		}
		throw new RuntimeException("Cannot get an index for this SelectorValue!");
	}
}
