package oberon;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

public abstract class AbstractProcedure {
	private final String name;
	private final List<FormalParamSection> formalParamSections;
	private final ProcedureBody body;

	public AbstractProcedure(final String procName, final List<FormalParamSection> paramSections, 
			final ProcedureBody procBody) {
		name = procName;
		formalParamSections = paramSections;
		body = procBody;
	}

	public String getName() {
		return name;
	}
	
	protected List<FormalParamSection> getParamSections() {
		return formalParamSections;
	}

	public ProcedureBody getBody() {
		return body;
	}

	public abstract void call(Queue<IExpression> localQueue) throws IOException;
}