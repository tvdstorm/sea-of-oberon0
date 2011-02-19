package jdm.oberon0.interpreter;

import jdm.oberon0.interpreter.eval.Evaluator;
import jdm.oberon0.values.Value;

/**
 * This class stores all runtime elements used by the interpreter and
 * builtin procedures.
 */
public class InterpreterContext extends Context {
	public InterpreterContext() {
		_scope = new ValueScope();
	}
	
	public ValueScope getScope() {
		return (ValueScope)_scope;
	}

	public void executeProcedure(ScriptedProcedure proc, Value[] arguments) {
		Evaluator eval = new Evaluator(this);
		eval.evaluate(proc, arguments);
	}

	public void pushScope() {
		_scope = new ValueScope((ValueScope)_scope);
	}
}
