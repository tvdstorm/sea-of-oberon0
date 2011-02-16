package org.elcid.oberon0.env;

import java.util.HashMap;
import java.util.Map;
import org.elcid.oberon0.ast.TypeNode;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.exceptions.TypeNotKnownException;
import org.elcid.oberon0.exceptions.UnboundVariableException;
import org.elcid.oberon0.exceptions.UnknownProcedureException;

/**
 * Wrapper class that represents a map of the available variable names and their
 * integer value.
 *
 * @author Pieter Brandwijk
 */
public class Environment {

	private Environment parent;
	private Map<String, Value> variables = new HashMap<String, Value>();
	private Map<String, TypeNode> types = new HashMap<String, TypeNode>();
	private Map<String, Procedure> procedures = new HashMap<String, Procedure>();

	public Environment() {
		parent = null;
	}

	public Environment(Environment superEnv) {
		this.parent = superEnv;
	}
	
	public void declareValue(String variableName, Value value) {
		variables.put(variableName, value);
	}

	public void declareType(String variableName, TypeNode type) {
		types.put(variableName, type);
	}

	public void declareProcedure(String procedureName, Procedure procedure) {
		procedures.put(procedureName, procedure);
	}

	public Value getValue(String variableName) {
		if (variables.containsKey(variableName)) {
			return variables.get(variableName);
		}
		if (parent != null) {
			return parent.getValue(variableName);
		}
		throw new UnboundVariableException("Variable " + variableName + " is not bound to a value");
	}

	public TypeNode getType(String variableName) {
		if (variables.containsKey(variableName)) {
			return types.get(variableName);
		}
		if (parent != null) {
			return parent.getType(variableName);
		}
		throw new TypeNotKnownException("Type of variable " + variableName + " is not known");
	}

	public Procedure getProcedure(String procedureName) {
		if (procedures.containsKey(procedureName)) {
			return procedures.get(procedureName);
		}
		if (parent != null) {
			return parent.getProcedure(procedureName);
		}
		throw new UnknownProcedureException("Procedure " + procedureName + " is unknown in the environment");
	}
	
}
