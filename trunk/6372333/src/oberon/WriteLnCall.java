package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.DataType;
import oberon.data.VariableManager;

class WriteLnCall extends Statement {

	@Override
	public void Eval() throws IOException {
		System.out.println();
	}

	public static void Initialize()
	{
		List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		
		LinkedList<Statement> statements = new LinkedList<Statement>();
		statements.add(new WriteLnCall());
		
		List<DataType> variables = new ArrayList<DataType>();
		List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		Declaration declaration = new Declaration(variables, procedures);
		
		ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		SystemMethodCall procedure = new SystemMethodCall("WriteLn", params, body);
		VariableManager.getInstance().AddSystemProcedure(procedure);
	}
}
