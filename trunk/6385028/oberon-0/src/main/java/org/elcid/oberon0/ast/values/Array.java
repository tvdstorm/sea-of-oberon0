package org.elcid.oberon0.ast.values;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public class Array extends Value {

	private List<Value> elements;

	public Array() {
		this.elements = new ArrayList<Value>();
	}

	public void add(Value element) {
		elements.add(element);
	}

	@Override
	public Value applySelector(Object key) {
		Integer index = (Integer) key;
		return elements.get(index);
	}

}
