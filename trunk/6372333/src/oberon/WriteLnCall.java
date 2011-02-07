package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;

/**
 * The Class WriteLnCall, handles call to system call WriteLn().
 */
class WriteLnCall implements IStatement {

	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval(Scope currentScope) throws IOException {
		System.out.println();
	}

	/**
	 * Initialize.
	 */
	public static void initialize(Scope currentScope){
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		statements.add(new WriteLnCall());
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("WriteLn", params, body);
		currentScope.addSystemProcedure(procedure);
	}
}
