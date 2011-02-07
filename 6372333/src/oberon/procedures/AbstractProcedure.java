package oberon.procedures;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

import oberon.IExpression;
import oberon.IProcedure;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class AbstractProcedure, super class for procedures.
 */
public abstract class AbstractProcedure implements IProcedure {
	
	/** The name. */
	private final String name;
	
	/** The formal param sections. */
	private final List<FormalParamSection> formalParamSections;
	
	/** The body. */
	private final ProcedureBody body;

	/**
	 * Instantiates a new abstract procedure.
	 *
	 * @param procName the name of the procedure
	 * @param paramSections the param sections for the procedure
	 * @param procBody the body of the procedure
	 */
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
	
	/**
	 * Gets the param sections.
	 *
	 * @return the param sections
	 */
	protected List<FormalParamSection> getParamSections() {
		return formalParamSections;
	}

	/**
	 * Gets the body of the procedure.
	 *
	 * @return the body of the procedure
	 */
	protected ProcedureBody getBody() {
		return body;
	}

	/* (non-Javadoc)
	 * @see oberon.IProcedure#call(java.util.Queue)
	 */
	@Override
	public abstract void call(Scope currentScope, Queue<IExpression> localQueue) throws IOException, UnsupportedException, VariableNotFoundInScopeException;
}