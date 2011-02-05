package jdm.oberon0.interpreter;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.interpreter.eval.Evaluator;
import jdm.oberon0.values.BooleanValue;
import jdm.oberon0.values.IntegerValue;
import jdm.oberon0.values.Value;

/**
 * This class stores all runtime elements used by the interpreter and
 * builtin procedures.
 */
public class Context {
	private Scope _scope;
	
	public Context() {
		_scope = new Scope();
	}
	
	public void registerBuiltin(String name, BuiltinProcedure fun) {
		_scope.defineProcedure(name, fun);
	}
	
	public Scope getScope() {
		return _scope;
	}

	public void defineConstant(String name, Value value) {
		_scope.defineConstant(name, value);
	}

	public void executeProcedure(ScriptedProcedure proc, Value[] arguments) {
		Evaluator eval = new Evaluator(this);
		eval.evaluate(proc, arguments);
	}

	public void pushScope() {
		_scope = new Scope(_scope);
	}

	public void popScope() {
		_scope = _scope.getParentScope();
	}

	public BooleanValue wrapBoolean(boolean b) {
		return new BooleanValue(b);
	}
	
	public IntegerValue wrapInteger(int i) {
		return new IntegerValue(i);
	}
}
