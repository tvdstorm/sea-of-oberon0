package eu.wietsevenema.lang.oberon.interpreter.values;

import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;

public class BooleanValue extends Value {

	private Boolean value;

	public BooleanValue(Boolean value) {
		this.value = value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

	public Boolean getValue() throws ValueUndefinedException {
		if (this.value == null) {
			throw new ValueUndefinedException();
		}
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof BooleanValue) {
			try {
				return this.getValue().equals(((BooleanValue) o).getValue());
			} catch (ValueUndefinedException e) {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.value != null) {
			return this.value.toString();
		}
		return "NULL";
	}

	@Override
	public Object clone() {
		if (value == null) {
			return new BooleanValue(null);
		} else {
			return new BooleanValue(value.booleanValue());
		}
	}

	@Override
	public void init() {
		this.value = false;
	}

}
