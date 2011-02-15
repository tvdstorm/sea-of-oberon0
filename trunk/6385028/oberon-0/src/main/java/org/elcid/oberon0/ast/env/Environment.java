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

	private Map<String, Reference> valueBindings = new HashMap<String, Reference>();
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
	public Reference getReference(String variableName) {
		if (valueBindings.containsKey(variableName))
			return valueBindings.get(variableName);
		if (superEnv != null)
			return superEnv.getReference(variableName);
		throw new UnboundVariableException("Variable " + variableName + " is not bound to an integer");
	}

	public void declareByReference(String variableName, Value value) {
		valueBindings.put(variableName, new RefReference(value));
	}

	public void declareByValue(String variableName, Value value) {
		valueBindings.put(variableName, new ValueReference(value));
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

}
