package oberon.procedures;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

import oberon.FormalParamSection;
import oberon.IExpression;
import oberon.IProcedure;
import oberon.ProcedureBody;

public abstract class AbstractProcedure implements IProcedure {
	private final String name;
	private final List<FormalParamSection> formalParamSections;
	private final ProcedureBody body;

	public AbstractProcedure(final String procName, final List<FormalParamSection> paramSections, 
			final ProcedureBody procBody) {
		name = procName;
		formalParamSections = paramSections;
		body = procBody;
	}

	/* (non-Javadoc)
	 * @see oberon.IProcedure#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	
	protected List<FormalParamSection> getParamSections() {
		return formalParamSections;
	}

	protected ProcedureBody getBody() {
		return body;
	}

	/* (non-Javadoc)
	 * @see oberon.IProcedure#call(java.util.Queue)
	 */
	@Override
	public abstract void call(Queue<IExpression> localQueue) throws IOException;
}