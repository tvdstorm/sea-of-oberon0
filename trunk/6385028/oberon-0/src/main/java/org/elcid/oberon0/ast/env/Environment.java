package org.elcid.oberon0.ast.env;

import java.util.HashMap;
import java.util.Map;
import org.elcid.oberon0.ast.TypeNode;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.exceptions.UnboundVariableException;

/**
 * Wrapper class that represents a map of the available variable names and their
 * integer value.
 *
 * @author Pieter Brandwijk
 */
public class Environment {

	private Environment superEnv;

	private Map<String, Value> valueBindings = new HashMap<String, Value>();
	private Map<String, TypeNode> typeAliases = new HashMap<String, TypeNode>();
	private Map<String, Procedure> procedures = new HashMap<String, Procedure>();

	public Environment() {
		superEnv = null;
	}

	public Environment(Environment superEnv) {
		this.superEnv = superEnv;
	}

	/**
	 * Returns the integer that is bound to the given variable name. If no mapping
	 * is found, a runtime exception will be thrown, as the system will not be able
	 * to recover.
	 *
	 * @param	variableName
	 * @return	the integer that is bound to the variable
	 */
	public Value getValue(String variableName) {
		if (valueBindings.containsKey(variableName))
			return valueBindings.get(variableName);
		if (superEnv != null)
			return superEnv.getValue(variableName);
		throw new UnboundVariableException("Variable " + variableName + " is not bound to an integer");
	}

	public void declareValue(String variableName, Value value) {
		valueBindings.put(variableName, value);
	}

	public TypeNode getType(String alias) {
		return typeAliases.get(alias);
	}

	public void putTypeAlias(String alias, TypeNode type) {
		typeAliases.put(alias, type);
	}

	public Procedure getProcedure(String procedureName) {
		return procedures.get(procedureName);
	}

	public void putProcedure(String procedureName, Procedure procedure) {
		procedures.put(procedureName, procedure);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (superEnv != null) {
			sb.append(superEnv.toString());
		}
		sb.append("SUB ENV:\n");
		for (Map.Entry<String, Value> ref : valueBindings.entrySet()) {
			sb.append(ref.getKey()+ " : " +ref.getValue().toString()+ "\n");
		}

		for (Map.Entry<String, Procedure> ref : procedures.entrySet()) {
			sb.append(ref.getKey()+ " : " +ref.getValue().toString()+ "\n");
		}
		sb.append("END SUB ENV");
		return sb.toString();
	}
}
