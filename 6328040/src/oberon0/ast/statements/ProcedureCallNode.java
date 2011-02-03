package oberon0.ast.statements;

import java.util.ArrayList;

import oberon0.ast.routines.ProcedureNode;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

public class ProcedureCallNode implements IExecutable {
	private String _name;
	private ArrayList<IReferable> _actualParams;
	
	
	public ProcedureCallNode(String name, ArrayList<IReferable> ap) {
		_name = name;
		_actualParams = ap;
	}

	@Override
	public void execute(Context context) {

		ProcedureNode procedure = context.getProcedure(_name);
		procedure.call(context, _actualParams);
		
	}

}
