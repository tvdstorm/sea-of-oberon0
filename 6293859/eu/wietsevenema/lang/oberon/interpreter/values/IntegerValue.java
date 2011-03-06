package eu.wietsevenema.lang.oberon.interpreter.values;

import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;

public class IntegerValue extends Value {
	
	private Integer value;

	public IntegerValue(Integer value) {
		this.value = value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getValue() throws ValueUndefinedException {
		if (this.value == null) {
			throw new ValueUndefinedException();
		}
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof IntegerValue) {
			try {
				return this.getValue().equals(((IntegerValue) o).getValue());
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
			return new IntegerValue(null);
		} else {
			return new IntegerValue(value.intValue());
		}
	}

	@Override
	public void init() {
		this.value = 0;
	}

}
