package oberon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.IntegerArrayDataType;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;

class ReadProcedure implements IStatement {
	@Override
	public void eval() throws IOException {
		final VariableManager instance = VariableManager.getInstance();
		final int index = instance.getVariable("i").getValue();
		
		final int input = readInput(index);
		final IntegerArrayDataType inputArray = (IntegerArrayDataType)instance.getVariable("input");
		inputArray.setValueAtIndex(index, input);
	}
	
	private int readInput(final int index) throws IOException {
		final BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		
	    System.out.print ("Type number "+ index +" you want to sort: ");
	    System.out.flush(); 
	    
	    
	    final String input = stdin.readLine();
	    
	    return Integer.parseInt(input);
	}

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
		VariableManager.getInstance().addSystemProcedure(procedure);
	}
}
