package interpreter;

import runtime.BuiltinFunction;
import runtime.Value;

import java.util.HashMap;
import java.util.Map;

import ast.Identifier;

public class Scope {
	private Scope _parentScope;
	private Map<String, Value> _constants;
	
	public Scope(Scope parentScope) {
		_parentScope = parentScope;
		_constants = new HashMap<String, Value>();
	}
	
	public void defineConstant(String name, Value value) {
		_constants.put(name, value);
	}

	public Value lookupValue(String name) {
		if (_constants.containsKey(name)) {
			return _constants.get(name);
		}
		
		//XXX
		return null;
	}
}
