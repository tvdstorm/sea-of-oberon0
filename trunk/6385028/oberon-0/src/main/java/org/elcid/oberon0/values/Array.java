package org.elcid.oberon0.values;

/**
 *
 * @author Pieter Brandwijk
 */
public class Array extends Value {

	private Value[] elements;
	private Value type;

	public Array(Integer length, Value elementType) {
		elements = new Value[length];
		type = elementType;

		// Initialize array with Ints of 0
		for (int i = 0; i < length; i++){
			elements[i] = type.clone();
		}
	}

	@Override
	public Value applySelector(Object key) {
		Int indexValue = (Int) key;
		Integer index = indexValue.getValue();
		return elements[index];
	}

	@Override
	public void set(Value value) {
		this.elements = ((Array) value).elements;
	}

	@Override
	public Value clone() {
		Array clone = new Array(elements.length, type);
		System.arraycopy(this.elements, 0, clone.elements, 0, elements.length);
		return clone;
	}

}
