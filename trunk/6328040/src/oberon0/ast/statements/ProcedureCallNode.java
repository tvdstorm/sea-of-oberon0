package oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

public class ProcedureCallNode implements IExecutable {
	private final String _name;
	private final List<IReferable> _actualParams;

	public ProcedureCallNode(String name, List<IReferable> actualParams) {
		_name = name;
		if (actualParams != null) {
			_actualParams = actualParams;
		} else {
			_actualParams = new ArrayList<IReferable>();
		}
	}

	@Override
	public void execute(Context context) {
		ICallable procedure = context.getProcedure(_name);
		if (procedure != null) {
			procedure.call(context, _actualParams);
		} else
			throw new RuntimeException("Procedure " + _name
					+ " is not in current scope");
	}

	/*
	 * prints function name and actual parameters, this can be used for
	 * debugging
	 */
	public void print(Context context) {
		System.out.print(_name);
		for (IReferable ref : _actualParams) {
			System.out.print(" " + ref.eval(context));
		}
		System.out.print("\n");
	}

}
