package oberon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import oberon.data.VariableManager;

public class ProcedurecallStatement extends AbstractStatement {
	final private List<AbstractExpression> procParameters;
	final private String procNameToCall;

	public ProcedurecallStatement(final String name, final List<AbstractExpression> params) {
		procNameToCall = name;
		procParameters = params;
	}

	@Override
	public void eval() throws IOException {
		final AbstractProcedure procedure = VariableManager.getInstance().getProcedure(procNameToCall);
		
		final Queue<AbstractExpression> localQueue = new LinkedList<AbstractExpression>();
		localQueue.addAll(procParameters);
		
		procedure.call(localQueue);
	}

}
