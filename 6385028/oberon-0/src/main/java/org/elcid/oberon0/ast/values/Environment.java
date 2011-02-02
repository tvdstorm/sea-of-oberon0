package org.elcid.oberon0.ast.values;

import java.util.HashMap;
import java.util.Map;
import org.elcid.oberon0.exceptions.UnboundVariableException;

/**
 * Wrapper class that represents a map of the available variable names and their
 * integer value.
 *
 * @author Pieter Brandwijk
 */
public class Environment {

	private Map<String, Integer> map;

	public Environment() {
		map = new HashMap<String, Integer>();
	}

	/**
	 * Returns the integer that is bound to the given variable name. If no mapping
	 * is found, a runtime exception will be thrown, as the system will not be able
	 * to recover.
	 *
	 * @param	variableName
	 * @return	the integer that is bound to the variable
	 */
	public Integer getValue(String variableName) {
		Integer value = map.get(variableName);
		if (value == null)
			throw new UnboundVariableException("Variable " + variableName + " is not bound to an integer");
		return value;
	}

	/**
	 * Puts a new mapping of a variable name to an integer.
	 *
	 * @param variableName
	 * @param value
	 */
	public void put(String variableName, Integer value) {
		assert (variableName != null) : "Variable name is null";
		assert (variableName.equals("")) : "Variable name is empty string";
		assert (value != null) : "Integer value is null";
		map.put(variableName, value);
	}

}
