package oberon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ProcedurecallStatement extends Statement {

	private Queue<Expression> _expressions;
	private String _name;

	public ProcedurecallStatement(String name,
			Queue<Expression> expressions) {
		_name = name;
		_expressions = expressions;
	}

	@Override
	public void Eval() throws IOException {
		ProcedureHeading procedure = VariableManager.getInstance().getProcedure(_name);
		
		Queue<Expression> localQueue = new LinkedList<Expression>();
		localQueue.addAll(_expressions);
		
		procedure.Call(localQueue);
	}

}
