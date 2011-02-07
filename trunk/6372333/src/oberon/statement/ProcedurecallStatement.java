package oberon.statement;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import oberon.IExpression;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class ProcedurecallStatement, calls a procedure.
 */
public class ProcedurecallStatement implements IStatement {
	
	/** The proc parameters. */
	final private List<IExpression> procParameters;
	
	/** The proc name to call. */
	final private String procNameToCall;

	/**
	 * Instantiates a new procedurecall statement.
	 *
	 * @param name the name to call
	 * @param params the params to provide in the call
	 */
	public ProcedurecallStatement(final String name, final List<IExpression> params) {
		procNameToCall = name;
		procParameters = params;
	}

	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval(Scope currentScope) throws IOException, UnsupportedException, VariableNotFoundInScopeException {
		final IProcedure procedure = currentScope.getProcedure(procNameToCall);
		
		final Queue<IExpression> localQueue = new LinkedList<IExpression>();
		localQueue.addAll(procParameters);
		
		procedure.call(currentScope, localQueue);
	}

}
