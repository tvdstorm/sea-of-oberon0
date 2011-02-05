package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;

class WriteLnCall implements IStatement {

	@Override
	public void eval() throws IOException {
		System.out.println();
	}

	public static void initialize(){
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		statements.add(new WriteLnCall());
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("WriteLn", params, body);
		VariableManager.getInstance().addSystemProcedure(procedure);
	}
}
