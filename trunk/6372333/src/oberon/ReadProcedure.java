package oberon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.DataType;
import oberon.data.VariableManager;

class ReadProcedure extends Statement {
	@Override
	public void Eval() throws IOException {
		VariableManager instance = VariableManager.getInstance();
		int index = instance.getVariable("i").getValue();
		
		int input = ReadInput(index);
		DataType inputArray = instance.getVariable("input");
		inputArray.setValue(index, input);
	}
	
	private int ReadInput(int index) throws IOException {
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		
	    System.out.print ("Type number "+ index +" you want to sort: ");
	    System.out.flush(); 
	    
	    
	    String input = stdin.readLine();
	    
	    return Integer.parseInt(input);
	}

	public static void Initialize()
	{
		List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("i");
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier, false));
		
		LinkedList<Statement> statements = new LinkedList<Statement>();
		statements.add(new ReadProcedure());
		
		List<DataType> variables = new ArrayList<DataType>();
		List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		Declaration declaration = new Declaration(variables, procedures);
		
		ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		ProcedureHeading procedure = new ProcedureHeading("Read", params, body);
		VariableManager.getInstance().AddSystemProcedure(procedure);
	}
}
