package org.elcid.oberon0.values;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public class Array extends Value {

	private List<Value> elements;
	private Integer maxLength;

	public Array(Integer maxLength) {
		this.elements = new ArrayList<Value>(maxLength);
		this.maxLength = maxLength;

		for (int i=0;i<maxLength;i++) {
			elements.add(new Int(0));
		}
	}

	@Override
	public Value applySelector(Object key) {
		Int indexValue = (Int) key;
		Integer index = indexValue.getValue();
		return elements.get(index);
	}

	@Override
	public void set(Value value) {
		this.elements = ((Array) value).elements;
		this.maxLength = ((Array) value).maxLength;
	}

	@Override
	public Value clone() {
		Array clone = new Array(maxLength.intValue());

		ArrayList<Value> copiedElements = new ArrayList<Value>();
		for (Value val : elements) {
			copiedElements.add(val.clone());
		}
		clone.elements = copiedElements;

		return clone;
	}

	@Override
	public String toString() {
		return elements.toString();
	}

}
