package ar.oberon0.values;

import ar.oberon0.ast.dataTypes.BooleanType;
import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;

public class BooleanValue extends ValueBase implements Negatable {

	private Boolean value;

	public BooleanValue() {
		this(false);
	}

	public BooleanValue(final Boolean value) {
		this.value = value;
	}

	public final Boolean getValueAsBoolean() {
		return this.value;
	}

	@Override
	public CreatableType getType() {
		return new BooleanType();
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		return this;
	}

	@Override
	public final int hashCode() {
		return this.value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == BooleanValue.class) {
			return this.value == ((BooleanValue) obj).value;
		}
		if (obj.getClass() == Boolean.class) {
			return this.value == (Boolean) obj;
		}
		return false;
	}

	@Override
	public Value negate() {
		return new BooleanValue(!this.value);
	}
}
