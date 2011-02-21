package ar.oberon0.values;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;

public abstract class ValueBase implements Value {
	/*
	 * Return the Type of the current object.
	 */
	@Override
	public abstract CreatableType getType();

	@Override
	public List<CheckViolation> check(Context context) {
		return new ArrayList<CheckViolation>();
	}

}
