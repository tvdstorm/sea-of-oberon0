package org.elcid.oberon0.values;

/**
 *
 * @author Pieter Brandwijk
 */
public class Array extends Value {

	private Value[] elements;

	public Array(Integer length) {
		elements = new Value[length];

		// Initialize array with Ints of 0
		for (int i = 0; i < length; i++){
			elements[i] = new Int(0);
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
		Array clone = new Array(elements.length);
		System.arraycopy(this.elements, 0, clone.elements, 0, elements.length);
		return clone;
	}

	@Override
	public String toString() {
		return elements.toString();
	}

}
