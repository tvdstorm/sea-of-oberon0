package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.IntegerArrayDataType;
import oberon.exceptions.UnsupportedException;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;

/**
 * The Class WriteCall, handles the calls to system call Write().
 */
class WriteCall implements IStatement {
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval() throws IOException, UnsupportedException {
		final VariableManager instance = VariableManager.getInstance();
		final IntegerArrayDataType inputArray = (IntegerArrayDataType) instance.getVariable("input");
		final int index = instance.getVariable("i").getValue();
		
		System.out.println(inputArray.getValueAtIndex(index));
	}

	/**
	 * Initialize.
	 */
	public static void initialize() {
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("i");
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier));
		paramNames = new ArrayList<String>();
		paramNames.add("input");
		params.add(new FormalParamSection(paramNames, FormalParamType.Array));
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		statements.add(new WriteCall());
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("Write", params, body);
		VariableManager.getInstance().addSystemProcedureToCurrentScope(procedure);
	}
}
