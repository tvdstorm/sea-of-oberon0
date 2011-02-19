package jdm.oberon0.interpreter;

import jdm.oberon0.ast.declarations.ProcedureDeclaration;
import jdm.oberon0.values.Value;

/**
 * An Oberon procedure defined in the program.
 */
public class ScriptedProcedure implements Callable {
	private ProcedureDeclaration _node;
	
	public ScriptedProcedure(ProcedureDeclaration node) {
		this._node = node;
	}

	@Override
	public void execute(InterpreterContext context, Value[] arguments) {
		context.executeProcedure(this, arguments);
	}

	public ProcedureDeclaration getNode() {
		return _node;
	}
}

