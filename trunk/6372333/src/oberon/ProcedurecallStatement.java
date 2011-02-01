package oberon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import oberon.data.VariableManager;

public class ProcedurecallStatement extends Statement {

	private Queue<Expression> _parameters;
	private String _name;

	public ProcedurecallStatement(String name,
			Queue<Expression> _expressions) {
		_name = name;
		_parameters = _expressions;
	}

	@Override
	public void Eval() throws IOException {
		ProcedureHeading procedure = VariableManager.getInstance().getProcedure(_name);
		
		Queue<Expression> localQueue = new LinkedList<Expression>();
		localQueue.addAll(_parameters);
		
		procedure.Call(localQueue);
	}

}
