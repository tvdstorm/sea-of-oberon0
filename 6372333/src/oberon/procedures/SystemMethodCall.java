package oberon.procedures;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

import oberon.FormalParamSection;
import oberon.IExpression;
import oberon.ProcedureBody;

public class SystemMethodCall extends AbstractProcedure {

	public SystemMethodCall(final String name, 
			final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	@Override
	public void call(final Queue<IExpression> localQueue) throws IOException {
		getBody().eval();
	}

}
