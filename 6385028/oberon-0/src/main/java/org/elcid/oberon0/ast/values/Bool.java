package org.elcid.oberon0.ast.values;

/**
 *
 * @author Pieter Brandwijk
 */
public class Bool extends Value {

	private Boolean value;

	public Bool(Boolean value) {
		this.value = value;
	}

	public Boolean getValue() {
		assert (value != null) : "Int value is null";
		return value;
	}

	@Override
	public Value applySelector(Object key) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
