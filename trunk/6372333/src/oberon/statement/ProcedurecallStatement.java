package oberon.statement;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import oberon.IExpression;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.VariableManager;

public class ProcedurecallStatement implements IStatement {
	final private List<IExpression> procParameters;
	final private String procNameToCall;

	public ProcedurecallStatement(final String name, final List<IExpression> params) {
		procNameToCall = name;
		procParameters = params;
	}

	@Override
	public void eval() throws IOException {
		final IProcedure procedure = VariableManager.getInstance().getProcedure(procNameToCall);
		
		final Queue<IExpression> localQueue = new LinkedList<IExpression>();
		localQueue.addAll(procParameters);
		
		procedure.call(localQueue);
	}

}
