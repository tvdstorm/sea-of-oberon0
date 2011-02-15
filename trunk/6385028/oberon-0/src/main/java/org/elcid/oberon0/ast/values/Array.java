package org.elcid.oberon0.ast.values;

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

}
