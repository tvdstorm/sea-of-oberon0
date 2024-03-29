package oberon.procedures;

import java.io.IOException;
import java.util.List;

import oberon.IExpression;
import oberon.Scope;

/**
 * The Class SystemMethodCall, contains a non user defined procedure.
 */
public class SystemMethodCall extends AbstractProcedure {

	/**
	 * Instantiates a new system method call.
	 *
	 * @param name the name of the call
	 * @param paramSections the param sections of the call
	 * @param body the body of the call
	 */
	public SystemMethodCall(final String name, 
			final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	/* (non-Javadoc)
	 * @see oberon.procedures.AbstractProcedure#call(java.util.Queue)
	 */
	@Override
	public void call(final Scope currentScope, final List<IExpression> localQueue) throws IOException {
		getBody().eval(currentScope);
	}

}
