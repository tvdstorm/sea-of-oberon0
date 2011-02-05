package ar.oberon0.values;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.ast.dataTypes.PrimitiveTypes;
import ar.oberon0.ast.dataTypes.SimpleType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.TechnicalException;

public class IntegerValue implements ArithmeticValue, ComparableValue {

	private int value;

	public IntegerValue() {
		this(0);
	}

	public IntegerValue(final int value) {
		this.value = value;
	}

	public final Object interpret(final Context context) throws TechnicalException {
		return this;
	}

	public final int getValueAsInt() {
		return this.value;
	}

	@Override
	public final CreatableType getType() {
		return new SimpleType(PrimitiveTypes.INTEGER);
	}

	@Override
	public final Value multiplyBy(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not multiply the type " + IntegerValue.class + " with a object of type " + value.getClass() + ".");
		}

		return new IntegerValue(this.value * ((IntegerValue) value).value);
	}

	@Override
	public final Value add(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not add the value of type " + IntegerValue.class + " with the value of type " + value.getClass() + ".");
		}

		return new IntegerValue(this.value + ((IntegerValue) value).value);
	}

	@Override
	public final Value negate() {
		return new IntegerValue(-this.value);
	}

	@Override
	public final Value subtract(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not subtract the value of type " + IntegerValue.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerValue(this.value - ((IntegerValue) value).value);
	}

	@Override
	public final int compareTo(final ComparableValue value) {
		if (!Helper.areSameType(this, value)) {
			return -1;
		}
		return Integer.valueOf(this.value).compareTo(((IntegerValue) value).value);
	}

	@Override
	public final Value divide(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not divide the value of type " + IntegerValue.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerValue(this.value / ((IntegerValue) value).value);
	}

	@Override
	public final Value modulo(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not modulo the value of type " + IntegerValue.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerValue(this.value % ((IntegerValue) value).value);
	}

	@Override
	public final String toString() {
		return "" + this.value;
	}

	@Override
	public final int hashCode() {
		return Integer.valueOf(this.value).hashCode();
	}

	@Override
	public final boolean equals(final Object obj) {
		if (obj.getClass() != IntegerValue.class) {
			return false;
		}
		return this.value == ((IntegerValue) obj).value;
	}
}
