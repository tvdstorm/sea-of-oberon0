package oberon;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

public class SystemMethodCall extends AbstractProcedure {

	public SystemMethodCall(final String name, 
			final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	@Override
	public void call(final Queue<AbstractExpression> localQueue) throws IOException {
		getBody().eval();
	}

}