package ar.oberon0.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ExpectedResult implements Iterable<String> {
	List<String> expectedStrings;

	protected ExpectedResult() {
		this.expectedStrings = new ArrayList<String>();
	}

	protected void addString(String expectedString) {
		this.expectedStrings.add(expectedString);
	}

	public Iterator<String> iterator() {
		return this.expectedStrings.iterator();
	}
}
