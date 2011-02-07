package jdm.oberon0.interpreter;

import java.util.HashMap;
import java.util.Map;

import jdm.oberon0.exceptions.UndefinedTypeException;
import jdm.oberon0.exceptions.UndefinedVariableException;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;
import jdm.oberon0.values.ReferenceValue;

/**
 * This class stores all scope-related values (variables, constants, types).
 */
public class Scope {
	private Scope _parentScope;

	private Map<String, Value> _constants;
	private Map<String, ReferenceValue> _variables;
	private Map<String, Callable> _procedures;
	private Map<String, Type> _types;

	public Scope() {
		_constants = new HashMap<String, Value>();
		_variables = new HashMap<String, ReferenceValue>();
		_procedures = new HashMap<String, Callable>();
		_types = new HashMap<String, Type>();
	}
	
	public Scope(Scope parentScope) {
		_parentScope = parentScope;
		_constants = new HashMap<String, Value>(parentScope._constants);
		_variables = new HashMap<String, ReferenceValue>(parentScope._variables);
		_procedures = new HashMap<String, Callable>(parentScope._procedures);
		_types = new HashMap<String, Type>(parentScope._types);
	}
	
	public void defineConstant(String name, Value value) {
		_constants.put(name, value);
	}
	
	public void defineType(String name, Type type) {
		_types.put(name, type);
	}
	
	public void defineVar(String name, Value value) {
		_variables.put(name, ReferenceValue.getRef(value));
	}
	
	public void defineProcedure(String name, Callable procedure) {
		_procedures.put(name, procedure);
	}
	
	public Value lookupVarOrConst(String name) {
		if (_constants.containsKey(name)) {
			return _constants.get(name);
		}
		
		if (_variables.containsKey(name)) {
			return _variables.get(name);
		}
		throw new UndefinedVariableException(name);
	}

	public Callable lookupProcedure(String name) {
		return _procedures.get(name);
	}

	public Type lookupType(String name) {
		if (!_types.containsKey(name)) {
			throw new UndefinedTypeException(name);
		}
		return _types.get(name);
	}
	
	public Scope getParentScope() {
		return _parentScope;
	}
	
	public boolean isGlobalScope() {
		return (_parentScope == null);
	}
}
