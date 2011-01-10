package interpreter;

import runtime.BuiltinFunction;
import runtime.ScriptedProcedure;
import runtime.Value;
import runtime.VoidValue;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private VoidValue _voidValue;
	private Scope _scope;
	
	public Context() {
		_voidValue = new VoidValue();
		_scope = new Scope();
	}
	
	public void registerBuiltin(String name, BuiltinFunction fun) {
		_scope.defineProcedure(name, fun);
	}
	
	public VoidValue getVoid() {
		return _voidValue;
	}
	
	public Scope getScope() {
		return _scope;
	}

	public void defineConstant(String name, Value value) {
		_scope.defineConstant(name, value);
	}

	public void execProcedure(ScriptedProcedure proc, Value[] arguments) {
		Interpreter interp = new Interpreter(this);
		interp.interpret(proc, arguments);
	}

	public void pushScope() {
		_scope = new Scope(_scope);
	}

	public void popScope() {
		_scope = _scope.getParentScope();
	}
}
