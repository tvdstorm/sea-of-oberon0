package jdm.oberon0.interpreter;

import jdm.oberon0.ast.Procedure;
import jdm.oberon0.values.Value;

/**
 * An Oberon procedure defined in the program.
 */
public class ScriptedProcedure implements Callable {
	private Procedure _node;
	
	public ScriptedProcedure(Procedure node) {
		this._node = node;
	}

	@Override
	public void execute(Context context, Value[] arguments) {
		context.executeProcedure(this, arguments);
	}

	public Procedure getNode() {
		return _node;
	}

	@Override
	public int getArgumentCount() {
		return _node.getParameters().size();
	}
}

