package runtime;

import ast.AddExpression;
import interpreter.Context;

public class ScriptedProcedure extends Callable {
	private ast.Procedure _node;
	
	public ScriptedProcedure(ast.Procedure node) {
		this._node = node;
	}

	@Override
	public void execute(Context ctx, Value[] arguments) {
		ctx.execProcedure(this, arguments);
	}

	public ast.Procedure getNode() {
		return _node;
	}
}

