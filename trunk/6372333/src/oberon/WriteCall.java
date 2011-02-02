package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.DataType;
import oberon.data.IntegerArrayType;
import oberon.data.VariableManager;

class WriteCall extends Statement {
	@Override
	public void Eval() throws IOException {
		VariableManager instance = VariableManager.getInstance();
		IntegerArrayType inputArray = (IntegerArrayType) instance.getVariable("input");
		int index = instance.getVariable("i").getValue();
		
		System.out.println(inputArray.getValueAtIndex(index));
	}

	public static void Initialize()
	{
		List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("i");
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier, false));
		paramNames = new ArrayList<String>();
		paramNames.add("input");
		params.add(new FormalParamSection(paramNames, FormalParamType.Array, false));
		
		LinkedList<Statement> statements = new LinkedList<Statement>();
		statements.add(new WriteCall());
		
		List<DataType> variables = new ArrayList<DataType>();
		List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		Declaration declaration = new Declaration(variables, procedures);
		
		ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		SystemMethodCall procedure = new SystemMethodCall("Write", params, body);
		VariableManager.getInstance().AddSystemProcedure(procedure);
	}
}
