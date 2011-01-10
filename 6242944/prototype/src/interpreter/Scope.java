package interpreter;

import runtime.BuiltinFunction;
import runtime.Callable;
import runtime.IntegerValue;
import runtime.ScriptedProcedure;
import runtime.Value;
import runtime.ValueRef;

import java.util.HashMap;
import java.util.Map;

import ast.ArrayType;
import ast.Identifier;
import ast.IdentifierType;
import ast.Procedure;
import ast.Type;

public class Scope {
	private Scope _parentScope;
	//XXX
	private Map<String, Value> _constants;
	private Map<String, ValueRef> _variables;
	private Map<String, Callable> _procedures;

	public Scope() {
		_constants = new HashMap<String, Value>();
		_variables = new HashMap<String, ValueRef>();
		_procedures = new HashMap<String, Callable>();
	}
	
	public Scope(Scope parentScope) {
		//XXX
		_parentScope = parentScope;
		_constants = new HashMap<String, Value>(parentScope._constants);
		_variables = new HashMap<String, ValueRef>(parentScope._variables);
		_procedures = new HashMap<String, Callable>(parentScope._procedures);
	}
	
	public void defineConstant(String name, Value value) {
		_constants.put(name, value);
	}
	
	//FIXME: type: String -> object?
	public void defineVar(String name, Value value) {
		_variables.put(name, ensureRef(value));
	}
	
	//XXX
	private ValueRef ensureRef(Value value) {
		if (value instanceof ValueRef) {
			return (ValueRef)value;
		}
		return new ValueRef(value);
	}

	public Value lookupValue(String name) {
		if (_constants.containsKey(name)) {
			return _constants.get(name);
		}
		
		if (_variables.containsKey(name)) {
			return _variables.get(name);
		}
		
		//XXX
		return null;
	}

	public void defineProcedure(String name, Callable procedure) {
		_procedures.put(name, procedure);
	}

	public Callable lookupProcedure(String name) {
		return _procedures.get(name);
	}

	public Scope getParentScope() {
		return _parentScope;
	}
}
