package oberon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ReadProcedure extends Statement {
	private static String NAME = "Read";
	
	@Override
	public void Eval() throws IOException {
		VariableManager instance = VariableManager.getInstance();
		int index = instance.getVariableValue("i");
		
		int input = ReadInput(index);
		instance.setArrayValue("input", index, input);
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
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier));
		
		LinkedList<Statement> statements = new LinkedList<Statement>();
		statements.add(new ReadProcedure());
		
		List<ConstVariable> constVariables = new ArrayList<ConstVariable>();
		List<VarDeclaration> varVariables = new ArrayList<VarDeclaration>();
		List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		Declaration declaration = new Declaration(constVariables, varVariables, procedures);
		
		ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		ProcedureHeading procedure = new ProcedureHeading(NAME, params, body);
		VariableManager.getInstance().AddProcedure(NAME, procedure);
	}
}
