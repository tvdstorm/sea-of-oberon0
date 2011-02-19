package nl.bve.uva.oberon.shared;

import nl.bve.uva.oberon.env.types.OberonValue;

public final class SelectorValue {
	private String stringVal;
	private OberonValue oberonVal;

	public SelectorValue(String val) {
		if (val == null) {
			throw new IllegalArgumentException("Cannot instantiate SelectorValue with " + val);
		}
		this.stringVal = val;
	}

	public SelectorValue(OberonValue val) {
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

	public OberonValue getIndex() {
		if (oberonVal != null) {
			return oberonVal;
		}
		throw new RuntimeException("Cannot get an index for this SelectorValue!");
	}
}
