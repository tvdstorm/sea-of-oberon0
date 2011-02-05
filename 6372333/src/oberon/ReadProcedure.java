package oberon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
 * The Class ReadProcedure, handles calls to system procedure Read.
 */
class ReadProcedure implements IStatement {
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval() throws IOException, UnsupportedException {
		final VariableManager instance = VariableManager.getInstance();
		final int index = instance.getVariable("i").getValue();
		
		final int input = readInputFromConsole(index);
		final IntegerArrayDataType inputArray = (IntegerArrayDataType)instance.getVariable("input");
		inputArray.setValueAtIndex(index, input);
	}
	
	/**
	 * Reads a single input from the console.
	 *
	 * @param index of the number to be entered
	 * @return the specified number
	 * @throws IOException When reading from the command line fails
	 */
	private int readInputFromConsole(final int index) throws IOException {
		final BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		
	    System.out.print ("Type number "+ index +" you want to sort: ");
	    System.out.flush(); 
	    
	    
	    final String input = stdin.readLine();
	    
	    return Integer.parseInt(input);
	}

	/**
	 * Initializes the read procedure.
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
		statements.add(new ReadProcedure());
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("Read", params, body);
		VariableManager.getInstance().addSystemProcedureToCurrentScope(procedure);
	}
}
