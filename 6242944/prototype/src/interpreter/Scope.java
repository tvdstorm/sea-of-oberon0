package interpreter;

import runtime.BuiltinFunction;
import runtime.IntegerValue;
import runtime.Value;
import runtime.ValueRef;

import java.util.HashMap;
import java.util.Map;

import ast.ArrayType;
import ast.Identifier;
import ast.IdentifierType;
import ast.Type;

public class Scope {
	private Scope _parentScope;
	private Map<String, Value> _constants;
	private Map<String, ValueRef> _variables;
	
	public Scope(Scope parentScope) {
		_parentScope = parentScope;
		_constants = new HashMap<String, Value>();
		_variables = new HashMap<String, ValueRef>();
	}
	
	public void defineConstant(String name, Value value) {
		_constants.put(name, value);
	}
	
	//FIXME: type: String -> object?
	public void defineVar(String name, Value value) {
		_variables.put(name, new ValueRef(value));
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
}
