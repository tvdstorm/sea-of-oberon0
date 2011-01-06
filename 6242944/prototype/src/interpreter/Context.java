package interpreter;

import runtime.BuiltinFunction;
import runtime.VoidValue;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, BuiltinFunction> _builtins;
	private VoidValue _voidValue;
	
	public Context() {
		_builtins = new HashMap<String, BuiltinFunction>();
		_voidValue = new VoidValue();
	}
	
	public void registerBuiltin(String name, BuiltinFunction fun) {
		_builtins.put(name, fun);
	}
	
	public VoidValue getVoid() {
		return _voidValue;
	}

	public BuiltinFunction lookupFunction(String name) {
		return _builtins.get(name);
	}
}
