package oberon.statement;

import java.io.IOException;
import java.util.List;

import oberon.IExpression;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.Scope;

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
	public void eval(Scope currentScope) throws IOException{
		final IProcedure procedure = currentScope.getProcedure(procNameToCall);
		
		procedure.call(currentScope, procParameters);
	}

}
