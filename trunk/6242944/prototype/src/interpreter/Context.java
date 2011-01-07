package interpreter;

import runtime.BuiltinFunction;
import runtime.Value;
import runtime.VoidValue;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, BuiltinFunction> _builtins;
	private VoidValue _voidValue;
	private Scope _scope;
	
	public Context() {
		_builtins = new HashMap<String, BuiltinFunction>();
		_voidValue = new VoidValue();
		_scope = new Scope(null);
	}
	
	public void registerBuiltin(String name, BuiltinFunction fun) {
		_builtins.put(name, fun);
	}
	
	public VoidValue getVoid() {
		return _voidValue;
	}
	
	public Scope getScope() {
		return _scope;
	}

	public BuiltinFunction lookupFunction(String name) {
		return _builtins.get(name);
	}
	
	public void defineConstant(String name, Value value) {
		_scope.defineConstant(name, value);
	}
}
